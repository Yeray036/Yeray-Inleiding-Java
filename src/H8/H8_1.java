package H8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class H8_1 extends Applet {

    Button knop;
    Button knop2;
    TextField tekstvak;
    Label label;
    String tekst;

    public void init(){

        setSize(1600, 900);


        tekstvak = new TextField("",20);
        label = new Label("Plaats hier uw wachtwoord");
        knop = new Button();
        knop.setLabel("Ok");
        knop.addActionListener(new TekstvakListener());
        knop2 = new Button();
        knop2.setLabel("refresh");
        add(label);
        add(tekstvak);
        add(knop);
        add(knop2);
        tekst = "";
    }

    public void paint(Graphics g){

    }

    class TekstvakListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            tekst = tekstvak.getText();
            repaint();
        }
    }


}

