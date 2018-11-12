package h14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Opdracht2 extends Applet {
    boolean Shuffle = false;
    ArrayList<String> Cards = new ArrayList<>();
    String[] suits = {"Clubs", "Spades", "Hearts", "Diamonds"};
    String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    public void init() {
        this.setSize(750, 500);
        for (String suit: suits) {
            for (String value: values) {
                Cards.add(value + " of " + suit);
            }
        }
        Button shuffle = new Button("Deal cards");
        shuffle.addActionListener(new shuffleListener());
        add(shuffle);
        Button reset = new Button("Reset");
        reset.addActionListener(new resetListener());
        add(reset);
    }

    public void CardShuffle() {
        Collections.shuffle(Cards);
        int xrow = 20;
        int yrow = 70;
        int row = 0;
        for (String kaart : Cards) {
            if (row == 13) {
                getGraphics().drawString("Player 1 has drawn:", xrow, 50);
                xrow = xrow + 140;
                yrow = 70;
            } else if (row == 26) {
                getGraphics().drawString("Player 2 has drawn:", xrow, 50);
                xrow = xrow + 140;
                yrow = 70;
            } else if (row == 39) {
                getGraphics().drawString("Player 3 has drawn:", xrow, 50);
                xrow = xrow + 140;
                yrow = 70;
            } else if (row == 51) {
                getGraphics().drawString("Player 4 has drawn:", xrow, 50);
            }
            row = row + 1;
            yrow = yrow + 20;
            getGraphics().drawString(kaart, xrow, yrow);
        }
    }
    public void paint(Graphics g) {
        if (Shuffle) {
            CardShuffle();
        }
    }
    class shuffleListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Shuffle = true;
            repaint();
        }
    }
    class resetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Shuffle = false;
            repaint();
        }
    }
}