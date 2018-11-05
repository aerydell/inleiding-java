package h11;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class PraktijkOpdracht2 extends Applet {
    Button knop;
    int teller;
    int som = 1;
    int x = 20;
    int y = 40;

    public void init(){
        knop = new Button ("OK");
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        add(knop);
    }

    public void paint(Graphics g){
        while(teller<11) {
            y+= 20;
            g.drawString(teller + "x" + som + "=" + som*teller, x,y);
            teller++;
        }
    }

    public class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            som = som+1;
            repaint();
        }
    }
}
