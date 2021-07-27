package com.alejandro.interfaces;

public class Celular implements Mensaje{

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando el mensaje desde el Celular:\"" + mensaje + "\"");
    }

    @Override
    public void cancelar() {
        System.out.println("Se cancelo el mensaje desde el Celular");
    }
    
    public void enviarWhatApp(){
        
    }
}
