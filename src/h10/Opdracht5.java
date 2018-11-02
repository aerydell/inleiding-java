package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht5 extends Applet{
    double cijfera , cijferb , cijferc , cijferd , cijfere , cijferf , cijferg , cijferh , cijferi , cijferj , gemiddelde;
    TextField tekstvak;
    Label label;
    String a, tekst;
    int counter = 1;
    Button knop;

    public void init() {
        tekstvak = new TextField(4);
        tekstvak.addActionListener(new TekstvakListener());
        label = new Label("voer hier je cijfers in");
        knop = new Button("OK");
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        tekst = "";
        add(label);
        add(tekstvak);
        add(knop);
    }
    public void paint(Graphics g) {
        g.drawString("cijfer 1: " + cijfera,80,60);
        g.drawString("cijfer 2: " + cijferb,80,80);
        g.drawString("cijfer 3: " + cijferc,80,100);
        g.drawString("cijfer 4: " + cijferd,80,120);
        g.drawString("cijfer 5: " + cijfere,80,140);
        g.drawString("cijfer 6: " + cijferf,80,160);
        g.drawString("cijfer 7: " + cijferg,80,180);
        g.drawString("cijfer 8: " + cijferh,80,200);
        g.drawString("cijfer 9: " + cijferi,80,220);
        g.drawString("cijfer 10: " + cijferj,73,240);
        g.drawString("gemiddelde: " + gemiddelde,50,260);
        g.drawLine(50,245,150,245);
        g.drawString(tekst, 50, 280);
    }

    class KnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            gemiddelde = (cijfera + cijferb + cijferc + cijferd + cijfere + cijferf + cijferg + cijferh + cijferi + cijferj)/10;
        if(gemiddelde>=5.5) {
            tekst = "Gefeliciteerd u bent geslaagd :D";
        }
        else {
            tekst = "Helaas uw puntentotaal is niet hoog genoeg 3:<";
        }

            repaint();
        }
    }

    class TekstvakListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

                a = tekstvak.getText();
                double input = Double.parseDouble(a);
                switch (counter) {
                    case 1: cijfera = input; break;
                    case 2: cijferb = input; break;
                    case 3: cijferc = input; break;
                    case 4: cijferd = input; break;
                    case 5: cijfere = input; break;
                    case 6: cijferf = input; break;
                    case 7: cijferg = input; break;
                    case 8: cijferh = input; break;
                    case 9: cijferi = input; break;
                    case 10: cijferj = input; break;
                }
                counter++;
                repaint();
            }
            }
        }

