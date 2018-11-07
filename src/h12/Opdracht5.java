package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht5 extends Applet{
    Button ja, nee;
    Label label;
    String tekst;

    public void init() {

        tekst = "";
        ja = new Button("ja");
        nee = new Button ("nee");

        JaListener jl = new JaListener();
        NeeListener nl = new NeeListener();

        ja.addActionListener( jl );
        nee.addActionListener( nl );

        add(ja);
        add(nee);
    }

    public void paint(Graphics g) {
        g.drawString("Moet deze opdracht op worden gezocht op internet?", 20,40);
        g.drawString("" + tekst,20,60);
    }

    class JaListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekst = " Lik m'n reet ik heb geen zin om iets op te zoeken, daar ben ik veel te lui voor";
            repaint();
        }
    }

    class NeeListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            tekst = "Lieg niet tegen me";
            repaint();
        }
    }
}
