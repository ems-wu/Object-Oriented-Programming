package FruitNinja;

import cs015.prj.FruitNinjaSupport.CS15Fruit;
public class Fruit extends CS15Fruit implements Choppable {
  /**I imported CS15 fruit to have access to all it's methods
  /My new Fruit class inherits from superclass CS15Fruit
  */
  public Fruit(){
    super(); //need this for every subclass
    this.getImage();
    this.ripen();
    this.wash();
    //Everytime constructor is called, I want all of these methods called
  }
  @Override
  public void chop(){
    this.chopGraphically();
    this.splash();
    /**Here I am overriding chop method from implemented Choppable interface
    /to make it do the specific methods I want
    */
  }
  @Override
  public int getScore(){
    return 0;
  }
}
