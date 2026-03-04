package app;


//Java Library Imports
import java.io.IOException;


//Project Imports
import os.LinuxOS;
import os.UsableOS;
import terminalUtils.Keyboard;


/**
 *The main class for the whole ass project
 *
 */
public class rpgGame{

 
    public static LinuxOS LOS;

    public static UsableOS<LinuxOS> OS;
    
    public static Keyboard KB;



    /**
     * initalizes all class variables
     */
    public static void init() throws IOException{
        try{
            KB = new Keyboard();
        } catch (IOException e) {
            throw new IOException("KEYBOARD DIDNT BUILD");
        }

        LOS = new LinuxOS();

        OS = new UsableOS<LinuxOS>(LOS);
    }



    /**
     * exits the program and closes all closeable objects
     * @param code ~ the code given to System.exit()
     */
    public static void exit(int code) throws IOException{
        KB.close();
        System.exit(code);
    }


    









    /**
     *THE MAIN METHOD
     */
    public static void main(String[] args) throws IOException{    
        //Initalizes variables
        init();

        //Clears the screen
        OS.clear();








        //Exits the program with error code 0
        exit(0);
    }
    //END OF MAIN METHOD
    








}


