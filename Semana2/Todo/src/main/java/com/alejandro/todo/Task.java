package com.alejandro.todo;

public class Task {
    
    private String title;
    private String descripcion;
    private int id;

    public Task() {
    }

    public Task(String title, String descripcion) {
        this.title = title;
        this.descripcion = descripcion;
    }

    public Task(String title, String descripcion, int id) {
        this.title = title;
        this.descripcion = descripcion;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public Task setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Task setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public int getId() {
        return id;
    }

    public Task setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "Task{" + "title=" + title + ", descripcion=" + descripcion + ", id=" + id + '}';
    }
}
