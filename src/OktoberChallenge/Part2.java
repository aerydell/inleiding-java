package OktoberChallenge;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Part2 extends Applet {
    Button soda, beer, wine, coffee, domedist, fordist, neworder;

    public void init() {
        soda = new Button("Soda");
        beer = new Button("Beer");
        wine = new Button("Wine");
        coffee = new Button("Coffee");
        domedist = new Button("dom. distil.");
        fordist = new Button("for. distil.");
        neworder = new Button(" New Order");
//        SodaListener sl = new SodaListener();
//        BeerListener bl = new BeerListener();
//        WineListener wl = new WineListener();
//        CoffeeListener cl = new CoffeeListener();
//        DomedistListener dl = new DomedistListener();
//        FordistListener fl = new FordistListener();
//        NeworderListener nl = new NeworderListener();
//        soda.addActionListener(sl);
//        beer.addActionListener(bl);
//        wine.addActionListener(wl);
//        coffee.addActionListener(cl);
//        domedist.addActionListener(dl);
//        fordist.addActionListener(fl);
//        neworder.addActionListener(nl);
        add(soda);
        add(beer);
        add(wine);
        add(coffee);
        add(domedist);
        add(fordist);
        add(neworder);
    }
}
