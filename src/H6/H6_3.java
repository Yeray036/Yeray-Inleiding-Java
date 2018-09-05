package H6;

import java.applet.Applet;
import java.awt.*;

public class H6_3 extends Applet {

    int positief;
    int positief2;
    int uitkomst;


    public void init(){

        setSize(1600, 900);

        positief = 10;
        positief2 = 20;
        uitkomst = (positief + positief2) *-1;

    }

    public void paint(Graphics g){

        g.drawString(""+ uitkomst, 100, 100);

    }

}
