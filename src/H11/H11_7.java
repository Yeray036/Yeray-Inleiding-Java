package H11;

import java.applet.Applet;
import java.awt.*;

public class H11_7 extends Applet {

    int cirkel;

    @Override
    public void init() {
        setSize(1600, 900);

    }

    @Override
    public void paint(Graphics g) {
        cirkel = 1;
        for (int i = 1; i <= 50; i++) {
            g.drawOval( 350 - i * 5, 350 - i * 5, i*10, i*10);
        }
    }
}
