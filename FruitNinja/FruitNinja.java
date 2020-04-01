package FruitNinja;

import cs015.prj.FruitNinjaSupport.CS15Game;
import cs015.prj.FruitNinjaSupport.Blade;
public class FruitNinja extends CS15Game{
  /**FruitNinja is subclass of superclass CS15Game. It inherits all of the
  /  methods from its parent class. I override the abstract methods
  / launchItem and onBladeContact() here.
  */
  public FruitNinja(){
    super(); //Needed for subclass
    Blade blade = new Blade();
    this.addBlade(blade);
    this.startGame();
    //Calling startGame and addBlade Method (already made) on the game itself
    blade.setName("MyKuwulBlade");
    /**Here I call setName method on an instance of Blade
    /I pass in the name of the blade I decided on
    */
  }
    @Override
      public Choppable launchItem(){
        int randInt = (int) (Math.random() * 5);
        Choppable choppable; //instance of declared type choppaple
        //Math.random() return random int 0 to 1 so multiply by 10
        switch (randInt) { //Switch statement more convenient than if
          case 1:
            choppable = new Bomb();
            break;
          case 2:
            choppable = new Pear();
            break;
          case 3:
            choppable = new Lemon();
            break;
          case 4:
            choppable = new Peach();
            break;
          default:
            choppable = new Apple();
            break;
        //Example of polymorphism as I set each fruit/bomb = to type choppable
  }
      return choppable;
  }
  @Override
    public int onBladeContact(){
      this.getChoppable();
      Choppable choppable = this.getChoppable();
    //storing instance variable in local one
      choppable.chop(); //I am chopping object of type choppable
        return choppable.getScore();
      /**I am returning the int given to me by calling getScore on
      /instance of choppable      */

  }
}
