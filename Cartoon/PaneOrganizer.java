package Cartoon;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/**
 * PaneOrganizer is the top level class and is where I have my quit button
 * and label and button panes.
 */

public class PaneOrganizer {
	private BorderPane _root;
	private HBox _buttonPane;
	private HBox _labelPane;
	private Label _ironmanLabel;
	public PaneOrganizer() {
		Pane cartoonPane = new Pane();
		Cartoon cartoon = new Cartoon(cartoonPane, _ironmanLabel);
		_root = new BorderPane();
		_root.setStyle("-fx-background-color: black;");
		_root.setCenter(cartoonPane);
		/**Here I am passing in cartoonPane and _ironmanLabel b/c Cartoon 
		*can take an instance of Pane and Label b/c I modified the constructor
		*in the Cartoon class
		*/
		this.createButtonPane();
		this.createLabelPane();
	}
	public void createButtonPane() {
		_buttonPane = new HBox();
		Button quit = new Button("Quit");
		_buttonPane.getChildren().addAll(quit);
		_buttonPane.setAlignment(Pos.CENTER);
		_root.setTop(_buttonPane);
		quit.setOnAction(new ClickHandler());
	}
	public void createLabelPane() {
		_labelPane = new HBox(); //Making a HBox Label Pane for my Ironman label;
		 _ironmanLabel = new Label("Ironman Go!");
		DropShadow dropShadow = new DropShadow();
			_labelPane.setAlignment(Pos.CENTER);
			_labelPane.setPrefSize(25,25);
			_labelPane.setStyle("-fx-background-color: lightyellow;");
		_labelPane.getChildren().add(_ironmanLabel);  
			 /**here create an instance of DropShadow 
			  * so I can create the drop shadow effect for my text
			  */
				_ironmanLabel.setEffect(dropShadow);
				_ironmanLabel.setCache(true);
				_ironmanLabel.setFont(Font.font(null, FontWeight.BOLD, 40));
		_root.setBottom(_labelPane);
		
	}

	public Pane getRoot() {
		return _root;
	}
	private class ClickHandler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent e) { //this creates the quit button
			Platform.exit();
		}
	}
}