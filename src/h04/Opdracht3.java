package h04;

import java.awt.*;
        import java.applet.*;

public class Opdracht3 extends Applet {

    public void init(){
    }

    public void paint(Graphics g)   {

        g.drawRoundRect(20,20,150,120,20,20);
        g.setColor(Color.red);
        g.fillRoundRect(20,20,150,40,20,20);
        g.fillRoundRect(100,50,150,40,20,20);
        g.fillRect(120,50,100,40);
        g.fillRect(20,20,120,40);
        g.fillRect(20,30,150,30);
        g.fillRect(100,60,150,30);
        g.setColor(Color.white);
        g.fillRect(100,90,150,40);
        g.setColor(Color.blue);
        g.fillRect(20,100,80,40);
        g.setColor(Color.black);
        g.drawLine(20,140,50,140);
        g.drawLine(20,20,20,140);
        g.drawLine(20,20,160,20);
        g.drawLine(161,21,165,21);
        g.drawRoundRect(100,50,150,120,20,20);
        g.setColor(Color.blue);
        g.fillRect(120,130,130,40);
        g.fillRoundRect(100,130,50,40,20,20);
        g.fillRect(100,130,50,20);
        g.setColor(Color.red);
        g.fillRect(150,50,100,40);
        g.setColor(Color.black);
        g.drawLine(140,50,240,50);
        g.drawLine(120,170,250,170);
        g.drawLine(100,160,100,100);
        g.drawLine(150,50,250,50);
        g.drawLine(107,50,170,27);
        g.drawLine(250,45,250,320);
        g.drawLine(250,45,265,45);
        g.drawLine(265,45,265,320);
        g.drawOval(250,30,15,15);
        g.drawLine(250,320,265,320);
    }
}
