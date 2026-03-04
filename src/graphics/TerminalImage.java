package graphics;

//Project Imports
import static graphics.output.*;

/**
 *this object represents ascii art for the terminal
 */
public class TerminalImage{

    private String image;
       
    /**
     * constructor for TerminalImage
     * @param image ~ the "image" (Ascii Art) for the terminal
     */
    public TerminalImage(final String image){
        this.image = image;
    }
    
    /**
     * draws the image to the terminal
     */
    public void draw(){
        write(image);
    }
    

    /**
     * this method returns the saved image
     * @return the "image" (Ascii Art) stored in the object
     */
    public String getImage(){
        return this.image;
    }
    
    /**
     * sets the saved image as the given argument
     * @param image ~ the new "image" (Ascii Art) for the terminal
     */
    public void setImage(final String image){
        this.image = image;
    }

}



