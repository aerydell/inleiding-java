package h10;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht3 extends Applet{
    int nummer, maand;
    TextField tekstvak;
    Label label;
    String s, tekst;

    public void init(){
        tekstvak = new TextField("",2);
        label = new Label("typ het maandnummer en druk enter.");
        tekstvak.addActionListener(new TekstvakListener());
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50,60);

    }

    class TekstvakListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            maand = Integer.parseInt( s );
            switch(maand) {
                case 1:
                    tekst = "januari 31 dagen";
                    break;
                case 2:
                    tekst = "februari 28 dagen (29 in een schrikkeljaar)";
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
            repaint();
        }
    }
}
