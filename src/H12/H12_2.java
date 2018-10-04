package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H12_2 extends Applet {

    Button koffertje[];
    String knopText;

    @Override
    public void init() {
        koffertje = new Button[25];
        for (int i = 0; i < koffertje.length; i++) {
            Button b = new Button("Knop_" + i);
            koffertje[i] = b;
            b.addActionListener(new KnopListener());

        }

        for (int i = 0; i < koffertje.length; i++) {
            add(koffertje[i]);
        }
    }


    @Override
    public void paint(Graphics g) {

        if (knopText != null) {
            g.drawString(knopText, 50, 500);
        }

    }


    class KnopListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Button b = (Button) e.getSource();
            knopText  = b.getLabel();
            repaint();

        }
    }
}
