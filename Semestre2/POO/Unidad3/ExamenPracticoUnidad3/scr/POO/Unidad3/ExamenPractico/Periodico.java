package POO.Unidad3.ExamenPractico;

public class Periodico extends Publicacion {
    private String nombre;
    private String fecha;

    public Periodico(int numeroPaginas, double precio, String nombre, String fecha) {
        super(numeroPaginas, precio);
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }


 public boolean esIgual(Periodico otro) {
    if (otro == null) return false;
    return this.nombre.equals(otro.nombre) && this.fecha.equals(otro.fecha);
}
    
    @Override
    public String toString() {
        return super.toString() + ", Periódico: " + nombre + ", Fecha: " + fecha;
    }
}
