package Tarea6;

public class Membresia {

    public enum Tipo {
        BASICA(50.0),    
        PREMIUM(150.0);

        private final double costoAsociado;

        Tipo(double costo) {
            this.costoAsociado = costo;
        }

        public double getCosto() {
            return costoAsociado;
        }
    }

    private Tipo tipoMembresia; 
    private int duracion;
    private double costo;

    public Membresia(int duracion, double costo, Tipo tipoEntrada) {
        this.duracion = duracion;
        this.costo = costo;
        this.tipoMembresia = tipoEntrada; 
    }

    public double calcularCostoTotal(Membresia membr, int duracion) {
        return membr.getTipo().getCosto() * duracion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Tipo getTipo() {
        return this.tipoMembresia;
    }

    public void setTipo(Tipo tipo) {
        this.tipoMembresia = tipo;
    }

    public Tipo getTipoMembresia() {
        return tipoMembresia;
    }

    public void setTipoMembresia(Tipo tipoMembresia) {
        this.tipoMembresia = tipoMembresia;
    }

    @Override
    public String toString() {
        return "Membresia [tipo=" + tipoMembresia + ", duracion=" + duracion + ", costo=" + costo + "]";
    }
}