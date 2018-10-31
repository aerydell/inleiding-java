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
    int hoogte;

    public void init(){
        Hans = Color.MAGENTA;
        Valerie = Color.RED;
        Jeroen = Color.GREEN;
        GewichtHans = 80;
        GewichtJeroen = 100;
        GewichtValerie = 40;
        hoogte = 20;

    }
    public void paint(Graphics g){
        g.drawLine(40,60,40,200);
        g.drawLine(40,200,200,200);
        g.drawLine(60,205,60,200);
        g.drawLine(80,205,80,200);
        g.drawLine(100,205,100,200);
        g.drawLine(120,205,120,200);
        g.drawLine(140,205,140,200);
        g.drawLine(160,205,160,200);
        g.drawLine(180,205,180,200);
        g.drawLine(200,205,200,200);
        g.drawString("160",200,220);
        g.drawString("140",175,220);
        g.drawString("120",150,220);
        g.drawString("100",125,220);
        g.drawString("80",110,220);
        g.drawString("60",90,220);
        g.drawString("40",70,220);
        g.drawString("20",50,220);
        g.drawString("0",30,220);
        g.drawString("valerie",60,250);
        g.drawString("hans",60,270);
        g.drawString("jeroen",60,290);
        g.drawString("gewicht in kilo's",80,40);
        g.setColor(Valerie);
        g.fillRect(41,160,GewichtValerie,hoogte);
        g.fillRect(40,240,10,10);
        g.setColor(Hans);
        g.fillRect(41,80,GewichtHans,hoogte);
        g.fillRect(40,260,10,10);
        g.setColor(Jeroen);
        g.fillRect(41,120,GewichtJeroen,hoogte);
        g.fillRect(40,280,10,10);
    }
}
