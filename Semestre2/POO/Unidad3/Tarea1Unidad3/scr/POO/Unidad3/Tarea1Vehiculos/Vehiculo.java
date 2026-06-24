package POO.Unidad3.Tarea1Vehiculos;

abstract class Vehiculo {
    

    private enum colorEnum {
         rojo, azul, blanco, negro, amarillo, plata
    }
    private colorEnum color = colorEnum.negro;
    private int numCilindros;
    private double potencia;
    
    
    
    public Vehiculo(int numCilindros,double potencia,String colorStr) {
        this.numCilindros = numCilindros;
        this.potencia = potencia;
        setColor(colorStr);
            

    }
    
    
    
    public int getNumRuedas() {
        return numRuedas;
    }
    
    
    
    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }
    
    
    
    public int getNumCilindros() {
        return numCilindros;
    }
    
    
    
    public void setNumCilindros(int numCilindros) {
        this.numCilindros = numCilindros;
    }
    
    
    
    public double getPotencia() {
        return potencia;
    }
    
    
    
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    @Override
    public String toString() {
        return "Vehiculo [numRuedas=" + numRuedas + ", numCilindros=" + numCilindros + ", potencia=" + potencia + "]";
    }
    
    int numRuedas;



    public colorEnum getColor() {
        return color;
    }



    public void setColor(String color) {
        this.color = colorEnum.valueOf(color.toLowerCase());
    }
}

