package FruitNinja;
import cs015.prj.FruitNinjaSupport.Constants;
/**Lemon is subclass of superclass Fruit. It inherits all of the methods
/ from its parent class.
*/
public class Lemon extends Fruit{
  public Lemon(){
    super();
  }
  @Override
  public java.lang.String getImage(){
      return Constants.LEMON_PATH;
      //I am overriding the inherited getImage method for each fruit
  }
  @Override
  public int getScore(){
    return 2;
    }
}
//Overriding getScore to give each fruit a different value for score
