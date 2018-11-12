package h14;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht extends Applet{
    int taartPunten;
    TextField tekstvak;
    Button knop;

    public void init() {
        taartPunten = 23;
        tekstvak = new TextField(10);
        knop = new Button("voer in");
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        add(knop);
    }
    public void paint( Graphics g) {

    }
    class KnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int input = 23;
        }
    }
}
