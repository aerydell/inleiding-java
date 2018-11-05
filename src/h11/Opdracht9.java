package h11;

import java.awt.*;
import java.applet.*;
public class Opdracht9 extends Applet {
    int breedte = 20;
    int hoogte = 20;

    public void paint(Graphics g) {
        int x = 50;
        int y = 50;
        for (int kolom = 0; kolom < 8; kolom++) {

            if(kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x,y,breedte,hoogte);
            }
            else{
                g.setColor(Color.white);
                g.fillRect(x,y,breedte,hoogte);
            }
            x += breedte;
        }

        x = 50;
        y += hoogte;
        for (int kolom = 0; kolom < 8; kolom++){
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x,y,breedte,hoogte);
            }
            else{
                g.setColor(Color.black);
                g.fillRect(x,y,breedte,hoogte);
            }
            x+=breedte;
        }

        x = 50;
        y += hoogte;
        for (int kolom = 0; kolom < 8; kolom++) {

            if(kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x,y,breedte,hoogte);
            }
            else{
                g.setColor(Color.white);
                g.fillRect(x,y,breedte,hoogte);
            }
            x += breedte;
        }

        x = 50;
        y += hoogte;
        for (int kolom = 0; kolom < 8; kolom++){
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x,y,breedte,hoogte);
            }
            else{
                g.setColor(Color.black);
                g.fillRect(x,y,breedte,hoogte);
            }
            x+=breedte;
        }

        x = 50;
        y += hoogte;
        for (int kolom = 0; kolom < 8; kolom++) {

            if(kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x,y,breedte,hoogte);
            }
            else{
                g.setColor(Color.white);
                g.fillRect(x,y,breedte,hoogte);
            }
            x += breedte;
        }

        x = 50;
        y += hoogte;
        for (int kolom = 0; kolom < 8; kolom++){
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x,y,breedte,hoogte);
            }
            else{
                g.setColor(Color.black);
                g.fillRect(x,y,breedte,hoogte);
            }
            x+=breedte;
        }

        x = 50;
        y += hoogte;
        for (int kolom = 0; kolom < 8; kolom++) {

            if(kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x,y,breedte,hoogte);
            }
            else{
                g.setColor(Color.white);
                g.fillRect(x,y,breedte,hoogte);
            }
            x += breedte;
        }

        x = 50;
        y += hoogte;
        for (int kolom = 0; kolom < 8; kolom++){
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x,y,breedte,hoogte);
            }
            else{
                g.setColor(Color.black);
                g.fillRect(x,y,breedte,hoogte);
            }
            x+=breedte;
        }
        g.drawRect(50,50,160,160);

    }
}
