package h06;

import java.awt.*;
import java.applet.*;

public class Opdracht3 extends Applet {
    int a, b, uitkomst;

    public void init(){
        a= 4;
        b = 12;
        uitkomst = a - b;
    }

    public void paint(Graphics g){
        g.drawString("uitkomst van de opdracht: " + uitkomst,20,20);
    }
}
