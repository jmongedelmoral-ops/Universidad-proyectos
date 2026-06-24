package POO.Unidad3.Tarea2Coche;

public abstract class Coche {
    protected String matricula;
    protected double velocidad;
    protected byte marcha;

    public  Coche(String matricula){
        this.matricula = matricula;
        this.velocidad = 0;
        this.marcha = 0;
    }

    public void acelerar(double aceleracion){
        System.out.println("Se ha acelerado unos " +aceleracion+" km/h");
        if(aceleracion < 0){
            System.out.println("Valoresnegativos, se descelera.");
            frenar(-aceleracion);
        }
        this.velocidad += aceleracion;
    }

    public void frenar(double desceleracion){
        if(desceleracion < 0){
            System.out.println("Valores negativos al frenar, se acelera");
            acelerar(-desceleracion);
        }
        if((this.velocidad - desceleracion) < 0){
            System.out.println("La aceleración se ha establecido en cero a pesar de ser menor.");
            this.velocidad = 0;
        }
        else
        this.velocidad -= desceleracion;
    }

    protected void cambiarMarcha(byte marcha){
        if (marcha < 0){
            marcha = 0; 
            System.out.println("Se ha actualizado la marcha a 0");
        }
        else{
            this.marcha = marcha; 
            System.out.println("Se ha actualizado la marcha a " + marcha);

        }
    }

    public String getMatricula() {
        return matricula;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public byte getMarcha() {
        return marcha;
    }

    @Override
    public String toString() {
        return "\nCoche [matricula=" + matricula + 
        "\n, velocidad=" + velocidad + 
        "\n, marcha=" + marcha + "]";
    }




    
}
