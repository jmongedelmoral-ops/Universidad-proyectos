package POO.Unidad4.TareaInterfazVideo;

public class PalomaMensajera extends Ave implements EnviadorDeMensaje {

    
    public void volarRapido() {
        System.out.println("Volando a máxima velocidad.");
    }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Paloma entregando nota: " + mensaje);
    }
}