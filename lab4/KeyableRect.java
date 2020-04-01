package lab4;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class KeyableRect {
	private Rectangle _rect;

	
	public KeyableRect(double x, double y, Color c) {
		// TODO: instantiate the Rectangle object
		_rect = new Rectangle();

		// TODO: modify the constructor's parameters so that it takes in two doubles for the x and y locations, as well as a Color.
		_rect.setWidth(Constants.RECT_WIDTH);
		_rect.setHeight(Constants.RECT_HEIGHT);
		// TODO: set the rectangle's size using the width and height constants in the Constants class
		// TODO: set the rectangle's location and color using the values passed in as parameters
		_rect.setX(x);
		_rect.setY(y);
		_rect.setFill(c);
		_rect.setStroke(c);
		
	}

	// TODO: create public getRectNode() method that returns the Rectangle object
	 public Rectangle getRectNode() {
	        return _rect;
	      }
	// TODO: create public changeColor() method that changes the Rectangle to a randomly generated color
	 public void changeColor() {
		 int red = (int) (Math.random()*256);
		 int green = (int) (Math.random()*256);
		 int blue = (int) (Math.random()*256);
		 Color customColor = Color.rgb(red,green,blue);
		 _rect.setFill(customColor);
	 }
}
