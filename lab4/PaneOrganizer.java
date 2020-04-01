package lab4;

import javafx.event.EventHandler;

import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.application.Platform;

public class PaneOrganizer {
	private BorderPane _root;
	private KeyableRect _leftRect;
	private KeyableRect _rightRect;
	private KeyableRect _centerRect;
	private Label _label;
	private VBox _labelPane;
	
	
	
	public PaneOrganizer() {
		_root = new BorderPane();
	
		
		// TODO: instantiate the BorderPane and call the private methods here
		_root.setStyle("-fx-background-color: orange;");
		 this.createRectsPane();
		 this.createLabelPane();
		 //label label = new label();
	}

	// TODO: make public getRoot() method that returns the BorderPane
	public BorderPane getRoot() {
		return _root;
	}	
	public void createRectsPane() {
		Pane rectsPane = new Pane();
		this._leftRect = new KeyableRect(Constants.LEFT_RECT_X,Constants.LEFT_RECT_Y,Color.BLUE);
		this._rightRect = new KeyableRect(Constants.RIGHT_RECT_X,Constants.RIGHT_RECT_Y,Color.GREEN);
		this._centerRect = new KeyableRect(Constants.CENTER_RECT_X,Constants.CENTER_RECT_Y,Color.RED);
		rectsPane.getChildren().addAll(_leftRect.getRectNode(),
				_centerRect.getRectNode(), _rightRect.getRectNode());
		rectsPane.setPrefSize(Constants.RECT_PANE_PREF_WIDTH, Constants.RECT_PANE_PREF_HEIGHT);
		rectsPane.setStyle("-fx-background-color: #FFFFFF;");
	
		_root.setTop(rectsPane);
		
		rectsPane.addEventHandler(KeyEvent.KEY_PRESSED, new KeyHandler());
		rectsPane.setFocusTraversable(true);
	
	
	}

	// TODO: make private createRectsPane() method that creates the user-responsive rectsPane
	public void createLabelPane() {
		_labelPane = new VBox();
		_root.setBottom(_labelPane);
		_label = new Label("Introduction to JavaFX!");
		_labelPane.getChildren().addAll(_label);
		_labelPane.setAlignment(Pos.CENTER);
	
		//all instance variables need underscores, local variables do not
	}

	private class KeyHandler implements EventHandler<KeyEvent> {
		@Override
		public void handle(KeyEvent e) {
			KeyCode keyPressed = e.getCode();
			
			// TODO: add switch statement for keyPressed input
			switch (keyPressed) {
				case L: 
					_leftRect.changeColor();
					break;
				case C: 
					_centerRect.changeColor();
					break;
				case R: 
					_rightRect.changeColor();
					break;
				case SPACE:
					System.out.println("Spacebar!");
					break;
				case Q:
					Platform.exit();
					break;
				default:
					break;
			}
			
			e.consume();
					
			// TODO: consume the event here
			
		}
	}
}

