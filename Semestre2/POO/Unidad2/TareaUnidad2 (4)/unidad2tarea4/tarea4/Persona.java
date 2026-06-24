package tarea4;
public class Persona {
    private Corazon corazon;


    public Persona(Corazon corazon) {
        this.corazon = corazon;
    }

    public void emocionar(int incremento) {
        corazon.cambiarbpm(incremento);
    }
    public void tranquilizar(int decremento) {
        corazon.cambiarbpm(-decremento);
    }
    public void mostrarEstado() {
        System.out.println("Estado actual de la persona: " + corazon.toString());
    }




}