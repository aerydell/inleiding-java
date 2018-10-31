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
    }
    public void paint(Graphics g) {
        g.drawString("Open dag");
    }
}
