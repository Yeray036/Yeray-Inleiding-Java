package H11;

import java.applet.Applet;
import java.awt.*;

public class H11_1 extends Applet {

    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        for(int teller = 0; teller < 10; teller++){
            g.drawLine(50+20*teller, 50,  50+20*teller, 150);
            g.drawString("" + teller, 47+20*teller, 163);
        }
    }
}
