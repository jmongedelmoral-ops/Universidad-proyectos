package POO.Unidad3.Tarea1Vehiculos;

public class AppVehiculos {

    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[5];


        vehiculos[0] = new Camion(6, 532.3, "amarillo", 2);
        vehiculos[1] = new Motocicleta(3, 123.24, "rojo", 3);
        vehiculos[2] = new Motocicleta(2, 234.1, "plata", 4);
        vehiculos[3] = new Motocicleta(5, 100, "blanco", 2);
        vehiculos[4] = new Camion(7, 800, "negro", 6);

        for (Vehiculo a: vehiculos){
            System.out.println(a.toString());
        }
        
    }


}
