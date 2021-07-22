package com.alejandro.practica;

import com.alejandro.pojo.Persona;

public class Referencia {
       
    public void cambiarDato(Persona p, int c){
        p.setNombre("Colocando nombre desde otro clase");
        
    }
    
    public static void main(String[] args) {
    
        int x = 0;
        Persona persona = new Persona("Alejandro");
        System.out.println(persona.getNombre());
        
       new Referencia().cambiarDato(persona, x);
        
        System.out.println(persona);
        System.out.println(persona);
    }
    
}
