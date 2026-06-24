package AplicacionReceta;

import java.util.ArrayList;

public class Receta {
    private int id;
    private String nombre;
    private String descripcion;
    private int porciones;
    private ArrayList<Paso> instrucciones;
    private ArrayList<Ingrediente> ingredientes;

    // Constructor
    public Receta(int id, String nombre, String descripcion, int porciones, ArrayList<Paso> instrucciones, ArrayList<Ingrediente> ingredientes) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.porciones = porciones;
        this.instrucciones = instrucciones;
        this.ingredientes = ingredientes;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPorciones() {
        return porciones;
    }

    public ArrayList<Paso> getInstrucciones() {
        return instrucciones;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPorciones(int porciones) {
        this.porciones = porciones;
    }

    public void setInstrucciones(ArrayList<Paso> instrucciones) {
        this.instrucciones = instrucciones;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    // toString
    @Override
    public String toString() {
        return "Receta{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", porciones=" + porciones +
                ", instrucciones=" + instrucciones +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
