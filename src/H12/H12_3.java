package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.Arrays;

public class H12_3 extends Applet {

    TextField tekstinvoer[];
    Button okknop;
    double[] cijfers;

    @Override
    public void init() {
        tekstinvoer = new TextField[5];
        cijfers = new double[5];

        for (int i = 0; i < tekstinvoer.length ; i++) {
            tekstinvoer[i] = new TextField("", 8);
            add(tekstinvoer[i]);
        }

        okknop = new Button("Ok");
        okknopListener ok = new okknopListener();
        okknop.addActionListener( ok );
        add(okknop);

    }

    @Override
    public void paint(Graphics g) {

    }

    class okknopListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < tekstinvoer.length; i++) {
                cijfers[i] = Double.parseDouble(tekstinvoer[i].getText());
            }
            Arrays.sort(cijfers);
            for (int i = 0; i < tekstinvoer.length; i++) {
                tekstinvoer[i].setText("" + cijfers[i]);
            }
        }
    }
}
