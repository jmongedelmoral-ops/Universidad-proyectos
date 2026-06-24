package com.proyectofinal.Personas;

public class Administrador extends Persona {
    private String puesto;
    private double salario;

    // Constructor que invoca a la superclase
    public Administrador(String nombre, String id, String telefono, String puesto, double salario) {
        // La "Llave Maestra": Inicializa la base de Persona primero
        super(nombre, id, telefono);
        this.puesto = puesto;
        this.salario = salario;
    }

    // Implementación obligatoria del contrato abstracto
    @Override
    public String toString() {
        String ret = "--- Perfil del Administrador ---\n";
        ret += "ID: " + getId() + "\n"; // Concatenamos usando +=
        ret += "Nombre: " + getNombre() + "\n";
        ret += "Puesto: " + puesto + "\n";
        ret += "Salario: $" + salario; // El último no necesita salto de línea
        return ret;
    }

    public void gestionarNomina() {
        System.out.println("El administrador " + getNombre() + " está procesando pagos...");
    }
}