package DoodleJump;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * This class creates the composite shape for my doodle and sets the initial location. It also
 * creates several helper methods such as bounce(), updatePosition(), and updateVelocity(), which
 * I utilize in DoodleJump, my game class. 
 */

public class Doodle {
	private Rectangle _doodle;
	private double _vel;
	private double _pos;
	
	public Doodle(Pane doodlePane) {
		_vel = Constants.REBOUND_VELOCITY;
		_pos = Constants.DOODLE_STARTINGY;
		_doodle = new Rectangle(Constants.DOODLE_WIDTH, Constants.DOODLE_HEIGHT);
		_doodle.setFill(Color.GREEN);
		_doodle.setX(Constants.DOODLE_STARTINGX);
		_doodle.setY(Constants.DOODLE_STARTINGY);
		doodlePane.getChildren().add(_doodle);		
	}
	
	public double getYLoc() {
		return _doodle.getY(); 
	}
	
	public double getXLoc() {
		return _doodle.getX(); 
	}
	
	public Rectangle getDoodle() {
		return _doodle;
	}
	
	public void updateVelocity() {
		/**
		 * This method determines the velocity of the doodle based on the current velocity 
		 * multiplied by the value of gravity and duration, which are constants determined in the
		 * constants class.
		 */
		_vel = _vel + Constants.GRAVITY * Constants.DURATION;
		
	}
	
	public void setY(double pos) {
		_doodle.setY(pos);
		_pos = pos;
		
	}
	
	public void bounce(Platform _platform) {
		/**
		 * This method checks if the doodle intersects a platform through the if statement, then 
		 * sets the velocity equal the the rebound velocity, which is defined in the constants class.
		 */
		if (_doodle.intersects(_platform.getXLocPlatform(), _platform.getYLocPlatform(), Constants.PLATFORM_WIDTH, Constants.PLATFORM_HEIGHT)){
			_vel = Constants.REBOUND_VELOCITY;
		}
	}
	
	public void updatePosition() {
		/**
		 * This method sets the y location of the doodle determined by adding the current position 
		 * of doodle to its velocity multiplied by duraiton. 
		 */
		_pos = _pos + _vel * Constants.DURATION;
		_doodle.setY(_pos);
	}
	
	public void setLocation(double x, double y) {
		_doodle.setX(x);
		_doodle.setY(y);
		_pos = y;
	}
}
