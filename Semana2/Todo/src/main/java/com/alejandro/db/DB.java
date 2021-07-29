package com.alejandro.db;

import com.alejandro.todo.Task;
import com.alejandro.util.Log;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DB implements DatabaseHelper {

    private static DB database = null;
    private final String nameDatabase = "task.db";
    private final String nameTable = "tasks";
    private final String columnId = "id";
    private final String columnTitle = "title";
    private final String columnDescription = "description";
    private Connection connection = null;

    private DB() throws Exception {
        String query = String.format("jdbc:sqlite:%s", nameDatabase);

        if (isExistDB()) {
            connection = DriverManager.getConnection(query);
        } else {
            connection = DriverManager.getConnection(query);
            createDB();
        }

    }

    private boolean isExistDB() {
        return new File(nameDatabase).exists();
    }

    private void createDB() throws Exception {
        String query
                = "CREATE TABLE '" + nameTable + "' "
                + "('" + columnId + "' INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,"
                + " '" + columnTitle + "' TEXT NOT NULL,"
                + " '" + columnDescription + "' TEXT);";

        Statement st = connection.createStatement();
        st.executeUpdate(query);
        st.close();
    }

    public static DB getDatabase() throws Exception {

        if (database == null) {
            Log.print("Conexion y creacion Ok");
            database = new DB();
        }

        return database;
    }

    @Override
    public int update(Task task) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Task> getAll() {
        ArrayList<Task> tasks = new ArrayList<>();

        try {
            Statement st = connection.createStatement();

            String query = String.format("SELECT * FROM %s ", nameTable);
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                tasks.add(
                        new Task(
                                rs.getString(columnTitle),
                                rs.getString(columnDescription),
                                rs.getInt(columnId)
                        )
                );
            }

            return tasks;
        } catch (Exception e) {
            e.printStackTrace();
            return tasks;
        }
    }

    @Override
    public Task get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insert(Task task) {
        try {
            Statement st = connection.createStatement();

            String query = String.format(
                    "INSERT INTO %s (%s, %s)  VALUES ('%s', '%s')",
                    nameTable,
                    columnTitle,
                    columnDescription,
                    task.getTitle(),
                    task.getDescripcion()
            );
            st.executeUpdate(query);

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
