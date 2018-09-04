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

        //Lijn
        g.drawLine(100, 100, breedte, hoogte);
        g.drawString("Lijn", 142, 112);

        //Rechthoek
        g.drawRect(100, 150, breedte, hoogte);
        g.drawString("Rechthoek", 162, 262);

        //Afgeronde Rechthoek
        g.drawRoundRect(100, 265, breedte, hoogte, 30, 30);
        g.drawString("Afgeronde rechthoek", 146, 380);

        //Gevulde rechthoek met ovaal
        g.setColor(opvulkleur);
        g.fillRect(312, 150, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawOval(312, 150, breedte, hoogte);
        g.drawString("Gevulde rechthoek met ovaal", 332, 262);

        //Gevulde ovaal
        g.setColor(opvulkleur);
        g.fillOval(312, 265, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawString("Gevulde ovaal", 372, 380);

        //Taartpunt met ovaal eromheen
        g.drawOval(525, 150, breedte, hoogte);
        g.setColor(opvulkleur);
        g.fillArc(525, 150, breedte, hoogte, 0, 45);
        g.setColor(lijnkleur);
        g.drawString("Taartpunt met ovaal eromheen", 542, 262);

        //Cirkel
        g.drawOval(565, 265, hoogte, hoogte);
        g.drawString("Cirkel", 596, 380);

    }

}
