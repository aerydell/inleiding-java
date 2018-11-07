package h12;

import java.awt.*;
import java.applet.*;
import java.util.*;

public class Opdracht3 extends Applet {

    private TextField[] Textfields;

    private final int aantaltf = 5;

    public void init() {

        Textfields = new TextField[aantaltf];

        for (int teller = 0; teller < aantaltf; teller++) {
            TextField tf = new TextField( 5 );
            Textfields[teller] = tf;
            add(tf);
        }
        Button knop = new Button("OK");
        add(knop);

        knop.addActionListener(e -> {
            int[] invoer = new int[aantaltf];
            for (int teller = 0;teller<aantaltf;teller++) {
                int input = Integer.parseInt(Textfields[teller].getText());
                invoer[teller] = input;
            }
            Arrays.sort(invoer);
            repaint();

            for(int teller = 0; teller < aantaltf; teller++) {
                Textfields[teller].setText(String.valueOf(invoer[teller]));
            }
        });
    }
}