package h04;

import java.awt.*;
        import java.applet.*;

public class Opdracht1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(20,105,120,105);
        g.drawLine(20,105,70,20);
        g.drawLine(120,105,70,20);
    }
}