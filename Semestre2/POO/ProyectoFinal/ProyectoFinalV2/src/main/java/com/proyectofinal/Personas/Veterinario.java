package com.proyectofinal.Personas;

public class Veterinario extends Persona {
    private String especialidad;
    private String cedulaProfesional;
    private boolean enCirugia;

    // Constructor: Inicializando la base y los rasgos únicos
    public Veterinario(String nombre, String id, String telefono, String especialidad, String cedula) {
        super(nombre, id, telefono);
        this.especialidad = especialidad;
        this.cedulaProfesional = cedula;
        this.enCirugia = false; 
    }

    // Comportamiento único: Cambiar disponibilidad
    public void setEstadoCirugia(boolean estado) {
        this.enCirugia = estado;
    }

    @Override
    public String toString() {
        String ret = "--- Perfil del Veterinario ---\n";
        ret += "ID: " + getId() + "\n";
        ret += "Nombre: " + getNombre() + "\n";
        ret += "Especialidad: " + especialidad + "\n";
        ret += "Cédula: " + cedulaProfesional + "\n";
        ret += "Estado: " + (enCirugia ? "En cirugía" : "Disponible");
        return ret;
    }
}