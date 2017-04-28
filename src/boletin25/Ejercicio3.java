/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin25;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author otorradomiguez
 */
public class Ejercicio3 {
    JFrame marco=new JFrame();
    JPanel panel=new JPanel();
    JButton saludo=new JButton("Saludo");
    JButton despedida=new JButton("Despedida");
    JLabel texto=new JLabel();
    
    public void iniciar(){
        saludo.addActionListener((ActionEvent e)->{
            texto.setText("Un saludo a DAM");
        });
        
        despedida.addActionListener((ActionEvent e)->{
            texto.setText("Fin del programa");
        });
        
        saludo.setAlignmentX(0.5f);
        despedida.setAlignmentX(0.5f);
        texto.setAlignmentX(0.5f);
        
        
        marco.setSize(200,200);
        marco.setLocation(550,50);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.add(saludo);
        /*
        La clase Box entre otras cosas nos permite usar separadores trasparentes
        para separar los componentes en un Layout
        */
        panel.add(Box.createRigidArea(new Dimension(0,20)));
        panel.add(despedida);
        panel.add(Box.createRigidArea(new Dimension(0,50)));
        panel.add(texto);
        
        marco.add(panel);
        marco.setVisible(true);
    }
}
