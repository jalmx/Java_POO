package com.alejandro.objetos;

public class PruebaAuto {

    public static void main(String[] args) {
        
        Auto vochito = new Auto();//creo una instancia de Auto
        
        vochito.arrancar();
        vochito.acelerar();
        
        System.out.printf("Este auto tiene %d puertas\n", vochito.noPuerta );
        System.out.printf("Este auto tiene %d de kilometraje\n", vochito.kilometraje );
    }
    
}
