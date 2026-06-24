package tarea3;

public class AppCoche {
    public static void main(String[] args) {
        Motor motor = new Motor();
        Coche coche = new Coche(motor);
        
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int opcion = 0;

        do {
        System.out.println("Menú de opciones:");
        System.out.println("1. Encender el coche");
        System.out.println("2. Apagar el coche");
        System.out.println("3. Acelerar el coche");
        System.out.println("4. Frenar el coche");
        System.out.println("5. Mostrar estado del coche");
        System.out.println("6. Salir");
        System.out.println("Ingrese una opción:");
        opcion = scanner.nextInt();

        switch(opcion) {
            case 1:
                coche.encenderCoche();
                break;
            case 2:
                coche.apagarCoche();
                break;
            case 3:
                System.out.println("El coche está acelerando...(Aumentando 500 RPM)");
                coche.acelerar(500); 

                break;
            case 4:
                System.out.println("El coche está frenando...(Disminuyendo 500 RPM)");
                coche.frenar(500);
                break;
            case 5:
                coche.mostrarEstado();
                break;
            case 6:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    } while (opcion != 6);
    scanner.close();
}
}
