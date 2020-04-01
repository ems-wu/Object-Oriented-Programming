package lab2;

public class Twitch implements VideoProvider {
  public Twitch(){



  }

  public String showAMovie() {
    return "ChronoTrigger.mp4";

  }
  public String getName() {
    return "Twitch";


  }

  public String getTopVideos() {
    return "ChronoTrigger.mp4,SuperMarioBros.mp4,PokemonRed.mp4";

  }

}
