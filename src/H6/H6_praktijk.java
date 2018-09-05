package H6;

import java.applet.Applet;
import java.awt.*;

public class H6_praktijk extends Applet {

    //5,9; 6.3; 6,9.

    float cijfer1;
    float cijfer2;
    float cijfer3;
    float uitkomst;

    public void init(){

       cijfer1 = 5.9f;
       cijfer2 = 6.3f;
       cijfer3 = 6.9f;
       uitkomst = Math.round((cijfer1+cijfer2+cijfer3) * 10/3);
       uitkomst = uitkomst/10;

    }

    public void paint(Graphics g){

        g.drawString("Gemiddelde " + uitkomst, 100, 100);

    }

}
