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
        g.drawLine(20, 100, 100, 100);
        g.drawString("Lijn", 50, 112);

        //Rechthoek
        g.drawRect(20, 150, 100, 70);
    }

}
