package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class PraktijkOpdracht extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int cijfer;

    public void init() {
        tekstvak = new TextField();
        tekstvak.addActionListener(new TekstvakListener());
        label = new Label("Voldoende of onvoldoende?");
        tekst = "" + cijfer;
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString("" + tekst, 50, 60);
    }

    class TekstvakListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            s = tekstvak.getText();
            int cijfer = Integer.parseInt( s );

                if ((cijfer >= 1) && cijfer <= 3) {
                    tekst = "dit cijfer is slecht";
                }
                if (cijfer == 4) {
                    tekst = "dit cijfer is onvoldoende";
                }
                if (cijfer == 5) {
                    tekst = "dit cijfer is matig";
                }
                if ((cijfer == 6) || cijfer == 7) {
                    tekst = "dit cijfer is voldoende";
                }
                if ((cijfer >= 7) && cijfer <= 10) {
                    tekst = "dit cijfer is goed";
                }
                if ((cijfer < 1) || cijfer > 10) {
                    tekst = "voer een geldig cijfer in";
                }
                repaint();
            }
        }

    }

