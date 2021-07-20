package com.alejandro.objetos;

public class PruebaPersona {

    public static void main(String[] args) {
        Persona juanito = new Persona();

        juanito.saludar();
        juanito.decirEdad();

        juanito.edad = 22;
        juanito.nombre = "Juanito";

        juanito.saludar();
        juanito.decirEdad();

        juanito.calcularEdad(1990);
        juanito.cenar("Buebito estrellado", "cafe");
        juanito.decirEdad();

        System.out.printf(
                "La edad si yo naci en 1989 mi edad es %d\n", 
                juanito.obteniendoEdad(1989, 2021)
        );
        
    }

}
