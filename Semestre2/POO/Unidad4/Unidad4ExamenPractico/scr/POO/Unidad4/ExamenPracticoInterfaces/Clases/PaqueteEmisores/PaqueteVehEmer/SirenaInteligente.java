package POO.Unidad4.ExamenPracticoInterfaces.Clases.PaqueteEmisores.PaqueteVehEmer;

import POO.Unidad4.ExamenPracticoInterfaces.Clases.PaqueteEmisores.VehiculosEmergencia;

public class SirenaInteligente extends VehiculosEmergencia {

    // Atributo específico
    private int volumen;

    // Constructor
    public SirenaInteligente(int id, String codigo, String zona, int volumen) {
        super(id, codigo, zona);
        this.volumen = volumen;
    }

    // Método activar
    public void activar() {
        System.out.println("La alarma ha sido activada en: " + super.getZona());
    }

    // Método propio sonarSirena
    public void sonarSirena() {
        System.out.println("La alarma suena con un volúmen de: " + volumen + " Decibelios");
    }

    // Método emitir alerta
    @Override
    public void EmitirAlerta(String mensaje) {
        System.out.println("La sirena emisora de id #" + super.getId() + "y código: " + super.getCodigo()
                + " se encuentra en " + super.getZona()
                + " y en las calles resuena: '" + mensaje + "'");

    }

    // En la clase SirenaInteligente
    @Override
    public String toString() {
        return "SIRENA -> ID: " + super.getId() + " | Volumen: " + this.volumen + "dB | Zona: " + super.getZona();
    }
}