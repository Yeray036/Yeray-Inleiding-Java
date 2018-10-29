package H14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class H14_praktijkopdracht extends Applet {

    TextField numberinjection;
    Label label;

    private Image token;
    private URL pad;

    @Override
    public void init() {

        pad =  H14_praktijkopdracht.class.getResource("/H14/Images/");

        label = new Label("Voer één, twee en of drie in");
        add(label);

        numberinjection = new TextField("", 8);
        numberinjectionListener n = new numberinjectionListener();
        numberinjection.addActionListener( n );
        add(numberinjection);

    }

    @Override
    public void paint(Graphics g) {
        tokens(g);
    }

    class numberinjectionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    public void tokens(Graphics g) {
        for (int i = 0; i < 24 ; i++) {
            token = getImage(pad, "tokenschips.png");
            repaint();
        }
    }
}
