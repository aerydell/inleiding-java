package h04;
import java.awt.*;
        import java.applet.*;

public class Opdracht7 extends Applet {
    public void init() {
    }
    public void paint(Graphics g){
        g.drawRoundRect(20,20,50,50,10,10);
        g.fillOval(32,32,5,5);
        g.fillOval(32,53,5,5);
        g.fillOval(53,32,5,5);
        g.fillOval(53,53,5,5);
    }
}
