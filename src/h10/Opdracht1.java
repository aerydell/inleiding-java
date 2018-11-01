package h10;

import java.awt.*;
import java.applet.*;
import java.awt.Event.*;

public class Opdracht1 extends Applet {
    int getal;
    TextField tekstvak;
    String tekst;

    public void init() {
        tekstvak = new TextField("", 13);
        tekstvak.addActionListener( new VakListener() );
        tekst = "";

        add(tekstvak);
    }
}
