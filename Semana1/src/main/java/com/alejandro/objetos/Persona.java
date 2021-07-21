package com.alejandro.objetos;

public class Persona {
    
    public int edad = 0;
    public String nombre = "";
    
    public void saludar(){
        System.out.println("Holis!!!! me llamo " + nombre);
    }
    
    public void decirEdad(){
        System.out.println("Tengo una edad de " + edad);
    }
    
    public void calcularEdad(int anioNacimiento){
        int edadActual = 2021 - anioNacimiento; 
        edad = edadActual;
    }
    
    public void cenar(String comida, String bebida){
        System.out.println("Esto cenando un rico " + comida + " con un rico " + bebida);
    }
    
    public int obteniendoEdad(int anioNacimiento, int anioActual){
        int edad = anioActual - anioNacimiento;
        
        return edad;
    }
}
