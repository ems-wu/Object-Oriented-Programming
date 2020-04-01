package DoodleJump;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

/**
 * Here in the PaneOrganizer class, I handle the basic graphics and create a button pane.
 * I implement my quit button here.
 */

public class PaneOrganizer {
	private BorderPane _root;
	private HBox _buttonPane;
	
	public PaneOrganizer() {
		Pane doodleJumpPane = new Pane();
		Pane platformPane= new Pane();
		ImageView doodleBG = new ImageView(new Image("file:./DoodleJump/temp1406589445.png")); //imported my own image for bg
		DoodleJump doodleJump = new DoodleJump(doodleJumpPane);
		_root = new BorderPane();
		_root.getChildren().add(doodleBG);
		_root.setCenter(doodleJumpPane);
		this.createButtonPane();		
	}
	
	public Pane getRoot() {
		return _root;
	}
	
	public void createButtonPane() {
		/**
		 * This method creates a button pane for the quit button. The setOnAction() methods 
		 * makes the button able to quit the game. 
		 */
		_buttonPane = new HBox();
		Button quit = new Button("Quit");
		_buttonPane.getChildren().addAll(quit);
		_buttonPane.setAlignment(Pos.CENTER);
		_root.setTop(_buttonPane);
		quit.setOnAction(new ClickHandler());
	}
	
	private class ClickHandler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent e) { //this creates the quit button
			System.exit(0);
		}
	}
}
