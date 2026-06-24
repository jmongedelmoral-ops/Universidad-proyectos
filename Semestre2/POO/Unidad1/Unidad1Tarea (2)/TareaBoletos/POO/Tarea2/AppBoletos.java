//Autor: José Manuel Monge Delmoral
//Fecha: 08/02/2026

package POO.Tarea2;

public class AppBoletos {
    
    //Creación de objetos y prueba de métodos
    public AppBoletos() {
        Vuelo vuelo1 = new Vuelo("Ciudad de México", "Nueva York", java.sql.Date.valueOf("2024-07-01"), "08:00", "12:00", (byte) 0, 1234, 150);
        Vuelo vuelo2 = new Vuelo("Nueva York", "Ciudad de México", java.sql.Date.valueOf("2024-07-10"), "14:00", "18:00", (byte) 0, 4321, 150);
        Asiento asiento1 = new Asiento(1, "Economica", true, 500.0f);
        Asiento asiento2 = new Asiento(2, "Economica", true, 500.0f);
        Pasajero pasajero1 = new Pasajero("Juan Perez", "Jperez@outlook.com", java.sql.Date.valueOf("1990-01-01"));
        metodoDePago metodoPago1 = new metodoDePago("Tarjeta de Crédito", "2343-4563-2424-2424", "Juan Perez");
        boletos boleto1 = new boletos("B001", pasajero1, asiento1, asiento2, vuelo1, vuelo2, metodoPago1);
        System.out.println(boleto1.toString());
        System.out.println(boleto1.datosSalida());
        System.out.println(boleto1.datosRetorno());
    }

    // Método main para ejecutar la aplicación,
    // solo se encarga de ejecutar el constructor de la clase AppBoletos.
    // puesto a que no cuenta con variables de instancia, no son necesarios los métodos getters, setters o toString.
    public static void main(String[] args) {
        new AppBoletos();
    }
    
    
    
    
    }
