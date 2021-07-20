package com.alejandro.pojo;

public class PruebaPerro {


    public static void main(String[] args) {
        Perro firulas = new Perro();
        
        firulas.ladrar();
        firulas.correr(5);
        firulas.setNombre("Firulais");
        System.out.println(firulas.jugar("pelota"));
        System.out.println("==========");
        
        firulas.ladrar(50);
        firulas.ladrar(100, "miau");
    }
    
}
