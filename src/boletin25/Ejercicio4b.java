/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin25;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
    
    public void iniciar(){
        marco.setSize(new Dimension(300,400));
        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        dibujar.addActionListener((ActionEvent e)->{
            Graphics g=panelTop.getGraphics();
            for(int i=0;i<Integer.parseInt(cantidad.getText());i++){                       
                for(int j=0;j<11;j++){                    
                    g.setColor(new Color(100/(j+1),50/(j+1),255/(i+1)));
                    g.fillOval(j*30,10+(30*((i*30)/300)), 20, 20);
                //panelTop.getGraphics().drawOval(j*30,10+(30*((i*30)/300)), 20, 20);                
                }
            }
        });
        panelTop.setLayout(new BoxLayout(panelTop,BoxLayout.Y_AXIS));
        panelTop.add(dibujar);
        panelTop.add(limpiar);
        panelTop.add(cantidad);
        
        marco.add(panelTop);
        marco.setVisible(true);
    }
}
