package com.alejandro.gui2;

import java.util.ArrayList;
import java.util.Random;

public final class PasswordGenerator {

    private PasswordGenerator(){}
    
    private final String simbols = "!@#$%&*(){}[];:.?><\\/-_";
    
    // crear un metodo que devuelva un arraylist del 0 al 9 en tipo string
    //integrar que devuelva la contrasenia con simbolos
    
    private static ArrayList<String> lower(){
        final ArrayList<String> lowers = new ArrayList<>();
        
        for(char a = 'a'; a <= 'z';a++){
             lowers.add( String.valueOf(a));
        }
        
        return lowers;
    }
    
    private static ArrayList<String> upper(){
        final ArrayList<String> uppers = new ArrayList<>();
        
      for(String a : PasswordGenerator.lower()){
            uppers.add(a.toUpperCase());
        }
        
        return uppers;
    }
    
    
    public static String get(int length){   
        
        StringBuilder pwd = new StringBuilder();
        Random random = new Random();
        
        int i =0;
        while(i < length){
            pwd.append( lower().get( random.nextInt(lower().size())));
            i++;
            pwd.append( upper().get( random.nextInt(upper().size())));
            i++;            
        }
        
        return pwd.toString();
    }
            
    public static void main(String[] args) {
        
        System.out.println(get(0));
        
    }
}
