package h04;

import java.awt.*;
        import java.applet.*;

public class Opdracht5 extends Applet {
    public void init(){
    }

    public void paint(Graphics g)   {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(20,20,200,75,0,360);
    }
}
