package testApps;

import java.io.IOException;


import terminalUtils.Keyboard;

import static utils.Timer.waitMIL;

public class keyboardTest {


    public static void main(String[] args) throws IOException{
        

        Keyboard kb = new Keyboard();

        int b = 0;
        int input;

        System.out.println("This program checks if you press the w key on the keyboard");

        while (b <= 500){
            waitMIL(100);
            input = kb.read();
            if(input == 'w'){
                System.out.println("w pressed");
            }
        }
        kb.close();
        System.out.println("done zo");
    }   

}
