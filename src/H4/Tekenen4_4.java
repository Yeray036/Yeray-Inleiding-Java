package H4;

import java.awt.*;
import java.applet.*;

public class Tekenen4_4 extends Applet {

    public void init() {
        setSize(1600, 900);
        setBackground(Color.WHITE);

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
       g.drawLine(100, 100, 100, 600);
       g.drawLine(100, 600, 450, 600);

       //Gewichten
       g.drawString("Gewicht (KG)", 25, 80);
       g.drawString("100", 50, 100);
       g.drawString("80", 50, 200);
       g.drawString("60", 50, 300);
       g.drawString("40", 50, 400);
       g.drawString("20", 50, 500);
       g.drawString("0", 50, 600);

       //Inner Light Gray Lines
       g.setColor(Color.decode("#BBBBBB"));
       g.drawLine(100, 100, 450, 100);
       g.drawLine(100, 200, 450, 200);
       g.drawLine(100, 300, 450, 300);
       g.drawLine(100, 400, 450, 400);
       g.drawLine(100, 500, 450, 500);

       //Bars with color per person
       //Valerie 40KG
       g.setColor(Color.green);
       g.fillRect(125, 400, 50, 200);
       g.setColor(Color.BLACK);
       g.drawString("Valerie", 130, 615);

       //Jeroen 100KG
       g.setColor(Color.red);
       g.fillRect(225, 100, 50, 500);
       g.setColor(Color.BLACK);
       g.drawString("Jeroen", 230, 615);

       //Hans 80KG
       g.setColor(Color.ORANGE);
       g.fillRect(325, 200, 50, 400);
       g.setColor(Color.BLACK);
       g.drawString("Hans", 335, 615);

       //Personen text
       g.setColor(Color.BLACK);
       g.drawString("Personen", 452, 605);
    }
}
