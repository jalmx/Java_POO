package com.alejandro.constructor;

public class Persona {
    
    private String nombre;
    private int edad;
    public static int anio = 2021;
    
    public Persona(){
        this("sin nombre");
    }
    
    public Persona(String nombre){
        this.nombre = nombre;
        this.edad = 0;
    }
    
    public Persona(int edad){
        this("sin nombre");
        this.edad = edad;   
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        Persona.anio++;
        this.edad = edad;
    }
    
    public static int calcularEdad(int anioNacimiento){
        return 2021 - anioNacimiento;
    }       
    
    public static void main(String[] args) {
        Persona persona = new Persona(25);
        Persona brenda = new Persona("Brenda");
        
        System.out.println(Persona.anio);
        
        System.out.println(persona.getNombre());

        persona.setEdad(25);        
        System.out.println(Persona.anio);
        
        System.out.println(persona.getEdad());
                 
        System.out.println(Persona.calcularEdad(1990));
        
        System.out.println(brenda.getNombre());
        
        brenda.setEdad(18);
        System.out.println(brenda.getEdad());
        System.out.println(Persona.anio);
        
    }    
       
}
