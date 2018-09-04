package H6;

import java.applet.Applet;
import java.awt.*;

public class H6_3 extends Applet {

    int a;
    double b;
    int uitkomst;

    public void int(){

        setSize(1600, 900);

        a = 847125;
        b = 84168;
        uitkomst = a+b;

    }

    public void paint(Graphics g){

        g.drawString("Uitkomst " + uitkomst, 100, 100);

    }

}
