package FruitNinja;

import cs015.prj.FruitNinjaSupport.CS15Bomb;

/**Bomb is subclass of superclass Bomb. It inherits all of the methods
/ from its parent class.
*/
public class Bomb extends CS15Bomb implements Choppable {
  public Bomb(){
    super();
  }

  @Override
  public void chop(){
    this.explode(); /**Instead of chopGraphically() and splash(), I want
    / the blomb to exmplode so I need to override it
    */
  }
  @Override
  public int getScore(){
    return 0;
  }
}
