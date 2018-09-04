package H5;

import java.awt.*;
import java.applet.*;

public class H5_2 extends Applet {

    int Valerie;
    int Jeroen;
    int Hans;

    public void init() {
        setSize(1600, 900);
        setBackground(Color.WHITE);
        Valerie = 40;
        Jeroen = 100;
        Hans = 80;

    }

    public void paint(Graphics g) {
       /*
       Valerie: 40 kg
       Jeroen: 100 kg
       Hans: 80 kg

       een staafdiagram, waarbij elke kolom een eigen kleur heeft.
       De namen van de kinderen staan onder het staafdiagram en de verdeling van de schaal staat naast de diagram met daarbij om de 20 de verdeling.
       */

        //barChart
        g.drawLine(100, 100, 100, 600);
        g.drawLine(100, 600, 450, 600);


    }
}