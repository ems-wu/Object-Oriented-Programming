package Tetris;

public class Constants {
	/**
	 * This is my Constants class. It defines some constants I use in Tetris
	 * It includes the dimensions of my square, board, and window, as well as the
	 * values of my number of rows, columns, rate
	 */
	public static final int WINDOW_HEIGHT = 700; // (UNITS: pixels)
	public static final int WINDOW_WIDTH = 400; // (UNITS: pixels)
	
	public static final int SQUARE_SIZE = 20; // (UNITS: pixels)
	public static final int BOARD_WIDTH = 400; // (UNITS: pixels)
	public static final int BOARD_HEIGHT = 700; // (UNITS: pixels)
	public static final int NUM_ROWS = 20;
	public static final int NUM_COLS = 35; 
	public static final int TIMELINE_RATE = 40; // (UNITS: seconds)
	
	public static final double [] [] _Piece1 = { {0,2*SQUARE_SIZE}, {SQUARE_SIZE, 2*SQUARE_SIZE} , {0, 3*SQUARE_SIZE}, {SQUARE_SIZE, 3*SQUARE_SIZE}}; //square shape
	public static final double [] [] _Piece2 = { {0,2*SQUARE_SIZE}, {0, 3*SQUARE_SIZE} , {0, 4*SQUARE_SIZE}, {0, 5*SQUARE_SIZE}}; //long line
	public static final double [] [] _Piece3 = { {0,2*SQUARE_SIZE}, {0, 3*SQUARE_SIZE} , {0, 4*SQUARE_SIZE}, {SQUARE_SIZE, 3*SQUARE_SIZE}}; //t shape
	public static final double [] [] _Piece4 = { {0,2*SQUARE_SIZE}, {0, 3*SQUARE_SIZE} , {0, 4*SQUARE_SIZE}, {SQUARE_SIZE, 2*SQUARE_SIZE}}; //right L
	public static final double [] [] _Piece5 = { {0,2*SQUARE_SIZE}, {SQUARE_SIZE, 3*SQUARE_SIZE} , {SQUARE_SIZE, 2*SQUARE_SIZE}, {SQUARE_SIZE, 4*SQUARE_SIZE}};//left L
	public static final double [] [] _Piece6 = { {0,2*SQUARE_SIZE}, {0, 3*SQUARE_SIZE} , {SQUARE_SIZE, 3*SQUARE_SIZE}, {SQUARE_SIZE, 4*SQUARE_SIZE}}; //left squiggly
	public static final double [] [] _Piece7 = { {0,4*SQUARE_SIZE}, {0, 3*SQUARE_SIZE} , {SQUARE_SIZE, 2*SQUARE_SIZE}, {SQUARE_SIZE, 3*SQUARE_SIZE}}; //right squiggly 
	//Array for the 4 squares, 2D array represents starting location of 4 squares
}
