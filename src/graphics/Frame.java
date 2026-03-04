package graphics;

//Project Imports
import static graphics.output.*;
import os.LinuxOS;
import os.UsableOS;

/**
 *The Frame class holds all the information and methods to draw a frame onto the console
 */
public class Frame{
    
    private TerminalImage[] images;
    private LinuxOS UOS;
    /**
     *Operating System Object
     */
    public UsableOS<LinuxOS> OS;
    
    /**
     * constructor for the Frame class
     * @param images ~ an array of TerminalImages
     */
    public Frame(TerminalImage[] images){
        this.images = images;
        this.UOS = new LinuxOS();
        this.OS = new UsableOS<>(UOS);
    }

    /**
     * clears the screen, then draws all the terminal images to the screen in order
     */
    public void render(){
        this.OS.clear();
        for (int i = 0; i < images.length; i++){
            images[i].draw();
            writeln("");
        }
    }

    /**
     *
     */
    public void setFrame(TerminalImage[] images){
        this.images = images;
    }

    



}
