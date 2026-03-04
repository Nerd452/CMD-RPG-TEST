package utils;

//Java Library Imports
import java.util.concurrent.TimeUnit;

/**
 *this class contains many static methods that make it easy to make the code wait a specified amount fo time
 */
public class Timer{
    
    /**
     * this function pauses the program for a given number of milliseconds
     * @param milliseconds ~ the number milliseconds waited
     */
    public static void waitMIL(final int milliseconds){
        try{
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        }catch(Exception e){
            System.exit(1);
        }
    }
    


    /**
     * this function pauses the program for a given number of seconds
     * @param seconds ~ the number of seconds waited
     */
    public static void waitSEC(final int seconds){
        try{
            TimeUnit.SECONDS.sleep(seconds);
        
        }catch(Exception e) {
            System.exit(1);
        }

    }

}
