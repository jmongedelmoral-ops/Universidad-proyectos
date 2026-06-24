package POO.Unidad3.Tarea2Coche;
import java.util.Scanner;

public class AppCoche {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        String matricula;
        Coche coche = null; 

        System.out.println("Inserte el número de matrícula");
        matricula = sc.next();
        
        
        do{
            System.out.println("El coche es automático o manual?");
            System.out.println("1. Automático");
            System.out.println("2. Manual");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    coche = new CocheCambioAutomatico(matricula);
                    System.out.println("Ha seleccionado coche automático");
                    break;
                case 2:
                    coche = new CocheCambioManual(matricula);
                    System.out.println("Ha seleccionado coche manual");
                    break;                    
                default:
                    System.out.println("Inserte opción válida");
                    break;
                }
        }while (opcion != 1 && opcion != 2);


        do{
            
            System.out.println("Menú del vehículo");
            System.out.println("1. Mostrar estado");
            System.out.println("2. Acelerar");
            System.out.println("3. Frenar");
            if (coche instanceof CocheCambioManual){
                System.out.println("4. Cambiar marcha");
            }
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            
            switch (opcion){
                case 1:
                System.out.println(coche.toString());
                break;
                case 2:
                coche.acelerar(60);
                break;
                case 3:
                coche.frenar(60);
                break;
                case 4:
                    if(coche instanceof CocheCambioAutomatico){
                        System.out.println("Inserte valores válidos");
                        break;
                    }
                    else{
                        System.out.println("Inserte una marcha del 1 al 6");
                        coche.cambiarMarcha(sc.nextByte());
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Inserte valores válidos");
                    break;
                
            } 
        } while (opcion != 0);

        sc.close();

    }


}
