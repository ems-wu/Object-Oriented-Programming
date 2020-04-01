package lab2;

public class Nature implements VideoProvider {
  public Nature(){

  }
  public String showAMovie() {
    return "Elephant.mp4";

  }
  public String getName() {
    return "Nature";


  }

  public String getTopVideos() {
    return "Elephant.mp4,Koala.mp4,Turtle.mp4";
  }
}
