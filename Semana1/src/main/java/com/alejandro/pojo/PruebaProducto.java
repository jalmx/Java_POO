package com.alejandro.pojo;

public class PruebaProducto {

    public static void main(String[] args) {
        Producto papitas = new Producto();
        
        papitas.setNombre("Papitas");
        papitas.setCantidad(5);
        papitas.setPrecio(5.60);
        
        papitas.descriptionProduct();
    }
    
}
