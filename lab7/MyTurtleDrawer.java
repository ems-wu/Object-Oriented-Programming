package lab7;

import cs015.labs.PseudocodeSupport.*;

public class MyTurtleDrawer extends AbstractTurtleDrawer {

	/**
	 * Your goal in this lab is to have a turtle draw a chain of squares.
	 * But wait! Someone has locked you out of the system! If you don't enter
	 * the correct password the App will automatically exit.
	 */
	public MyTurtleDrawer() {
		super();
		String login = "ewu18"; // fill in your login

		
		String password = "My cousin is Perry the Platypus"; // use print lines to figure out what the correct password is!
		System.out.println(this.getPassword(login));
		
		this.checkPassword(login, password); // Hint: how can you look at the code for checkPassword(...)?
		
	}


	/**
	 * Fill in this method to draw a chain of squares. The Turtle
	 * class has the following methods you can call:
	 *
	 * 	public void moveForward(int steps); // where steps is in pixels
	 * 	public void turnRight(); // turns turtle 90 degrees to the right
	 * 	public void turnLeft(); // turns turtle 90 degrees to the left
	 * 	public void penDown(); // starts drawing
	 * 	public void penUp(); // stops drawing
         *
	 * For example, to move the turtle forward by 10 pixels, call:
	 *	turtle.moveForward(10);
	 *
	 */
	@Override
	public void drawSquares(Turtle turtle, double sideLen) {
		turtle.penDown();
		turtle.moveForward(sideLen);
		turtle.turnRight(); 
		turtle.moveForward(sideLen);
		turtle.turnRight(); 
		turtle.moveForward(sideLen);
		turtle.turnRight(); 
		turtle.moveForward(sideLen);
		sideLen = sideLen-10;
		turtle.penUp();
		// Fill me in!
		while (sideLen > 0) { 
			//for (int j = 0; j < 5; j++) {
			turtle.penDown();
			turtle.moveForward(sideLen);
			turtle.turnRight(); 
			turtle.moveForward(sideLen);
			turtle.turnRight(); 
			turtle.moveForward(sideLen);
			turtle.turnRight(); 
			turtle.moveForward(sideLen);
			turtle.turnRight(); 
			turtle.moveForward(sideLen);
			turtle.penUp();
			sideLen = sideLen-10;
		}
		

		}
	}

