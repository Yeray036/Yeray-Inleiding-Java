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

    setSize(1600, 900);

    seconde = 1;
    minuten = seconde*60;
    uren =  minuten*60;
    dagen = uren*24;
    jaren= dagen*365;

    }

    public void paint(Graphics g){

    g.drawString("Minuten in seconde : " + minuten, 100, 100);
    g.drawString("Uren in seconde : " + uren, 100, 200);
    g.drawString("Dagen in seconde : " + dagen, 100, 300);
    g.drawString("Jaren in seconde : " + jaren, 100, 400);

    }

}
