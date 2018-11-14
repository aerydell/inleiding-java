package OktoberChallenge;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Part3 extends Applet {

    TextField bedrag;
    Button plus, min;
    Label rekening, percentage;
    double totaal, fooi;

    public void init() {

        bedrag = new TextField(5);
        plus = new Button("+");
        min = new Button("-");
        rekening = new Label("Rekening bedrag");
        percentage = new Label ("Percentage Fooi");
//        bedrag.addActionListener( new BedragListener());
//        plusListener pl = new PlusListener();
//        MinListener ml = new MinListener();
//        plus.addActionListener( pl );
//        min.addActionListener( ml );
        add(rekening);
        add(bedrag);
        add(percentage);
        add(plus);
        add(min);
    }
}
