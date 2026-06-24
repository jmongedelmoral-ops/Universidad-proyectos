package com.proyectofinal.Personas;

public abstract class Persona {
    // Atributos (Variables de instancia)
    private String nombre;
    private String id;
    private String telefono;
    
    // Constructor
    public Persona(String nombre, String id, String telefono) {
        this.nombre = nombre;
        this.id = id;
        this.telefono = telefono;
    }
    
    // Setters y getters
    public String getNombre() { return nombre; }
    public String getId() { return id; }
    
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", id=" + id + ", telefono=" + telefono + "]";
    }
}
