package com.proyectofinal.Personas;

public class Cliente extends Persona {
    private String direccion;
    private int cantidadMascotas;

    // Constructor: Pasando la antorcha a la superclase
    public Cliente(String nombre, String id, String telefono, String direccion) {
        super(nombre, id, telefono);
        this.direccion = direccion;
        this.cantidadMascotas = 0; // Iniciamos en cero por defecto
    }

    // Refactorizado para construir el String correctamente
    @Override
    public String toString() {
        String ret = "--- Perfil del Cliente ---\n";
        ret += "ID: " + getId() + "\n";
        ret += "Nombre: " + getNombre() + "\n";
        ret += "Dirección: " + direccion + "\n";
        ret += "Mascotas registradas: " + cantidadMascotas;
        return ret;
    }
}
