package lab2;

public class CartoonNetworkProvider implements VideoProvider {

  public CartoonNetworkProvider() {

  }

  public String showAMovie() {
    return "PopeyeForPres.mp4";

  }
  public String getName() {
    return "Cartoon Network Channel";


  }

  public String getTopVideos() {
    return "PopeyeCookingWithGags.mp4,PopeyeForPres.mp4,PopeyeMeetsSinbad.mp4";

  }


}
