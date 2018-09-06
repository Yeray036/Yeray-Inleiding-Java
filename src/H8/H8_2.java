package H8;

import java.applet.Applet;
import java.awt.*;

public class H8_2 extends Applet {

    /*
    Vier knoppen:
    1: Mannelijke personen.
    2: Vrouwlijke personen.
    3: potentiële mannen.
    4: potentiële vrouwen.
     */

    Button man;
    Button vrouw;
    Button potentiëleman;
    Button potentiëlevrouw;

    public void init(){

        setSize(1600, 900);

        man = new Button();
        man.setLabel("Mannelijke personen");

        vrouw = new Button();
        vrouw.setLabel("Vrouwlijke personen");

        potentiëleman = new Button();
        potentiëleman.setLabel("Potentiële mannen");

        potentiëlevrouw = new Button();
        potentiëlevrouw.setLabel("Potentiële vrouwen");

        add(man);
        add(vrouw);
        add(potentiëleman);
        add(potentiëlevrouw);

    }

    public void paint(Graphics g){

    }

}
