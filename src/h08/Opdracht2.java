package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht2 extends Applet{

    String schermtekst;
    Button man;
    Button vrouw;
    Button jongen;
    Button meisje;
    int a, b, c, d, totaal;

    public void init(){
        man = new Button("mannen");
        vrouw = new Button("vrouwen");
        jongen = new Button("potentiele mannen");
        meisje = new Button("potentiele vrouwen");
        ManListener ml = new ManListener();
        VrouwListener vl = new VrouwListener();
        JongenListener jl = new JongenListener();
        MeisjeListener gl = new MeisjeListener();
        man.addActionListener( ml );
        vrouw.addActionListener( vl );
        jongen.addActionListener( jl );
        meisje.addActionListener( gl );
        add(man);
        add(vrouw);
        add(jongen);
        add(meisje);
        a = 0;
        b = 0;
        c = 0;
        d = 0;
    }
    public void paint(Graphics g) {
        g.drawString("Open dag",20,20);
        g.drawString("Mannen: " + c ,20,50);
        g.drawString("Vrouwen: " + d ,20,70);
        g.drawString("Potentiele mannen: " + a ,20,90);
        g.drawString("Potentiele Vrouwen: " + b ,20,110);
        g.drawString("Totaal" + totaal,20,130);
    }

    class JongenListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            a = a + 1;
            c = c + 1;
            totaal = totaal + 1;
            repaint();
        }
    }

    class MeisjeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            b = b + 1;
            d = d + 1;
            totaal = totaal + 1;
            repaint();
        }
    }

    class ManListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            c = c + 1;
            totaal = totaal + 1;
            repaint();
        }
    }

    class VrouwListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            d = d + 1;
            totaal = totaal + 1;
            repaint();
        }
    }
}
