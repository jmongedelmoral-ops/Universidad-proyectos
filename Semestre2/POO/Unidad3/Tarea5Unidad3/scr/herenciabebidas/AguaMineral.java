package herenciabebidas;

public class AguaMineral extends Producto {
    
    private String origen;
    
    public AguaMineral(String identificador, String descripcion, float tamaño, int cantidad, double precio,
        String marca, String origen) {
            super(identificador, descripcion, tamaño, cantidad, precio, marca);
            this.origen = origen;
        }
        public String getOrigen() {
            return origen;
        }
        @Override
        public String toString() {
            return "\nAguaMineral [identificador=" + getIdentificador() + 
            "\n, origen=" + origen
             + "\n, descripcion=" + getDescripcion()
             + "\n, tamaño=" + getTamaño()
             + "\n, cantidad=" + cantidad
             + "\n, precio=" + precio
             + "\n, marca=" + marca + "]";
        }
    
}
