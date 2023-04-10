import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;

public class GUI 
{
    //Themesound eingefügt
    //Soundmethode erstellt und Throws definiert
    void sound() throws UnsupportedAudioFileException, IOException, LineUnavailableException
    {
        File file = new File("C:\\Users\\LIama23\\Meine Ablage\\ZHAW\\Informatik 2\\Selfstudy\\BattlefieldGame\\theme.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
    }
    }
    
