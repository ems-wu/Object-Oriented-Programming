package AndyBot;

import cs015.prj.AndyBotSupport.AndyBot;
import cs015.prj.AndyBotSupport.MazeSolverSupport;

public class MazeSolver extends MazeSolverSupport{

    public MazeSolver(AndyBot andyBot) {
        // This is the constructor.
        // **Please do not alter this part of the code**
        super();
        this.solve(andyBot);
    }

    /**
     * The method can manipulate an AndyBot instance to solve the maze.
     */
    public void solve(AndyBot andyBot) {
        // TO DO: Call move methods on the robot so that it knows
        // which steps to take.
          andyBot.moveUp(1);
          andyBot.shuffleLeft(2);
          andyBot.moveUp(2);
          andyBot.shuffleLeft(1);
          andyBot.moveUp(1);
          andyBot.shuffleLeft(1);
          andyBot.moveUp(2);
          andyBot.shuffleRight(3);
          andyBot.moveUp(2);
          andyBot.shuffleRight(2);
        // TO DO: Nest a call to getHint within a call to solveRoadBlock
        // so that the hint is passed to solveRoadBlock. (Make sure to do
        // this before you attempt to move up!)
          this.getHint();
          this.solveRoadBlock(this.getHint());
          andyBot.moveUp(2);

    }
      // public int getHint(int x) {
      //   return x;
        //don't need this, already have method coded in parent class, can access it by using key word "this"




    /**
     * Solves a roadblock using the passed in integer.
     */
    public void solveRoadBlock(int x) {
      this.enterPassword(4 * x - 6);





        // TO DO: call enterPassword and pass it 4 times x, minus 6
    }
  }
