package com.alejandro.pokemons;

public class Pokemon{
    
    private final String nombre;
    private int power;
    private int live;

    public Pokemon(String nombre, int power) {
        this.nombre = nombre;
        this.power = power;
        this.live = 100;
    }

    public Pokemon() {
        this("Pokemon");
    }
    
    public Pokemon(String nombre) {
        this(nombre, 10);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getLive() {
        return live;
    }

    public void setLive(int live) {
        this.live = live;
    }

    public final String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "nombre=" + nombre + ", power=" + power + ", live=" + live + '}';
    }
    
     public void ataque(Pokemon pokemon){
        final int live = pokemon.getLive() - (int)this.power;
        pokemon.setLive(live);
    }

    public void ataqueEspecial(Pokemon pokemon){
        //System.out.println(this.getNombre() +" ataque especial contra el pokemon " + pokemon.getNombre());
    }
}
