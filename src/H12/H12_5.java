package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H12_5 extends Applet {

    TextField tekstvak;
    int[] getallen = {100, 200, 300, 120};
    boolean gevonden;
    int index;
    int zoeken;
    Button okknop;

    @Override
    public void init() {
        okknop = new Button("Ok_knop");
        okknopListener O = new okknopListener();
        okknop.addActionListener( O );
        tekstvak = new TextField("", 8);
        add(tekstvak);
        zoeken = 0;
        gevonden = false;
        add(okknop);
    }

    @Override
    public void paint(Graphics g) {
        if(gevonden) {
            g.drawString("De waarde is gevonden : " + index, 20 , 50);
            gevonden = false;
        }
        else {
            g.drawString("De waarde is niet gevonden.", 20, 50);
        }
    }

    class okknopListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            zoeken = Integer.parseInt(tekstvak.getText());
            index = 0;
            for (int i = 0; i < getallen.length ; i++) {
                if (getallen[i] == zoeken) {
                    gevonden = true;
                    index = i;
                }
            }
            repaint();

        }
    }
}
