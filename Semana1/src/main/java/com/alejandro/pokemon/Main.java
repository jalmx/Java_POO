package com.alejandro.pokemon;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
     
        Pikachu pikachu = new Pikachu("Pikachu", 12);
        Bulbasour bulbasour = new Bulbasour("Pedro", 11);
        
        while(pikachu.getLive() > 0 && bulbasour.getLive() > 0 ){
            int ataque = new Random().nextInt(7);
            
            if(ataque >= 0 && ataque <= 3){
                pikachu.ataque(bulbasour);
            }else{
                bulbasour.ataque(pikachu);
            }
        }
        
        System.out.printf("%s quedo con %d de vida\n", pikachu.getNombre() , pikachu.getLive());
        System.out.printf("%s quedo con %d de vida\n", bulbasour.getNombre() , bulbasour.getLive());
    }
    
}
