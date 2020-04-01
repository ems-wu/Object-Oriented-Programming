package FruitNinja;

import javafx.application.Application;
import javafx.stage.Stage;
import cs015.prj.FruitNinjaSupport.FruitNinjaFrame;
import cs015.prj.FruitNinjaSupport.Blade;

/**
 * Here in the constructor I am instantiating my top level object, FruitNinja.
 * instantiate your top-level object. I create two new local variables:
 * frame and fruitninja.
 */

public class App extends Application{

	@Override
	public void start(Stage stage)  {
		FruitNinjaFrame frame = new FruitNinjaFrame(stage);

		FruitNinja fruitninja = new FruitNinja();

		frame.addGame(fruitninja);
		/**here I am calling add game on the instance of frame I created earlier
		*I need to pass in a game of type CS15Game so I passed in fruitninja
		*/
	}
	public static void main(String[] argv) {
		launch(argv);
	}

}
