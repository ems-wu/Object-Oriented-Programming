package hw1;

/**
 * This is the Chef class, which knows how to make food.
 */
public class Chef {

  /**
   * The constructor, which gets called whenever a new instance of Chef is made.
   */
  public Chef(String name) {
    System.out.println("A new Chef named " + name + " has been made.");

    // We want every instance of Chef to be ready to make food! That's why we
    // call this method in the constructor.
    this.getReady();
  }

  /**
   * This method prints out this chef getting ready. Don't worry about the
   * "private" keyword for now -- we'll come back to it later in class.
   */
  private void getReady() {
    System.out.println("Washing hands, putting on an apron, and prepping the " +
        "kitchen...");
  }



  /**
   * TODO: Write your makeFood() method goes below!
   */

  public void makeFood(String foodToMake) {
     System.out.println("Making " + foodToMake + "!");



   }
}
