package LiteBrite;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * This is the App class.
 * You should instantiate your top-level object in the constructor.
 *
 * This is where I instantiated my top level object (aka LiteBrite). The app
 clas models an application and only instantiaties my top level object. 
 */

public class App extends Application {

    public void start(Stage stage) {
        // This line causes the LiteBrite frame to appear.
        new cs015.prj.LiteBriteSupport.LiteBriteFrame(stage);
        // Your code goes here.
   LiteBrite litebrite = new LiteBrite();
    }
    /**
    * This is called a mainline.  When you type "java LiteBrite.App"
    * this method gets called automatically.  Ignore the "String[] args"
    * for now; you won't need it in CS15.  All this method does is
    * call the launch method, which is a JavaFX method that calls the start
    * method above. So if your code is in that start method then it will be
    * executed and run!
    *
    * DO NOT CHANGE THIS CODE!
    */
    public static void main(String[] argv) {
        launch(argv);
    }
}
