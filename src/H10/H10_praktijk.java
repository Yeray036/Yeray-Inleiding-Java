package H10;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H10_praktijk extends Applet {

    Label textcijferinvoer;
    TextField cijferinvoer, uitvoer2;
    double uitvoer;
    String s, beordeeling;

    @Override
    public void init() {

        setLayout(null);

        textcijferinvoer = new Label("Voer hier Uw cijfer in");
        textcijferinvoer.setBounds(50, 50, 120, 25);
        add(textcijferinvoer);

        cijferinvoer = new TextField("", 4);
        cijferinvoerListener ci = new cijferinvoerListener();
        cijferinvoer.addActionListener(ci);
        cijferinvoer.setBounds(175, 50, 150, 25);
        add(cijferinvoer);

        uitvoer2 = new TextField("");
        uitvoer2.setEditable(false);
        uitvoer2.setBounds(175, 75, 150, 25 );
        add(uitvoer2);
    }

    @Override
    public void paint(Graphics g) {
    }

    class cijferinvoerListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            uitvoer = Double.parseDouble(cijferinvoer.getText());
            if (uitvoer <= 4) {
                beordeeling = "Slecht";
            }
            else if (uitvoer >= 4 && uitvoer < 5){
                beordeeling = "Onvoldoende";
            }
            else if (uitvoer >= 5 && uitvoer < 6) {
                beordeeling = "Matig";
            }
            else if (uitvoer >= 6 && uitvoer < 7) {
                beordeeling = "Voldoende";
            }
            else if (uitvoer >= 7 && uitvoer < 10) {
                beordeeling = "Goed";
            }
            else {
                JOptionPane.showMessageDialog(null, "That is a bummer, you messed up!", "No valid number!!",
                JOptionPane.ERROR_MESSAGE);
            }
            uitvoer2.setText(beordeeling);
        }
    }

}


