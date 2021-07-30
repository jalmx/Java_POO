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
            createTable();
        }

    }

    public static DB getDatabase() throws Exception {

        if (database == null) {
            Log.print("Conexion y creacion Ok");
            database = new DB();
        }

        return database;
    }

    private boolean isExistDB() {
        return new File(nameDatabase).exists();
    }

    private void createTable() throws Exception {
        String query
                = "CREATE TABLE '" + nameTable + "' "
                + "('" + columnId + "' INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,"
                + " '" + columnTitle + "' TEXT NOT NULL,"
                + " '" + columnDescription + "' TEXT);";

        Statement st = connection.createStatement();
        st.executeUpdate(query);
        st.close();
    }

    @Override
    public int update(Task task) {
        int value = -1;
        try {
            Statement st = connection.createStatement();

            String query = String.format(
                    "UPDATE %s SET %s = '%s', %s = '%s'  WHERE %s=%d ;",
                    nameTable,
                    columnTitle,
                    task.getTitle(),
                    columnDescription,
                    task.getDescripcion(),
                    columnId,
                    task.getId()
            );
            value = st.executeUpdate(query);

            return value;
        } catch (Exception e) {
            e.printStackTrace();
            return value;
        }
    }

    @Override
    public boolean delete(int id) {
        try {
            Statement st = connection.createStatement();
            final String query = String.format(
                    "DELETE FROM %s WHERE %s=%d",
                    nameTable,
                    columnId,
                    id
            );

            int i = st.executeUpdate(query);
            Log.print("borra al id %d", i);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

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

            rs.close();

            return tasks;
        } catch (Exception e) {
            e.printStackTrace();
            return tasks;
        }
    }

    @Override
    public Task get(int id) {
        Task task = null;

        try {
            Statement st = connection.createStatement();

            String query = String.format(
                    "SELECT * FROM %s WHERE %s=%d ",
                    nameTable,
                    columnId,
                    id
            );
            ResultSet rs = st.executeQuery(query);

            task = new Task(
                    rs.getString(columnTitle),
                    rs.getString(columnDescription),
                    rs.getInt(columnId)
            );
            rs.close();

            return task;
        } catch (Exception e) {
            e.printStackTrace();
            return task;
        }
    }

    @Override
    public void close() {
        try {
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

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
