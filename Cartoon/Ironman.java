package Cartoon;

import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

/**
 * Here in the Ironman class I create my composite shape made up
 * of an ellipse, rectangles, and a polygon.
 */

public class Ironman {
	private Ellipse _ellipse;
	private Rectangle _rect;
	private Polygon _mask;
	private Rectangle _leftEye;
	private Rectangle _rightEye;
	private Pane _root;

	public Ironman(Pane root) {
		this.createIronman();
		root.getChildren().addAll(_ellipse, _rect, _mask, _leftEye, _rightEye);
	//this adds all the features of ironman to the pane
	}
	
	public void createIronman() {
		_root = new Pane();
		_ellipse = new Ellipse(150,195);
		_rect = new Rectangle(200,150);
		_mask = new Polygon();
		_leftEye = new Rectangle(70, 20);
		_rightEye = new Rectangle(70, 20);
		_ellipse.setFill(Color.RED);
		_ellipse.setCenterX(700);
		_ellipse.setCenterY(400);
		_rect.setFill(Color.RED);
		_rect.setX(600);
		_rect.setY(470);
		_mask.setFill(Color.YELLOW);
		_mask.setStrokeWidth(1.5); 
		_mask.setStroke(Color.BLACK);
		_mask.getPoints().addAll(new Double[]{  //I created a polygon for the mask
				 630.0, 280.0, //top left point				
		         680.0, 350.0,			         
		         720.0, 350.0,			        
		         770.0, 280.0,			        
				 820.0, 295.0, 
				 805.0, 410.0, 
		         820.0, 500.0, 	
		         750.0, 610.0, 
		         650.0, 610.0,			         
		         580.0, 500.0,
		     	 595.0, 410.0, 	        			      			         
		         580.0, 295.0,      
		       //here are all the (x,y) points of the polygon
	  });
		_leftEye.setFill(Color.TURQUOISE);
		_leftEye.setX(600);
		_leftEye.setY(380);
		_leftEye.setStrokeWidth(1.5); 
		_leftEye.setStroke(Color.BLUE);
		_rightEye.setFill(Color.TURQUOISE);
		_rightEye.setX(730);
		_rightEye.setY(380);
		_rightEye.setStrokeWidth(1.5); 
		_rightEye.setStroke(Color.BLUE);
	
	_mask.addEventHandler(KeyEvent.KEY_PRESSED, new KeyHandler());
	_leftEye.addEventHandler(KeyEvent.KEY_PRESSED, new KeyHandler());
	_rightEye.addEventHandler(KeyEvent.KEY_PRESSED, new KeyHandler());
	_mask.setFocusTraversable(true);
	_mask.setFocusTraversable(true);
	_leftEye.setFocusTraversable(true);
	_rightEye.setFocusTraversable(true); //brings the focus to the specific ironman head parts
	}
	public double getYLoc() {
		return _ellipse.getCenterY(); 
		/**Here I am getting the center Y so I can move my 
		/composite shape down the y-coordinate
		 */
	}
	public void addY(double Y) {
		_ellipse.setCenterY(_ellipse.getCenterY() + Y);
		_mask.setLayoutY(_mask.getLayoutY() + Y);
		_rect.setY(_rect.getY() + Y);
		_leftEye.setY(_leftEye.getY() + Y);
		_rightEye.setY(_rightEye.getY() + Y); //adds value of y for each movement
	}
		

	private class KeyHandler implements EventHandler<KeyEvent> { 
		//My KeyHandler class can visually change color of the eyes and masks
		@Override
		public void handle(KeyEvent e) {
			KeyCode keyPressed = e.getCode();
			// I created a switch statement for keypressed input b/c I have multiple cases
			switch (keyPressed) {
				case L: 
					_leftEye.setFill(Color.BLACK);
					break;
				case R: 
					_rightEye.setFill(Color.BLACK);
					break;
				case M: 
					_mask.setFill(Color.PINK);
					break;
				default:
					break;
			} //When you pressed each letter, the shapes fill to the corresponding color
			
			e.consume();				
			
		}
	}
}
	 

