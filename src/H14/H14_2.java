package H14;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

public class H14_2 extends Applet {

    Button kaartdeler;

    String[] kleuren = {"Harten", "Ruiten", "Schoppen", "Klaveren"};
    String[] getalkaart = {"twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "boer", "vrouw", "heer", "aas"};

    String deck[];

    String[] speler1;
    String[] speler2;
    String[] speler3;
    String[] speler4;

    private URL pad;
    private AudioClip sound;

    @Override
    public void init() {

        setSize(1600, 900);

        speler1 = new String[ 13 ];
        speler2 = new String[ 13 ];
        speler3 = new String[ 13 ];
        speler4 = new String[ 13 ];

        kaartdeler = new Button("Deel Uw kaarten");
        KaartdeelListener k = new KaartdeelListener();
        kaartdeler.addActionListener(k);
        add(kaartdeler);
        deelKaarten();

        pad = H14_2.class.getResource("/H14/Sounds/");
        sound = getAudioClip(pad, "CardSFX.wav");

    }

    private void deelKaarten() {
        deck = new String[ 52 ];

        int deckIndex = 0;
        for (int i = 0; i < kleuren.length; i++) {
            String kleur = kleuren[ i ];
            for (int j = 0; j < getalkaart.length; j++) {
                String kaart = getalkaart[ j ];
                String s = kleur + " " + kaart;
                deck[ deckIndex ] = s;
                deckIndex++;
            }
        }
    }

    @Override
    public void paint(Graphics g) {

        int x1 = 100;
        int x2 = 200;
        int x3 = 300;
        int x4 = 400;

        int y = 50;


        g.drawString("Speler 1 ", x1, y);
        g.drawString("Speler 2 ", x2, y);
        g.drawString("Speler 3 ", x3, y);
        g.drawString("Speler 4 ", x4, y);

        for (int i = 0; i < 13; i++) {

            y += 20;
            g.drawString(speler1[ i ], x1, y);
            g.drawString(speler2[ i ], x2, y);
            g.drawString(speler3[ i ], x3, y);
            g.drawString(speler4[ i ], x4, y);
        }
    }

    class KaartdeelListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            deelKaarten();
            for (int i = 0; i < 13; i++) {
                speler1[ i ] = deelKaart();
                speler2[ i ] = deelKaart();
                speler3[ i ] = deelKaart();
                speler4[ i ] = deelKaart();
            }
            sound.play();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            repaint();
        }

    }

    private String deelKaart() {
        int random = new Random().nextInt(deck.length);
        String kaart = deck[ random ];

        //vervang de inhoud van deck
        String[] hulpLijst = new String[ deck.length - 1 ];
        int hulpindex = 0;
        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                hulpLijst[ hulpindex ] = deck[ i ];
                hulpindex++;
            }
        }
        deck = hulpLijst;
        return kaart;
    }
}
