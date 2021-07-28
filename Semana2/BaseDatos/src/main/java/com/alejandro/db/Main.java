package com.alejandro.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) throws Exception {

        Connection connection = null;

        connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
        Statement statement = connection.createStatement();
        statement.setQueryTimeout(30);

        //statement.executeUpdate("create table person (id integer, name string)");
//        for (int i = 0; i < 10; i++) {
//            statement.executeUpdate("insert into person values(1, 'leo')");
//        statement.executeUpdate("insert into person values(2, 'yui')");
//        }
        ResultSet rs = statement.executeQuery("select * from person");
        
        while(rs.next()){
            System.out.print("name = " + rs.getString("name")+" - ");
            System.out.println("id = " + rs.getInt("id"));
            System.out.println("============");
        }

        if(connection == null){
            connection.close();
        }
    }

}
