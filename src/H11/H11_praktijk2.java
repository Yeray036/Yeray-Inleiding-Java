package H11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H11_praktijk2 extends Applet {

    TextField tafelinvoer;
    Button okknop;
    int tafelinvoer2;


    @Override
    public void init() {

        okknop = new Button("Ok");
        okknopListener ok = new okknopListener();
        okknop.addActionListener( ok );

        tafelinvoer = new TextField("", 8);
        tafelinvoer.addActionListener( ok );
        add(tafelinvoer);
        add(okknop);

        tafelinvoer2 = 0;

    }
    @Override
    public void paint(Graphics g) {
        if(tafelinvoer2 != 0)
            for (int i = 1; i <= 10; i++)
                g.drawString(String.format("%d x %d = %d", tafelinvoer2, i, i*tafelinvoer2),50, 50+15*i);
    }

    class okknopListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                tafelinvoer2 = Integer.parseInt(tafelinvoer.getText());
            }catch (Exception ex) {
                if (tafelinvoer2 != 0 && tafelinvoer.getText().isEmpty()) {
                    tafelinvoer2++;
                }
            }
            tafelinvoer.setText("");
            repaint();
        }
    }

}
