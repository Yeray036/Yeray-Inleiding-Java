package H6;

import java.applet.Applet;
import java.awt.*;

public class H6_2 extends Applet {

    int seconde;
    int minuten;
    int uren;
    int dagen;
    int jaren;

    public void init(){

    seconde = 1;
    minuten = seconde*60;
    uren =  minuten*60;
    dagen = uren*24;
    jaren= dagen*365;

    }

    public void paint(Graphics g){
    
    g.drawString("Minuten: " + minuten, 100, 100);
    g.drawString("Uren: " + uren, 100, 200);
    g.drawString("Dagen " + dagen, 100, 300);
    g.drawString("Jaren " + jaren, 100, 400);

    }

}
