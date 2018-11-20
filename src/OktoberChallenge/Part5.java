package OktoberChallenge;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.net.URL;

public class Part5 extends Applet{

    Button play, buy;
    private URL pad;
    private Image cherry, plum, orange, peach, bar1, lemon, bar2, grapes, coins, heart, melon, bar3, bell, seven;
    private Image uitCherry, uitPlum, uitOrange, uitPeach, uitBar1, uitLemon, uitBar2, uitGrapes, uitCoins, uitHeart, uitMelon, uitBar3, uitBell, uitSeven;
    private Image ImageA, ImageB, ImageC;
    int random1, random2, random3;
    int BaseA, BaseB, BaseC, credits;

    public void init(){

        this.setLayout(null);

        play = new Button("play");
        buy = new Button("buy 10 credits");
        PlayListener pl = new PlayListener ();
        BuyListener bl = new BuyListener ();
        play.addActionListener( pl );
        buy.addActionListener( bl );
        play.setEnabled(false);

        add(play).setBounds(320, 350, 70, 40);
        add(buy).setBounds(300, 105, 100, 30);
        BaseA = 0;
        BaseB = 0;
        BaseC = 0;
        credits = 0;

        pad = PlayListener.class.getResource("/OktoberChallenge/Part 5 pictures/");

        cherry = getImage(pad, "fruit_6.jpg");
        plum = getImage(pad, "fruit_13.jpg");
        orange = getImage(pad, "fruit_4.jpg");
        peach = getImage(pad, "fruit_15.jpg");
        bar1 = getImage(pad, "fruit_9.jpg");
        lemon = getImage(pad, "fruit_18.jpg");
        bar2 = getImage(pad, "fruit_10.jpg");
        grapes = getImage(pad, "fruit_2.jpg");
        coins = getImage(pad, "fruit_16.jpg");
        heart = getImage(pad, "fruit_20.jpg");
        melon = getImage(pad, "fruit_19.jpg");
        bar3 = getImage(pad, "fruit_11.jpg");
        bell = getImage(pad, "fruit_5.jpg");
        seven = getImage(pad, "fruit_1.jpg");

        uitHeart = getImage(pad, "uitleg_20.jpg");
        uitMelon = getImage(pad, "uitleg_19.jpg");
        uitLemon = getImage(pad, "uitleg_18.jpg");
        uitCoins = getImage(pad, "uitleg_16.jpg");
        uitPeach = getImage(pad, "uitleg_15.jpg");
        uitPlum = getImage(pad, "uitleg_13.jpg");
        uitBar3 = getImage(pad, "uitleg_11.jpg");
        uitBar2 = getImage(pad, "uitleg_10.jpg");
        uitBar1 = getImage(pad, "uitleg_9.jpg");
        uitCherry = getImage(pad, "uitleg_6.jpg");
        uitBell = getImage(pad, "uitleg_5.jpg");
        uitOrange = getImage(pad, "uitleg_4.jpg");
        uitGrapes = getImage(pad, "uitleg_2.jpg");
        uitSeven = getImage(pad, "uitleg_1.jpg");




    }

    public void paint(Graphics g){
        SlotMachine(g);
    }

    void SlotMachine (Graphics g) {
        setSize(440,640);
//        the following code is the machine
        g.setColor(Color.darkGray);
        g.fillRoundRect(20, 60, 400, 560,10,10);
        g.fillRoundRect(20,20,400,100, 200, 75);
        g.setColor(Color.black);
        g.drawString("Credits: " + credits, 75, 365);
        g.setColor(Color.lightGray);
        g.fillRoundRect(25,25,390, 70, 200, 75);
        g.fillRect(25, 62, 390, 20 );
        g.fillRoundRect(25, 70, 390, 25, 10, 10);
//        The following slots for the fruits.
        g.fillRoundRect(50, 140, 100, 175, 10, 10);
        g.fillRoundRect(170, 140, 100, 175, 10, 10);
        g.fillRoundRect(290, 140, 100, 175, 10, 10);
        g.drawImage(ImageA, 65, 145, 70, 165, this);
        g.drawImage(ImageB, 185, 145, 70, 165, this);
        g.drawImage(ImageC, 305, 145, 70, 165, this);
////        The following code is the top section
        g.setColor(Color.red);
        g.fillRoundRect(28, 28, 384, 64, 200, 75);
        g.fillRoundRect(28,70, 384, 22, 10,10);
        g.fillRect(28, 60, 384, 20);
        g.setColor(Color.yellow);
//        following code is the letter T
        g.fillRect(45, 50, 10, 35);
        g.fillRect(35, 55, 30, 5);
        g.fillRect(55, 50, 10, 5);
        g.fillRoundRect(35, 50, 30, 10, 15, 10);
//        following code is the letter R
        g.fillRect(70, 50, 10,35);
        g.fillArc(60, 50, 40, 25, 270, 180);
        g.drawLine(100, 85, 90, 70);
        g.drawLine(91, 85, 81, 70);
        g.drawLine(92, 85, 82, 70);
        g.drawLine(93, 85, 83, 70);
        g.drawLine(94, 85, 84, 70);
        g.drawLine(95, 85, 85, 70);
        g.drawLine(96, 85, 86, 70);
        g.drawLine(97, 85, 87, 70);
        g.drawLine(98, 85, 88, 70);
        g.drawLine(99, 85, 89, 70);
        g.setColor(Color.red);
        g.fillArc(70, 60, 20, 5, 270, 180);
//        following code is the letter I
        g.setColor(Color.yellow);
        g.fillRect(105, 50, 10, 35);
//        following code is the letter P
        g.fillRect(120, 50, 10, 35);
        g.fillArc(110, 50, 40, 25, 270, 180);
        g.setColor(Color.red);
        g.fillArc(120, 60, 20, 5, 270, 180);
//        following code is the letter L
        g.setColor(Color.yellow);
        g.fillRect(155, 50, 10, 35);
        g.fillRect(155, 78, 30, 7);
//        following code is the letter E
        g.fillRect(190, 50, 10, 30);
        g.fillRect(190, 50, 30, 7);
        g.fillRect(190, 63, 20, 7);
        g.fillRect(190, 78, 30, 7);
//        following code is the letter F
        g.fillRect(255, 50, 10, 35);
        g.fillRect(255, 50, 30 , 7);
        g.fillRect(255, 63, 20 , 7);
//        following code is the letter R
        g.fillRect(290, 50, 10,35);
        g.fillArc(280, 50, 40, 25, 270, 180);
        g.drawLine(320, 85, 310, 70);
        g.drawLine(311, 85, 301, 70);
        g.drawLine(312, 85, 302, 70);
        g.drawLine(313, 85, 303, 70);
        g.drawLine(314, 85, 304, 70);
        g.drawLine(315, 85, 305, 70);
        g.drawLine(316, 85, 306, 70);
        g.drawLine(317, 85, 307, 70);
        g.drawLine(318, 85, 308, 70);
        g.drawLine(319, 85, 309, 70);
        g.setColor(Color.red);
        g.fillArc(290, 60, 20, 5, 270, 180);
//        following code is the letter U
        g.setColor(Color.yellow);
        g.fillRect(325, 50, 30, 26);
        g.fillRect(345, 50, 10, 35);
        g.fillArc(325, 66, 25, 20, 180, 180);
        g.setColor(Color.red);
        g.fillArc(335, 65, 10, 10, 180, 180);
        g.fillRect(335, 50, 10, 20);
//        following code is the letter I
        g.setColor(Color.yellow);
        g.fillRect(360, 50, 10, 35);
//        following code is the letter T
        g.fillRect(385, 50, 10, 35);
        g.fillRect(375, 55, 30, 5);
        g.fillRect(375, 50, 10, 5);
        g.fillRoundRect(375, 50, 30, 10, 15, 10);
//        following code is all the images and scores
        g.setColor(Color.black);
//        Cherries
        g.drawImage(uitCherry, 50, 400, 20, 20, this);
        g.drawImage(uitCherry, 70, 400, 20, 20, this);
        g.drawImage(uitCherry, 50, 425, 20, 20, this);
        g.drawImage(uitCherry, 70, 425, 20, 20, this);
        g.drawImage(uitCherry, 90, 425, 20, 20, this);
        g.drawString("  3 credits", 115, 415);
        g.drawString("  5 credits", 115, 440);
//        Plums
        g.drawImage(uitPlum, 50, 450, 20, 20, this);
        g.drawImage(uitPlum, 70, 450, 20, 20, this);
        g.drawImage(uitPlum, 50, 475, 20, 20, this);
        g.drawImage(uitPlum, 70, 475, 20, 20, this);
        g.drawImage(uitPlum, 90, 475, 20, 20, this);
        g.drawString("  5 credits", 115, 465);
        g.drawString("10 credits", 115, 490);
//        Oranges
        g.drawImage(uitOrange, 50, 500, 20, 20,this);
        g.drawImage(uitOrange, 70, 500, 20, 20,this);
        g.drawImage(uitOrange, 50, 525, 20, 20,this);
        g.drawImage(uitOrange, 70, 525, 20, 20,this);
        g.drawImage(uitOrange, 90, 525, 20, 20,this);
        g.drawString("10 credits", 115, 515);
        g.drawString("20 credits", 115, 540);
//        Peaches
        g.drawImage(uitPeach, 170, 400, 20, 20,this);
        g.drawImage(uitPeach, 190, 400, 20, 20,this);
        g.drawImage(uitPeach, 170, 425, 20, 20,this);
        g.drawImage(uitPeach, 190, 425, 20, 20,this);
        g.drawImage(uitPeach, 210, 425, 20, 20,this);
        g.drawString("20 credits", 235, 415);
        g.drawString("30 credits", 235, 440);
//        Bar1
        g.drawImage(uitBar1, 170, 450, 20, 20,this);
        g.drawImage(uitBar1, 190, 450, 20, 20,this);
        g.drawImage(uitBar1, 170, 475, 20, 20,this);
        g.drawImage(uitBar1, 190, 475, 20, 20,this);
        g.drawImage(uitBar1, 210, 475, 20, 20,this);
        g.drawString("25 credits", 235, 465);
        g.drawString("50 credits", 235, 490);
//        Lemons
        g.drawImage(uitLemon, 170, 500, 20, 20,this);
        g.drawImage(uitLemon, 190, 500, 20, 20,this);
        g.drawImage(uitLemon, 210, 500, 20, 20,this);
        g.drawString("50 credits", 235, 515);
//        Bar2
        g.drawImage(uitBar2, 170, 525, 20, 20,this);
        g.drawImage(uitBar2, 190, 525, 20, 20,this);
        g.drawImage(uitBar2, 210, 525, 20, 20,this);
        g.drawString("75 credits", 235, 540);
//        Grapes
        g.drawImage(uitGrapes, 290, 400, 20, 20,this);
        g.drawImage(uitGrapes, 310, 400, 20, 20,this);
        g.drawImage(uitGrapes, 330, 400, 20, 20,this);
        g.drawString("75 credits", 355, 415);
//        Coins
        g.drawImage(uitCoins, 290, 425, 20, 20,this);
        g.drawImage(uitCoins, 310, 425, 20, 20,this);
        g.drawImage(uitCoins, 330, 425, 20, 20,this);
        g.drawString("75 credits", 355, 440);
//        Hearts
        g.drawImage(uitHeart, 290, 450, 20, 20,this);
        g.drawImage(uitHeart, 310, 450, 20, 20,this);
        g.drawImage(uitHeart, 330, 450, 20, 20,this);
        g.drawString("75 credits", 355, 465);
//        Melons
        g.drawImage(uitMelon, 290, 475, 20, 20,this);
        g.drawImage(uitMelon, 310, 475, 20, 20,this);
        g.drawImage(uitMelon, 330, 475, 20, 20,this);
        g.drawString("75 credits", 355, 490);
//        Bar3
        g.drawImage(uitBar3, 290, 500, 20, 20,this);
        g.drawImage(uitBar3, 310, 500, 20, 20,this);
        g.drawImage(uitBar3, 330, 500, 20, 20,this);
        g.drawString("100 credits", 350, 515);
//        Bells
        g.drawImage(uitBell, 290, 525, 20, 20,this);
        g.drawImage(uitBell, 310, 525, 20, 20,this);
        g.drawImage(uitBell, 330, 525, 20, 20,this);
        g.drawString("125 credits", 350, 540);
//        SEVENS
        g.drawImage(uitSeven, 40, 560, 40, 40,this);
        g.drawImage(uitSeven, 80, 560, 40, 40,this);
        g.drawImage(uitSeven, 120, 560, 40, 40,this);
        g.drawString("250 credits", 165, 585);
//        ALL BARS
        g.drawImage(uitBar1, 230,560, 40, 40, this);
        g.drawImage(uitBar2, 270,560, 40, 40, this);
        g.drawImage(uitBar3, 310,560, 40, 40, this);
        g.drawString("250 credits", 355, 585);


        g.setColor(Color.white);
        g.fillRect(90, 400, 20,20);
        g.fillRect(90, 450, 20,20);
        g.fillRect(90, 500, 20,20);
        g.fillRect(210, 400, 20,20);
        g.fillRect(210, 450, 20,20);
    }

    class PlayListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            credits = credits - 1;

            random1 = (int) (Math.random() * 14 + 1);
            random2 = (int) (Math.random() * 14 + 1);
            random3 = (int) (Math.random() * 14 + 1);
            BaseA =  random1;
            BaseB = random2;
            BaseC = random3;
            switch(BaseA) {
                case 1:
                    ImageA = cherry;
                    break;
                case 2:
                    ImageA = plum;
                    break;
                case 3:
                    ImageA = orange;
                    break;
                case 4:
                    ImageA = peach;
                    break;
                case 5:
                    ImageA = bar1;
                    break;
                case 6:
                    ImageA = lemon;
                    break;
                case 7:
                    ImageA = bar2;
                    break;
                case 8:
                    ImageA = grapes;
                    break;
                case 9:
                    ImageA = coins;
                    break;
                case 10:
                    ImageA = heart;
                    break;
                case 11:
                    ImageA = melon;
                    break;
                case 12:
                    ImageA = bar3;
                    break;
                case 13:
                    ImageA = bell;
                    break;
                case 14:
                    ImageA = seven;
                    break;
            }
            switch(BaseB) {
                case 1:
                    ImageB = cherry;
                    break;
                case 2:
                    ImageB = plum;
                    break;
                case 3:
                    ImageB = orange;
                    break;
                case 4:
                    ImageB = peach;
                    break;
                case 5:
                    ImageB = bar1;
                    break;
                case 6:
                    ImageB = lemon;
                    break;
                case 7:
                    ImageB = bar2;
                    break;
                case 8:
                    ImageB = grapes;
                    break;
                case 9:
                    ImageB = coins;
                    break;
                case 10:
                    ImageB = heart;
                    break;
                case 11:
                    ImageB = melon;
                    break;
                case 12:
                    ImageB = bar3;
                    break;
                case 13:
                    ImageB = bell;
                    break;
                case 14:
                    ImageB = seven;
                    break;
            }
            switch(BaseC) {
                case 1:
                    ImageC = cherry;
                    break;
                case 2:
                    ImageC = plum;
                    break;
                case 3:
                    ImageC = orange;
                    break;
                case 4:
                    ImageC = peach;
                    break;
                case 5:
                    ImageC = bar1;
                    break;
                case 6:
                    ImageC = lemon;
                    break;
                case 7:
                    ImageC = bar2;
                    break;
                case 8:
                    ImageC = grapes;
                    break;
                case 9:
                    ImageC = coins;
                    break;
                case 10:
                    ImageC = heart;
                    break;
                case 11:
                    ImageC = melon;
                    break;
                case 12:
                    ImageC = bar3;
                    break;
                case 13:
                    ImageC = bell;
                    break;
                case 14:
                    ImageC = seven;
                    break;
            }
            if(ImageA == cherry && ImageB == cherry) {
                    credits = credits + 3;
            }
            else if(ImageA == cherry && ImageB == cherry && ImageC == cherry) {
                credits = credits + 2;
            }
            if(ImageA == plum && ImageB == plum) {
                credits = credits + 5;
            }
            else if(ImageA == plum && ImageB == plum && ImageC == plum) {
                credits = credits + 5;
            }
            if(ImageA == orange && ImageB == orange) {
                credits = credits + 10;
            }
            else if(ImageA == orange && ImageB == orange && ImageC == orange) {
                credits = credits + 10;
            }
            if(ImageA == peach && ImageB == peach) {
                credits = credits + 20;
            }
            else if(ImageA == peach && ImageB == peach && ImageC == peach) {
                credits = credits + 10;
            }
            if(ImageA == bar1 && ImageB == bar1) {
                credits = credits + 25;
            }
            else if(ImageA == bar1 && ImageB == bar1 && ImageC == bar1) {
                credits = credits + 25;
            }
            else if(ImageA == lemon && ImageB == lemon && ImageC == lemon) {
                credits = credits + 50;
            }
            else if(ImageA == bar2 && ImageB == bar2 && ImageC == bar2) {
                credits = credits + 25;
            }
            else if(ImageA == grapes && ImageB == grapes && ImageC == grapes) {
                credits = credits + 25;
            }
            else if(ImageA == coins && ImageB == coins && ImageC == coins) {
                credits = credits + 25;
            }
            else if(ImageA == heart && ImageB == heart && ImageC == heart) {
                credits = credits + 25;
            }
            else if(ImageA == melon && ImageB == melon && ImageC == melon) {
                credits = credits + 25;
            }
            else if(ImageA == bar3 && ImageB == bar3 && ImageC == bar3) {
                credits = credits + 25;
            }
            else if(ImageA == bell && ImageB == bell && ImageC == bell) {
                credits = credits + 25;
            }
            else if(ImageA == seven && ImageB == seven && ImageC == seven) {
                credits = credits + 25;
            }
            if( credits == 0) {
                play.setEnabled(false);
                buy.setEnabled(true);
            }
            repaint();
        }
    }

    class BuyListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            credits = credits + 10;
            if( credits > 0) {
                play.setEnabled(true);
                buy.setEnabled(false);
            }
            repaint();
        }
    }
}
