package H5;

import java.awt.*;
import java.applet.Applet;

public class H5_1 extends Applet {

    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init(){

        setSize(1600, 900);
        setBackground(Color.WHITE);
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 200;
        hoogte = 100;

    }

    public void paint(Graphics g) {

        g.drawLine(100, 100, breedte, hoogte);

    }

}
