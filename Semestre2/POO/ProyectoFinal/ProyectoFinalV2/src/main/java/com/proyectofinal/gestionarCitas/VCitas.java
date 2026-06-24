package com.proyectofinal.gestionarCitas;

import java.time.LocalDate;
import java.time.LocalTime;
import com.proyectofinal.*;

public class VCitas implements Vector<Cita>{
    private Cita[] citas;
    private int ultimo;

    public VCitas(int tamañoMaximo) {
        this.citas = new Cita[tamañoMaximo];
        this.ultimo = 0;
    }

    // Getters y Setters
    public Cita[] getCitas() { return citas; }
    public void setCitas(Cita[] citas) { this.citas = citas; }

    public int getUltimo() { return ultimo; }
    public void setUltimo(int ultimo) { this.ultimo = ultimo; }

    // Métodos de estado
    @Override
    public boolean isEmpty() {
        return ultimo == 0;
    }

    @Override
    public boolean isFull() {
        return ultimo == citas.length;
    }

    @Override
    public void add(Cita c) {
        if (!isFull()) {
            citas[ultimo] = c;
            ultimo++;
        }
    }

    @Override
    public void delete(int numCita) {
        for (int i = 0; i < ultimo; i++) {
            if (citas[i].getNumCita() == numCita) {
                for (int j = i; j < ultimo - 1; j++) {
                    citas[j] = citas[j + 1];
                }
                citas[ultimo - 1] = null;
                ultimo--;
                break;
            }
        }
    }
    
    @Override
    public int search(int id){
        for (int i = 0; i<  ultimo; i++){
            if(citas[i].getNumCita() == id){
                return i;
            }
        }
        return -1;
        
    }

    @Override
    public void replace(int pos, Cita nuevo){
            this.citas[pos] = nuevo;        
    }

    public void ordenar() {
        // Ordenamiento por fecha y hora 
        for (int i = 0; i < ultimo - 1; i++) {
            for (int j = 0; j < ultimo - 1 - i; j++) {
                if (citas[j].getFechaCita().isAfter(citas[j+1].getFechaCita())) {
                    Cita temp = citas[j];
                    citas[j] = citas[j+1];
                    citas[j+1] = temp;
                }
            }
        }
    }

    // Métodos de presentación (Filtros)
    public String presentarUnaCita(int numCita) {
        for (int i = 0; i < ultimo; i++) {
            if (citas[i].getNumCita() == numCita) {
                return citas[i].toString();
            }
        }
        return "Cita no encontrada.";
    }

    public String presentarCitaFecha(LocalDate fecha) {
        String res = "";
        for (int i = 0; i < ultimo; i++) {
            if (citas[i].getFechaCita().equals(fecha)) {
                res += citas[i].toString() + "\n";
            }
        }
        return res.isEmpty() ? "No hay citas en esa fecha." : res;
    }

    public String presentarCitasAtendidas(LocalDate fecha) {
        String res = "";
        for (int i = 0; i < ultimo; i++) {

            if (citas[i].getFechaCita().equals(fecha) && 
                citas[i].getEstadoCita() == Cita.EstadoCita.FINALIZADA) {
                res += citas[i].toString() + "\n";
            }
        }
        return res.isEmpty() ? "No hay citas finalizadas en esa fecha." : res;
    }

    public String PresentarPrimeraVez() {
        String res = "";
        for (int i = 0; i < ultimo; i++) {
            if (citas[i].isPrimeraVez()) {
                res += citas[i].toString() + "\n";
            }
        }
        return res.isEmpty() ? "No hay mascotas de primera vez." : res;
    }

    public String presentarCitasVeterinario(String nombreVet) {
        String res = "";
        for (int i = 0; i < ultimo; i++) {
            if (citas[i].getVeterinario().getNombre().equalsIgnoreCase(nombreVet)) {
                res += citas[i].toString() + "\n";
            }
        }
        return res.isEmpty() ? "No hay citas para ese veterinario." : res;
    }

    public boolean estaDisponible(LocalDate fecha, LocalTime hora, String nombreVet) {
    for (int i = 0; i < ultimo; i++) {
        if (citas[i].getFechaCita().equals(fecha) && 
            citas[i].getHoraCita().equals(hora) && 
            citas[i].getVeterinario().getNombre().equalsIgnoreCase(nombreVet)) {
            return false; // Ya hay alguien a esa hora con ese veterinario
        }
    }
    return true;
}

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < ultimo; i++) {
            res += citas[i].toString() + "\n";
        }
        return res.isEmpty() ? "No hay citas registradas." : res;
    }
}
