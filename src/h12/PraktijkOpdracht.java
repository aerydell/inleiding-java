package h12;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht extends Applet {
    int steven = 123456789;
    int jennie = 123456789;
    int sjon = 123456789;
    int piet = 123456789;
    int klaas = 123456789;
    int achmed = 123456789;
    int tim = 123456789;
    int kevin = 123456789;
    int sander = 123456789;
    int pieter = 123456789;
    Button knop;
    TextField tekstvak;
    String input, tekst;

    public void init() {
        knop = new Button("OK");
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);
        add(knop);
        tekstvak = new TextField(10);
        add(tekstvak);

    }
    public void paint(Graphics g) {
        g.drawString(tekst,40,100);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input = tekstvak.getText().toLowerCase();
            switch (input){
                case "steven":
                    tekst = "steven's nummer is " + steven;
                    break;
                case "jennie":
                    tekst = "Jennie's nummer is " + jennie;
                    break;
                case "sjon":
                    tekst = "Sjon's nummer is " + sjon;
                    break;
                case "piet":
                    tekst = "Piet's nummer is " + piet;
                    break;
                case "klaas":
                    tekst = "Klaas's nummer is " + klaas;
                    break;
                case "achmed":
                    tekst = "Achmed's nummer is " + achmed;
                    break;
                case "tim":
                    tekst = "tim's nummer is " + tim;
                    break;
                case "kevin":
                    tekst = "Jan's nummer is " + kevin;
                    break;
                case "sander":
                    tekst = "sander's nummer is " + sander;
                    break;
                case "pieter":
                    tekst = "pieter's nummer is" + pieter;
                    break;
            }
            repaint();
        }

    }
}