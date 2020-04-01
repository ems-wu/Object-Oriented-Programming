package hw1;

/**
 * Welcome to the App class! This is where everything begins.
 */
public class App {
  /**
   * When you run the program, this "main" method gets called first automatically. You'll
   * see that everything starts from this method!
   */
  public static void main(String[] args) {
    // This line prints a greeting into the console
    System.out.println("Hello world!");


    // Here we make a new instance of Chef, and we store it in a variable
    // named kevin. Hop over to Chef.java to see what's going on there.
    Chef kevin = new Chef("Kevin");

    // TODO: Get kevin to make chili and make a new Chef named Jim here!
    // This line exits the program.

    kevin.makeFood("chili");

    Chef jim = new Chef("Jim");

    jim.makeFood("cheese");






    System.exit(0);
  }
}
