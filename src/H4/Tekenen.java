package H4;

import java.awt.*;
import java.applet.*;

public class Tekenen extends Applet {

    public void init() {
        setSize(1600, 900);
        setBackground(Color.WHITE);

    }

    public void paint(Graphics g) {
        int[] x = {100, 200, 300};
        int[] y = {300, 300-(int)(Math.sqrt(Math.pow(200, 2)-Math.pow(100, 2))), 300}; //Dit berekend y= 300+300-Wortel van 200*200-100*100
        g.drawPolygon(x, y, x.length);
    }
}
