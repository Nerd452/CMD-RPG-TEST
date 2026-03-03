package test;

//Project Imports
import os.LinuxOS;

//Java Library Imports
import java.util.concurrent.TimeUnit;

public class MainTest{

    public static void main(String args[]){  
        //Arrange
        LinuxOS OS = new LinuxOS();

        //ACT
        try{
            OS.clear();
            System.out.println("Hello World");
            TimeUnit.SECONDS.sleep(3);
            OS.clear();
            TimeUnit.SECONDS.sleep(3);
            System.out.println(" |        |");
            System.out.println(" |        |");
            System.out.println(" |        |");
            System.out.println(" |        |");
            System.out.println("              ");
            System.out.println("_          _");
            System.out.println(" |________|");
            TimeUnit.SECONDS.sleep(3);
            OS.clear();
            System.exit(0);
        } catch (Exception e){
            System.out.println("Something Went Wrong");
        }
    }

}
