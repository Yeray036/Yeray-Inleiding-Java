package H12;

import java.applet.Applet;
import java.awt.*;

public class H12_1 extends Applet {

    double cijfers[], totaal, gemiddelde;

    @Override
    public void init() {
        cijfers = new double[10];
        totaal = 0;

        for(int teller = 0; teller < cijfers.length; teller++){
            cijfers[teller] = 10 * teller + 10;
        }

        for(int teller = 0; teller < cijfers.length; teller++) {
            double cijfer = cijfers[teller];
            totaal = totaal + cijfer;
        }
        gemiddelde = totaal / cijfers.length;
    }

    @Override
    public void paint(Graphics g) {
        int y = 20;
        int x = 50;
        for (int teller = 0; teller < cijfers.length; teller++) {
            g.drawString("Cijfers : " + cijfers[teller], x, y);
            y += 20;
        }
        g.drawString("Gemiddelde : " + gemiddelde, x, y);
    }
}