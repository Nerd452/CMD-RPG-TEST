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
    
    /**
     * writes a string to the console by overwriting the previous line up to 60 charecters
     * @param arg ~ the string written to the console
     */
    public static void uwrite(String arg){
        write("\r");
        
        for(int i = 0; i < 6; i++) {
            write("          ");
        }
        write("\r");
        write(arg);
    }


}



