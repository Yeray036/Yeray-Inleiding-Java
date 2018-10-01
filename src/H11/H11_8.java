package H11;

import java.applet.Applet;
import java.awt.*;

public class H11_8 extends Applet {

    int cirkel;

    @Override
    public void init() {
        setSize(1600, 900);

    }

    @Override
    public void paint(Graphics g) {
        cirkel = 1;
        for (int i = 1; i <= 100; i++) {
            g.drawOval( 350 - i * 3, 350 - i * 3, i*6, i*6);
        }
    }
}
