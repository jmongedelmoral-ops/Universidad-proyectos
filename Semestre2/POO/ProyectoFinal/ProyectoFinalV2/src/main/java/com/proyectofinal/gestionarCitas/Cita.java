package com.proyectofinal.gestionarCitas;


import java.time.LocalDate;
import java.time.LocalTime;

import com.proyectofinal.gestionarMasc.Mascota;      // Importamos desde el otro package
import com.proyectofinal.Personas.Veterinario;

public class Cita {

    private int numCita;
    private LocalDate fechaCita;
    private LocalTime horaCita;
    private Mascota mascota;
    private boolean primeraVez;
    private boolean fidelizacion;
    public enum EstadoCita {
    PROGRAMADA, EN_PROCESO, FINALIZADA, CANCELADA;
}
    private EstadoCita estadoCita;


    public enum TipoServicio {
    CONSULTA, VACUNA, CIRUGIA, ESTETICA;

}
    private TipoServicio tipoServicio;
    private Veterinario veterinario;

    public Cita(int numCita, LocalDate fechaCita, LocalTime horaCita, Mascota mascota, 
                boolean primeraVez, EstadoCita estadoCita, boolean fidelizacion, TipoServicio tipoServicio, 
                Veterinario veterinario) {
        this.numCita = numCita;
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
        this.mascota = mascota;
        this.primeraVez = primeraVez;
        this.estadoCita = estadoCita;
        this.fidelizacion = fidelizacion;
        this.tipoServicio = tipoServicio;
        this.veterinario = veterinario;
    }

    
    // Getters y Setters
    public int getNumCita() { return numCita; }
    public void setNumCita(int numCita) { this.numCita = numCita; }
    
    public LocalDate getFechaCita() { return fechaCita; }
    public void setFechaCita(LocalDate fechaCita) { this.fechaCita = fechaCita; }
    
    public LocalTime getHoraCita() { return horaCita; }
    public void setHoraCita(LocalTime horaCita) { this.horaCita = horaCita; }

    public Mascota getMascota() { return mascota; }
    public void setMascota(Mascota mascota) { this.mascota = mascota; }
    
    public boolean isPrimeraVez() { return primeraVez; }
    public void setPrimeraVez(boolean primeraVez) { this.primeraVez = primeraVez; }
    
    public EstadoCita getEstadoCita() { return estadoCita; }
    public void setEstadoCita(EstadoCita estadoCita) { this.estadoCita = estadoCita; }
    
    public TipoServicio getTipoServicio() { return tipoServicio; }
    public void setTipoServicio(TipoServicio tipoServicio) { this.tipoServicio = tipoServicio; }
    
    public Veterinario getVeterinario() { return veterinario; }
    public void setVeterinario(Veterinario veterinario) { this.veterinario = veterinario; }
    
    public boolean isFidelizacion() {     return fidelizacion; }
    public void setFidelizacion(boolean fidelizacion) {this.fidelizacion = fidelizacion; }

@Override
public String toString() {
    return "Cita #" + numCita + " [" + estadoCita + "] - " + fechaCita + " " + horaCita + 
           "\nServicio: " + tipoServicio + " | Mascota: " + mascota.getNombre() + 
           "\nVeterinario: " + (veterinario != null ? veterinario.getNombre() : "No asignado") +
           "\nFidelización (Descuento): " + (fidelizacion ? "SÍ" : "NO");
}
}
