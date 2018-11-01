package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht1 extends Applet {
    String schermtekst;
    TextField tekstvak;
    Button knop;
    Button reset;

    public void init(){
        tekstvak = new TextField("", 20);
        Label label = new Label("your tekst here ->");
        tekstvak.addActionListener(new TekstvakListener());
        knop = new Button("OK");
        reset = new Button ("reset");
        ResetListener rl = new ResetListener();
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        reset.addActionListener( rl );
        add(label);
        add(tekstvak);
        add(knop);
        add(reset);
    }

    public void paint(Graphics g){
        g.drawString("" + schermtekst,50,60);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            schermtekst = tekstvak.getText();
            repaint();
        }
    }
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            schermtekst = tekstvak.getText();
            repaint();
        }
    }
    class ResetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText(" ");
            repaint();
        }
    }
}
