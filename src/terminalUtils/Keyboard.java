package terminalUtils;

import java.io.IOException;




//import org.jline.reader.impl.LineReaderImpl;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;
//import org.jline.reader.Binding;

/**
 * this clalss is desingned to give input from the keyboard 
 * 
 */
public class Keyboard{


    /**
     * the terminal object, talks to the system terminal
     * 
     */
    public Terminal terminal;
 
    /**
     * Constructor for the keybinds class
     * Opens the termial in raw mode
     * @throws IOException - if shit goes south
     */
    public Keyboard() throws IOException{
        //Im gonna explain this code in DETAIL so I dont forget
        try{
            //Sets the terminal object to the system terminal
            this.terminal = TerminalBuilder.terminal();

            //sets the system terminal to Raw Mode
            //Raw mode means that all input is converted to the input stream
            //TLDR; you dont need to press enter for input to be take in
            terminal.enterRawMode();
        }catch(IOException e){
            throw new IOException("Terminal Wouldn't Build");
        }

    }

    /**
     * closes the terminal object, taking the system terminal out of raw mode
     * @throws IOException ~ if shit goes south
     */
    public void close() throws IOException{
        try{
            this.terminal.close();
        } catch(IOException e){
            System.out.println("THIS WENT VERY SOUTH");
        }
    }

    /**
     * 
     * This method listens to the terminal, and returns the unicode as an integer for any chars put inside
     * @return - the unicode for the chars (can be directly compared to chars like 'w')
     * @throws IOException ~ If shit goes south
     */
    public int read() throws IOException{
        return this.terminal.reader().read();
    }

}






