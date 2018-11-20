package h14;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.net.URL;

public class PraktijkOpdracht extends Applet {

    int taartPunten, gegeten, computer;
    String barf, blergh;
    TextField tekstvak;
    Button knop, reset;
    double random;
    private URL pad;
    private AudioClip scream, applause;
    private Image afbeelding, afbeeldinglost, afbeeldingwon;
    boolean playerLost;
    boolean playerWon;

    public void init() {
        playerLost = false;
        playerWon = false;
        setSize(400,400);
        barf = "";
        random = Math.random();
        taartPunten = 23;
        blergh = "there are still " + taartPunten + " pieced left";
        pad = KnopListener.class.getResource("/h14/SoundsAndPhotos/");
        scream = getAudioClip(pad, "scream1.wav");
        applause = getAudioClip(pad, "applause.wav");
        afbeelding = getImage(pad, "taartpunt.jpg");
        afbeeldinglost = getImage(pad, "you lost.jpg");
        afbeeldingwon = getImage(pad, "you won.jpg");
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
        int x = -30;
        int y = 100;

        g.drawString("Don't eat the last piece of cake or you'll have to buy a new one.", 20, 40);
        g.drawString("" + barf, 20, 60);
        g.drawString("" + blergh, 20, 80);


        if (!playerLost && !playerWon) {
            for (int i = 0; i < taartPunten; i++) {
                x += 50;
                g.drawString(pad.toString(), 0, -10);
                g.drawImage(afbeelding, x, y, 50, 50, this);
                if (x == 170) {
                    x = -30;
                    y += 50;
                }
            }
        }
        else {
            if (playerLost) {
                g.drawImage(afbeeldinglost, 20, 100, 100, 100, this);
                scream.play();
            }
            else {
                g.drawImage(afbeeldingwon, 20, 100, 100, 100, this);
                applause.play();
            }
        }
    }



    class KnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            playerWon = false;
            playerLost = false;
            gegeten = Integer.parseInt(tekstvak.getText());

            if (gegeten > 0 && gegeten < 4) {
                taartPunten = taartPunten - gegeten;
            }
            if (taartPunten <= 0) {
                blergh = "muhuhahahahahahaha you lost...";
                playerLost = true;
            }
            if (taartPunten == 1) {
                blergh = "Congratulations....... you have beaten a computer.....";
                playerWon = true;
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
                computer = (int) (random * 3 + 1);
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
                computer = 0;
                taartPunten = taartPunten - computer;
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
            playerLost = false;
            playerWon = false;
            repaint();
        }
    }
}

