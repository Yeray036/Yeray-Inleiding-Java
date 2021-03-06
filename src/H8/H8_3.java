package H8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.Key;

public class H8_3 extends Applet {

    TextField getalinvoer;
    Label btwinvoer;
    Button okknop;
    float getal;

    public void init(){


        setSize(1600, 900);

        getalinvoer = new TextField("", 20);
        getalinvoer.addActionListener(new getalinvoerListener());
        btwinvoer = new Label("Bedrag om BTW te berekenen");
        add(btwinvoer);
        add(getalinvoer);

        okknop = new Button();
        okknop.setLabel("Ok");
        okknop.addActionListener(new getalinvoerListener());
        add(okknop);
    }

    public void paint(Graphics g){
        g.drawString("" + getal, 870, 50);
        g.drawString("€ ", 860, 50);
}




    class getalinvoerListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            getal = Float.parseFloat (getalinvoer.getText());
            getal *= 0.21;
            getal = Math.round(getal*100);
            getal /=100;
            repaint();
        }
    }

}
