package h12;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht extends Applet {
    int jan = 1234567;
    int jennie = 1234567;
    int sjon = 1234567;
    int piet = 1234567;
    int klaas = 1234567;
    int achmed = 1234567;
    int tim = 1234567;
    int kevin = 1234567;
    int sander = 1234567;
    int pieter = 1234567;
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
                case "jan":
                    tekst = "Jan's nummer is " + jan;
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