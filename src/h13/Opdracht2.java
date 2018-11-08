package h13;

import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet {

    public void init(){

    }

    public void paint (Graphics g) {
        setBackground(Color.red);
        baksteenMuur(g, 0,0, 100, 50);
    }

    void baksteenMuur (Graphics g, int x, int y, int breedte, int hoogte) {

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

        x= 0;
        y+= hoogte;

        for( int baksteenMuur = 0; baksteenMuur < 15; baksteenMuur++){

            {
                g.drawRect(x, y, breedte, hoogte);
                x += breedte;
            }
        }
    }
}
