package DoodleJump;

/**
 * This is my Constants class. It defines some constants I use in DoodleJump
 * It includes the dimensions of my doodle, platform, and window, as well as the
 * values of various distances and velocities.
 */
public class Constants {

    public static final int GRAVITY = 800; // acceleration constant (UNITS: pixels/s^2)
    //Changed gravity to 800 pixels/sec2 b/c pixel was falling off screen too fast
    public static final int REBOUND_VELOCITY = -900; // initial jump velocity (UNITS: pixels/s)
    public static final double DURATION = 0.016; // KeyFrame duration (UNITS: s)
    public static final int INITIALVELOCITY = 0; 
    public static final int INITIALPOSITION = 0; 

    public static final int DOODLE_XMOVEMENT = 50; // (UNITS: pixels)

    public static final int PLATFORM_WIDTH = 40; // (UNITS: pixels)
    public static final int PLATFORM_HEIGHT = 10; // (UNITS: pixels)
    public static final int DOODLE_WIDTH = 20; // (UNITS: pixels)
    public static final int DOODLE_HEIGHT = 40; // (UNITS: pixels)
    
    public static final int DOODLE_STARTINGX = 260; // (UNITS: pixels)
    public static final int DOODLE_STARTINGY = 525; // (UNITS: pixels)
    public static final int PLATFORM_STARTINGX = 240; // (UNITS: pixels)
    public static final int PLATFORM_STARTINGY = 565; // (UNITS: pixels)
    
    public static final int WINDOW_HEIGHT = 700; // (UNITS: pixels)
    public static final int WINDOW_WIDTH = 500; // (UNITS: pixels)
    

}
