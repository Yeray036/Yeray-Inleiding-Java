package H11;

import java.applet.Applet;
import java.awt.*;

public class H11_9 extends Applet {

    int y, x;
    int breedte = 50, hoogte = 50;

    @Override
    public void init() {
        setSize(1600, 900);
        setBackground(Color.BLUE);
    }

    @Override
    public void paint(Graphics g) {
        y = 50;
        x = 50;
        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }
        x = 50;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }
        x = 50;
        y += hoogte;
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }
        x = 50;
        y += hoogte;
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }
        x = 50;
        y += hoogte;
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }
        x = 50;
        y += hoogte;
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }
        x = 50;
        y += hoogte;
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }
        x = 50;
        y += hoogte;
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.WHITE);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }
    }
}
