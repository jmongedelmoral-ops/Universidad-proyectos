/*
Estudiante: José Manuel Monge Delmoral
Número de control:  

Observaciones:

1:
Consideré prudente crear una super clase llamada "Emisores"
de forma que solo se requiera un único vector genérico para
guardar clases que heredasen de ella.

2:
A pesar de que la clase VehiculosEmergencia cuenta con un atributo "codigo",
la super clase Emisores cuentan con un atributo de ID para que VEmisores pueda
implementar correctamente el método search() para buscar todos los emisores.
*/

package POO.Unidad4.ExamenPracticoInterfaces;

import POO.Unidad4.ExamenPracticoInterfaces.Clases.PaqueteEmisores.PaqueteDispComun.AplMovil;
import POO.Unidad4.ExamenPracticoInterfaces.Clases.PaqueteEmisores.PaqueteDispComun.RadioEmergencia;

import POO.Unidad4.ExamenPracticoInterfaces.Clases.PaqueteEmisores.PaqueteVehEmer.Drone;
import POO.Unidad4.ExamenPracticoInterfaces.Clases.PaqueteEmisores.PaqueteVehEmer.SirenaInteligente;
import POO.Unidad4.ExamenPracticoInterfaces.Clases.Emisores;
import POO.Unidad4.ExamenPracticoInterfaces.Clases.VEmisores;

public class AppEmisores {
    public static void main(String[] args) {

        // == 2 Objetos por clase ==

        // Drone (id, codigo, zona, alturaVuelo)
        Drone dron1 = new Drone(101, "DRN-NORT-01", "Sector Norte - Bosque", 120.2);
        Drone dron2 = new Drone(102, "DRN-SUR-05", "Sector Sur - Costa", 85.6);

        // SirenaInteligente (id, codigo, zona, volumen)
        SirenaInteligente sirena1 = new SirenaInteligente(201, "SIR-CENT-A", "Plaza Central", 110);
        SirenaInteligente sirena2 = new SirenaInteligente(202, "SIR-IND-B", "Zona Industrial", 125);

        // AplMovil (id, marca) - Hereda de DispositivoComunicacion
        AplMovil app1 = new AplMovil(301, "iOS - v15.4");
        AplMovil app2 = new AplMovil(302, "Android - v12.0");

        // RadioEmergencia (id, marca) - Hereda de DispositivoComunicacion
        RadioEmergencia radio1 = new RadioEmergencia(401, "Motorola PRO-700");
        RadioEmergencia radio2 = new RadioEmergencia(402, "Kenwood TK-Series");

        // == Inicialización del Vector ==

        VEmisores emisores = new VEmisores(10);

        // == Rellenar el vector mediante un arreglo auxiliar y un bucle ==

        // Creamos un arreglo temporal para facilitar el iterado
        Emisores[] elementos = { dron1, dron2, sirena1, sirena2, app1, app2, radio1, radio2 };

        for (int i = 0; i < elementos.length; i++) {
            emisores.add(elementos[i]);
        }

        System.out.println("Carga de dispositivos completada. Total: " + elementos.length);
        System.out.println();

        // ==Recorrerlos y mostrarlos==
        emisores.displayAll();

        System.out.println();
        // Recorremos Emisores
        
        for (int i = 0; i <= emisores.getTope(); i++) {
            // Llamamos a que cada elemento ejecute la alerta
            emisores.getEmisores()[i].EmitirAlerta(
                    "EMERGENCIA DETECTADA: Se requiere atención inmediata en el sector.");
            System.out.println();
        }

        // ==Fin del código==

    }
}
