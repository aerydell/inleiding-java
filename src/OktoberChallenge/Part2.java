package OktoberChallenge;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Part2 extends Applet {
    Button soda, beer, wine, coffee, domedist, fordist, neworder;
    double order, daytotal;

    public void init() {
        soda = new Button("Soda");
        beer = new Button("Beer");
        wine = new Button("Wine");
        coffee = new Button("Coffee");
        domedist = new Button("dom. distil.");
        fordist = new Button("for. distil.");
        neworder = new Button(" New Order");
        SodaListener sl = new SodaListener();
        BeerListener bl = new BeerListener();
        WineListener wl = new WineListener();
        CoffeeListener cl = new CoffeeListener();
        DomedistListener dl = new DomedistListener();
        FordistListener fl = new FordistListener();
        NeworderListener nl = new NeworderListener();
        soda.addActionListener(sl);
        beer.addActionListener(bl);
        wine.addActionListener(wl);
        coffee.addActionListener(cl);
        domedist.addActionListener(dl);
        fordist.addActionListener(fl);
        neworder.addActionListener(nl);
        add(soda);
        add(beer);
        add(wine);
        add(coffee);
        add(domedist);
        add(fordist);
        add(neworder);
    }

    public void paint(Graphics g) {
        g.drawString("order total: €" + order, 20, 80);
        g.drawString("Total today: €" + daytotal, 20, 100);
    }

    class SodaListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            order = order + 2.25;
            daytotal = daytotal + 2.25;
            repaint();
        }
    }
    class BeerListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            order = order + 2.50;
            daytotal = daytotal + 2.50;
            repaint();
        }
    }
    class WineListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            order = order + 2.75;
            daytotal = daytotal + 2.75;
            repaint();
        }
    }
    class CoffeeListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            order = order + 2;
            daytotal = daytotal + 2;
            repaint();
        }
    }
    class DomedistListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            order = order + 3;
            daytotal = daytotal + 3;
            repaint();
        }
    }
    class FordistListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            order = order + 3.75;
            daytotal = daytotal + 3.75;
            repaint();
        }
    }
    class NeworderListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            order = 0;
            repaint();
        }
    }

}
