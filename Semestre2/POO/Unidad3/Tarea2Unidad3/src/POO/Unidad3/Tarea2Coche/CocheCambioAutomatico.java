package POO.Unidad3.Tarea2Coche;

public class CocheCambioAutomatico extends Coche {

    public CocheCambioAutomatico(String matricula) {
        super(matricula);
    
        
    }

    @Override
    public void acelerar(double aceleracion) {
        // TODO Auto-generated method stub
        super.acelerar(aceleracion);
        actualizarMarcha(getVelocidad());
    }

    @Override
    public void frenar(double desceleracion) {
        // TODO Auto-generated method stub
        super.frenar(desceleracion);
        actualizarMarcha(getVelocidad());
    }

    public void actualizarMarcha(double velocidad){
        if (velocidad < 20)
            cambiarMarcha((byte) 1);
        else 
        if (19 < velocidad && velocidad < 40)
            cambiarMarcha((byte) 2);
        else 
        if (39 < velocidad && velocidad < 60)
            cambiarMarcha((byte) 3);
        else 
        if (59 < velocidad && velocidad < 80)
            cambiarMarcha((byte) 4);
        else 
        if (79 < velocidad && velocidad < 100)
            cambiarMarcha((byte) 5);
        else 
        if (100 < velocidad)
            cambiarMarcha((byte) 6);
    }
}
