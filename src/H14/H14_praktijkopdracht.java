package H14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

public class H14_praktijkopdracht extends Applet {

    TextField numberinjection;
    Label label;
    int numberOfTokens;
    String stringChips = "";

    public boolean checkUserTurn = true;

    private Image token;
    private URL pad;
    private Image youLost;
    private Image youWon;

    int[] specialnumbers = {1, 5, 9, 13, 17, 21};

    @Override
    public void init() {

        setSize(720, 720);

        numberOfTokens = 23;

        //For the people that read this, here is where you can change your path.
        pad = H14_praktijkopdracht.class.getResource("/H14/Images/");

        label = new Label("Voer één, twee en of drie in");
        label.setBackground(Color.black);
        label.setForeground(Color.white);
        add(label);

        numberinjection = new TextField("", 8);
        numberInjectionListener n = new numberInjectionListener();
        numberinjection.addActionListener(n);
        add(numberinjection);

        setBackground(Color.black);

    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        stringChips = Integer.toString(numberOfTokens);
        if (numberOfTokens <= 0) {
            stringChips = "0";
        }
        g.drawString("Number of poker chips left : " + stringChips, 50, 50);
        tokens(g);
    }

    class numberInjectionListener implements ActionListener {
        int input;

        @Override
        public void actionPerformed(ActionEvent e) {
            if (checkUserTurn == false)
                return;
            input = Integer.parseInt(numberinjection.getText());
            if (input < 4 && input > 0) {
                numberOfTokens = numberOfTokens - input;
                repaint();
            }
            checkUserTurn = false;
            new java.util.Timer().schedule(
                    new java.util.TimerTask() {
                        @Override
                        public void run() {
                                for (int i : specialnumbers)
                                    if (numberOfTokens - 1 == i)
                                        input = 1;
                                    else if (numberOfTokens - 2 == i)
                                        input = 2;
                                    else if (numberOfTokens - 3 == i)
                                        input = 3;
                                    else if (numberOfTokens == 1)
                                        return;
                            Random random = new Random();
                            if (input == 0)
                                if (numberOfTokens >= 4)
                                    input = random.nextInt(3) + 1;
                                else
                                    input = 1;

                            numberOfTokens -= input;
                            repaint();
                            checkUserTurn = true;
                        }
                    },
                    1000 // Wait 1 second before the PC makes a turn
            );
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
        youLost = getImage(pad, "gameover.png");
        youWon = getImage(pad, "winner.png");
        if (numberOfTokens == 1 && checkUserTurn == true) {
            g.drawImage(youLost, 50, 50, this);
        } else if (numberOfTokens == 1 && checkUserTurn == false) {
            g.drawImage(youWon, 5, 60, this);
        }
    }
}
