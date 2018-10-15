package H13;

import java.applet.Applet;
import java.awt.*;

public class H13_praktijkopdracht extends Applet {


    public void init() {
        setSize(1080, 720);

    }

    public void paint(Graphics g) {
        boom(g);
    }

    void boom(Graphics g) {

        Color B = new Color(120, 93, 68);

        int pattern = 0;
        for (int y = 50; y < 400; y += 80) {
            for (int x = 50; x < 100; x += 150) {
                if (pattern == 0) {
                    g.setColor(B);
                    g.fillRect(x, y, 20, 60);
                }
            }
        }
        for (int y2 = 35; y2 < 400; y2 += 80) {
            for (int x2 = 40; x2 < 100; x2 += 150) {
                if (pattern == 0) {
                    g.setColor(Color.green);
                    g.fillOval(x2, y2, 40, 40);
                }
            }
        }

        for (int y3 = 50; y3 < 400; y3 += 80) {
            for (int x3 = 200; x3 < 300; x3 += 150) {
                if (pattern == 0) {
                    g.setColor(B);
                    g.fillRect(x3, y3, 20, 60);
                }
            }
        }
        for (int y4 = 35; y4 < 400; y4 += 80) {
            for (int x4 = 40; x4 < 300; x4 += 150) {
                if (pattern == 0) {
                    g.setColor(Color.green);
                    g.fillOval(x4, y4, 40, 40);
                }
            }
        }
    }
}
