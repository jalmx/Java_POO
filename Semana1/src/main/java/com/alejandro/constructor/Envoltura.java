package com.alejandro.constructor;

import javax.swing.JOptionPane;

/**
 *
 * @author xizuth
 */
public class Envoltura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        int x = 5;
        
  //      Integer x1 = Integer.valueOf(x);
        
//        Double d = x1.doubleValue();    
        
        //parse = casting
        
        //(double) 5  //casting la compatibilidad de tipo es directa, puede perder o agregar inf
                
        //Double.valueOf(5); // parseo conversion o transformacion para adaptarlo a nueva forma
  
        String valor1 = JOptionPane.showInputDialog("Dar un valor");
        double v1 = Double.parseDouble(valor1);
        
        String valor2 = JOptionPane.showInputDialog("Dar el segundo valor");
        double v2 = Double.parseDouble(valor2);
        
        String resultado = String.format("El resutado es %.2f", (v1+v2));
        JOptionPane.showMessageDialog(null, resultado);
        
        
        
    }
    
}
