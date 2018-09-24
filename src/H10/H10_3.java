package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H10_3 extends Applet {

    public TextField maandinvoer;
    int maanden;
    String s, maanduitvoer;
    Label writeuitvoer;


    public void init(){
        setSize(1600, 900);

        maandinvoer = new TextField("", 20);
        writeuitvoer = new Label("Type hier Uw maandnummer");
        maandinvoer.addActionListener( new maandinvoerListener());
        maanduitvoer = "";
        add(writeuitvoer);
        add(maandinvoer);
    }

    public void paint(Graphics g){
        g.drawString(maanduitvoer, 50, 50);
    }

    class maandinvoerListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            s = maandinvoer.getText();
            maanden = Integer.parseInt( s );
            switch(maanden) {
                case 1:
                    maanduitvoer = "Januari heeft 31 dagen";
                    break;
                case 2:
                    maanduitvoer = "Februari heeft 28 dagen";
                    break;
                case 3:
                    maanduitvoer = "Maart heeft 31 dagen";
                    break;
                case 4:
                    maanduitvoer = "April heeft 30 dagen";
                    break;
                case 5:
                    maanduitvoer = "Mei heeft 31 dagen";
                    break;
                case 6:
                    maanduitvoer = "Juni heeft 30 dagen";
                    break;
                case 7:
                    maanduitvoer = "Juli heeft 31 dagen";
                    break;
                case 8:
                    maanduitvoer = "Augustus heeft 31 dagen";
                    break;
                case 9:
                    maanduitvoer = "September heeft 30 dagen";
                    break;
                case 10:
                    maanduitvoer = "Oktober heeft 31 dagen";
                    break;
                case 11:
                    maanduitvoer = "November heeft 30 dagen";
                    break;
                case 12:
                    maanduitvoer = "December heeft 31 dagen";
                    break;
                default:
                    maanduitvoer = "Dit is geen geldigen maand..!";
                    break;
            }
            repaint();
        }
    }

}
