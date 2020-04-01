package LiteBrite;

/**
 * Don't worry about the 'extends' stuff.
 * Pretend this says 'public class ColorPalette',
 * just like the class declarations shown in lecture.
 *
 * I declared the instance variables below the ColorPalette constructor so that
 the specific colors could be tracked when the user clicked on it, using the
 instance variable. Then, my getter method would also return an instance
 variable. I also imported Color and ColorButton. This class creates a color
 palette. 
 */
   import cs015.prj.LiteBriteSupport.ColorButton;
   import javafx.scene.paint.Color;


public class ColorPalette extends cs015.prj.LiteBriteSupport.ColorPaletteSupport {

    private Color _color;
    private LiteBox _litebox;


    // Instance variable declarations go here.
    //speicifc color we need ot keep track of, using instance variable, keep
    //track of color user is clicking on, setting to be new colorpalette.
    //getter method getting adn returnign instance variable


    public ColorPalette() {

      _color = Color.WHITE;

        // This adds a white ColorButton to the ColorPalette.
        // You may add up to ten ColorButtons to the ColorPalette.
        new cs015.prj.LiteBriteSupport.ColorButton(this, Color.WHITE);
        new cs015.prj.LiteBriteSupport.ColorButton(this, Color.RED);
        new cs015.prj.LiteBriteSupport.ColorButton(this, Color.MISTYROSE);
        new cs015.prj.LiteBriteSupport.ColorButton(this, Color.AQUAMARINE);
        new cs015.prj.LiteBriteSupport.ColorButton(this, Color.TEAL);
        new cs015.prj.LiteBriteSupport.ColorButton(this, Color.ORCHID);
        new cs015.prj.LiteBriteSupport.ColorButton(this, Color.ROSYBROWN);
        new cs015.prj.LiteBriteSupport.ColorButton(this, Color.SPRINGGREEN);
        new cs015.prj.LiteBriteSupport.ColorButton(this, Color.PALETURQUOISE);
        new cs015.prj.LiteBriteSupport.ColorButton(this, Color.SLATEGRAY);
    }

    /**
     * This method is called when a cs015.prj.LiteBrite.ColorButton
     * is clicked on. The javafx.scene.paint.Color is then passed in as a parameter.
     * You will never need to call this method  yourself; it is called
     * from within the support code. Implement this method to change the color
     * of new LitePegs added to the LiteBox.
     */
    public void setColor(Color newColor) {
        _color = newColor;
      }
      public Color getColor() {
        return _color;
      }
}
