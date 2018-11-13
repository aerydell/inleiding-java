package h12;

import h11.PraktijkOpdracht1;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht5 extends Applet {

    boolean gevonden;
    int[] Nummers = {7, 3, 2, 0, 9, 12, 1, 4, 151, 24, 53, 11};
    int gezocht;
    TextField tekstvak;

    public void init() {
        gezocht = 0;
        gevonden = false;
        tekstvak = new TextField("", 13);
        tekstvak.addActionListener(new TekstvakListener());

        add(tekstvak);
    }

    public void paint(Graphics g) {
        if (gevonden == true) {
            g.drawString("het getal " + gezocht + " is gevonden", 60, 60);
        }
        else{
            g.drawString("het getal " + gezocht + " is niet gevonden", 60, 60);
        }
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            gezocht = Integer.parseInt(tekstvak.getText());


            int teller = 0;

            while (teller < Nummers.length) {
                if(Nummers[teller] == gezocht) {
                    gevonden = true;
                    break;
                }
                teller++;
            }
            repaint();
        }

    }
}
