package h04;

import java.awt.*;
        import java.applet.*;

public class Opdracht2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g)  {
        g.drawLine(20,105,120,105);
        g.drawLine(20,105,70,35);
        g.drawLine(120,105,70,35);
        g.drawRect(20,105,100,80);
        g.drawRect(35,145,20,40);
        g.drawRect(80,135,15,15);
        g.drawRect(65,135,15,15);
        g.drawRect(80,150,15,15);
        g.drawRect(65,150,15,15);
    }
}
