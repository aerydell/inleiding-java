package OktoberChallenge;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Part4 extends Applet{
    TextField tekstvak;
    Label label;
    Button knop;
    int Tijdinput, tijdTokio, tijdChihuahua, tijdMelbourne, tijdLondon;
    String tokio, chihuahua, melbourne, london;

    public void init() {
        tekstvak = new TextField("", 2);
        label = new Label("Voer een heel uur in");
        knop = new Button ("Toon tijden");
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        add(label);
        add(tekstvak);
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString("" + tokio, 20, 40 );

    }

    class KnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Tijdinput = Integer.parseInt(tekstvak.getText());
            if(Tijdinput >= 0 && Tijdinput <= 23) {
                if(Tijdinput >= 0 && Tijdinput <= 13) {
                    tijdMelbourne = Tijdinput + 10;
                }
                if(Tijdinput >=14 && Tijdinput <= 23) {
                    tijdMelbourne = Tijdinput - 14;
                }
                if(Tijdinput >= 0 && Tijdinput <= 15) {
                    tijdTokio = Tijdinput + 8;
                }
                if(Tijdinput >= 16 && Tijdinput <= 23) {
                    tijdTokio = Tijdinput - 16;
                }
                if(Tijdinput >= 1 && Tijdinput <= 23) {
                    tijdLondon = Tijdinput - 1;
                }
                if(Tijdinput == 0) {
                    tijdLondon = Tijdinput + 23;
                }
                if(Tijdinput >=0 && Tijdinput <= 8) {
                    tijdChihuahua = Tijdinput + 15;
                }
                if(Tijdinput >= 9 && Tijdinput <= 23) {
                    tijdChihuahua = Tijdinput - 9;
                }
            }
            else{
                "wrong input, please typ in a number between 0 and 23";
            }
            tokio = "The time in Tokio is: " + tijdTokio + ":00";
            chihuahua = ""
        }
    }
}
