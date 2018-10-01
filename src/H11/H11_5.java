package H11;

import java.applet.Applet;
import java.awt.*;

public class H11_5 extends Applet {

    int vierkant;

    @Override
    public void init() {
        vierkant = 1;
        for(int i = 1; i <= 5; i++){
        }
    }

    @Override
    public void paint(Graphics g) {
        vierkant = 1;
        for (int i = 1; i <= 5; i++) {
            g.drawRect(50+25*i, 50+25*i, 25, 25);
        }
    }
}
