package POO.Unidad4.TareaInterfazVideo;

public class Persona implements EnviadorDeMensaje {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void enviarMensaje(String mensaje) {
        // Una persona envía el mensaje hablando o gritando
        System.out.println(nombre + " está gritando por la calle: " + mensaje);
    }
}
