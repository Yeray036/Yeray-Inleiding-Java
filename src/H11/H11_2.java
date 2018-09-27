package H11;

import java.applet.Applet;
import java.awt.*;

public class H11_2 extends Applet {

    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        for(int getallen = 20; getallen > 10; getallen--) {
            g.drawString("" + getallen, -170+20*getallen, 50);
        }
    }
}
