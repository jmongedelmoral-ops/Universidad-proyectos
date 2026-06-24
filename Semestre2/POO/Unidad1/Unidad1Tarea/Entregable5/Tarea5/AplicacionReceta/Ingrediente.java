package AplicacionReceta;

public class Ingrediente {
    private String nombre;
    private float cantidad;

    public Ingrediente(String nombre, float cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Ingrediente [nombre=" + nombre + ", cantidad=" + cantidad + "]";
    }

   

}
