/*

@(#)Show.java 1.0 03/02/26

*

Voorbeeld 2.1

*

*/

//importeer de benodigde klassen uit de Java bibliotheek
import java.awt.*;
import java.applet.*;

//een klasse met de naam Show van het type Applet
public class JavaApplet extends Applet {
    //een (lege) methode die de Applet initialiseert
    public void init() {
        setBackground(new Color(255, 248, 220));
    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(new Color(128, 0, 0));
        g.drawString("Mijn eerste applet!", 50, 60 );
    }
}