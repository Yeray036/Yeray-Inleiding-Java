package H11;

import java.applet.Applet;
import java.awt.*;

public class H11_3 extends Applet {

    long fib [];

    @Override
    public void init() {
        fib = new long[92];
        for(int i = 0; i < fib.length; i++) {
            if(i < 2)
                fib[i] = 1;
            else
                fib[i] = fib[i-2]+fib[i-1];
        }
    }

    @Override
    public void paint(Graphics g) {
        int i = 0;
        for(long num:fib){
            g.drawString("" + num, 50, 50+20*i++);
        }
    }
}
