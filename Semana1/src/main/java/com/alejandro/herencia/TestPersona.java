package com.alejandro.herencia;

public class TestPersona {

    public static void main(String[] args) {
        
        Persona persona = new Persona();
        Empleado empleado = new Empleado();
        Programador programador = new Programador();
        
        persona.setNombre("Agustin");        
        persona.printDatosCompletos();
                
        empleado.setNombre("Carlos");
        empleado.printDatosCompletos();
        empleado.setSalario(4500);
        empleado.imprimirDatosSalario();
        
        programador.setNombre("Brenda");
        programador.printDatosCompletos();
        programador.setSalario(6000);
        programador.imprimirDatosSalario();
        programador.setActividad("Data Base Administrator (DBA)");
        programador.imprimirActividadCompleta();
        
        
    }
    
}
