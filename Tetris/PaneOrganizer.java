package Tetris;

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
 * Here in the PaneOrganizer class, I handle setting the background. creating a getter
 * method for my pane, and creating the button pane for my quit button.
 */
public class PaneOrganizer {
	private BorderPane _root;
	public PaneOrganizer() {
		Pane tetrisPane = new Pane();
		Tetris tetris = new Tetris(tetrisPane);
		ImageView tetrisBG = new ImageView(new Image("file:./Tetris/sushi.jpg"));
		_root = new BorderPane();
		_root.getChildren().add(tetrisBG);
		_root.setCenter(tetrisPane);
		this.createButtonPane();
	}
	
	public Pane getRoot() {
		//getter method for the root of my pane
		return _root;
	}
	
	public void createButtonPane() {
		/**
		 * This method creates a button pane for the quit button. The setOnAction() methods 
		 * makes the button able to quit the game. 
		 */
		HBox buttonPane = new HBox();
		Button quit = new Button("Quit");
		buttonPane.getChildren().addAll(quit);
		buttonPane.setAlignment(Pos.CENTER);
		_root.setBottom(buttonPane);
		quit.setOnAction(new ClickHandler());
	}
	
	private class ClickHandler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent e) { //this creates the quit button
			System.exit(0);
		}
	}
}
