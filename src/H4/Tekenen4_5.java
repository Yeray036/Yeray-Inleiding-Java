package H4;

import java.awt.*;
import java.applet.*;

public class Tekenen4_5 extends Applet {

    public void init() {
        setSize(1600, 900);
        setBackground(Color.BLUE);

    }

    public void paint(Graphics g) {
        //H4_5 Fill ARC
        g.setColor(Color.YELLOW);
        g.fillArc(100, 100, 100, 100, 0, 360);

        //Stoplicht
        g.setColor(Color.BLACK);
        g.fillRect(200, 300, 100, 200);
        g.fillRect(235, 300, 30, 500);
        g.setColor(Color.RED);
        g.fillArc(232, 320, 40,40, 0, 360);
        g.setColor(Color.orange);
        g.fillArc(232, 370, 40,40, 0, 360);
        g.setColor(Color.GREEN);
        g.fillArc(232, 420, 40,40, 0, 360);

        //Dobbelsteen
        g.setColor(Color.WHITE);
        g.fillRoundRect(500, 250, 100, 100, 25, 25);
        g.setColor(Color.BLACK);
        g.fillArc(512, 255, 25, 25, 0, 360);
        g.fillArc(560, 255, 25, 25, 0, 360);
        g.fillArc(512, 315, 25, 25, 0, 360);
        g.fillArc(560, 315, 25, 25, 0, 360);
    }
}