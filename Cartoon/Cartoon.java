package Cartoon;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

/**
 * Here in the Cartoon class I set up the functions of my cartoon and create me time line.
 * I also pass in an instance of Pane and Label into my constructor so I can create association.
 */


public class Cartoon {
	private BorderPane _root;
	private Ironman _ironMan;
	private Label _ironmanLabel;
	public Cartoon(Pane cartoonPane, Label ironmanLabel) {
		Pane ironmanPane = cartoonPane; //ironmanPane contains my composite shape
		_ironMan = new Ironman(ironmanPane);
		_ironmanLabel = ironmanLabel;
		this.setupTimeline();
		}
	
		public BorderPane getRoot() {
			return _root;
		}
		public void setupTimeline() {
			KeyFrame kf = new KeyFrame(
					Duration.seconds(.04), //duration of each keyframe
					new TimeHandler());
			Timeline timeline = new Timeline(kf);
			timeline.setCycleCount(
					Animation.INDEFINITE); //animation never stops
			timeline.play();
		}
		private class TimeHandler implements EventHandler<ActionEvent>{ 
			/**EventHandler is private inner class
			 * has access to instance variables/methods of the class that declared it
			 */
		@Override	
			public void handle(ActionEvent event) {
				if(_ironMan.getYLoc() == 0) {
					_ironMan.addY(0);
				} 
				else {
					_ironMan.addY(2); //add 2 to y-coordinate every .05 seconds
				}
				if(_ironMan.getYLoc() >= 800) {
					_ironmanLabel.setText("Where did he go!"); //changes label after 800 on y coordinate plane
			}
		}
	}
}

	

