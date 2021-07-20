package com.alejandro.pojo;

public class Perro {
 
    public Perro(){}//un constructor vacio
 
    private String raza = "";
    private String nombre = "";
        
    public void setRaza(String razaNueva){
        raza = razaNueva;
    }
    
    public void setNombre(String nombreNuevo){
        nombre = nombreNuevo.toUpperCase();
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getRaza(){
        return raza;
    }
    
    public void ladrar(){
        System.out.println("gua!! gua!!!");
    }
    
    public void ladrar(String sonido){
        System.out.println(sonido + "!!!! " + sonido +"!!!!!!");
    }
    
    public void ladrar(int veces){
        for(int i =0; i< veces; i++){
            System.out.print("gua!!!! ");
        }
        System.out.println("");
    }
    
    public void ladrar(int veces, String sonido){
        for(int i =0; i< veces; i++){
            System.out.print(sonido +"!!!! ");
        }
        System.out.println("");
    }
    
    public void correr(int velocidad){
        
        if (nombre.isEmpty()){
            setNombre("Perrito");
        }
        
        System.out.println(getNombre() + " va corriendo a " + velocidad + " km/h");
    }
    
    public String jugar(String juguete){
        return String.format("%s esta jugando con %s", getNombre(), juguete);
    }
    
}
