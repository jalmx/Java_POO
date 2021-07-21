/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandro.pojo;

/**
 *
 * @author xizuth
 */
public class Producto {
    
    private double precio = 0.0;
    private int cantidad =0;
    private String nombre ="";

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void descriptionProduct(){
        System.out.println(
                String.format(
                        "Hay %d %s y cuestan %.2f pesos",
                        getCantidad(), 
                        getNombre(), 
                        getPrecio()
                )
        );
    }
}
