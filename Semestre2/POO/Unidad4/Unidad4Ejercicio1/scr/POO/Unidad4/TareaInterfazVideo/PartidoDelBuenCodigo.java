package POO.Unidad4.TareaInterfazVideo;

public class PartidoDelBuenCodigo {

    private EnviadorDeMensaje[] mensajeros = new EnviadorDeMensaje[10];
    private int contadorMensajeros = 0;

    public void agregarMensajero(EnviadorDeMensaje m) {
        if (contadorMensajeros < mensajeros.length) {
            mensajeros[contadorMensajeros] = m;
            contadorMensajeros++;
        } else {
            System.out.println("Error: Ya no caben más mensajeros en el partido.");
        }
    }

    public void hacerCampania() {
        // Solo recorremos hasta donde hay mensajeros reales
        for (int i = 0; i < contadorMensajeros; i++) {
            mensajeros[i].enviarMensaje("¡Voten por el Buen Código!");
        }
    }
}
