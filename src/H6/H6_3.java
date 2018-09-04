package H6;

import java.applet.Applet;
import java.awt.*;

public class H6_3 extends Applet {

    int a;
    int b;
    int c;


    public void init(){

        setSize(1600, 900);

        a = 10;
        b = 20;
        c = (a + b) *-1;

    }

    public void paint(Graphics g){

        g.drawString(""+ c, 100, 100);

    }

}
