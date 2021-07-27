package com.alejandro.errors;

import java.util.ArrayList;
import java.util.HashMap;

public class Objectos {

    public static void main(String[] args) {
        
        int i[] = new int[5];
        
        Object o[] = {"hola", 2, 5.6, false};
        
        for(Object element : o){
            System.out.println(element);
            
        }
        
        ArrayList<Object> listO = new ArrayList<>();
        listO.add(o);
        listO.size();
        listO.get(0);
        
        ArrayList<Double> listD = new ArrayList<>();
        listD.add(1.2);
        
        HashMap<Integer, String> db = new HashMap<>();
        db.put(0, "hola");
        db.put(1, "hola");
        db.put(2, "hola");
        
        db.get(5);
        
    }
    
}
