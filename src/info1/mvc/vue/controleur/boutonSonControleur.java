package info1.mvc.vue.controleur;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import info1.mvc.vue.FenetreSon;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class boutonSonControleur implements ActionListener{
    private FenetreSon fenetre;

    public boutonSonControleur(FenetreSon fn){ fenetre = fn;}

    @Override
    public void actionPerformed(ActionEvent e){
        try {
            File son = new File("./soundBox/bruit-dexplosion.wav");
            String soundName = "yourSound.wav";
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src/soundBox/bruit-dexplosion.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            JOptionPane.showMessageDialog(fenetre,"BOUM");
        }catch(Exception exception){
            JOptionPane.showMessageDialog(fenetre, "Fichier audio non trouvé.");
        }
    }
}
