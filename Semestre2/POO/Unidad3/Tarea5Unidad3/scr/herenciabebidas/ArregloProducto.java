package herenciabebidas;

public class ArregloProducto {
    private Producto[] productos;
    private int tamaño;
    private int tope = -1;

    public ArregloProducto(int tamaño) {
        this.tamaño = tamaño;
        this.productos = new Producto[tamaño];
    }
    public int getTamaño() {
        return tamaño;
    }

    public double calcPrecioTotal(){
        double precioTotal = 0;

        for(int i = 0; i <= tope; i++){
            precioTotal += (productos[i].getPrecio()*productos[i].getCantidad());
        }

        return precioTotal;
    }

    public double calcPrecioTotalMarca(String marca){
        double precioTotal = 0;

        for(int i = 0; i <= tope; i++){
            if(productos[i].getMarca().equals(marca)){
                precioTotal += (productos[i].getPrecio()*productos[i].getCantidad());

            }
        }

        return precioTotal;
    }

    public void mostrarInfor(){
        for(int i = 0; i <= tope; i++){
            System.out.println(productos[i].toString());
        }
    }

    public boolean add(Producto p){
        if (lleno() || existente(p)){
            return false;
        }
        tope++;
        productos[tope] = p;
        return true;
    }

    public Boolean delete(String ID){

            for(int i = 0; i <=tope; i++){
                if(productos[i].getIdentificador().equals(ID)){
                    productos[i] = productos[tope];
                    tope--;
                    return true;
                }
            }
            return false;
    }

    public boolean lleno(){
        return (tope == (tamaño-1));
    }

    public boolean existente(Producto p){
        for(int i = 0; i <= tope; i++){
            if( productos[i].getIdentificador().equals(p.getIdentificador())){
                return true;
            }
        }
        return false;
    }
}
