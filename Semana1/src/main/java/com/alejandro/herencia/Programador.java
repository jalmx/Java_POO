/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandro.herencia;

/**
 *
 * @author xizuth
 */
public class Programador extends Empleado{
    
    private String actividad;

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }  
    
    public void imprimirActividadCompleta(){
        System.out.println(
                this.getNombre() + " tiene un salario de " + 
                this.getSalario() +" y realiza " + this.getActividad()
            );
    }
    
}
