package h13;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht3 extends Applet {

    Button beton, bricks;

    public void init(){
        beton = new Button("betonblok");
        bricks = new Button("baksteen");
        BetonListener bl = new BetonListener();
        BricksListener sl = new BricksListener();
        beton.addActionListener( bl );
        bricks.addActionListener( sl );
        add(beton);
        add(bricks);

    }

    public void paint (Graphics g) {

    }

    public class BricksListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            Graphics g = getGraphics();
            baksteenMuur(g, 0,0, 100, 50);
        }
    }

    public class BetonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            Graphics g = getGraphics();
            betonMuur(g, 0, 0, 150, 75 );
        }
    }

    void baksteenMuur (Graphics g, int x, int y, int breedte, int hoogte) {

        setBackground(Color.red);

        for( int baksteenMuur = 0; baksteenMuur < 15; baksteenMuur++) {

            {
            g.drawRect(x, y, breedte, hoogte);
            x += breedte;
            }

        }

        x = 50;
        y += hoogte;

        for( int baksteenMuur = 0; baksteenMuur < 15; baksteenMuur++) {


            {
                g.drawRect(x, y, breedte, hoogte);
                x += breedte;
            }
        }

        x= 0;
        y+= hoogte;

        for( int baksteenMuur = 0; baksteenMuur < 15; baksteenMuur++){

            {
                g.drawRect(x, y, breedte, hoogte);
                x += breedte;
            }
        }

        x = 50;
        y += hoogte;

        for( int baksteenMuur = 0; baksteenMuur < 15; baksteenMuur++) {


            {
                g.drawRect(x, y, breedte, hoogte);
                x += breedte;
            }
        }

        x= 0;
        y+= hoogte;

        for( int baksteenMuur = 0; baksteenMuur < 15; baksteenMuur++){

            {
                g.drawRect(x, y, breedte, hoogte);
                x += breedte;
            }
        }

        x = 50;
        y += hoogte;

        for( int baksteenMuur = 0; baksteenMuur < 15; baksteenMuur++) {


            {
                g.drawRect(x, y, breedte, hoogte);
                x += breedte;
            }
        }

        x= 0;
        y+= hoogte;

        for( int baksteenMuur = 0; baksteenMuur < 15; baksteenMuur++){

            {
                g.drawRect(x, y, breedte, hoogte);
                x += breedte;
            }
        }

        x = 50;
        y += hoogte;

        for( int baksteenMuur = 0; baksteenMuur < 15; baksteenMuur++) {


            {
                g.drawRect(x, y, breedte, hoogte);
                x += breedte;
            }
        }

        x= 0;
        y+= hoogte;

        for( int baksteenMuur = 0; baksteenMuur < 15; baksteenMuur++){

            {
                g.drawRect(x, y, breedte, hoogte);
                x += breedte;
            }
        }

        x = 50;
        y += hoogte;

        for( int baksteenMuur = 0; baksteenMuur < 15; baksteenMuur++) {


            {
                g.drawRect(x, y, breedte, hoogte);
                x += breedte;
            }
        }

        x= 0;
        y+= hoogte;

        for( int baksteenMuur = 0; baksteenMuur < 15; baksteenMuur++){

            {
                g.drawRect(x, y, breedte, hoogte);
                x += breedte;
            }
        }

        x = 50;
        y += hoogte;

        for( int baksteenMuur = 0; baksteenMuur < 15; baksteenMuur++) {


            {
                g.drawRect(x, y, breedte, hoogte);
                x += breedte;
            }
        }

        x= 0;
        y+= hoogte;

        for( int baksteenMuur = 0; baksteenMuur < 15; baksteenMuur++){

            {
                g.drawRect(x, y, breedte, hoogte);
                x += breedte;
            }
        }

        x = 50;
        y += hoogte;

        for( int baksteenMuur = 0; baksteenMuur < 15; baksteenMuur++) {


            {
                g.drawRect(x, y, breedte, hoogte);
                x += breedte;
            }
        }
    }

    void betonMuur (Graphics g, int x, int y, int breedte, int hoogte) {

        setBackground(Color.gray);

        for( int betonMuur = 0; betonMuur < 10; betonMuur++) {

            {
                g.drawRect(x, y, breedte, hoogte);
                x += breedte;
            }
        }

        x = 75;
        y += hoogte;

        for( int betonMuur = 0; betonMuur < 10; betonMuur++) {


            {
                g.drawRect(x, y, breedte, hoogte);
                x += breedte;
            }
        }

        x= 0;
        y+= hoogte;

        for( int betonMuur = 0; betonMuur < 10; betonMuur++){

            {
                g.drawRect(x, y, breedte, hoogte);
                x += breedte;
            }
        }

        x = 75;
        y += hoogte;

        for( int betonMuur = 0; betonMuur < 10; betonMuur++) {


            {
                g.drawRect(x, y, breedte, hoogte);
                x += breedte;
            }
        }

        x= 0;
        y+= hoogte;

        for( int betonMuur = 0; betonMuur < 10; betonMuur++){

            {
                g.drawRect(x, y, breedte, hoogte);
                x += breedte;
            }
        }

        x = 75;
        y += hoogte;

        for( int betonMuur = 0; betonMuur < 10; betonMuur++) {


            {
                g.drawRect(x, y, breedte, hoogte);
                x += breedte;
            }
        }

        x= 0;
        y+= hoogte;

        for( int betonMuur = 0; betonMuur < 10; betonMuur++){

            {
                g.drawRect(x, y, breedte, hoogte);
                x += breedte;
            }
        }

        x = 75;
        y += hoogte;

        for( int betonMuur = 0; betonMuur < 10; betonMuur++) {


            {
                g.drawRect(x, y, breedte, hoogte);
                x += breedte;
            }
        }

        x= 0;
        y+= hoogte;

        for( int betonMuur = 0; betonMuur < 10; betonMuur++){

            {
                g.drawRect(x, y, breedte, hoogte);
                x += breedte;
            }
        }

        x = 75;
        y += hoogte;

        for( int betonMuur = 0; betonMuur < 10; betonMuur++) {


            {
                g.drawRect(x, y, breedte, hoogte);
                x += breedte;
            }
        }

        x= 0;
        y+= hoogte;

        for( int betonMuur = 0; betonMuur < 10; betonMuur++){

            {
                g.drawRect(x, y, breedte, hoogte);
                x += breedte;
            }
        }

    }
}
