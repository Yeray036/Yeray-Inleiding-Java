package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H12_praktijkopdracht extends Applet {

    TextField naamtextfield[] = new TextField[10];
    TextField teltextfield[] = new TextField[10];
    Label naamlabel, tellabel;
    Button enter;

    @Override
    public void init() {
        setSize(1600, 900);
        setLayout(null);

        naamlabel = new Label("Naam:");
        naamlabel.setBounds(0, 0, 200, 25);
        naamlabel.setAlignment(Label.CENTER);
        add(naamlabel);

        tellabel = new Label("Tel. nr:");
        tellabel.setBounds(200, 0, 200, 25);
        tellabel.setAlignment(Label.CENTER);
        add(tellabel);

        for (int i = 0; i < naamtextfield.length; i++) {
            naamtextfield[i] = new TextField();
            naamtextfield[i].setBounds(0, 25 + 25 * i, 200, 25);
            add(naamtextfield[i]);

            teltextfield[i] = new TextField();
            teltextfield[i].setBounds(200, 25 + 25 * i, 200, 25);
            add(teltextfield[i]);

            naamtextfield[i].addActionListener(tekstvakListener(i, 0));
            teltextfield[i].addActionListener(tekstvakListener(i, 1));
        }
        enter = new Button("Enter");
        enter.setBounds(0, 25 + 25 * naamtextfield.length, 400, 25);
        enter.addActionListener(tekstvakListener(-1, -1));
        add(enter);

    }

    boolean output = false;

    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < naamtextfield.length; i++) {
            if (!naamtextfield[i].getText().isEmpty())
                g.drawString(naamtextfield[i].getText() + " & " + teltextfield[i].getText(), 450, 50 + g.getFontMetrics().getHeight() * i);
        }
    }

    public ActionListener tekstvakListener(int cur, int type) {
        return (e) -> {
            if(cur == -1){
                for(int i = 0; i < naamtextfield.length; i++){
                    if(naamtextfield[i].getText().isEmpty()){
                        naamtextfield[i].requestFocus();
                        System.out.println("1");
                        return;
                    }
                    else if(teltextfield[i].getText().isEmpty()){
                        teltextfield[i].requestFocus();
                        System.out.println("2");
                        return;
                    }
                }
                repaint();
                return;
            }
            if(type == 0){
                teltextfield[cur].requestFocus();
            }else if(type == 1){
                naamtextfield[(cur+1) % naamtextfield.length].requestFocus();
            }
        };
    }
}


