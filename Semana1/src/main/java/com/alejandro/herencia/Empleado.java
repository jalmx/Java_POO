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
public class Empleado extends Persona{
    
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }       
    
    public void imprimirDatosSalario(){
        System.out.println(this.getNombre() + " tiene un salario de " + this.getSalario() );
    }
}
