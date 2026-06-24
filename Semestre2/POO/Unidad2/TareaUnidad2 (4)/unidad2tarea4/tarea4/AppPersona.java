package tarea4;

public class AppPersona {
    public static void main(String[] args) {
        Corazon corazon = new Corazon();
        Persona persona = new Persona(corazon);
        
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int opcion = 0;

        do {
        System.out.println("Menú de opciones:");
        System.out.println("1. Emocionar la persona");
        System.out.println("2. Tranquilizar la persona");
        System.out.println("3. Mostrar estado de la persona");
        System.out.println("4. Salir");
        System.out.println("Ingrese una opción:");
        opcion = scanner.nextInt();

        switch(opcion) {
            case 1:
                persona.emocionar(5); 
                System.out.println("La persona está emocionándose...(Aumentando en 5 sus BPM) BPM:"+corazon.toString());

                break;
            case 2:
                persona.tranquilizar(5);
                System.out.println("La persona está tranquilizándose...(Disminuyendo 5 BPM) BPM:"+corazon.toString());
                break;
            case 3:
                persona.mostrarEstado();
                break;
            case 4:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    } while (opcion != 4);
    scanner.close();
}
}
