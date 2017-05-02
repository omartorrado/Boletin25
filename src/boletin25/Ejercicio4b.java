/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin25;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author otorradomiguez
 */
public class Ejercicio4b {
    JFrame marco=new JFrame();
    JPanel panelTop=new JPanel();
    JButton dibujar=new JButton("Dibujar");
    JButton limpiar=new JButton("Limpiar");
    JTextField cantidad=new JTextField("0");
    JPanel panelBot=new JPanel();
    
    public void iniciar(){
        marco.setSize(new Dimension(300,400));
        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        dibujar.addActionListener((ActionEvent e)->{
            Graphics g=panelBot.getGraphics();
            for(int i=0;i<Integer.parseInt(cantidad.getText());i++){                       
                /*
                Aqui generamos circulos con degradado de color en filas de 10:
                for(int j=0;j<11;j++){                    
                    g.setColor(new Color(100/(j+1),50/(j+1),255/(i+1)));
                    g.fillOval(j*30,10+(30*((i*30)/300)), 20, 20);
                panelBot.getGraphics().drawOval(j*30,10+(30*((i*30)/300)), 20, 20);                
                }
                */
                g.setColor(Color.RED);
                for(int j=0;j<11;j++){
                g.fillOval(j*30, i*30, 20, 20);
                }
            }
        });
        
        dibujar.setAlignmentX(0.5f);
        limpiar.setAlignmentX(0.5f);
        panelBot.setSize(300, 200);
        panelBot.setBorder(BorderFactory.createLineBorder(Color.yellow, 10));
        
        panelTop.setLayout(new BoxLayout(panelTop,BoxLayout.Y_AXIS));
        panelTop.add(dibujar);
        panelTop.add(limpiar);
        panelTop.add(cantidad);
                
        marco.add(panelTop,BorderLayout.NORTH);
        marco.add(panelBot,BorderLayout.CENTER);
        marco.setVisible(true);
    }
}
