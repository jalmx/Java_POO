/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandro.constructor;

/**
 *
 * @author xizuth
 */
public class Refencias {

    public static void impresion(String a){
        
        if(a == null) return;
        
        double b = Double.parseDouble(a);
        System.out.println(b);
    }
    
    
    public static void main(String[] args) {
        
//        String nombre = "";
//        String nombre2 = new String();
//        
//        String edad = null;
//        
//        System.out.println(nombre2);

         String nombre = null;
         
         impresion(nombre);
    }
    
}
