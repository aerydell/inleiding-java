package h04;

import java.awt.*;
        import java.applet.*;

public class PraltijkOpdracht extends Applet{
        public void init(){
        }
        public void paint(Graphics g){
            g.drawLine(20,20,220,20);
            g.drawString("Lijn",110,40);
            g.drawRect(20,50,200,75);
            g.drawString("rechthoek",95,145);
            g.drawRoundRect(20,155,200,75,30,30);
            g.drawString("Afgeronde Rechthoek",60,260);
            g.drawString("Gevulde rechthoek met ovaal",265,145);
            g.drawString("Gevulde ovaal",300,260);
            g.drawOval(460,50,200,75);
            g.drawString("Taartpunt met ovaal eromheen",480,145);
            g.setColor(Color.magenta);
            g.fillRect(240,50,200,75);
            g.fillOval(240,155,200,75);
            g.fillArc(460,50,200,75,0,45);
            g.setColor(Color.black);
            g.drawOval(240,50,200,75);
            g.drawOval(523,155,75,75);
            g.drawString("Cirkel",545,250);
        }
}
