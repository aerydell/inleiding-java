package h12;

import java.awt.*;
import java.applet.*;
import java.util.*;

public class Opdracht2 extends Applet{
    int[] getallen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13 , 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
    Button knop;

    public void init(){
        getallen = new int[25];


        for (int teller = 0; teller < getallen.length; teller++) {

            knop = new Button("de knop");
            add(knop);
        }
        Arrays.sort(getallen);

    }
}
