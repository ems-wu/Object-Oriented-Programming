package lab1;

/**
* This is the second lab where you are going to decorate a cupcake.
* The purpose of this mini-app is to get you comfortable making java classes
* from scratch, making instances, and passing and receiving parameters.
*
* @author <your login here>
*/

public class App{

  public App(){
    // Initializes an instance of an undecorated Cupcake
    cs015.labs.CupcakeSupport.Cupcake avd = new cs015.labs.CupcakeSupport.Cupcake();

    /*
    * Make an instance of your CupcakeDecorator class here.
    * It needs to know about the plain cupcake in order to decorate it.
    * This sounds a lot like an association... Look at the lecture notes
    * if you don't remember how to do this.
    */
    CupcakeDecorator decorator = new CupcakeDecorator(avd);
  }

  /*
  * This is the main method. Don't worry about it, as it just makes an
  * instance of the App class.
  *
  * DO NOT CHANGE THIS CODE.
  */
  public static void main(String[] args){
    new App();
  }
}
