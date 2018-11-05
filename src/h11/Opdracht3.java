package h11;

import java.awt.*;
import java.applet.*;

public class Opdracht3 extends Applet {
    int teller = 1;
    int arg1 = 0;
    int arg2 = 1;
    int som;
    int y = 1;

    public void init() {
        som = arg1+arg2;
    }

    public void paint (Graphics g) {
        while(teller <1000) {
            y+=20;
            g.drawString("" + som, 40, y);
            arg1 = arg2;
            arg2 = som;
            som = arg1+arg2;
        }
    }

}
