/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandro.pokemons;

/**
 *
 * @author xizuth
 */
public class Charizard extends Pokemon {

    private String tipoAtaque ;
    
    public Charizard() {
        super();// esto es de cajon
    }

    public Charizard(String nombre, String tipoAtaque) {
        super(nombre);        
        this.tipoAtaque = tipoAtaque;
    }       

    @Override
    public void ataqueEspecial(Pokemon pokemon) {
        super.ataqueEspecial(pokemon);

        System.out.println(
                this.getNombre() + " ataca con "+ this.tipoAtaque +" contra " + pokemon.getNombre()
        );
        System.out.println("=========================================");
    }

    public void sonido() {
        System.out.println("grrrr!!!!!");
    }
    
}
