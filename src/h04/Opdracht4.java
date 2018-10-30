package h04;

import java.awt.*;
        import java.applet.*;

public class Opdracht4 extends Applet {

            public void init()  {
            }

            public void paint(Graphics g){
                g.drawLine(40,40,40,200);
                g.drawLine(40,200,180,200);
                g.drawLine(35,180,40,180);
                g.drawLine(35,160,40,160);
                g.drawLine(35,140,40,140);
                g.drawLine(35,120,40,120);
                g.drawLine(35,100,40,100);
                g.drawLine(35,80,40,80);
                g.drawLine(35,60,40,60);
                g.drawLine(35,40,40,40);
                g.drawString("0",27,200);
                g.drawString("20",20,180);
                g.drawString("40",20,160);
                g.drawString("60",20,140);
                g.drawString("80",20,120);
                g.drawString("100",13,100);
                g.drawString("120",13,80);
                g.drawString("140",13,60);
                g.drawString("160",13,40);
                g.setColor(Color.red);
                g.fillRect(60,160,20,40);
                g.fillRect(20,230,10,10);
                g.setColor(Color.green);
                g.fillRect(100,100,20,100);
                g.fillRect(20,250,10,10);
                g.setColor(Color.magenta);
                g.fillRect(140,120,20,80);
                g.fillRect(20,270,10,10);
                g.setColor(Color.black);
                g.drawString("Valerie",40,240);
                g.drawString("Jeroen",40,260);
                g.drawString("Hans",40,280);
                g.drawString("Gewicht in Kilo's",70,30);
            }

}
