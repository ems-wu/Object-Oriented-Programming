package lab5;

import java.util.ArrayList;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.layout.Pane;

/**
 * This is the class you'll be using for Part 2 of the lab. Your job is to
 * fill in a series of methods, each of which will modify the ArrayList of
 * Colors _colors. Our support code will visualize this ArrayList for you,
 * and you can use the buttons in the GUI to test each method you write.
 */
public class ArrayListBuilder {

	/**
	 * This is the ArrayList of Colors your methods will modify.
	 * Do not change this code!
	 */
	ArrayList<Color> _colors = new ArrayList<Color>();


	/*
	 * WRITE THIS METHOD FIRST!
	 *
	 * This method is very similar to the displayArray() method in ArrayBuilder.
	 */
	public void displayArrayList(Pane parentPane) {

		// This generates an ArrayList of rectangles with Colors based on the ArrayList
		// _colors
		parentPane.getChildren().clear();
		ArrayList<Rectangle> rects = ArrayListVisualizer.generateSquares(_colors);
		parentPane.getChildren().addAll(rects);
        // TODO: add the elements of the ArrayList to be displayed visually!

	}

	/**
	 * Adds a PINK color to the end of the ArrayList _colors.
	 */
	public void addPink() {
		_colors.add(Color.PINK);
	}

	/**
	 * Clears (empties) the ArrayList _colors.
	 */
	public void clear() {
		_colors.clear();
	}

	/**
	 * Adds a WHITE color to the end of the ArrayList _colors.
	 */
	public void addWhite() {
		_colors.add(Color.WHITE);
		// TODO: Fill in this method
	}

	/**
	 * Adds three PINK to the end of the ArrayList _colors.
	 */
	public void addThreePink() {
        // TODO: Fill in this method
		_colors.add(Color.PINK);
		_colors.add(Color.PINK);
		_colors.add(Color.PINK);
			 
	}

	/**
	 * Removes the third element from the ArrayList _colors (if there is a
	 * third element-- otherwise, does nothing).
	 */
	public void removeThird() {
        // TODO: Fill in this method
		_colors.remove(2);
	}

	/**
	 * Loops through the ArrayList _colors, replacing every element that is
	 * currently PINK with BLUE. (Hint: you can test whether two colors are
	 * the same using the "equals" method. For example, if you have a Color
	 * called "someColor" and you want to know if it's orange, you could say:
	 *
	 * "if (someColor.equals(Color.ORANGE)) {
	 * 		System.out.println("It's orange!");
	 * }"
	 */
	public void changePinksToBlues() {
		// TODO: Fill in this method
		for (int i = 0; i < _colors.size(); i++) { 
			if (_colors.get(i).equals(Color.PINK)) {
			_colors.set(i,Color.BLUE); 
		 }
	}

}
}
