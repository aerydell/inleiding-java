package h04;

import java.awt.*;
        import java.applet.*;

public class Opdracht6 extends Applet {
    public void init(){
    }

    public void paint(Graphics g){
        setBackground(Color.gray);
        g.setColor(Color.white);
        g.fillOval(15,15,110,110);
        g.fillRect(15,70,110,110);
        g.fillOval(15,115,110,110);
        g.setColor(Color.black);
        g.fillOval(20,20,100,100);
        g.fillRect(20,70,100,100);
        g.fillOval(20,120,100,100);
        g.setColor(Color.red);
        g.fillOval(53,50,35,35);
        g.setColor(Color.orange);
        g.fillOval(53,150,35,35);
        g.setColor(Color.green);
        g.fillOval(53,100,35,35);
    }
}
