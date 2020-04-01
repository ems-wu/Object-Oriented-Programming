package FruitNinja;
import cs015.prj.FruitNinjaSupport.Constants;
/**Peach is subclass of superclass Fruit. It inherits all of the methods
/ from its parent class.
*/
public class Peach extends Fruit{
  public Peach(){
    super();
  }
  @Override
    public java.lang.String getImage(){
      return Constants.PEACH_PATH;
    /** Here I am overriding getimage method so I can return the specific
    /constant given to me through the support code.
    */
  }
    @Override
      public int getScore(){ //Overriding to establish individual score
        return 3;
  }
}
