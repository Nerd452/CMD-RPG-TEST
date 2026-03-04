package testApps;


//ProjectImports
import os.LinuxOS;
import os.UsableOS;
import static utils.Timer.*;
import static graphics.output.*;


public class AnimationTest{

    public static void main(String[] args){
        //Arrange variables
        LinuxOS UOS = new LinuxOS();
        UsableOS<LinuxOS> OS = new UsableOS<LinuxOS>(UOS);
        
        //Act
        OS.clear();
        writeln(OS.getOS());
        write("Test Animation");
        
        waitSEC(3);
        OS.clear();
        
        write("Animation 1 ~ Loading bar\n\n");
        String loadedBars = "";
        String unloadedBars = "--------------------";
        for(int i = 1; i <= 20; i++){
            loadedBars += "*";
            unloadedBars = unloadedBars.substring(0,(20-i));
            uwrite("[" + loadedBars + unloadedBars + "]");
            waitMIL(400);
            
        }

        waitSEC(3);
        writeln("");
        
        System.exit(0);

    }

}


