package com.alejandro.herencia2;

public class Pikachu {
    
    private final String nombre;
    private double power;
    private int live;

    public Pikachu(String nombre, double power) {
        this.nombre = nombre;
        this.power = power;
        this.live = 100;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public int getLive() {
        return live;
    }

    public void setLive(int live) {
        this.live = live;
    }

    public String getNombre() {
        return nombre;
    }
        
//    @Override// anotaciones
//    public String toString(){
//                        
//        return String.format(
//                "Este Pokemon es de la clase %s se llama %s con un poder de %f y con un nivel de vida de %d", 
//                this.getClass().toString(), 
//                this.getNombre(), 
//                this.getPower(), 
//                this.getLive()
//        );
//    }

    @Override
    public String toString() {
        return "Pikachu{" + "nombre=" + nombre + ", power=" + power + ", live=" + live + '}';
    }
    
    
}
