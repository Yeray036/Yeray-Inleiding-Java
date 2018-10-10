package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H12_6 extends Applet {

    long[] getallen = {1, 1 , 20, 20, 50, 23, 26, 55, 55};
    TextField getalinvoer;
    int textfieldtoint;
    String textString;

    @Override
    public void init() {
        getalinvoer = new TextField("", 8);
        getalinvoerListener G = new getalinvoerListener();
        getalinvoer.addActionListener( G );
        add(getalinvoer);
        textString = "";
    }

    @Override
    public void paint(Graphics g) {
        g.drawString (textString, 50, 50);
    }

    class getalinvoerListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            textfieldtoint = Integer.parseInt(getalinvoer.getText());
            int counter = 0;

            for (int i = 0; i < getallen.length; i++) {
                if (getallen[i] == textfieldtoint) {
                    counter++;
                }
                System.out.println(i);
            }
            System.out.println("het getal kwam : " + counter + " x voor");
            textString = "het getal kwam : " + counter + " x voor";
            repaint();
        }
    }

}
