package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H10_4 extends Applet {

    public TextField maandinvoer;
    public TextField jaarinvoer;
    int aantaldagen;
    int maanden;
    String s, maanduitvoer;
    Label writeuitvoer;


    public void init(){
        setSize(1600, 900);

        maandinvoer = new TextField("", 20);
        writeuitvoer = new Label("Type hier Uw maandnummer en jaar");
        maandinvoer.addActionListener( new maandinvoerListener());
        maanduitvoer = "0";
        add(writeuitvoer);
        add(maandinvoer);
        jaarinvoer = new TextField("", 20);
        jaarinvoer.addActionListener(new maandinvoerListener());
        add(jaarinvoer);
    }

    public void paint(Graphics g){
        g.drawString("Maand : " + maanduitvoer, 50, 50);
        g.drawString("Dagen : " + aantaldagen, 50, 80);
    }

    class maandinvoerListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            s = maandinvoer.getText();
            maanden = Integer.parseInt( s );
            switch(maanden) {
                case 1:
                    maanduitvoer = "Januari";
                    aantaldagen = 31;
                    break;
                case 2:
                    s = jaarinvoer.getText();
                    int jaartal = Integer.parseInt(s);
                    if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) || jaartal % 400 == 0 )
                    {
                        aantaldagen = 29;
                    }
                    else {
                        aantaldagen = 28;
                    }
                    maanduitvoer = "Februari";
                    break;
                case 3:
                    maanduitvoer = "Maart";
                    aantaldagen = 31;
                    break;
                case 4:
                    maanduitvoer = "April";
                    aantaldagen = 30;
                    break;
                case 5:
                    maanduitvoer = "Mei";
                    aantaldagen = 31;
                    break;
                case 6:
                    maanduitvoer = "Juni";
                    aantaldagen = 30;
                    break;
                case 7:
                    maanduitvoer = "Juli";
                    aantaldagen = 31;
                    break;
                case 8:
                    maanduitvoer = "Augustus";
                    aantaldagen = 31;
                    break;
                case 9:
                    maanduitvoer = "September";
                    aantaldagen = 30;
                    break;
                case 10:
                    maanduitvoer = "Oktober";
                    aantaldagen = 31;
                    break;
                case 11:
                    maanduitvoer = "November";
                    aantaldagen = 30;
                    break;
                case 12:
                    maanduitvoer = "December";
                    aantaldagen = 31;
                    break;
                default:
                    maanduitvoer = "Dit is geen geldigen maand..!";
                    break;
            }
            repaint();
        }
    }

}
