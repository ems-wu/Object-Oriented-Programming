  package lab1;

import cs015.labs.CupcakeSupport.*;



  public class CupcakeDecorator {
    public CupcakeDecorator(Cupcake cupcake) {

  CupcakeFrosting frosting = new CupcakeFrosting();

  CupcakeSprinkles sprinkles = new CupcakeSprinkles();

  CupcakeCherry cherry = new CupcakeCherry();
    cupcake.add(frosting);
    cupcake.add(sprinkles);
    cupcake.add(cherry);
  }
}
