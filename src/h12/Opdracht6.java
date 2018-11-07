package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.Arrays;

public class Opdracht6 extends Applet{
    boolean gevonden;
    int[] nummers = {1, 5, 3, 4, 4, 3, 1, 8, 6, 9, 5, 4, 5, 5, 8, 6, 7, 7, 9, 3, 2, 5};
    int gezocht;
    int aantalGevonden;
    TextField tekstvak;

    public void init(){
        gezocht = 0;

        gevonden = false;
        tekstvak = new TextField("", 13);
        tekstvak.addActionListener(new TekstvakListener());

        add(tekstvak);
    }

    public void paint (Graphics g) {
        if( gevonden == true) {
            g.drawString("het nummer " + gezocht + " is " + aantalGevonden + " keer gevonden",20,40);
        }
        else{
            g.drawString("het nummer " + gezocht + " is niet gevonden", 20,40);
        }
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            aantalGevonden = 0;
            gevonden = false;
            gezocht = Integer.parseInt(tekstvak.getText());
            int teller = 0;

            while(teller< nummers.length) {
                if (nummers[teller] == gezocht) {
                    gevonden = true;
                    aantalGevonden++;
                }
                teller++;
            }
            repaint();
        }


    }

}
