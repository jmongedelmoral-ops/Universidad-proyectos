package POO.Tarea2;

import java.sql.Date;

public class Vuelo {

    //Atributos y constructor
    private String locacionSalida;
    private String locacionLlegada;
    private Date fechaSalida;
    private String horaSalida;
    private String horaLlegada;
    private Byte Escala;
    private int numeroVuelo;
    private int numeroAsientos;

    public Vuelo(String locacionSalida, String locacionLlegada, Date fechaSalida, String horaSalida, String horaLlegada, Byte escala, int numeroVuelo, int numeroAsientos) {
        this.locacionSalida = locacionSalida;
        this.locacionLlegada = locacionLlegada;
        this.fechaSalida = fechaSalida;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.Escala = escala;
        this.numeroVuelo = numeroVuelo;
        this.numeroAsientos = numeroAsientos;
    }

    // Métodos getters, setters y toString
    public String getLocacionSalida() {
        return locacionSalida;
    }

    public String getLocacionLlegada() {
        return locacionLlegada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }
    public String getHoraSalida() {
        return horaSalida;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public Byte getEscala() {
        return Escala;
    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }
    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setLocacionSalida(String locacionSalida) {
        this.locacionSalida = locacionSalida;
    }

    public void setLocacionLlegada(String locacionLlegada) {
        this.locacionLlegada = locacionLlegada;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public void setEscala(Byte escala) {
        Escala = escala;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    @Override
    public String toString() {
        return "Vuelo [locacionSalida=" + locacionSalida + ", locacionLlegada=" + locacionLlegada + ", fechaSalida=" + fechaSalida + ", horaSalida="
                + horaSalida + ", horaLlegada=" + horaLlegada + ", Escala=" + Escala + ", numeroVuelo=" + numeroVuelo
                + ", numeroAsientos=" + numeroAsientos + "]";
    }
    
    

}
