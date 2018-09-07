package H8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class H8_2 extends Applet {

    /*
    Vier knoppen:
    1: Mannelijke personen.
    2: Vrouwlijke personen.
    3: potentiële mannen.
    4: potentiële vrouwen.
     */

    int totaal;
    int man;
    int vrouw;
    int pman;
    int pvrouw;
    Button knopman;
    Button knopvrouw;
    Button knoppman;
    Button knoppvrouw;

    public void init() {

        setSize(1600, 900);

        //knopman
        knopman = new Button("Mannelijke personen");
        knopmanListener kml = new knopmanListener();
        knopman.addActionListener( kml );
        add(knopman);

        //knopvrouw
        knopvrouw = new Button("Vrouwlijke personen");
        knopvrouwListener kvl = new knopvrouwListener();
        knopvrouw.addActionListener( kvl );
        add(knopvrouw);

        //knop potentiële mannen
        knoppman = new Button("Potentiële mannen");
        knoppmanListener kpml = new knoppmanListener();
        knoppman.addActionListener( kpml );
        add(knoppman);

        //knop potentiële vrouwen
        knoppvrouw = new Button("Potentiële vrouwen");
        knoppvrouwListener kpvl = new knoppvrouwListener();
        knoppvrouw.addActionListener( kpvl );
        add(knoppvrouw);
    }

    public void paint(Graphics g) {
        g.drawString("Mannen : " + man,50,80);
        g.drawString("Vrouwen : " + vrouw, 50, 120);
        g.drawString("Potentiële mannen : " + pman, 50, 160);
        g.drawString("Potentiële vrouwen : " + pvrouw, 50, 200);
        g.drawString("Totaal : " + totaal, 50, 240);
    }

    class knopmanListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            man = man + 1;
            totaal = totaal + 1;
            repaint();
        }
    }

    class knopvrouwListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            vrouw = vrouw + 1;
            totaal = totaal + 1;
            repaint();
        }
    }

    class knoppmanListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            pman = pman + 1;
            totaal = totaal + 1;
            repaint();
        }
    }

    class knoppvrouwListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            pvrouw = pvrouw + 1;
            totaal = totaal + 1;
            repaint();
        }
    }

}

