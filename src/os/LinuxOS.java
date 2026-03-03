
package os;

//Java Library Imports
import java.lang.ProcessBuilder;
import java.lang.Process;


/**
 *This class has tools directly related to the Linux Operating System
 */
public class LinuxOS implements OS{
    
    //Variable Fields
    /**
     * The Name of the operating System ~ "LINUX"
     */
    public String OSNAME = "LINUX";


    //Constructor
    /**
     *Constructor for LinuxOS, takes no arguments
     */
    public LinuxOS(){
 
    }


    //Methods
    


    @Override
    public void clear(){ //NOT DONE YET
        try{
            //Ill explain this in steps cause Ill Forget
            //STEP1 ~ new ProcessBuilder("clear") :: creates a ProcessBuilder to for the "clear" command
            //STEP2 ~ .inheritIO() :: 
            //STEP3 ~ .start() ::
            //STEP4 ~ .waitFor() :: 
            new ProcessBuilder("clear").inheritIO().start().waitFor();
        } catch (Exception e){
            System.out.println("Something Went Wrong");
        }

    }

    @Override
    public String getOS(){
        return this.OSNAME;
    }

}


