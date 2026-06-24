package com.proyectofinal.gestionarMasc;
import java.time.LocalDate;
import com.proyectofinal.*;

public class VMascotas implements Vector<Mascota> {
    private Mascota[] mascotas; 
    private int tope;           

    public VMascotas(int tamañoMaximo) {
        this.mascotas = new Mascota[tamañoMaximo];
        this.tope = 0;
    }

    public Mascota[] getMascotas() { return mascotas; }
    public void setMascotas(Mascota[] mascotas) { this.mascotas = mascotas; }

    public int getTope() { return tope; }
    public int getCapacidadMaxima() { return mascotas.length; }

    @Override
    public String toString(){
        if (isEmpty()) {
            return "El almacén está vacío.";
        }
        String todos = "--- LISTADO DE MASCOTAS ---\n";
        for (int i = 0; i < tope; i++) {
            todos += mascotas[i].toString() + "\n---------------------\n";
        }
        return todos;
    }

    @Override
    public void add(Mascota mascota) {
        if (!isFull()) {
            mascotas[tope] = mascota; 
            tope++; 
            System.out.println("Mascota agregada correctamente.");
        } else {
            System.out.println("Error: El almacén de mascotas está lleno.");
        }
    }

    @Override
    public int search(int idMascota) {
        for (int i = 0; i < tope; i++) {
            if (mascotas[i].getIdMascota() == idMascota) {
                return i;
            }
        }
        return -1;
    }

    public Mascota buscarNombre(String nombreMascota) {
        for (int i = 0; i < tope; i++) {
            if (mascotas[i].getNombre().equalsIgnoreCase(nombreMascota)) {
                return mascotas[i];
            }
        }
        return null;
    }

    public String buscarEspecie(String especie) {
        String resultado = "Mascotas de especie '" + especie + "':\n";
        boolean encontro = false;
        for (int i = 0; i < tope; i++) {
            if (mascotas[i].getEspecie().equalsIgnoreCase(especie)) {
                resultado += " - " + mascotas[i].getNombre() + "\n";
                encontro = true;
            }
        }
        return encontro ? resultado : "No se encontraron mascotas de la especie: " + especie;
    }

    public int buscarChip(int numChip) {

        for (int i = 0; i < tope; i++) {
            if (mascotas[i].getNumChip() == numChip) {
                return  i;
            }
        }
        return -1;
    }

    // Buscar por fecha de nacimiento exacta
    public String buscarFechaNac(LocalDate fecha) { 
        String resultado = "Mascotas nacidas el " + fecha + ":\n";
        boolean encontro = false;
        for (int i = 0; i < tope; i++) {
            if (mascotas[i].getNacio().equals(fecha)) {
                resultado += " - " + mascotas[i].getNombre() + "\n";
                encontro = true;
            }
        }
        return encontro ? resultado : "No hay mascotas nacidas en esa fecha.";
    }

    // Buscar mascotas por el ID del dueño 
    public String buscarOwner(int idOwner) {
        String resultado = "Mascotas del dueño ID " + idOwner + ":\n";
        boolean encontro = false;
        for (int i = 0; i < tope; i++) {

            if (mascotas[i].getOwner() != null && mascotas[i].getOwner().getMembresia() == idOwner) {
                resultado += " - " + mascotas[i].getNombre() + " (" + mascotas[i].getEspecie() + ")\n";
                encontro = true;
            }
        }
        return encontro ? resultado : "El dueño no tiene mascotas registradas.";
    }


    // Eliminar una mascota por ID
    @Override
    public void delete(int idMascota) {
        for (int i = 0; i < tope; i++) {
            if (mascotas[i].getIdMascota() == idMascota) {
                // Desplazar las mascotas siguientes hacia la izquierda
                for (int j = i; j < tope - 1; j++) {
                    mascotas[j] = mascotas[j + 1];
                }
                mascotas[tope - 1] = null; // Limpiamos la última posición
                tope--; // Reducimos el tope
                System.out.println("Mascota ID " + idMascota + " eliminada.");
                return;
            }
        }
        System.out.println("No se encontró la mascota para eliminar.");
    }

    // Modificar una mascota existente en una posición específica del tope
    @Override
    public void replace(int posicionTope, Mascota nuevaMascota) {
            mascotas[posicionTope] = nuevaMascota;
    }

    // Ordenar las mascotas 
   public void ordenar() {
    for (int i = 0; i < tope - 1; i++) {
        for (int j = 0; j < tope - i - 1; j++) {
            // Comparamos los IDs de dos mascotas seguidas
            if (mascotas[j].getIdMascota() > mascotas[j + 1].getIdMascota()) {
                
                // INTERCAMBIO
                Mascota temporal = mascotas[j];
                mascotas[j] = mascotas[j + 1];
                mascotas[j + 1] = temporal;
            }
        }
    }
    System.out.println("Mascotas ordenadas por ID (Bubble Sort).");
}

    // Métodos de estado
    @Override
    public boolean isEmpty() {
        return tope == 0;
    }

    @Override
    public boolean isFull() {
        return tope == mascotas.length;
    }
}
