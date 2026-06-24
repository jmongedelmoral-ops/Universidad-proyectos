package herenciabebidas;

public class Soda extends Producto {
    private double porcAzucar;
    private Boolean promocion;
    public Soda(String identificador, String descripcion, float tamaño, int cantidad, double precio, String marca, double porcAzucar, boolean promocion) {
        super(identificador, descripcion, tamaño, cantidad, precio, marca);
        this.porcAzucar = porcAzucar;
        this.promocion = promocion;
    }
    @Override
    public String toString() {
        return "Soda [identificador=" + getIdentificador()
         + "\n, porcAzucar=" + porcAzucar
         + "\n, descripcion=" + getDescripcion()
         + "\n, promocion=" + promocion
         + "\n, tamaño=" + getTamaño()
         + "\n, cantidad=" + cantidad
         + "\n, precio=" + precio
         + "\n, marca=" + marca + "]";
    }

}
