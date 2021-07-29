package com.alejandro.db;

import com.alejandro.todo.Task;
import java.util.ArrayList;

public interface DatabaseHelper {
    
    boolean insert(Task task);
    
    int update(Task task);
    
    boolean delete(int id);
    
    ArrayList<Task> getAll();
    
    Task get(int id);
    
    void close();
}
