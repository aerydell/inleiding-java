package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht1 extends Applet {
    int getal, hoogsteGetal;
    TextField tekstvak;

    public void init() {
        tekstvak = new TextField("", 13);
        tekstvak.addActionListener( new VakListener() );

        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString("" + hoogsteGetal, 40,50);
    }

    class VakListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            String s;

            s = tekstvak.getText();
            getal = Integer.parseInt( s );
            if (getal > hoogsteGetal) {
                hoogsteGetal = getal ;
            }

            repaint();
        }
    }
}
