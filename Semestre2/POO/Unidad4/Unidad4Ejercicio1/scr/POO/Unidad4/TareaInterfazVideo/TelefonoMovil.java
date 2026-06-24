package POO.Unidad4.TareaInterfazVideo;

public class TelefonoMovil extends Dispositivo implements EnviadorDeMensaje {
    @Override
    public void encender() {
        System.out.println("Pantalla iluminada. Cargando sistema...");
    }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando WhatsApp/SMS: " + mensaje);
    }
}