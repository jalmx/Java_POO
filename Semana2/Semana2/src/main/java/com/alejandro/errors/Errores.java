package com.alejandro.errors;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Errores {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.println("Dar la edad");
            int edad = sc.nextInt();
            System.out.println("En 5 anios vas terner una edad de " + (edad + 5));
            
            int[] numeros = {5,3,8,2,56,21,5,6};
            System.out.println("El valor de la ultima posicion es " +
                    numeros[numeros.length-1]);
                    
        }catch(InputMismatchException errorTipo){
            System.out.println("Solo puedes dar numeros");
        }catch(ArrayIndexOutOfBoundsException errorArray){
            System.out.println("La posicion a la que quieres acceder no existe");
        }finally{
            System.out.println("Aqui ejecuto algo que tenga que suceder, pase o no pase error");
        }
        
        
        
    }
    
}
