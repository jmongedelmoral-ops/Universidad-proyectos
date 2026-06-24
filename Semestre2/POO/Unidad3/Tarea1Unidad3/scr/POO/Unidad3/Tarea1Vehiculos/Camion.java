package POO.Unidad3.Tarea1Vehiculos;

public class Camion extends Vehiculo {
    private int numEjes;

    public Camion(int numEjes, double potencia, String colorStr, int numCilindros) {
        super(numCilindros, potencia, colorStr);
        if (numEjes == 0){
            System.err.println("Introduzca un numero de ejes válido");
        
        }
        else{
            this.numEjes = numEjes;
        }
        
    }

    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    @Override
    public String toString() {
        return "Camión [numRuedas=" + this.getNumRuedas() + ", numCilindros=" + this.getNumCilindros() + ", potencia=" + this.getPotencia() +" numEjes=" + this.getNumEjes() + "]";
    }

}
