package h11;

import java.awt.*;
import java.applet.*;

public class Opdracht7 extends Applet {
    int teller = 500;
    int y = 15;
    int x = 15;

    public void init(){

    }

    public void paint(Graphics g) {
        while(teller>9) {
            y += 5;
            x += 5;
            g.drawOval (x, y, teller, teller);
            teller = teller - 10;

        }
    }

}