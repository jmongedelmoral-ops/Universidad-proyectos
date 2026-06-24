package POO.Unidad3.Tarea1Vehiculos;

    public class Motocicleta extends Vehiculo {
    private int numPlazas;

    public Motocicleta(int numPlazas, double potencia, String colorStr, int numCilindros) {
        super(numCilindros, potencia, colorStr);
        if (numPlazas == 0){
            System.err.println("Introduzca un numero de plazas válido");
        
        }
        else{
            this.numPlazas = numPlazas;
        }
        
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    @Override
    public String toString() {
        return "Motocicleta [numRuedas=" + this.getNumRuedas() + ", numCilindros=" + this.getNumCilindros() + ", potencia=" + this.getPotencia() +" numPlazas=" + this.getNumPlazas() + "]";
    }
}
