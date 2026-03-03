package test;

//Project Imports
import os.LinuxOS;
import static graphics.output.write;

//Java Library Imports
import java.util.concurrent.TimeUnit;


/**
 * This Class only exists to test what would be impractical or impossible to test with junit <br>
 * Keep in mind, that just because something says it passed doesn't mean it did, look for all visual cues that it passed to confirm
 */
public class MainTest{
    
    /**
     *constructor for MainTest, Should never be called
     */
    public MainTest(){
        
    }
    
    /**
     *Tests if the clear command actually clears the console
     *@return - best case, true if it works, false if it doesn't
     */
    public static boolean clearTest(){
        try{

            System.out.println("Test Not Made Yet");
            return false;
        }catch (Exception e){
            System.out.println("Something Went Wrong");
            return false;
        }

    }

    /**
     * the main method for MainTest
     * @param args - an array of strings that can be passed to the main method
     */
    public static void main(String args[]){  
        //Arrange
        boolean clearTest;
        //Act

        clearTest = clearTest();
        

        //Assertions
        System.out.print("clearTest: " + clearTest);

        write("\nwriteTest: True\n");
  
    }

}
