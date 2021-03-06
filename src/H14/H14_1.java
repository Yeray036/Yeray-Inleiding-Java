package H14;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

public class H14_1 extends Applet {

    Button kaartknop;
    String[] kleuren = {"Harten", "Ruiten", "Schoppen", "Klaveren"};
    String[] getalkaart = {"een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "boer", "vrouw", "heer", "aas"};
    String kaart3;

    private URL pad;
    private AudioClip sound;

    @Override
    public void init() {

        pad = H14_1.class.getResource("/H14/Sounds/");
        sound = getAudioClip(pad, "CardSFX.wav");

        kaartknop = new Button("Shuffle maar ! ");
        KaartKnopListener K = new KaartKnopListener();
        kaartknop.addActionListener(K);
        add(kaartknop);

        kaart3 = "";

    }

    @Override
    public void paint(Graphics g) {

        Color b1= new Color(150, 0, 0);
        Color b2= new Color(0, 0, 0);

        int b = (int) (Math.random()*2+1);
        if(b == 1) g.setColor(b1);
        if(b == 2) g.setColor(b2);

        g.drawString(kaart3, 50, 50);
    }

    
        class KaartKnopListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                Random random = new Random();
                int ran1 = random.nextInt(4);
                String kaart = kleuren[ran1];
                int ran2 = random.nextInt(13);
                String kaart2 = getalkaart[ran2];

                sound.play();
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                kaart3 = kaart + " " + kaart2;
                repaint();
            }
        }
    }
