package os;


/**
 *This interface is built to hold all the methods that an operating system would need
 */
public interface OS{
    

    /**
     * this method clears the terminal of all content
     */
    public abstract void clear();

    /**
     * this method returns the name of the operating system (linux, windows, e.t.c.)
     * @return - returns the name of the operating system as a string
     */
    public abstract String getOS();

}
