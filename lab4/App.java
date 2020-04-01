package lab4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class App extends Application {

  /**
   * The main method - this is the entry point to the entire program.
   *
   * @param args
   *          - just the command line arguments
   */
  public static void main(String[] args) {
      launch(args);
  }

  /**
   * JavaFX magic calls this method. The primaryStage is the frame in which
   * everything else is included.
   */
  @Override
  public void start(Stage primaryStage) {
	 
	  // TODO: instantiate Organizer and set up the scene
	  PaneOrganizer organizer = new PaneOrganizer();
	 
	  Scene scene = new Scene(organizer.getRoot());
	  primaryStage.setScene(scene);
	  // TODO: set the title and show the primaryStage
	  
	  primaryStage.setTitle("MyNewTitle");
	  primaryStage.show();

  }
}
