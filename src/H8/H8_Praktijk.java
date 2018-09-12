package H8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H8_Praktijk extends Applet {

    TextField eerstegetal;
    TextField tweedegetal;
    Button keer;
    Button delen;
    Button plus;
    Button min;
    Button Clear;
    float uitkomst = 0;

    public void init(){
        setSize(1600, 900);

        //Eerste tekstvak.
        eerstegetal = new TextField("", 20);
        add(eerstegetal);

        //Tweede tekstvak.
        tweedegetal = new TextField("", 20);
        add(tweedegetal);

        //Keer(*) knop.
        keer = new Button("*");
        keerListener k = new keerListener();
        keer.addActionListener( k );
        add(keer);

        //Delen(/) knop.
        delen = new Button("/");
        delenListener d = new delenListener();
        delen.addActionListener( d );
        add(delen);

        //Plus(+) knop.
        plus = new Button("+");
        plusListener p = new plusListener();
        plus.addActionListener( p );
        add(plus);

        //Min(-) knop.
        min = new Button("-");
        minListener m = new minListener();
        min.addActionListener( m );
        add(min);

        //Clear(C) knop.
        Clear = new Button("Clear");
        ClearListener C = new ClearListener();
        Clear.addActionListener( C );
        add(Clear);
    }

    public void paint(Graphics g){
        g.drawString("" + uitkomst, 760, 50);
        g.drawString("Uitkomst  = ", 690, 50);
    }

    class keerListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            float eerste,tweede;
            eerste = Float.parseFloat(eerstegetal.getText());
            tweede = Float.parseFloat(tweedegetal.getText());
            uitkomst = eerste*tweede;
            repaint();
        }
    }

    class delenListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            float eerste,tweede;
            eerste = Float.parseFloat(eerstegetal.getText());
            tweede = Float.parseFloat(tweedegetal.getText());
            uitkomst = eerste/tweede;
            repaint();
        }
    }

    class plusListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            float eerste,tweede;
            eerste = Float.parseFloat(eerstegetal.getText());
            tweede = Float.parseFloat(tweedegetal.getText());
            uitkomst = eerste+tweede;
            repaint();
        }
    }

    class minListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            float eerste,tweede;
            eerste = Float.parseFloat(eerstegetal.getText());
            tweede = Float.parseFloat(tweedegetal.getText());
            uitkomst = eerste-tweede;
            repaint();
        }
    }

    class ClearListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            uitkomst = 0;
            eerstegetal.setText("");
            tweedegetal.setText("");
            repaint();
        }
    }

}
