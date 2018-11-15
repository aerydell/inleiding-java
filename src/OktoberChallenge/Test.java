package OktoberChallenge;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Test extends Applet{

    TextField bedrag;
    Button plus, min;
    Label rekening, percentage;
    double totaal, fooi;
    int fooipercent = 10;
    String nope;

    public void init() {
        bedrag = new TextField("",15);
        plus = new Button("+");
        min = new Button("-");
        rekening = new Label("Rekening bedrag");
        percentage = new Label ("Percentage Fooi: ");
        PlusListener pl = new PlusListener();
        MinListener ml = new MinListener();
        plus.addActionListener( pl );
        min.addActionListener( ml );
        add(rekening);
        add(bedrag);
        add(percentage);
        add(min);
        add(plus);
    }

    public void paint(Graphics g) {
        g.drawString("" + fooipercent,80,40);

    }

    class MinListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(fooipercent > 0) {
                fooipercent -= 1;
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
            fooipercent += 1;
            repaint();
        }
    }
}
