package h05;

import java.awt.*;
        import java.applet.*;

public class Opracht2 extends Applet {
    Color Hans;
    Color Valerie;
    Color Jeroen;
    int GewichtHans;
    int GewichtValerie;
    int GewichtJeroen;
    int breedte;

    public void init(){
        Hans = Color.MAGENTA;
        Valerie = Color.RED;
        Jeroen = Color.GREEN;
        GewichtHans = 80;
        GewichtJeroen = 100;
        GewichtValerie = 40;
        breedte = 20;

    }
    public void paint(Graphics g){
        g.drawLine(40,40,40,200);
        g.drawLine(40,40,180,40);
        g.drawLine(35,180,40,180);
        g.drawLine(35,160,40,160);
        g.drawLine(35,140,40,140);
        g.drawLine(35,120,40,120);
        g.drawLine(35,100,40,100);
        g.drawLine(35,80,40,80);
        g.drawLine(35,60,40,60);
        g.drawLine(35,40,40,40);
        g.drawString("160",13,200);
        g.drawString("140",13,180);
        g.drawString("120",13,160);
        g.drawString("100",13,140);
        g.drawString("80",20,120);
        g.drawString("60",20,100);
        g.drawString("40",20,80);
        g.drawString("20",20,60);
        g.drawString("0",27,40);
        g.setColor(Valerie);
        g.fillRect(60,40,breedte,GewichtValerie);
    }
}
