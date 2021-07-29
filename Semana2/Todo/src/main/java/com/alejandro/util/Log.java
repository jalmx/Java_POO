package com.alejandro.util;

import javax.swing.JFrame;

public final class Log {
    
    private final static String line = ("===============================================================================================================\n");
    private Log(){}
    
    public static void print(String message){
        System.out.println(line);
        System.out.println(message);
        System.out.println(line);
    }
    
    public static void print(String message, Object... data){
        message += "\n";
        System.out.println(line);
        System.out.printf(message, data);
        System.out.println(line);
    }
    
    public static void print(JFrame frame){
        String name = frame.getName();
        String title = frame.getTitle();
        String className = frame.getClass().getCanonicalName();
        
        String message = String.format(
                "The Frame with name:  \"%s\" with title: \"%s\" in the class \"%s\""                 
                , name, title, className);
        
        System.out.println(line);
        System.out.println(message);
        System.out.println(line);
    }
    
}
