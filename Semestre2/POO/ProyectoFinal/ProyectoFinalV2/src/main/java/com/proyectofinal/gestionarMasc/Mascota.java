package com.proyectofinal.gestionarMasc;
import java.time.LocalDate;
import java.time.Period;

public class Mascota {

    // Atributos 
    private int idMascota;
    private int numChip;
    private String nombre;
    private String raza;
    private String especie;
    private String color;
    public enum Genero{
        MACHO, HEMBRA;
    }
    private Genero genero;
    private LocalDate nacio;
    private LocalDate murio;
    private int numConsulta;
    private Owner owner; 

    // constructor
    public Mascota() {
    }

    public Mascota(int idMascota, int numChip, String nombre, String raza, String especie, String color, 
                   Genero genero, LocalDate nacio, int numConsulta, Owner owner) {
        this.idMascota = idMascota;
        this.numChip = numChip;
        this.nombre = nombre;
        this.raza = raza;
        this.especie = especie;
        this.color = color;
        this.genero = genero;
        this.nacio = nacio;
        this.murio = null;
        this.numConsulta = numConsulta;
        this.owner = owner;
    }

    // getters y setters
    public int getIdMascota() { return idMascota; }
    public void setIdMascota(int idMascota) { this.idMascota = idMascota; }
    
    public int getNumChip() { return numChip; }
    public void setNumChip(int numChip) { this.numChip = numChip; }
    

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getRaza() { return raza; }
    public void setRaza(String raza) { this.raza = raza; }

    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public Genero getGenero() { return genero; }
    public void setGenero(Genero genero) { this.genero = genero; }

    public LocalDate getNacio() { return nacio; }
    public void setNacio(LocalDate nacio) { this.nacio = nacio; }

    public LocalDate getMurio() { return murio; }
    public void setMurio(LocalDate murio) { this.murio = murio; }

    public int getNumConsulta() { return numConsulta; }
    public void setNumConsulta(int numConsulta) { this.numConsulta = numConsulta; }

    public Owner getOwner() { return owner; }
    public void setOwner(Owner owner) { this.owner = owner; }

    // Métodos
    public int calcularEdad() {
        if (nacio != null) {
            LocalDate fechaFin = (murio != null) ? murio : LocalDate.now();
            return Period.between(nacio, fechaFin).getYears();
        }
        return 0;
    }

    public int contarConsultas() {
        return this.numConsulta;
    }

    public boolean aplicaDescuento() {
        return this.numConsulta > 9;
    }

    public void reiniciarConsultas() {
        this.numConsulta = 0;
    }

    // toString
     @Override
    public String toString() {
        return "Mascota #" + idMascota + " | Chip: " + numChip + 
               " | Nombre: " + nombre + " | Dueño: " + (owner != null ? owner.getNombre() : "Sin dueño") +
               " | Edad: " + calcularEdad() + " años";
    }
}
