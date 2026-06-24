package POO.Tarea2;

public class metodoDePago {

    //Atributos y constructor
    private String numeroTarjeta;
    private String medio;
    private String nombrePasajero;

    public metodoDePago(String medio,String numeroTarjeta, String nombrePasajero) {
        this.medio = medio;
        this.numeroTarjeta = numeroTarjeta;
        this.nombrePasajero = nombrePasajero;
    }

    // Métodos getters, setters y toString
    public String getMedio() {
        return medio;
    }
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }
    public String getNombrePasajero() {
        return nombrePasajero;
    }
    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
    public void setNombrePasajero(String nombrePasajero) {
        this.nombrePasajero = nombrePasajero;
    }
    public void setMedio(String medio) {
        this.medio = medio;
    }
    @Override
    public String toString() {
        return "metodoDePago [medio=" + medio + ", numeroTarjeta=" + numeroTarjeta + ", nombrePasajero="
                + nombrePasajero + "]";
    }
}
