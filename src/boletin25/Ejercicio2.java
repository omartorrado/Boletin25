/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin25;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author otorradomiguez
 */
public class Ejercicio2 {
    JFrame marco=new JFrame();
    JPanel panel=new JPanel();
    JButton programacion=new JButton("Programación");
    JButton bases=new JButton("Bases");
    
    public void iniciar(){
        marco.setTitle("Curso DAM");
        marco.setSize(200,200);
        marco.setLocation(300,50);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        programacion.addActionListener((ActionEvent e)->{
            marco.setTitle("Programación");
        });
        
        bases.addActionListener((ActionEvent e)->{
            marco.setTitle("Bases de datos");
        });
        
        panel.add(programacion);
        panel.add(bases);
        
        marco.add(panel);
        marco.setVisible(true);
    }
}
