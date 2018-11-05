package h11;

import java.awt.*;
import java.applet.*;

public class Opdracht8 extends Applet {
    int teller = 1;
    int x = 20;
    int y = 20;
    int circle = 0;

    public void init(){

    }

    public void paint(Graphics g){
        while(teller<101) {
            circle += 10;
            g.drawOval(x,y, circle, circle);
            teller++;
        }
    }
}
