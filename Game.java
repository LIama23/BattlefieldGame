import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;

public class Game 
{
    
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException 
    {
        //Erstes Charakterobjekt erstellt und Statsmethode aufgerufen
        Charakter char1 = new Charakter("Daniel", 100, 50);
        char1.showStats();

        //Guiobjekt erstellt
        GUI gui = new GUI();
        gui.frame();
        gui.sound();
    }

}


