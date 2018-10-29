package H14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class H14_praktijkopdracht extends Applet {

    TextField numberinjection;
    Label label;
    int numberOfTokens;

    private Image token;
    private URL pad;

    @Override
    public void init() {

        setSize(720, 720);

        numberOfTokens = 23;

        pad = H14_praktijkopdracht.class.getResource("/H14/Images/");

        label = new Label("Voer één, twee en of drie in");
        add(label);

        numberinjection = new TextField("", 8);
        numberinjectionListener n = new numberinjectionListener();
        numberinjection.addActionListener(n);
        add(numberinjection);

        setBackground(Color.black);

    }

    @Override
    public void paint(Graphics g) {
        tokens(g);
    }

    class numberinjectionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int input = Integer.parseInt(numberinjection.getText());
            if (input < 4 && input > 0) {
                numberOfTokens = numberOfTokens - input;
                repaint();


            }
        }
    }

    public void tokens(Graphics g) {
        int x = 0;
        int y = 5;
        for (int i = 0; i < numberOfTokens; i++) {
            if (i % 5 == 0) {
                x = 50;
                y += 120;
            }
            token = getImage(pad, "tokenschips.png");
            g.drawImage(token, x, y, 100, 100, this);
            x += 110;
        }
    }
}
