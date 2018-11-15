package OktoberChallenge;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Part3 extends Applet {

    TextField bedrag;
    Button plus, min;
    Label rekening, percentage;
    double totaal, fooi, bedragexcl;
    int fooiprocent = 0;
    int totaalInt, fooiInt;
    String nope;

    public void init() {

        this.setLayout(null);
        bedrag = new TextField(15);
        plus = new Button("+");
        min = new Button("-");
        rekening = new Label("Rekening bedrag");
        percentage = new Label ("Percentage Fooi: ");
        bedrag.addActionListener(new TekstvakListener());
        PlusListener pl = new PlusListener();
        MinListener ml = new MinListener();
        plus.addActionListener( pl );
        min.addActionListener( ml );
        add(rekening).setBounds(40, 20,100, 20);
        add(bedrag).setBounds(150,20,130,20);
        add(percentage).setBounds(40,60, 100, 20);
        add(min).setBounds(210, 60, 30, 20);
        add(plus).setBounds(250, 60, 30, 20);
    }
    public void paint (Graphics g) {
        g.drawString("Fooi: €" + fooi, 20, 100);
        g.drawString("Totaal incl fooi("+ fooiprocent + "): €" + totaal, 20,120);
        g.drawString("" + fooiprocent + "%",150, 75);
        g.drawString(nope, 20, 120);
    }
    class MinListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(fooiprocent > 0) {
                fooiprocent = fooiprocent - 1;
                nope = "";
            }
            else{
                nope = "can't go below 0%";

            }
            repaint();
        }
    }

    class PlusListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            fooiprocent = fooiprocent + 1;
            nope = "";
            repaint();
        }

    }
    class TekstvakListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            bedragexcl = Double.parseDouble(bedrag.getText());
            fooi = (bedragexcl / 100) * fooiprocent;
            fooi = fooi * 100;
            fooi = (int) fooi;
            fooi = fooi / 100;

            totaal = (bedragexcl / 100) * (100 + fooiprocent);
            totaal = totaal*100;
            totaal = (int) totaal;
            totaal = totaal / 100;
            repaint();
        }
    }

}
