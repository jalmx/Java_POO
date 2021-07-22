package com.alejandro.herencia;

public class Persona {
    
    private String nombre;
    private int edad;

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void printDatosCompletos(){
        System.out.println(this.getNombre() + " tiene una edad de " + this.getEdad());
    }
    
}
