package h13;

import java.awt.*;
import java.applet.*;

public class PraktijkOpdracht2 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        Boom (g, 20, 20, 35, 70);
    }

    void Boom (Graphics g, int x1, int y1, int x2, int y2) {

        for(int boom = 0; boom < 5; boom++) {

            g.setColor(Color.black);
            g.drawOval(x1, y1, 50, 50);
            g.drawRect(x2, y2, 20, 40);
            g.setColor(Color.green);
            g.fillOval(x1,y1,50,50);
            g.setColor(Color.red);
            g.fillRect(x2,y2,20,40);

            x1 += 60;
            x2 += 60;

        }

        x1 = 50;
        y1 = 70;
        x2 = 65;
        y2 = 120;

        for(int boom = 0; boom < 5; boom++) {

            g.setColor(Color.black);
            g.drawOval(x1, y1, 50, 50);
            g.drawRect(x2, y2, 20, 40);
            g.setColor(Color.green);
            g.fillOval(x1,y1,50,50);
            g.setColor(Color.red);
            g.fillRect(x2,y2,20,40);

            x1 += 60;
            x2 += 60;

            }
    }
}
