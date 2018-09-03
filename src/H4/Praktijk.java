package H4;

import java.awt.*;
import java.applet.*;

public class Praktijk extends Applet {

    public void init(){
        setSize(1600, 900);
        setBackground(Color.WHITE);
    }

    public void paint(Graphics g){
        //Lijn
        g.setColor(Color.black);
        g.drawLine(20, 100, 150, 100);
        g.drawString("Lijn", 75, 112);

        //Rechthoek
        g.drawRect(20, 150, 150, 80);
        g.drawString("Rechthoek", 60, 242);

        //Afgeronde rechthoek
        g.drawRoundRect(20, 245, 150, 80, 30, 30);
        g.drawString("Afgeronde Rechthoek", 35, 342);

        //Gevulde rechthoek met ovaal
        g.setColor(Color.magenta);
        g.fillRect(180, 150, 150, 80);
        g.setColor(Color.black);
        g.drawArc(180, 150, 150, 80, 0, 360);
        g.drawString("Gevulde rechthoek met ovaal", 175, 242);

        //Gevulde Ovaal
        g.setColor(Color.MAGENTA);
        g.fillArc(180, 245, 150, 80, 0, 360);
        g.setColor(Color.BLACK);
        g.drawString("Gevulde Ovaal", 215, 342);

        //Taartpunt met ovaal eromheen
        g.drawString("Taartpunt met ovaal eromheen", 342, 242);
        g.drawOval(342, 150, 150, 80);
        g.setColor(Color.MAGENTA);
        g.fillArc(342, 150, 150, 80, 0, 45);

        //Cirkel
        g.setColor(Color.BLACK);
        g.drawOval(375, 245, 75, 75);
        g.drawString("Cirkel", 396, 342);
    }

}
