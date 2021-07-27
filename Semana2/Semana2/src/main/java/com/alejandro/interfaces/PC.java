package com.alejandro.interfaces;

public class PC implements Mensaje{

    @Override
    public void enviar(String mensaje) {
        System.out.printf("Enviando mensaje desde PC: \"%s \"\n", mensaje);
    }

    @Override
    public void cancelar() {
        System.out.println("Se cancelo en la PC");
    }
    
    public void activarRGB(String codeHex){
        
    }
}
