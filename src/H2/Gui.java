package H2;//importeer de benodigde klassen uit de Java bibliotheek
import java.awt.*;
import java.applet.*;

//een klasse met de naam Show van het type Applet
public class Gui extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {

        setBackground(Color.WHITE);

    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Yeray", 50, 60 );
        g.setColor(Color.red);
        g.drawString("Guzmán Padrón", 50, 70);
    }


}