package POO.Tarea2;

public class Asiento {
    //Atributos y constructor
    private int posicion;
    private String clase;
    private boolean disponibilidad;
    private float costo;

    public Asiento(int posicion, String clase, boolean disponibilidad, float costo) {
        this.posicion = posicion;
        this.clase = clase;
        this.disponibilidad = disponibilidad;
        this.costo = costo;
    }
    
    // Métodos getters, setters y toString
    public int getPosicion() {
        return posicion;
    }

    public String getClase() {
        return clase;
    }

    public boolean isDisponible() {
        return disponibilidad;
    }

    public float getCosto() {
        return costo;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    public void setClase(String clase) {
        this.clase = clase;
    }
    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    public void setCosto(float costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Asiento [posicion=" + posicion + ", clase=" + clase + ", disponibilidad=" + disponibilidad + ", costo="
                + costo + "]";
    }
}