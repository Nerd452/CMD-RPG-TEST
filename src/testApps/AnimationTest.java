package testApps;


//ProjectImports
import static utils.Timer.*;
import graphics.Frame;
import graphics.TerminalImage;

public class AnimationTest{

    public static void main(String[] args){
        //Arrange variables
        TerminalImage I1 = new TerminalImage("Welcome To Animation Testing");
        TerminalImage I2 = new TerminalImage("Please Hold For Loading Bar Test");
        
        TerminalImage[] IM1= {I1, I2};

        Frame F1 = new Frame(IM1);
       
        //ACT
        F1.render();
        waitSEC(3);



        I1.setImage("Now Presenting...\nLoadingBar");
        String loaded = "";
        String unloaded = "--------------------";
        IM1[0] = I1;

        for(int i = 1; i <= 21; i++){
            loaded += "*";
            unloaded = unloaded.substring(0, 21-i);
            I2.setImage("[" + loaded + unloaded + "]");
            IM1[1] = I2;
            F1.setFrame(IM1);
            F1.render();
            waitMIL(500);
        }
        

        //Exit
        System.exit(0);
     }

}


