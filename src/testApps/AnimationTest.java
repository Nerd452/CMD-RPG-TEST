package testApps;

//NOTE :: AT FULL SCREEN 255 m's wide
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

        //INTRO START
        F1.render();
        waitSEC(3);
        //INTRO END





        //LOADING BAR START
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
            waitMIL(400);
        }
        //LOADING BAR END
        



        //Back_And_Forth * START

        String S1 = "";
        String S2 = "";
        for (int i = 1; i <= 255; i++){ //builds strings
            if ((i % 2) == 0) {
                S1 += " ";
                S2 += "*";
            } else{
                S1 += "*";
                S2 += " ";
            }
        }

        //sets the images
        I1.setImage(S1);
        I2.setImage(S2);

        TerminalImage[] IM2 = {I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2,
        I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2};

        TerminalImage[] IM3 = {I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1,
        I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1, I2, I1};
        
        for (int i = 1; i <= 100; i++){
            if ((i % 2) == 0){
                F1.setFrame(IM2);
                F1.render();
            }else{
                F1.setFrame(IM3);
                F1.render();
            }
            waitMIL(100);

        }


        //Back_And_Forth * End
        

        //Exit
        F1.OS.clear();
        System.exit(0);
     }

}


