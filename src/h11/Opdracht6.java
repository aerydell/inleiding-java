package h11;

import java.awt.*;
import java.applet.*;

public class Opdracht6 extends Applet {

    int teller = 100;
    int x = 10;
    int y = 10;


    public void init() {

    }

    public void paint(Graphics g) {
        while (teller > 19) {
            y += 10;
            x += 10;
            g.drawOval(x, y, teller, teller);
            teller = teller - 20;

        }

    }
}
