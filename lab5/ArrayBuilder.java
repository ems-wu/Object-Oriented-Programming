package lab5;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.layout.Pane;

/*
 * This class has methods to build and display arrays with different patterns.
 * You can use the buttons in the GUI to test the different methods.
 */
public class ArrayBuilder {

	/*
	 * WRITE THIS METHOD FIRST, before starting to build the color arrays!
     *
	 * This method is called in ArrayVisualizer, so you do not need to call it yourself.
	 */
	public static void displayArray(Color[][] myArray, Pane parentPane, int[][] arr) {

		/* This generates a 2D array of Rectangles whose colors match the corresponding
		 * Color in myArray. (i.e. if the Color at myArray[1][2] is Color.WHITE, the
		 * Rectangle at rects[1][2] will be white)
         */
			parentPane.getChildren().clear();
		Rectangle[][] rects = ArrayVisualizer.generateSquares(myArray);
		for (int i = 0; i < rects.length; i++) { //rects.length number of rows
			for (int j = 0; j < rects[0].length; j++) {
			// Code to add to the pane goes here!
			parentPane.getChildren().add(rects[i][j]);
			}
			}
		// TODO: display the array here!

	}

	/**
	 * Returns a 16 by 10 2D array of Colors.
	 * The array should consist of vertical stripes of alternating SKYBLUE
	 * and TEAL.
     *
     * A note about modulo: a % b computes the remainder after a is divided by b
     *
     * We can use this behavior to test for even numbers- if i % 2 is 0, then we
     * know that i is even. If i % 2 is 1, then we know that i is odd.
	 */
	public static Color[][] buildStripeArray() {
		Color[][] myArray = new Color[16][10]; // create array
		for (int i = 0; i < myArray[0].length ; i++) {
			//we didn't need the -1 
			for (int j = 0; j < myArray.length ; j++) { // for each index (i, j)
				if (i % 2 == 0) { // if i is even, store SKYBLUE
					myArray[j][i] = Color.SKYBLUE;
				
				} else { // if i is odd, store TEAL
					myArray[j][i] = Color.TEAL;
				
				}
			}
		}
		return myArray;
	}

	/**
	 * Returns a 3 by 4 2D array of Colors.
	 * The array should be fully GREEN.
     *
     * When initially run, the array will be mostly GREEN but contain some
     * RED indices. An index will display red if the int array "intArray" does
     * not match the corresponding pre-defined int array we have written.
     *
     * Your job is to figure out what the correct values should be and update
     * "intArray" accordingly, which should produce a fully green 2D array in
     * the visualizer.
     *
     * HINT: Use print statements!!
	 */
	public static Color[][] buildGreenArray() {
		

		int[][] intArray = { {3, 7, 34, 9}, {2, 5, 1, 4}, {3, 2, 12, 16} }; // the int array to be updated
		
		Color[][] myArray = new Color[3][4]; // create color array
		//nullpointer - means something not initialized, in this case it was myArray
		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray[0].length; j++) { // for each index (i, j)
				if (intArray[i][j] == Constants.INT_ARRAY[i][j]) { // if the value at intArr[i][j] is correct
					myArray[i][j] = Color.GREEN;
				}
				else {
					myArray[i][j] = Color.RED;
					System.out.println("Error: Unexpected value at arr[" + i + "][" + j + "]");
				}
			}
		}
		return myArray;
	}


	/**
	 * Returns an 8 by 8 2D array of Colors.
	 * The array should be patterned like a checkerboard, alternating RED and
	 * BLACK such that no two adjacent indices contain the same color. See the
	 * handout for a picture.
	 */
	public static Color[][] buildCheckerArray() {
		// TODO: Fill in this method and return a 2D array of Colors!
		Color[][] myArray = new Color[8][8]; // create array
		for (int i = 0; i < myArray[0].length ; i++) {
			for (int j = 0; j < myArray.length ; j++) { 
				if ((i + j) % 2 == 0) { 
					myArray[j][i] = Color.RED;
				
				} else {
					myArray[j][i] = Color.BLACK;
				
				}
			}
		}
		return myArray;
	}
//array list for platforms, store platforms, add things and get rid of things
	//array lists are flexible
	//array list in game class
	/**
	 * Returns a 7 by 4 (7 rows, 4 columns) 2D array of Colors.
	 * The left half of the array (lower x-indices) should be CYAN and the
	 * right half (higher x-indices) should be BLUE. See the handout for a
	 * picture.
	 */
	public static Color[][] buildTwoColorArray() {
		Color[][] myArray = new Color[7][4]; 
		for (int i = 0; i < myArray[0].length ; i++) {
			for (int j = 0; j < myArray.length ; j++) { 
				if ( i <= 1) { 
					myArray[j][i] = Color.AQUAMARINE;
				
				} else {
					myArray[j][i] = Color.BLUE;
				
				}
			}
		}
		return myArray;
	}
	/**
	 * Returns a 5 by 5 2D array of Colors.
	 * The array should be completely CRIMSON except for a single diagonal
	 * stripe that extends from the top-left (0, 0) to the bottom-right (4, 4)
	 * and is colored YELLOW. See the handout for a picture.
	 */
	public static Color[][] buildDiagonalStripeArray() {
		// TODO: Fill in this method and return a 2D array of Colors!
		
		int[][] intArray = { {3, 0, 0, 0, 0}, {0, 5, 0, 0, 0}, {0, 0, 12, 0, 0}, {0, 0, 0, 9, 0}, {0, 0, 0, 0, 6}};
		
		Color[][] myArray = new Color[5][5]; 
		for (int i = 0; i < myArray[0].length ; i++) {
			for (int j = 0; j < myArray.length ; j++) { 
				if (intArray[i][j] == Constants.DIAGONAL_ARRAY[i][j]) { 
					myArray[i][j] = Color.YELLOW;
				
				}
				else {
					myArray[i][j] = Color.RED;
				
				}
			}
		}
		return myArray;
	}
}
