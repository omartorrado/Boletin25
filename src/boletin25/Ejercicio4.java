/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin25;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static java.lang.Thread.sleep;
import javax.swing.JLabel;

/**
 *
 * @author otorradomiguez
 */
public class Ejercicio4 {

    JFrame ventana1 = new JFrame();
    JFrame ventana2 = new JFrame();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JButton botonAbrir = new JButton("Pulsame");
    JButton botonParar = new JButton("Parar");
    Thread t2;
    
    public void iniciar() {
                        
        botonAbrir.addActionListener((ActionEvent e) -> {
            ventana2.setVisible(true);
            CambioFondo cf = new CambioFondo();
            t2 = new Thread(cf);
            t2.start();
            
        });
        
        botonParar.addActionListener((ActionEvent e)->{
            if(t2.isAlive()){
                ventana2.dispose();                
            }
        });

        ventana1.setSize(200, 200);
        ventana1.setLocation(50, 300);
        ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel1.add(botonAbrir);
        panel1.add(botonParar);
        ventana1.add(panel1);

        ventana2.add(panel2);
        ventana2.setSize(600, 400);
        ventana2.setLocation(300, 300);
        ventana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ventana1.setVisible(true);
    }

    public class CambioFondo implements Runnable {

        @Override
        public void run() {
            Random rd1 = new Random();
            while (t2.isAlive()) {
                try {
                    panel2.setBackground(new Color(rd1.nextInt(256), rd1.nextInt(256), rd1.nextInt(256)));
                    sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Ejercicio4.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }
}
