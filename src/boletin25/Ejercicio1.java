/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin25;

import java.awt.event.ActionEvent;
import java.util.HashSet;
import java.util.Set;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author otorradomiguez
 */
public class Ejercicio1 {
    JFrame marco=new JFrame();
    JPanel panel=new JPanel();
    JButton pulsar=new JButton("Pulsar");
    JLabel etiqueta=new JLabel("Pulsaste el boton");
    
    public void iniciar(){
        marco.setSize(200,200);
        marco.setLocation(50, 50);
        
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        
        pulsar.addActionListener((ActionEvent e) -> {
            etiqueta.setVisible(true);
        });
        pulsar.setAlignmentX(0.5f);
        
        etiqueta.setVisible(false);
        etiqueta.setAlignmentX(0.5f);
        
        
        panel.add(pulsar);
        panel.add(etiqueta);
        
        marco.add(panel);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}
