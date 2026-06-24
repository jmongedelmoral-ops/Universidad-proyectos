package POO.Unidad4.ExamenPracticoInterfaces.Clases.PaqueteEmisores.PaqueteDispComun;

import POO.Unidad4.ExamenPracticoInterfaces.Clases.PaqueteEmisores.DispositivosComunicacion;

public class RadioEmergencia extends DispositivosComunicacion {

    // Constructor
    public RadioEmergencia(int id, String marca ) {
        super(id, marca);
    }

    // Método propio
    public void encender() {
        System.out.println("El radio emisor marca: "+super.getMarca()+" con id: #"+super.getId()+" se encuentra encendida");
    }

    // Método propio
    public void transmitirFrecuencia() {
        System.out.println("El radio se encuentra sintonizando...");
    }

    @Override
    public void EmitirAlerta(String mensaje) {
        System.out.println("Radio (emisor #"+ super.getId()+") transmitiendo alerta: "+ mensaje);
    }

    @Override
    public String toString() {
        return "RadioEmergencia -> ID: " + super.getId() + " | Marca: " + super.getMarca();}
}