package herenciabebidas;

public abstract class Producto {
    private String identificador;
    private String descripcion;
    private float tamaño;
    enum medida {
        KILOGRAMOS, GRAMOS, LITROS, MILILITROS
    }
    int cantidad;
    double precio;
    String marca;
    
    public Producto(String identificador, String descripcion, float tamaño, int cantidad, double precio, String marca) {
        this.identificador = identificador;
        this.descripcion = descripcion;
        this.tamaño = tamaño;
        this.cantidad = cantidad;
        this.precio = precio;
        this.marca = marca;
    }
    public String getIdentificador() {
        return identificador;
    }
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public float getTamaño() {
        return tamaño;
    }
    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    @Override
    public String toString() {
        return "Producto [identificador=" + identificador + ", descripcion=" + descripcion + ", tamaño=" + tamaño
                + ", cantidad=" + cantidad + ", precio=" + precio + ", marca=" + marca + "]";
    }
}
