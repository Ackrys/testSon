package info1.mvc.vue;

import java.awt.*;
import java.io.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.io.IOException;

public class FenetreSon extends JFrame{

    private JPanel panelPrincipal;
    private JButton EXPLOSION;

    public FenetreSon(String titre){
        super(titre);

        panelPrincipal = new JPanel(new BorderLayout());
        this.setContentPane(panelPrincipal);

        EXPLOSION = new JButton("BOOM");
        EXPLOSION.setPreferredSize(new Dimension(500,500));
        panelPrincipal.add(EXPLOSION);
        this.setPreferredSize(new Dimension(1600,900));

    }


    public void fixeListenerBoutonSon(ActionListener action){
        EXPLOSION.addActionListener(action);
    }
}
