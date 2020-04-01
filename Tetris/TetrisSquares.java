package Tetris;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
/**
 * Here I create the composite shape for my tetris square and make it transparent
 * for the border. Here I also create several getter methods for the rectangle and
 * x and y locations. I create changeColor(), a helper method for my Piece class.
 */
public class TetrisSquares {
	private Rectangle _rect;
	private Color _color;
	public TetrisSquares(Pane tetrisSquaresPane) {
	_color = Color.ALICEBLUE; //I chose to specifically fill the square shape with this color
	//border made of squares, piece can check if it's colliding with the border
	_rect = new Rectangle(Constants.SQUARE_SIZE,Constants.SQUARE_SIZE);
	_rect.setFill(Color.TRANSPARENT);
	_rect.setStroke(Color.PINK);
	tetrisSquaresPane.getChildren().add(_rect);
	}
	
	public void setLocation(double x, double y) {
		//setter method to set the x and y location of _rect
		_rect.setX(x);
		_rect.setY(y);
	}
	
	public Rectangle getRect(){
		return _rect;
	}
	
	public void changeColor() {
		/** this changes _rect to a random color that I have predetermined depending on
		 * the switch statement.
		 */
		int rand_int = (int) (Math.random() *10);
		switch (rand_int) {
		case 0: case 1:
			_rect.setFill(Color.LIGHTBLUE);
			break;
		case 2: case 3:
			_rect.setFill(Color.AQUAMARINE);
			break;
		case 4: case 5: 
			_rect.setFill(Color.HONEYDEW);
		case 6: case 7:
			_rect.setFill(Color.LIGHTPINK);
		case 8: case 9:
			_rect.setFill(Color.LAVENDER);
		case 10:
			_rect.setFill(Color.SKYBLUE);
		default:
		    _rect.setFill(Color.SKYBLUE); //code will never reach here
		break; 
		}	
	}
	
	public void setSquareColor() {
		_rect.setFill(_color);
	}
		//setter method to set color in Piece class
	
	public double getXLoc() {
		return _rect.getX();
		//getter method for x location of _rect
	}
	
	public double getYLoc() {
		return _rect.getY();
		//getter method of y location of _rect
	}
}
