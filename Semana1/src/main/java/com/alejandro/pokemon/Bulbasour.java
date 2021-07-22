package com.alejandro.pokemon;

public class Bulbasour {

    private double power;
    private final String nombre;
    private int live;

    public Bulbasour(String nombre, double power) {
        this.power = power;
        this.nombre = nombre;
        this.live = 100;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void setLive(int live) {
        this.live = live;
    }

    public int getLive() {
        return live;
    }  

    public void ataque(Pikachu pikachu){
        int live = pikachu.getLive() - (int)this.power;
        pikachu.setLive(live);
    }
       
    
}
