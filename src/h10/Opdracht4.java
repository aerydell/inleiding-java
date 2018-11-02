package h10;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht4 extends Applet {
    int jaar, maand;
    TextField tekstvak1, tekstvak2;
    Label label;
    String s, tekst;

    public void init() {
        tekstvak1 = new TextField("", 2);
        tekstvak2 = new TextField("", 4);
        label = new Label("typ het maandnummer en jaartel en druk enter.");
        tekstvak1.addActionListener(new Tekstvak1Listener());
        tekstvak2.addActionListener(new Tekstvak1Listener());
        tekst = "";
        add(label);
        add(tekstvak1);
        add(tekstvak2);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60);

    }


    class Tekstvak1Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            s = tekstvak1.getText();
            maand = Integer.parseInt(s);

            s = tekstvak2.getText();
            jaar = Integer.parseInt(s);

            switch (maand) {
                case 1:
                    tekst = "januari 31 dagen";
                    break;
                case 2:
                    tekst = "februari 28 dagen";
                    break;
                case 3:
                    tekst = "maart 31 dagen";
                    break;
                case 4:
                    tekst = "april 30 dagen";
                    break;
                case 5:
                    tekst = "mei 31 dagen";
                    break;
                case 6:
                    tekst = "juni 30 dagen";
                    break;
                case 7:
                    tekst = "juli 31 dagen";
                    break;
                case 8:
                    tekst = "augustus 31 dagen";
                    break;
                case 9:
                    tekst = "september 30 dagen";
                    break;
                case 10:
                    tekst = "oktober 31 dagen";
                    break;
                case 11:
                    tekst = "november 30 dagen";
                    break;
                case 12:
                    tekst = "december 31 dagen";
                    break;
                default:
                    tekst = "ongeldige maand";
                    break;
            }
            if ((jaar % 4 == 0 && !(jaar % 100 == 0)) || jaar % 400 == 0) {
                switch (maand) {
                    case 2:
                        tekst = "februari 29 dagen";
                        break;
                }
            }
        repaint();
        }
    }
}

