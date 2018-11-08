package h13;
import java.awt.*;
import java.applet.*;
public class PraktijkOpdracht1 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        g.drawOval(19, 20, 51, 50);
        g.drawRect(34, 70, 21, 40);
        g.setColor(Color.green);
        g.fillOval(20,20,50,50);
        g.setColor(Color.red);
        g.fillRect(35,70,20,40);
    }
}
