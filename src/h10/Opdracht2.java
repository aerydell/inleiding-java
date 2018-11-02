package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht2 extends Applet {
    int getal, hoogsteGetal, laagsteGetal;
    TextField tekstvak;

    public void init() {
        tekstvak = new TextField("", 13);
        tekstvak.addActionListener( new VakListener() );

        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString("" + hoogsteGetal, 40,50);
        g.drawString("" + laagsteGetal, 40,70);
    }

    class VakListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String s;

            s = tekstvak.getText();
            getal = Integer.parseInt( s );
            if (getal > hoogsteGetal) {
                hoogsteGetal = getal ;
            }

            if (getal < laagsteGetal) {
                laagsteGetal = getal;
            }
            repaint();
        }
    }
}
