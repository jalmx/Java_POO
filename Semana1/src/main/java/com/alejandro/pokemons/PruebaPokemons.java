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
public class PruebaPokemons {

    public static void main(String[] args) {
        
        Pokemon pokemon = new Pokemon("Desconcido");
        Charizard charizard = new Charizard("Roberto","super flama");
        
        pokemon.ataqueEspecial(charizard);
        charizard.ataqueEspecial(pokemon);
        
    }
    
}
