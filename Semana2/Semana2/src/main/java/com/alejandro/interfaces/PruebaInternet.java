package com.alejandro.interfaces;

import java.util.ArrayList;

public class PruebaInternet {

    public static void main(String[] args) {
        
        Celular cel = new Celular();
        PC pc = new PC();
        
        cel.enviar("Hola Priscila");
        pc.enviar("Hola Priscila");
        
        ArrayList<Mensaje> mensajes = new ArrayList<>();
        
        mensajes.add(pc);
        mensajes.add(cel);
        
        for(Mensaje m: mensajes){
            m.enviar("Prisila Developer");
        }
        
    }
    
}
