package H8;

import java.applet.Applet;
import java.awt.*;

public class H8_1 extends Applet {

    Button knop;
    TextField tekstvak;
    Label label;

    public void init(){

        setSize(1600, 900);

        tekstvak = new TextField("",20);
        label = new Label("Plaats hier uw wachtwoord");
        add(label);
        add(tekstvak);
        knop = new Button();
        knop.setLabel("Enter");
        add(knop);
    }

    public void paint(Graphics g){

    }

}
