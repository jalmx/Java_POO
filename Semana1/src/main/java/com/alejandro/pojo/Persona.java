package com.alejandro.pojo;

public class Persona {

    private String nombre="";
    private int edad=0;
     
    private Persona(){}
    
    public Persona(String nombre){
        this.nombre = nombre;
        System.out.println("Llamada al constructo con nombre");
    }
    
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void imprimiNombre(){
        System.out.println(
                "La persona se llama " +
                this.nombre
        );
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
        this.edad = edad;
    }

}
