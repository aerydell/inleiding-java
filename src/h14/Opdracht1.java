package h14;

import h11.PraktijkOpdracht1;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht1 extends Applet{

    String kleur, nummer;
    double r;
    int kaart;
    Button knop;

    public void init() {
        knop = new Button("re-pick");
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString("" + nummer + kleur, 20,20);
    }

    class KnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            r = Math.random();
            kaart = (int)(r * 54 + 1);

            if(kaart>= 1 && kaart <= 13) {
                kleur = "of Spades";
            }
            if(kaart >=14 && kaart <= 26) {
                kleur = "of Diamonds";
            }
            if(kaart == 27 || kaart == 28) {
                kleur = "Joker";
            }
            if(kaart >= 29 && kaart <= 41) {
                kleur = "of Hearts";
            }
            if(kaart >=42 && kaart <= 54) {
                kleur = "of Clubs";
            }
            if(kaart == 1 || kaart == 14 || kaart == 41 || kaart == 54) {
                nummer = "Ace ";
            }
            if(kaart == 2 || kaart == 15 || kaart == 40 || kaart == 53) {
                nummer = "2 ";
            }
            if(kaart == 3 || kaart == 16 || kaart == 39 || kaart == 52) {
                nummer = "3 ";
            }
            if(kaart == 4 || kaart == 17 || kaart == 38 || kaart == 51) {
                nummer = "4 ";
            }
            if(kaart == 5 || kaart == 18 || kaart == 37 || kaart == 50) {
                nummer = "5 ";
            }
            if(kaart == 6 || kaart == 19 || kaart == 36 || kaart == 49) {
                nummer = "6 ";
            }
            if(kaart == 7 || kaart == 20 || kaart == 35 || kaart == 48) {
                nummer = "7 ";
            }
            if(kaart == 8 || kaart == 21 || kaart == 34 || kaart == 47) {
                nummer = "8 ";
            }
            if(kaart == 9 || kaart == 22 || kaart == 33 || kaart == 46) {
                nummer = "9 ";
            }
            if(kaart == 10 || kaart == 23 || kaart == 32 || kaart == 45) {
                nummer = "10 ";
            }
            if(kaart == 11 || kaart == 24 || kaart == 31 || kaart == 44) {
                nummer = "Jack ";
            }
            if(kaart == 12 || kaart == 25 || kaart == 30 || kaart == 43) {
                nummer = "Queen ";
            }
            if(kaart == 13 || kaart == 26 || kaart == 29 || kaart == 42) {
                nummer = "King ";
            }
            repaint();
        }

    }
}
