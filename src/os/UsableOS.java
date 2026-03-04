package os;

/**
 *this class is where all the operating system calls are done from, makes it easy to port to windows
 */
public class UsableOS<i extends OS> implements OS {
    
    /**
     *this varaible holds the operating system information/class
     */
    public i os;


    /**
     *
     */
    public UsableOS(final i os){
        if (os instanceof UsableOS) {
            throw new IllegalArgumentException("AHHHH");
        }else{
            this.os = os;
        }

    }


    @Override
    public void clear(){
        (this.os).clear();
    }

    @Override
    public String getOS(){
        return (this.os).getOS();
    }


}


