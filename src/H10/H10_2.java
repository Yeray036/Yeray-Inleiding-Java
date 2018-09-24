package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H10_2 extends Applet {

    public TextField getalinvoer;
    Button check;
    float laagstegetal = 2146740985;
    float hoogstegetal = -2146740985;

    public void init(){
        setSize(1600, 900);

        getalinvoer = new TextField("", 20);
        add(getalinvoer);

        check = new Button("Enter");
        checkListener C = new checkListener();
        getalinvoer.addActionListener( C );
        check.addActionListener( C );
        add(check);

    }

    public void paint(Graphics g){
        if (laagstegetal == 2146740985)
            return;
        else
            g.drawString("" + laagstegetal, 50, 50);
        if (hoogstegetal == -2146740985)
                return;
        else
            g.drawString("" + hoogstegetal, 100, 50);
    }

    class checkListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            float getalinvoer1 = Float.parseFloat(getalinvoer.getText());
            if (laagstegetal > getalinvoer1)
                laagstegetal = getalinvoer1;
            float getalinvoer2 = Float.parseFloat(getalinvoer.getText());
            if (hoogstegetal < getalinvoer2)
                hoogstegetal = getalinvoer2;
            repaint();
        }
    }
}
