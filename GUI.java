import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI 
{

    //Framemethode erstellt
    void frame()
    {
        //Label erstellt
        ImageIcon image1 = new ImageIcon("C:\\Users\\LIama23\\Meine Ablage\\ZHAW\\Informatik 2\\Selfstudy\\BattlefieldGame\\Battlefield.png");
        JLabel label = new JLabel();
        label.setIcon(image1);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);

        //Frame erstellt
        JFrame frame1 = new JFrame();
        frame1.setTitle("Battolofildo");
        frame1.setSize(1800, 1800);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setResizable(false);
        frame1.getContentPane().setBackground(new Color(0,0,0));

        frame1.add(label);

        frame1.setVisible(true);

        //Logo erstellt
        ImageIcon image2 = new ImageIcon("C:\\Users\\LIama23\\Meine Ablage\\ZHAW\\Informatik 2\\Selfstudy\\BattlefieldGame\\penis.png");
        frame1.setIconImage(image2.getImage());


        


    }


    //Themesound eingefügt
    //Soundmethode erstellt und Throws definiert
    void sound() throws UnsupportedAudioFileException, IOException, LineUnavailableException
    {

        File file = new File("C:\\Users\\LIama23\\Meine Ablage\\ZHAW\\Informatik 2\\Selfstudy\\BattlefieldGame\\theme.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();

    }
    }
    
