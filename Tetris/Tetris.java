package Tetris;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class Tetris {
	/**
	 * Here in the DoodleJump class contains most of my game logic. It also sets up
	 * my timeline, gridArray, and keyboard input for the movement of my piece. I create a couple boolean
	 * methods such as moveValidity() and endGame(), which checks whether my shape can move and whether
	 * the game has ended respectively. 
	 */
	private TetrisSquares[][] _boardArray;
	private Piece _piece;
	private Pane _tetrisSquaresPane;
	private Timeline timeline;
	private boolean _pause;
	private boolean _drop;
	private Pane _labelPane;
	private Label _tetrisLabel;
	
	public Tetris(Pane tetrisPane) {
		_pause = false; //using a flag so I pause/unpause game later in switch statement
		_drop = false;
		_boardArray = new TetrisSquares[Constants.NUM_ROWS][Constants.NUM_COLS];
		_tetrisSquaresPane = tetrisPane;
		_tetrisSquaresPane.setFocusTraversable(true);
		this.makeGridArray();
		this.setupTimeline();
		this.createLabelPane();
		tetrisPane.addEventHandler(KeyEvent.KEY_PRESSED, new KeyHandler());
		tetrisPane.setFocusTraversable(true);
		_piece = new Piece(tetrisPane, _boardArray);
		
	}
	private void createLabelPane() {
		/**
		 * This method creates a label pane and a label for the game. The label will eventually update
		 * when game is overjava pane.
		 */
		_labelPane = new Pane();
		_tetrisLabel = new Label("Tetris ~");
		_labelPane.setStyle("-fx-background-color: pink;");
		_labelPane.getChildren().add(_tetrisLabel);
		_tetrisSquaresPane.getChildren().add(_labelPane);
	}
	private boolean endGame() {
		/**
		 * This method checks that if there is something in the top row, 
		 * then set boolean value to true. I use this method throughout the class
		 * to stop all game play if the method returns true. 
		 */
		int toprow = 2;
		boolean gameOver = false;
		for(int i=2; i<Constants.NUM_ROWS-2;i++) {
			if(_boardArray[i][toprow]!=null) {
				gameOver=true;
				return true;
			}
		} return false;
	}
	
	private void makeGridArray () {
		/** In this method I am creating my grid array (aka border). Using a nested for loop,
		*I create an if statement saying that if my rows are less/equal to 1 or greater 
		*than/equal to my number of rows less than 2, or my columns are less than/equal to
		*1 or the number of columns less than 2, then create a new instance of TetrisSquares
		*there an set the location of that tetris square at the points that are within the
		*parameters of the if statement and for loops. 
		*/
		for (int i = 0; i < Constants.NUM_ROWS; i++) {
			for (int j = 0; j< Constants.NUM_COLS; j++) {		
				if (i <= 1 || i>=Constants.NUM_ROWS - 2|| j <=1 ||j >= Constants.NUM_COLS -2) {
					TetrisSquares rect = new TetrisSquares(_tetrisSquaresPane);
					_boardArray[i][j] = rect;
					rect.setLocation(i*Constants.SQUARE_SIZE,j*Constants.SQUARE_SIZE);
				} 			
			}
		}
	}
	private boolean moveValidity(int directionx, int directiony) {
		/**
		 * This method checks to see if the shape can move in the x or y direction depending
		 * on what numbers you input into the paramters. This boolean method returns false if
		 * the board is not null and returns true if it is
		 */
		TetrisSquares[] squareArray = _piece.getArray();
		for (int i=0; i<4;i++) {
			double newXLoc =  squareArray[i].getXLoc() + directionx * Constants.SQUARE_SIZE;
			double newYLoc = squareArray[i].getYLoc() + directiony * Constants.SQUARE_SIZE ;
			int col = (int) newYLoc/Constants.SQUARE_SIZE;
			int row = (int) newXLoc/Constants.SQUARE_SIZE;
				if(_boardArray[row][col]!=null){
				return false; 
				}
			} 
		return true;
		}
	
	private boolean isRowFull(int i) {
		/**this boolean method returns false if the square is null and true otherwise.
		 * I use it in my clearLines() method.
		*/
		for(int j = 2; j<Constants.NUM_ROWS-2; j++) {
			if (_boardArray[j][i] == null) {
				return false;
			}
		}
		return true;
		}
	
	private void clearLines() {
		/**this method loops through the rows from top to bottom and checks that if a row 
		 * full, then for each column, it graphically removes the node at that row and column, then 
		 * logically removes it. Then for each row from the cleared row to the top of the board,
		 * for each column, you move the square down logically and graphically
		*/
		for (int i=2; i<Constants.NUM_COLS-2; i++) {	
			if(isRowFull(i)) {
				for (int j=2; j<Constants.NUM_ROWS-2; j++){
					_tetrisSquaresPane.getChildren().remove(_boardArray[j][i].getRect());
					_boardArray[j][i]=null;
				}
			for(int row =i; row >2; row--) {
			for (int col=2; col<Constants.NUM_ROWS-2;col++) {
				if(_boardArray[col][row - 1]!=null) {
					_boardArray[col][row - 1].setLocation(_boardArray[col][row - 1].getXLoc(),_boardArray[col][row - 1].getYLoc()+Constants.SQUARE_SIZE);
				}
				_boardArray[col][row - 1]=_boardArray[col][row - 1];
				}
			}	
		}
	}
}

	private void setupTimeline() {
		//sets up the timeline
		KeyFrame kf = new KeyFrame(Duration.seconds(1), new TimeHandler());
		timeline = new Timeline(kf);
		timeline.setCycleCount(Animation.INDEFINITE);
		timeline.play();
	}

	private class KeyHandler implements EventHandler<KeyEvent> {
		@Override
		public void handle(KeyEvent e) {
			if(endGame()==false) {
			KeyCode keyPressed = e.getCode();
			switch (keyPressed) {
			//This switch statement creates key input for the pieces
			case RIGHT:
				if(_pause == false) { 
				if(moveValidity(1, 0)) {
				_piece.move(1, 0);
					}
				}
				//Boundaries and key input for right of screen. If piece hits right of screen, right key input does not work
				break;
			case LEFT:
				if(_pause == false) {
				if(moveValidity(-1, 0)) {
				_piece.move(-1, 0);
				}
				}
				break;
			case DOWN:
				if(_pause == false) {
				if(moveValidity(0, 1)) {
				_piece.move(0, 1);
				}
				}
				break;
			case UP:
				if(_pause == false) {
				_piece.rotate();
				}
				break;
			case SPACE: //why is space bar making the game pause
				if(_pause == false) {
					if(moveValidity(0, 1)) {
						if(_drop==false) { 
						//if _drop is false, timeline will speed up when key pressed
							_drop=true;
							timeline.setRate(Constants.TIMELINE_RATE);
						}
				else if(_drop ==true) {
				//if _drop is true, timeline will reset to normal speed when key pressed
					_drop=false;
					timeline.setRate(1);
					}
				}
			}
				break;
			case P:
				if (_pause == false) {
				    _pause = true;
				    timeline.pause();
				}
				else if (_pause == true) {
				    _pause = false;
				    timeline.play();
				}
			//these two statements toggle the _pause variable so each time P is pressed
				//the timeline either starts or stops depending on whether it returns 
				break;
				default:
					System.out.println(); //code will never reach here
				break;
			}
			e.consume();
		}
	}
}
	
	private class TimeHandler implements EventHandler<ActionEvent> {
		/**Here I create an if else statement, saying that if moveValidity() is true, then
		 * the piece can move down one in the timeline. If not, then get the x and y location
		 * of the squares and add them to the _boardArray. It also says that if the boolean method
		 * endGame() returns false, then add a new piece and clear lines. If it returns true,
		 * then update the label to game over. 
		*/
		@Override
		public void handle(ActionEvent event) {
		if(moveValidity(0,1)) {
			_piece.move(0,1);
		}
		else { //matching graphical with logical location
			//for each square
			for (int i = 0; i<4; i++) {
			TetrisSquares[] squareArray = _piece.getArray();
			double ind_x = squareArray[i].getXLoc()/Constants.SQUARE_SIZE;
			double ind_y = squareArray[i].getYLoc()/Constants.SQUARE_SIZE;
				_boardArray[(int) ind_x][(int) ind_y]= squareArray[i];
			}
			if(endGame()==false) {
			_piece = new Piece(_tetrisSquaresPane, _boardArray);
			Tetris.this.clearLines();
				}
			if(endGame()==true) {
				_tetrisLabel.setText("Game Over!"); //changes label to Gameover if shape hits top row
				}
			}			
		}
	}
}
	
	




