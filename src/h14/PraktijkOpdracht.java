package h14;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht extends Applet {
    int taartPunten, gegeten, computer;
    String barf, blergh;
    TextField tekstvak;
    Button knop, reset;
    double random;

    public void init() {
        barf = "";
        random = Math.random();
        taartPunten = 23;
        blergh = "there are still " + taartPunten + " pieced left";
        tekstvak = new TextField(10);
        knop = new Button("Enter");
        reset = new Button("Reset");
        KnopListener kl = new KnopListener();
        ResetListener rl = new ResetListener();
        knop.addActionListener(kl);
        reset.addActionListener(rl);
        add(tekstvak);
        add(knop);
        add(reset);
    }

    public void paint(Graphics g) {
        g.drawString("Don't eat the last piece of cake or you'll have to buy a new one.", 20, 40);
        g.drawString("" + barf, 20, 60);
        g.drawString("" + blergh, 20, 80);

    }

    class KnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            gegeten = Integer.parseInt(tekstvak.getText());

            if (gegeten > 0 && gegeten < 4) {
                taartPunten = taartPunten - gegeten;
            }
            if (taartPunten <= 0) {
                blergh = "pffffff, you can't even beat a computer...";
            }
            if (taartPunten == 1) {
                blergh = "Congratulations, you have beaten a computer.....";
            }
            if (taartPunten == 2 || taartPunten == 6 || taartPunten == 10 || taartPunten == 14 || taartPunten == 18 || taartPunten == 22) {
                computer = 1;
                taartPunten = taartPunten - computer;
                barf = "the computer has removed 1 slice";
                blergh = "There are now " + taartPunten + " pieces left";
            } else if (taartPunten == 3 || taartPunten == 7 || taartPunten == 11 || taartPunten == 15 || taartPunten == 19) {
                computer = 2;
                taartPunten = taartPunten - computer;
                barf = "the computer has removed 2 slices";
                blergh = "There are now " + taartPunten + " pieces left";
            } else if (taartPunten == 4 || taartPunten == 8 || taartPunten == 12 || taartPunten == 16 || taartPunten == 20) {
                computer = 3;
                taartPunten = taartPunten - computer;
                barf = "the computer has removed 3 slices";
                blergh = "There are now " + taartPunten + " pieces left";
            } else if (taartPunten == 5) {
                computer = (int) (random * 3 + 1);
                taartPunten = taartPunten - computer;
                barf = "the computer has removed " + computer + " slices";
                blergh = "There are now " + taartPunten + " pieces left";
            } else if (taartPunten == 9) {
                computer = (int) (random * 3 + 1);
                taartPunten = taartPunten - computer;
                barf = "the computer has removed " + computer + " slices";
            } else if (taartPunten == 13) {
                computer = (int) (random * 2 + 1);
                taartPunten = taartPunten - computer;
                barf = "the computer has removed " + computer + " slices";
                blergh = "There are now " + taartPunten + " pieces left";
            } else if (taartPunten == 17) {
                computer = (int) (random * 3 + 1);
                taartPunten = taartPunten - computer;
                barf = "the computer has removed " + computer + " slices";
                blergh = "There are now " + taartPunten + " pieces left";
            } else if (taartPunten == 21) {
                computer = (int) (random * 3 + 1);
                taartPunten = taartPunten - computer;
                barf = "the computer has removed " + computer + " slices";
                blergh = "There are now " + taartPunten + " pieces left";
            }
            else if(gegeten <= 0 || gegeten >= 4) {
                barf = "please enter a valid number";
            }
            repaint();
        }
    }


    class ResetListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            taartPunten = 23;
            barf = "";
            blergh = "there are still " + taartPunten + " pieced left";
            repaint();1
        }
    }
}

