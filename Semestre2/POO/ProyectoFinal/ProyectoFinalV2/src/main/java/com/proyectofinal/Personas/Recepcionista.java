package com.proyectofinal.Personas;

public class Recepcionista extends Persona {
    private String turno; 
    private int extensionTelefonica;

    // Constructor: Sincronizando con la superclase Persona
    public Recepcionista(String nombre, String id, String telefono, String turno, int extension) {
        super(nombre, id, telefono);
        this.turno = turno;
        this.extensionTelefonica = extension;
    }

    // Getters y Setters
    public String getTurno() { return turno; }
    public void setTurno(String turno) { this.turno = turno; }

    // Construcción del perfil para el sistema
    @Override
    public String toString() {
        String ret = "--- Perfil del Recepcionista ---\n";
        ret += "ID: " + getId() + "\n";
        ret += "Nombre: " + getNombre() + "\n";
        ret += "Turno: " + turno + "\n";
        ret += "Extensión: " + extensionTelefonica;
        return ret;
    }
}
