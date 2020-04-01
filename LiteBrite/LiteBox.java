package LiteBrite;

/**
 * Here in LiteBox.java, I instantiated my _clrpalette after the constructor,
 then made a new litepeg and implemented my methods. Futhermore, I imported
 various classes above the contructor. This class models a lite box that
 detects a mouse when clicked on. The LiteBox method references the class
 ColorPalette. the insertLitePeg method is called when you click in the grid. 
 */
  import cs015.prj.LiteBriteSupport.LitePeg;
  import javafx.scene.paint.Color;
  import cs015.prj.LiteBriteSupport.LitePosition;

public class LiteBox extends cs015.prj.LiteBriteSupport.LiteBoxSupport {

    private ColorPalette _clrpalette;
  /**
   * This is the constructor for a LiteBox.  Note that
   * this constructor receives a parameter of type ColorPalette.
   */
//

    public LiteBox(ColorPalette palette) {
      _clrpalette = palette;
//this palette can do setcolor method
    }
//finish association here, palette
    /**
     * This method is called when the grid is clicked.
     * You will never have to call this method yourself.
     * The LitePosition passed in corresponds to the position
     * clicked. Implement this method to make a LitePeg show up!
     */
    public void insertLitePeg(LitePosition position) {
      //make new litepeg here
      //setting position here, needs to know color for color palette, make sure everything
      //is in curly bracket
      LitePeg litepeg = new LitePeg();
      litepeg.setColor(_clrpalette.getColor());
      litepeg.setPosition(position);
    }
}
