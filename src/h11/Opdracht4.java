package h11;

import java.awt.*;
import java.applet.*;

public class Opdracht4 extends Applet {

    int teller = 1;
    int arg1, table;
    int y = 0;

    public void init(){
        table = 3;
    }

    public void paint(Graphics g) {
        while(teller <= 11) {
            y += 20;
            g.drawString("" + arg1, 40, y);
            arg1 = teller * table;
            teller++;
        }
    }

}
