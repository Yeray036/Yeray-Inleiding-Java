package H11;

import java.applet.Applet;
import java.awt.*;

public class H11_6 extends Applet {

    int cirkel;

    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        cirkel = 1;
        for (int i = 1; i <= 5; i++) {
            g.drawOval( 50 - i * 10, 50 - i * 10, i*20, i*20);
        }
    }
}
