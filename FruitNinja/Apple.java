package FruitNinja;

import cs015.prj.FruitNinjaSupport.Constants;

/**Apple is subclass of superclass Fruit. It inherits all of the methods
/ from its parent class.
*/
public class Apple extends Fruit{
    public Apple(){
      super();
  }
    @Override
    public java.lang.String getImage(){
      return Constants.APPLE_PATH;
  }
    @Override
    public int getScore(){
      return 1;
    }
  }
