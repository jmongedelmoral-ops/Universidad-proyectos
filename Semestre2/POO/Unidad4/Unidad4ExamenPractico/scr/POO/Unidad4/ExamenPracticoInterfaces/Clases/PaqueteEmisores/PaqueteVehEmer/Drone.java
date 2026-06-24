package POO.Unidad4.ExamenPracticoInterfaces.Clases.PaqueteEmisores.PaqueteVehEmer;

import POO.Unidad4.ExamenPracticoInterfaces.Clases.PaqueteEmisores.VehiculosEmergencia;

public class Drone extends VehiculosEmergencia {
    // Atributo específico de la clase Drone
    private double alturaVuelo;

    // Constructor
    public Drone(int id, String codigo, String zona, double alturaVuelo) {
        super(id, codigo, zona); // Llama al constructor de la clase padre
        this.alturaVuelo = alturaVuelo;
    }

    // Método propio de Drone
    public void activar() {
        System.out.println("El drone ha sido activado y está listo para operar.");
    }

    // Método propio de Drone
    public void volar() {
        System.out.println("Iniciando vuelo. Altura actual: " + alturaVuelo + " metros.");
    }

    @Override
    public void EmitirAlerta(String mensaje) {
        System.out.println("El dron emisor de id #" + super.getId() + " y código:" + super.getCodigo() +
                " sobrevuela " + super.getZona()
                + " y su sistema de audio repite: " + mensaje);
    }

    @Override
    public String toString() {
        return "DRONE -> ID: " + super.getId() + " | Altura: " + this.alturaVuelo + "m | Zona: " + super.getZona();
    }
}
