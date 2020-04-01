package FruitNinja;
import cs015.prj.FruitNinjaSupport.Constants;
/**Pear is subclass of superclass Fruit. It inherits all of the methods
/ from its parent class.
*/
public class Pear extends Fruit{
    public Pear(){
      super();
    }
  @Override
    public java.lang.String getImage(){
      return Constants.PEAR_PATH;
    }
    @Override
      public int getScore(){
        return 4;
    }
}
