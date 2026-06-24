package POO.Unidad3.Tarea2Coche;

public class CocheCambioManual extends Coche {

    
    public CocheCambioManual(String Matricula){
        super(Matricula);
    }

    @Override
    public void cambiarMarcha(byte marcha) {
        if (marcha > 6){
            System.out.println("Por favor insertar un valor válido");
            return;
        }
        else
        super.cambiarMarcha(marcha);
    }
}
