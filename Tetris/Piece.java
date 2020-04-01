package Tetris;

import javafx.scene.layout.Pane;
/**
 * This is my Piece class. This class creates my _1dArray that holds the my tetris 
 * square pieces created from my TetrisSquares class. It also has a getter for my array
 * which I utilize in my game class.
 */
public class Piece {
	private TetrisSquares[] _1dArray;
	private TetrisSquares[][] _board;
	private boolean _isSquare;
	public Piece(Pane piecePane, TetrisSquares[][] board) {
		_board = board;
		_1dArray = new TetrisSquares[4];
		_1dArray[0] = new TetrisSquares(piecePane);
		_1dArray[1] = new TetrisSquares(piecePane);
		_1dArray[2] = new TetrisSquares(piecePane);
		_1dArray[3] = new TetrisSquares(piecePane); 
		//added 4 squares into piece array that will later be configured
		this.generatePiece();
	}
	
	public TetrisSquares[] getArray() {
		return _1dArray; //getter method for _1dArray
	}
	
	private void generatePiece() { //creates orientation of piece
		int rand_int = (int) (Math.random() *10); //creates random # between 0 and 10
		switch (rand_int) { 
		case 0: case 1:
			for (int i = 0; i<_1dArray.length; i++) {
			_isSquare =true; //stored a boolean so square won't rotate
			_1dArray[i].setLocation(Constants._Piece1[i][0]+Constants.BOARD_WIDTH/2,Constants._Piece1[i][1]);
			//on each index set location of that of the indicies within 2d array storing constants
			_1dArray[i].setSquareColor(); //changes each square to random color established in helper method
			}
			break;
			case 2: case 3:
				for (int i = 0; i<_1dArray.length; i++) {
				_1dArray[i].setLocation(Constants._Piece3[i][0]+Constants.BOARD_WIDTH/2,Constants._Piece3[i][1]);
				_1dArray[i].changeColor();
				}
				break;
			case 4: case 5:
				for (int i = 0; i<_1dArray.length; i++) {
				_1dArray[i].setLocation(Constants._Piece4[i][0]+Constants.BOARD_WIDTH/2,Constants._Piece4[i][1]);
				_1dArray[i].changeColor();
				}
				break;
			case 6: case 7:
				for (int i = 0; i<_1dArray.length; i++) {
				_1dArray[i].setLocation(Constants._Piece5[i][0]+Constants.BOARD_WIDTH/2,Constants._Piece5[i][1]);
				_1dArray[i].changeColor();
				}
				break;
			case 8: 
				for (int i = 0; i<_1dArray.length; i++) {
				_1dArray[i].setLocation(Constants._Piece6[i][0]+Constants.BOARD_WIDTH/2,Constants._Piece6[i][1]);
				_1dArray[i].changeColor();
				}
				break;
			case 9:
				for (int i = 0; i<_1dArray.length; i++) {
				_1dArray[i].setLocation(Constants._Piece2[i][0]+Constants.BOARD_WIDTH/2,Constants._Piece2[i][1]);
				_1dArray[i].changeColor();
				}
				break;
			case 10:
				for (int i = 0; i<_1dArray.length; i++) {
					_1dArray[i].setLocation(Constants._Piece7[i][0]+Constants.BOARD_WIDTH/2,Constants._Piece7[i][1]);
					_1dArray[i].changeColor();
					}
			break;
			default:
				for (int i = 0; i<_1dArray.length; i++) {
					_1dArray[i].setLocation(Constants._Piece7[i][0]+Constants.BOARD_WIDTH/2,Constants._Piece7[i][1]);
					_1dArray[i].changeColor();
					} //it should never get here
				}
			}
	
	public void move(double xOffset, double yOffset) {
		/**Loops through all the squares and sets the x and Y location
		 * depending on the offset given
		*/
		for (TetrisSquares square: _1dArray) { 
			square.setLocation(square.getXLoc()+xOffset * Constants.SQUARE_SIZE, square.getYLoc()+yOffset * Constants.SQUARE_SIZE);
			}
		}
	
	public void rotate() {
		/**Rotates the piece 90 degrees based on the 3rd index of the array
		*/
		double centerOfRotationX = _1dArray[2].getXLoc();
		double centerOfRotationY = _1dArray[2].getYLoc(); //getting x and y location of 2nd index in 1dArray
		boolean canRotate = true;
		double[] newX = new double[4];
		double[] newY = new double[4];
		for (int i = 0; i < 4; i++) {
		double locX = _1dArray[i].getXLoc();
		double locY = _1dArray[i].getYLoc(); 
		double newXLoc = centerOfRotationX - centerOfRotationY + locY;
		double newYLoc = centerOfRotationY + centerOfRotationX - locX;
		newX[i] = newXLoc;
		newY[i] = newYLoc;
		if (newXLoc < 0 || newYLoc < 0 || newXLoc > Constants.WINDOW_WIDTH+2) {
			//checks if new x and y location are within board
			canRotate = false;
		}
		else if (_board[(int) (newXLoc/Constants.SQUARE_SIZE)][(int) (newYLoc/Constants.SQUARE_SIZE)]!=null) {
			//checks if index is null
			canRotate = false;	
			}
		}
		if(canRotate){
			if(_isSquare!=true) { //makes sure square won't rotate
				for (int i=0; i<4; i++) {
					_1dArray[i].setLocation(newX[i], newY[i]);
				}
			}
		}
	}
}
	
	






