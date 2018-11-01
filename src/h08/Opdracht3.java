package h08;



import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht3 extends Applet {
    TextField tekstvak;
    Label label;
    double getal;
    Button knop;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type een getal");
        tekstvak.addActionListener( new TekstvakListener() );
        knop = new Button("OK");
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        add(label);
        add(tekstvak);
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString("bedrag inclusief btw = " + getal, 50, 60 );
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble( s );
            getal = getal * 1.21;
            repaint();
        }
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble( s );
            getal = getal * 1.21;
            repaint();
        }
    }
}