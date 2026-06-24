package tarea3;
public class Coche {
    private Motor motor;


    public Coche(Motor motor) {
        this.motor = motor;
    }

    public void encenderCoche() {
        motor.encender();
    }
    public void apagarCoche() {
        motor.apagar();
    }
    public void acelerar(int incremento) {
        motor.cambiarRpm(incremento);
    }
    public void frenar(int decremento) {
        motor.cambiarRpm(-decremento);
    }
    public void mostrarEstado() {
        motor.checarEstado();
    }




}