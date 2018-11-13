package OktoberChallenge;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Part1 extends Applet {
    Label labelVal, labelJer, labelSan;
    TextField tekstVal, tekstJer, tekstSan;
    int val, jer, san;
    Button wijzig;

    public void init() {
        labelVal = new Label("Valerie");
        labelJer = new Label("Jeroen");
        labelSan = new Label("Sander");
        tekstVal = new TextField(3);
        tekstJer = new TextField(3);
        tekstSan = new TextField(3);
        wijzig = new Button("Change");
        WijzigListener wl = new WijzigListener();
        wijzig.addActionListener( wl );
        add(labelVal);
        add(tekstVal);
        add(labelJer);
        add(tekstJer);
        add(labelSan);
        add(tekstSan);
        add(wijzig);

    }

    public void paint (Graphics g) {
            g.drawLine(40,40,40,200);
            g.drawLine(40,200,180,200);
            g.drawLine(35,180,40,180);
            g.drawLine(35,160,40,160);
            g.drawLine(35,140,40,140);
            g.drawLine(35,120,40,120);
            g.drawLine(35,100,40,100);
            g.drawLine(35,80,40,80);
            g.drawLine(35,60,40,60);
            g.drawLine(35,40,40,40);
            g.drawString("0",27,200);
            g.drawString("20",20,180);
            g.drawString("40",20,160);
            g.drawString("60",20,140);
            g.drawString("80",20,120);
            g.drawString("100",13,100);
            g.drawString("120",13,80);
            g.drawString("140",13,60);
            g.drawString("160",13,40);
            g.setColor(Color.red);
            g.fillRect(20,210, 10,10);
            g.fillRect(50,200 - val, 20, val );
            g.setColor(Color.blue);
            g.fillRect(20,230, 10,10);
            g.fillRect(80, 200 - jer, 20, jer);
            g.setColor(Color.green);
            g.fillRect(20,250, 10,10);
            g.fillRect(110, 200 - san, 20, san);
            g.setColor(Color.black);
            g.drawString("Valerie", 40,220);
            g.drawString("Jeroen", 40,240);
            g.drawString("Sander", 40, 260);
            g.drawRect(50, 200 - val, 20, val);
            g.drawRect(80, 200 - jer, 20, jer);
            g.drawRect(110, 200 - san, 20, san);
    }
    class WijzigListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            val = Integer.parseInt(tekstVal.getText());
            jer = Integer.parseInt(tekstJer.getText());
            san = Integer.parseInt(tekstSan.getText());
            repaint();
        }
    }
}
