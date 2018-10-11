package H13;

import java.applet.Applet;
import java.awt.*;

public class H13_1 extends Applet {

    @Override
    public void paint(Graphics g) {
        tekenDriehoek(g, 150, 200, 200, 50, 250, 200);
    }
    void tekenDriehoek(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3){
        int x[] = {x1,x2,x3};
        int y[] = {y1,y2,y3};
        g.drawPolygon(x,y,3);
    }
}
