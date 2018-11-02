package h08;

import javax.swing.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class PraktijkOpdracht extends Applet {
    TextField tekstvak1, tekstvak2;
    Button plus;
    Button min;
    Button Divide;
    Button multiply;
    double getal;

    public void init() {
        tekstvak1 = new TextField("",10);
        tekstvak2 = new TextField("",10);
        plus = new Button("+");
        min = new Button("-");
        Divide = new Button("/");
        multiply = new Button("*");
        PlusListener pl = new PlusListener();
        MinListener ml = new MinListener();
        DivideListener dl = new DivideListener();
        MultiplyListener xl = new MultiplyListener();
        plus.addActionListener( pl );
        min.addActionListener( ml );
        Divide.addActionListener( dl );
        multiply.addActionListener( xl );
        add(tekstvak1);
        add(tekstvak2);
        add(plus);
        add(min);
        add(Divide);
        add(multiply);
    }

    public void paint(Graphics g) {

    }

    public class PlusListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak1.getText();
            double arg1 = Double.parseDouble(s);
            double arg2 = Double.parseDouble(tekstvak2.getText());
            double uitkomst = arg1 + arg2;
            tekstvak1.setText(String.valueOf(uitkomst));
            tekstvak2.setText("");
        }
    }

    public class MinListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            double arg1 = Double.parseDouble(tekstvak1.getText());
            double arg2 = Double.parseDouble(tekstvak2.getText());
            double uitkomst = arg1 - arg2;
            tekstvak1.setText(String.valueOf(uitkomst));
            tekstvak2.setText("");
        }
    }

    public class DivideListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            double arg1 = Double.parseDouble(tekstvak1.getText());
            double arg2 = Double.parseDouble(tekstvak2.getText());
            double uitkomst = arg1 / arg2;
            tekstvak1.setText(String.valueOf(uitkomst));
            tekstvak2.setText("");
        }
    }

    public class MultiplyListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            double arg1 = Double.parseDouble(tekstvak1.getText());
            double arg2 = Double.parseDouble(tekstvak2.getText());
            double uitkomst = arg1 * arg2;
            tekstvak1.setText(String.valueOf(uitkomst));
            tekstvak2.setText("");
        }
    }
}

