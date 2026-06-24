package AplicacionReceta;

public class Paso {
    private int orden;
    private String instruccion;
    private double duracion;
    private double temperatura;

    public Paso(int orden, String instruccion, double duracion, double temperatura) {
        this.orden = orden;
        this.instruccion = instruccion;
        this.duracion = duracion;
        this.temperatura = temperatura;
    }
    // Getters
    public int getOrden() {
        return orden;
    }

    public String getInstruccion() {
        return instruccion;
    }

    public double getDuracion() {
        return duracion;
    }

    public double getTemperatura() {
        return temperatura;
    }

    // Setters
    public void setOrden(int orden) {
        this.orden = orden;
    }

    public void setInstruccion(String instruccion) {
        this.instruccion = instruccion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    // toString
    @Override
    public String toString() {
        return "Paso{" +
                "orden=" + orden +
                ", instruccion='" + instruccion + '\'' +
                ", duracion=" + duracion +
                ", temperatura=" + temperatura +
                '}';
    }
}
