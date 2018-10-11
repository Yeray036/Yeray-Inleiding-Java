package H13;

import java.applet.Applet;
import java.awt.*;
import java.net.URL;

public class H13_2 extends Applet {

    @Override
    public void init() {
        setSize(800, 600);
    }

    @Override
    public void paint(Graphics g) {
        drawbrickwall(g);
    }

    void drawbrickwall(Graphics g) {
       int pattern = 0;
       setBackground(new Color(187, 187, 187));

       Color b1= new Color(165, 93, 68);
       Color b2= new Color(124, 81, 72);
       Color b3= new Color(191, 117, 82);

        for (int y = 0; y < 600; y += 24) {
            for (int x = 0; x < 874; x += 74) {
                int b = (int) (Math.random()*3+1);
                if(b == 1) g.setColor(b1);
                if(b == 2) g.setColor(b2);
                if(b == 3) g.setColor(b3);

                if(pattern == 0)
                    g.fillRect(x, y, 70, 20);
                else
                    g.fillRect(x-35, y, 70, 20);
            }
            if(pattern == 0)pattern=1;
            else pattern=0;
        }
    }
}
