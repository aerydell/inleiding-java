package h06;

import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet {
    int a, b, c, d, e, f, uur, dag, jaar, schrikkeljaar;

    public void init(){
        a = 1;
        b = 60;
        c = 60;
        d = 24;
        e = 365;
        f = 366;
        uur = a * b * c;
        dag = uur * d;
        jaar = dag * e;
        schrikkeljaar = dag * f;
    }
    public void paint(Graphics g){
        g.drawString("aantal secondes in een: ", 20, 20);
        g.drawString("uur: " + uur,20,40);
        g.drawString("dag: " + dag,20,60);
        g.drawString("jaar: " + jaar,20,80);
        g.drawString("schrikkeljaar: " + schrikkeljaar,20,100);
    }
}
