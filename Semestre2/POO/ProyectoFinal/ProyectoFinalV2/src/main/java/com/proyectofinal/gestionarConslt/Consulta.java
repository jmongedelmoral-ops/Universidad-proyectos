package com.proyectofinal.gestionarConslt;

import com.proyectofinal.Personas.Veterinario;
import com.proyectofinal.gestionarMasc.*;
import java.time.LocalDate;

public class Consulta {
    private int idConsulta;
    private Mascota mascota;
    private float peso;
    private float altura;
    private LocalDate fechaConsulta;
    private String diagnostico;
    private String tratamiento;
    private boolean asistio;
    private Veterinario veterinario;

    public Consulta(int idConsulta, Mascota mascota, float peso, float altura, 
                    LocalDate fechaConsulta, String diagnostico, String tratamiento, 
                    boolean asistio, Veterinario veterinario) {
        this.idConsulta = idConsulta;
        this.mascota = mascota;
        this.peso = peso;
        this.altura = altura;
        this.fechaConsulta = fechaConsulta;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.asistio = asistio;
        this.veterinario = veterinario;
    }

    // Getters y Setters
    public int getIdConsulta() { return idConsulta; }
    public void setIdConsulta(int idConsulta) { this.idConsulta = idConsulta; }

    public Mascota getMascota() { return mascota; }
    public void setMascota(Mascota mascota) { this.mascota = mascota; }

    public float getPeso() { return peso; }
    public void setPeso(float peso) { this.peso = peso; }

    public float getAltura() { return altura; }
    public void setAltura(float altura) { this.altura = altura; }

    public LocalDate getFechaConsulta() { return fechaConsulta; }
    public void setFechaConsulta(LocalDate fechaConsulta) { this.fechaConsulta = fechaConsulta; }

    public String getDiagnostico() { return diagnostico; }
    public void setDiagnostico(String diagnostico) { this.diagnostico = diagnostico; }

    public String getTratamiento() { return tratamiento; }
    public void setTratamiento(String tratamiento) { this.tratamiento = tratamiento; }

    public boolean Asistio() { return asistio; }
    public void setAsistio(boolean asistio) { this.asistio = asistio; }

    public Veterinario getVeterinario() { return veterinario; }
    public void setVeterinario(Veterinario veterinario) { this.veterinario = veterinario; }

    // Métodos específicos del diagrama
    public void contarCita() {
        // Lógica para contabilizar (dependerá de cómo manejes el total)
    }

    public void marcarAsistencia() {
        this.asistio = true;
    }

    public void registrarDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public void registrarTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    @Override
    public String toString() {
        return "Consulta #" + idConsulta + " | Fecha: " + fechaConsulta + 
               " | Mascota: " + mascota.getNombre() + " | Veterinario: " + veterinario.getNombre() +
               " | Diagnóstico: " + diagnostico + " | Tratamiento: " + tratamiento;
    }
}
