package Cartoon;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Here in the constructor I am instantiating my top level object, PaneOrganizer.
 * App class is where we instantiate your top-level object. I set the scene
 * and title of my window here and showed my stage.
 */

public class App extends Application {

    @Override
    public void start(Stage stage) {
    	PaneOrganizer organizer = new PaneOrganizer(); //Creating instance of PaneOrganizer
    	Scene scene = new Scene(organizer.getRoot());
    		stage.setScene(scene);
    		stage.setTitle("Iron Man");
    		stage.show();
    }
    public static void main(String[] argv) {
        launch(argv);
    }
}
