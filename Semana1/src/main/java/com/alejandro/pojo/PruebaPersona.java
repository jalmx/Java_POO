package com.alejandro.pojo;

public class PruebaPersona {

    public static void main(String[] args) {
        
        Persona brenda = new Persona("Brenda");
        brenda.imprimiNombre();
        
        Persona nadie;//aqui solo creo un espacio en memoria
        
        nadie = new Persona("Priscila", 16);//aqui llamo al constructor
        
        nadie.imprimiNombre();
    
    }
    
}
