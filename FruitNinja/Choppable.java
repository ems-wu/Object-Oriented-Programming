package FruitNinja;
  /**Here I have created my interface Choppable which is a "contract"
  /for my other classes to implement. This is an example of polymorphism as
  *all classes that implement this have access to my declared methods.
  */
public interface Choppable{

  public int getScore();

  public void chop();
  /**Here I have declared two methods: getScore and chop.
  /getScore returns an int while chop does not return anything.
  */
}
