
package os;

//Java Library Imports
import java.lang.ProcessBuilder;
import java.lang.Process;

public class LinuxOS implements OS{
    
    //Variable Fields
    /**
     * The Name of the operating System ~ "LINUX"
     */
    public String OSNAME = "LINUX";


    //Constructor
    public LinuxOS(){
 
    }


    //Methods
    


    @Override
    public void clear(){ //NOT DONE YET
        try{
            //
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


