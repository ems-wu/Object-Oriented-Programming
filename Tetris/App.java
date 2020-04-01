package Tetris;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
  *Here in the constructor I am instantiating my top level object,
 * PaneOrganizer. App class is where we instantiate your top-level object. I set
 * the scene and title of my window here and showed my stage. I set the stage
 * resizable to false so I can't change the window of my game, which makes
 * creating the constraints more convenient.
  */

public class App extends Application {

    @Override
    public void start(Stage stage) {
    	PaneOrganizer organizer = new PaneOrganizer();
		Scene scene = new Scene(organizer.getRoot(), Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
		stage.setScene(scene);
		stage.setTitle("Tetris <3");
		stage.setResizable(false); // keeps screen same size
		stage.show();
    }

    public static void main(String[] argv) {
        launch(argv);
    }
}
