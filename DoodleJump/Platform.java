package DoodleJump;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * Here in the Platform class I create my composite shape for my platform made up
 * of an a brown rectangle. I also create several getter methods and also a helper
 * method, setLocation().
 */


public class Platform {
	private Rectangle _platform;
	public Platform(Pane platformPane) {
		_platform = new Rectangle(Constants.PLATFORM_WIDTH, Constants.PLATFORM_HEIGHT);
		_platform.setFill(Color.BROWN);
		_platform.setX(Constants.PLATFORM_STARTINGX);
		_platform.setY(Constants.PLATFORM_STARTINGY);
		platformPane.getChildren().add(_platform);
	}
	
	public Rectangle getPlatform() {
		return _platform; 
	}
	
	public double getYLocPlatform() {
		return _platform.getY();
	}
	
	public double getXLocPlatform() {
		return _platform.getX();
	}
	
	public void setLocation(double x, double y) {  
		_platform.setX(x);
		_platform.setY(y);
		//helper method to set x and y location of platform
	}
}


