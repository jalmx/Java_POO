package com.alejandro.gui;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Ventana2 extends JFrame{
    
    public Ventana2(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        
    }
    
    public static void main(String[] args) {
        new Ventana2().setVisible(true);
    }
}
