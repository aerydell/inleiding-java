package h11;

import java.awt.*;
import java.applet.*;

public class Opdracht1 extends Applet {

    public void init(){

    }

    public void paint(Graphics g) {
        int teller = 0;
        int y = 0;

        while(teller < 11) {
            y += 20;
            g.drawLine(50,y,300,y);
            g.drawString("" + teller, 305, y );
            teller++;
        }
    }
}
