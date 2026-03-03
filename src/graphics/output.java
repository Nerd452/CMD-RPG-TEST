package graphics;





/**
 *This interface gives several powerful tools for quickly and easily writing to the console
 */
public class output{

    /**
     *writes to the console
     * @param arg ~ the string written to the console
     */
    public static void write(String arg){
        System.out.print(arg);
    };

    /**
     *writes a newline to the console
     */
    public static void newLine(){
        write("\n");
    }

    /**
     * writes a string to the console, followed by a newline
     * @param arg ~ the string written to the console
     */
    public static void writeln(String arg){
        write(arg);
        newLine();
    }


}



