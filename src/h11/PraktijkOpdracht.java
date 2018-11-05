package h11;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class PraktijkOpdracht extends Applet {
    TextField tekstvak;
    Button knop;
    int teller, som;
    int x = 20;

    public void init(){
        tekstvak = new TextField("", 1);
        tekstvak.addActionListener(new TekstvakListener());
        knop = new Button ("OK");
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        add(tekstvak);
        add(knop);
    }

    public void paint(Graphics g){
        while(teller<11) {
            g.drawString(teller + "x" + som + "=" + som*teller, x,60);
            g.drawString(teller + "x" + som + "=" + som*teller,x,80);
            g.drawString(teller + "x" + som + "=" + som*teller, x,100);
            g.drawString(teller + "x" + som + "=" + som*teller, x,120);
            g.drawString(teller + "x" + som + "=" + som*teller, x,140);
            g.drawString(teller + "x" + som + "=" + som*teller, x,160);
            g.drawString(teller + "x" + som + "=" + som*teller, x,180);
            g.drawString(teller + "x" + som + "=" + som*teller, x,200);
            g.drawString(teller + "x" + som + "=" + som*teller, x,220);
            g.drawString(teller + "x" + som + "=" + som*teller, x,240);

        }
    }

    public class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            som = Integer.parseInt(tekstvak.getText());
            repaint();
        }

    }

    public class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            som =Integer.parseInt (tekstvak.getText());
            repaint();
        }
    }
}
