package POO.Unidad4.ExamenPracticoInterfaces.Clases.PaqueteEmisores.PaqueteDispComun;

import POO.Unidad4.ExamenPracticoInterfaces.Clases.PaqueteEmisores.DispositivosComunicacion;

public class AplMovil extends DispositivosComunicacion {

    // Constructor
    public AplMovil(int id, String marca) {
        super(id, marca);
    }

    // Método propio
    public void encender() {
        System.out.println("Celular (emisor #" + super.getId() + ") encendido");
    }

    // Método propio
    public void notificacionPush() {
        System.out.println("Celular(emisor #" + super.getId() + ") marca: " + super.getMarca() + " ha notificado.");
    }

    @Override
    public void EmitirAlerta(String mensaje) {
        System.out.println(
                "Celular (emisor #" + super.getId() + ") ha activado la alarma, las pantallas muestran: " + mensaje);

    }

    @Override
    public String toString() {
        return "AplicacionMovil -> ID: " + super.getId() + " | Marca: " + super.getMarca();}

}
