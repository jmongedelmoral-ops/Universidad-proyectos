package POO.Unidad3.ExamenPractico;

public class Publicacion {
    private int numeroPaginas;
    private double precio;

    public Publicacion(int numeroPaginas, double precio) {
        this.numeroPaginas = numeroPaginas;
        this.precio = precio;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Publicación con " + numeroPaginas + " páginas y un precio de " + precio;
    }
}