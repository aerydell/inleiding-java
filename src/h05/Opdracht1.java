package h05;

import java.awt.*;
        import java.applet.*;

public class Opdracht1 extends Applet {

    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init(){
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 200;
        hoogte = 75;
    }
    public void paint(Graphics g){
        g.drawLine(20,20,220,20);
        g.drawRect(20,60,breedte,hoogte);
        g.drawRoundRect(20,165,breedte,hoogte,30,30);
        g.setColor(opvulkleur);
        g.fillRect(240,60,breedte,hoogte);
        g.fillOval(240,165,breedte,hoogte);
        g.fillArc(460,60,breedte,hoogte,0,45);
        g.setColor(lijnkleur);
        g.drawOval(240,60,breedte,hoogte);
        g.drawOval(460,60,breedte,hoogte);
    }
}
