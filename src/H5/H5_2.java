package H5;

import java.awt.*;
import java.applet.*;
import java.util.jar.JarEntry;

public class H5_2 extends Applet {

    int Valerie;
    int Jeroen;
    int Hans;

    public void init() {
        setSize(1600, 900);
        setBackground(Color.WHITE);

        //Verander hier je gewichten Y = 100 = 20kg
        Valerie = 200;
        Jeroen = 500;
        Hans = 400;

    }

    public void paint(Graphics g) {
       /*
       Valerie: 40 kg
       Jeroen: 100 kg
       Hans: 80 kg

       een staafdiagram, waarbij elke kolom een eigen kleur heeft.
       De namen van de kinderen staan onder het staafdiagram en de verdeling van de schaal staat naast de diagram met daarbij om de 20 de verdeling.
       */

        //barChart
        //Verticale lijn
        g.drawLine(100, 100, 100, 600);
        //Horizontale lijn
        g.drawLine(100, 600, 450, 600);

        //Gewichten
        g.drawString("Gewicht (KG)", 25, 80);
        g.drawString("100", 50, 100);
        g.drawString("80", 50, 200);
        g.drawString("60", 50, 300);
        g.drawString("40", 50, 400);
        g.drawString("20", 50, 500);
        g.drawString("0", 50, 600);

        //Bars with color per person
        //Valerie 40KG
        g.setColor(Color.green);
        g.fillRect(125, 600-Valerie, 50, Valerie);
        g.setColor(Color.BLACK);
        g.drawString("Valerie", 130, 615);

        //Jeroen 100KG
        g.setColor(Color.red);
        g.fillRect(225, 600-Jeroen, 50, Jeroen);
        g.setColor(Color.BLACK);
        g.drawString("Jeroen", 230, 615);

        //Hans 80KG
        g.setColor(Color.ORANGE);
        g.fillRect(325, 600-Hans, 50, Hans);
        g.setColor(Color.BLACK);
        g.drawString("Hans", 335, 615);

        //Personen text
        g.setColor(Color.BLACK);
        g.drawString("Personen", 452, 605);

    }
}