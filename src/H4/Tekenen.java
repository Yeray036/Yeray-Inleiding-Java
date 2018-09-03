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
        int[] y = {300, 300-(int)(Math.sqrt(Math.pow(200, 2)-Math.pow(100, 2))), 300}; //(Stelling van pythagoras)Dit berekend y= 300=(onderkant)-Wortel van C^2(Lengte van rib)-A^2(Helft van de rib dus midden driehoek)
        g.drawPolygon(x, y, x.length);

        //House+Roof
        x = new int[]{500, 500, 800, 800, 500, 650, 800};
        y = new int[]{200, 500, 500, 200, 200, 100, 200};
        g.drawPolygon(x, y, x.length);

        //Door
        g.drawRect(615, 350, 75, 150);

        //Doorknob
        g.drawRoundRect(675, 420, 10, 10, 180, 180);

        //WindowLeft
        g.drawRect(550, 240, 50, 50);
        g.drawRect(545, 235, 60, 60);

        //WindowRight
        g.drawRect(700, 240, 50, 50);
        g.drawRect(695, 235, 60, 60);

        g.fillRect(990, 100, 10, 600);
        g.setColor(Color.red);
        g.fillRect(1000, 100, 350, 100 );
        g.setColor(Color.WHITE);
        g.fillRect(1000, 200, 350, 100 );
        g.setColor(Color.blue);
        g.fillRect(1000, 300, 350, 100 );

    }
}
