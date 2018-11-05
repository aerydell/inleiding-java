package h12;

import java.awt.*;
import java.applet.*;
import java.util.*;

public class Opdracht1 extends Applet {
    int[] getallen = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int totaal;

    public void init() {
        getallen = new int[10];

        for (int teller = 0; teller < getallen.length; teller++) {
            getallen[teller] = 10 * teller + 10;
        }
    }

    public void paint (Graphics g) {
        for(int teller = 0; teller < getallen.length; teller++) {
            g.drawString("" + getallen[teller], 50, 20 * teller + 20);
        }
        totaal = 10 + 20 + 30 + 40 + 50 + 60 + 70 + 80 + 90 + 100;

        g.drawString("het gemmiddelde is: " + totaal/getallen.length, 50,220);
    }


}