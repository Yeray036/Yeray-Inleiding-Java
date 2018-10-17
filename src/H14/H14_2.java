package H14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class H14_2 extends Applet {

    Button kaartdeler;

   private String deck[] = {
           "Ruiten A's", "Ruiten 2", "Ruiten 3", "Ruiten 4", "Ruiten 5", "Ruiten 6", "Ruiten 7" ,"Ruiten 8" , "Ruiten 9", "Ruiten 10", "Ruiten boer", "Ruiten vrouw", "Ruiten heer",
           "Schoppen A's", "Schoppen 2", "Schoppen 3", "Schoppen 4", "Schoppen 5", "Schoppen 6", "Schoppen 7" ,"Schoppen 8" , "Schoppen 9", "Schoppen 10", "Schoppen boer", "Schoppen vrouw", "Schoppen heer",
           "Harten A's", "Harten 2", "Harten 3", "Harten 4", "Harten 5", "Harten 6", "Harten 7" ,"Harten 8" , "Harten 9", "Harten 10", "Harten boer", "Harten vrouw", "Harten heer",
           "Klaver A's", "Klaver 2", "Klaver 3", "Klaver 4", "Klaver 5", "Klaver 6", "Klaver 7" ,"Klaver 8" , "Klaver 9", "Klaver 10", "Klaver boer", "Klaver vrouw", "Klaver heer"
   };

    @Override
    public void init() {

    kaartdeler = new Button("Deel Uw kaarten");
    KaartdeelListener K = new KaartdeelListener();
    kaartdeler.addActionListener( K );
    add(kaartdeler);

    }

    @Override
    public void paint(Graphics g) {

        }

        class KaartdeelListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {

                }
            }
    }


