package com.alejandro.pokemon;

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
    
     public void ataque(Bulbasour bulbasour){
        int live = bulbasour.getLive() - (int)this.power;
        bulbasour.setLive(live);
    }
    
}
