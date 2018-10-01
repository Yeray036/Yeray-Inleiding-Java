package H11;

import java.applet.Applet;
import java.awt.*;

public class H11_4 extends Applet {

    int tafelvandrie;

    @Override
    public void init() {
    }

    @Override
    public void paint(Graphics g) {
        tafelvandrie = 3;
        for (int i = 1; i <= 10; i++) {
            g.drawString("" + tafelvandrie*i, 50, 50+20*i);
        }
    }
}
