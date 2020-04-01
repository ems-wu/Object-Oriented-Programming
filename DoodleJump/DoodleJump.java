package DoodleJump;

import java.util.ArrayList;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

/**
 * Here in the DoodleJump class contains most of my game logic. It also sets up
 * my timeline, arraylist, and keyboard input for the movement of my doodle.
 */

public class DoodleJump {
	private Doodle _doodle;
	private Platform _platform;
	private ArrayList<Platform> _platformArrayList;
	private Pane doodlePane;
	private double _difference;
	private Pane _labelPane;
	private Label _doodleLabel;
	private Timeline timeline;

	public DoodleJump(Pane doodleJumpPane) {
		doodlePane = doodleJumpPane;
		_doodle = new Doodle(doodlePane);
		_platform = new Platform(doodlePane);
		_platformArrayList = new ArrayList<Platform>();
		_platformArrayList.add(_platform);
		doodlePane.addEventHandler(KeyEvent.KEY_PRESSED, new KeyHandler());
		doodlePane.setFocusTraversable(true);
		this.setupTimeline();
		this.createLabelPane();
		this.exitGame();
	}


	private void generatePlatform() {
		/**
		 * This method generates platforms until the screen is full. The while loop
		 * checks the location of the top most platform of the array list (the last one)
		 * and generates a a platform in a new location within the constraints. The randomInt()
		 * method randomizes the location of the platforms. 
		 */
		Platform top = _platformArrayList.get(_platformArrayList.size() - 1); // <=topmost platform is last platform in
																				// array list)
		while (top.getYLocPlatform() > 0) {
			Platform newPlat = new Platform(doodlePane);
			_platformArrayList.add(newPlat);/// <=can access the last platform from top
			// write random number method in game class (randInt(int low, int high)
			double newX = this.randomInt(0, 400);
			double newY = this.randomInt(top.getYLocPlatform() - 100, top.getYLocPlatform() - 50);
			newPlat.setLocation(newX, newY);
			top = newPlat;
		}
	} 

	private double randomInt(double low, double high) {
		return low + (double) (Math.random() * (high - low + 1));
	}

	private void scrollPlatforms() {
		/**
		 * This method moves platforms down if the y location of doodle is less than half of 
		 * the window height. It includes a for loop that loops through the array list of 
		 * platforms and checks each one of them to set the y location of the platform by
		 * adding on the difference between doodle and the middle of the screen onto the 
		 * y location of the original platform.
		 */
		if (_doodle.getYLoc() < Constants.WINDOW_HEIGHT / 2) {
			_difference = (Constants.WINDOW_HEIGHT / 2) - _doodle.getYLoc();
			_doodle.setLocation(_doodle.getXLoc(), Constants.WINDOW_HEIGHT / 2);
			for (int i = 0; i < _platformArrayList.size(); i++) {
				_platformArrayList.get(i).setLocation(_platformArrayList.get(i).getXLocPlatform(),
						_platformArrayList.get(i).getYLocPlatform() + _difference);

			}
		}
	}

	private void removePlatforms() {
		/**
		 * This method removes platforms from the arraylist if the array list is not empty
		 * and the y location of the platform is greater than the height of the window. The
		 * platforms are then removed both logically and graphically.
		 */
		while (!_platformArrayList.isEmpty() && _platformArrayList.get(0).getYLocPlatform() > Constants.WINDOW_HEIGHT) {
			doodlePane.getChildren().remove(_platformArrayList.get(0));
			_platformArrayList.remove(_platformArrayList.get(0));
		}
	}

	private void exitGame() {
		if (_doodle.getYLoc() > Constants.WINDOW_HEIGHT) {
			System.exit(0);	
		}
	}

	private void createLabelPane() {
		/**
		 * This method creates a label pane and a label for the game. The label will eventually update
		 * when doodle falls off the screen according to the timeline.
		 */
		_labelPane = new Pane();
		_doodleLabel = new Label("DoodleJump");
		_labelPane.setStyle("-fx-background-color: lightgreen;");
		_labelPane.getChildren().add(_doodleLabel);
		doodlePane.getChildren().add(_labelPane);
	}

	private class KeyHandler implements EventHandler<KeyEvent> {
		@Override
		public void handle(KeyEvent e) {
			KeyCode keyPressed = e.getCode();
			switch (keyPressed) {
			//This switch statement creates boundaries for doodle and keeps it from going off screen
			case RIGHT:
				if (_doodle.getXLoc() + Constants.DOODLE_XMOVEMENT < Constants.WINDOW_WIDTH) {
					_doodle.setLocation(_doodle.getXLoc() + Constants.DOODLE_XMOVEMENT, _doodle.getYLoc());
				//Boundaries and key input for right of screen. If doodle hits right of screen, right key input does not work
				}
				
				break;
			case LEFT:
				if (_doodle.getXLoc() - Constants.DOODLE_XMOVEMENT > 0) {
					_doodle.setLocation(_doodle.getXLoc() - Constants.DOODLE_XMOVEMENT, _doodle.getYLoc());
				//Boundaries and key input for left of screen. If doodle hits left of screen, left key input does not work
				}
				
				break;
			default:
				break;
			}

			e.consume();

		}
	}

	private void setupTimeline() {
		KeyFrame kf = new KeyFrame(Duration.seconds(Constants.DURATION), new TimeHandler());
		timeline = new Timeline(kf);
		timeline.setCycleCount(Animation.INDEFINITE);
		timeline.play();
		
	}

	private class TimeHandler implements EventHandler<ActionEvent> {
	
		@Override
		public void handle(ActionEvent event) {
			_doodle.updateVelocity();
			_doodle.updatePosition();
			scrollPlatforms();
			generatePlatform();
			removePlatforms();
			if (_doodle.getYLoc() >= Constants.WINDOW_HEIGHT) {
				_doodleLabel.setText("Game Over!");
				timeline.stop();
				doodlePane.setOnKeyPressed(null);
				// Stops timeline and keyboard input after doodle falls off screen
			}
			for (int i = 0; i < _platformArrayList.size(); i++) {
				_doodle.bounce(_platformArrayList.get(i));
				// A for loop that loops through everything, checking every platform
			}
		}
	}
}


