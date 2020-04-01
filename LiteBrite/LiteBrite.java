package LiteBrite;
//This class is the top level class that contains ColorPalette and LiteBox.
public class LiteBrite {

  private ColorPalette _clrpalette;
  private LiteBox _litebox;

  public LiteBrite() {
      _clrpalette = new ColorPalette();
     _litebox = new LiteBox(_clrpalette);
  }
}
