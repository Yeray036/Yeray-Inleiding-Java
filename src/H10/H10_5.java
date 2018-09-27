package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H10_5 extends Applet {

    TextField cijferinvoer;
    Button okknop;
    Label okknoplabel;
    float cijferinput;
    String v, voldoende;
    int aantalcijfer;
    double gemiddelde;
    double totaal;

    public void init() {
        setSize(720, 480);

        voldoende = "";

        okknoplabel = new Label("Voer hier Uw cijfers in");
        add(okknoplabel);

        cijferinvoer = new TextField("", 8);
        add(cijferinvoer);

        okknop = new Button("Ok");
        okknopListener ok = new okknopListener();
        okknop.addActionListener(ok);
        cijferinvoer.addActionListener(ok);
        add(okknop);

    }

    public void paint(Graphics g) {
        g.drawString("" + voldoende, 50, 50);
        g.drawString("Uw gemiddelde = " + gemiddelde, 50, 80);
    }

    class okknopListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            cijferinput = Float.parseFloat(cijferinvoer.getText());
            System.out.println(cijferinput);
            if (cijferinput >= 5.5) {
                voldoende = "Voldoende";
            } else {
                voldoende = "Onvoldoende";
            }
            aantalcijfer++;
            totaal = cijferinput+totaal;
            gemiddelde = totaal/aantalcijfer;
            repaint();
        }
    }
}


