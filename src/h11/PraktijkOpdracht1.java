package h11;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class PraktijkOpdracht1 extends Applet {
    TextField tekstvak;
    Button knop;
    int teller, som;
    int x = 20;
    int y = 40;

    public void init(){
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener(new TekstvakListener());
        knop = new Button ("OK");
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        add(tekstvak);
        add(knop);
    }

    public void paint(Graphics g){
        while(teller<11) {
            y+= 20;
            g.drawString(teller + "x" + som + "=" + som*teller, x,y);
            teller++;
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
