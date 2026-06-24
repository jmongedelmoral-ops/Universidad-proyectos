/*
Equipo conformado por:

José Manuel Monge Delmoral
Said Uriel Enríquez Hernández
Gutiérrez Camacho Alan Genaro

*/

package pentagonoVectores;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class App {
    //==============DEFINICIÓN DE VARIABLES============
    public static Scanner sc = new Scanner(System.in);
    public static float r; // r viene de radio
    public static int opcion;
    public static float escX = 1; // esc viene de "escala".
    public static float escY = 1;
    
    
    //MAIN
    public static void main(String[] args) {
        JFrame f = new JFrame(); // Se crea una ventana vacía

        //============OBTENCIÓN DE DATOS=======================
        System.out.println("Inserte el radio del pentagono (en píxeles)");
        r = sc.nextInt();





        //==================CREACIÓN DE LA VENTANA=================

        
        do {
            f.add(new JComponent() { // Se rellena la ventana
                public void paintComponent(Graphics g) { // Esta es la función para calcular el tamaño de los vectores

                    // Esta es una "técnica" de clase anónima, básicamente estoy creando una clase
                    // sin nombre
                    // que hereda de JComponent() donde reescribo su método paintComponent y a su vez
                    // se está instanciando 
                    

                    //=================CÁLCULO DE COORDENADAS DEL POLÍGONO======================
                    
                    // l = lados, cx = centro X, cy = centro Y
                    int l = 5, cx = 150, cy = 150; // DATOS AQUÍ

                    // Para cada vector, habrá una cordenada en X y otra en Y,
                    // la cantidad de coordenadas que se necesitan dependen de cuandos lados tendrá
                    // el polígono, en un pentágono, necesitaremos entonces hacen falta 5
                    // coordenadas (x, y).

                    // Cada coordenada en X y en Y se guardan en arreglos de tamaño l = 5.
                    int[] x = new int[l], y = new int[l];

                    // Ciclo for para rellenar dichos arreglos
                    for (int i = 0; i < l; i++) {

                        double a = 2 * Math.PI * i / l - Math.PI / 2;
                        /*
                         * Explicación de la fórmula:
                         * "a" es el ángulo que forma un radio con el eje X,
                         * 
                         * "2 * Math.PI * i / l":
                         * 2*pi radianes es la vuelta completa al círculo,
                         * dividirlo entre l = 5 rebanará al círculo unitario en 5 partes
                         * 
                         * a la primer coordenada le asignará 0/5 trozo del círculo,
                         * luego a la siguiente 1/5, 2/5...
                         * 
                         * "- Math.PI / 2":
                         * gira el pentágono 90°,
                         * se debe de restar por que en computación el (0,0) se encuentra
                         * arriba a la izquierda, por lo que el ángulo gira en sentido horario.
                         * 
                         * Puedes probar a ver que pasa eliminando parte de la fórmula para un mejor entendimiento de 
                         * por qué están ahí.
                         */

                        // Cada coordenada será igual al centro del pentagono
                        // más el radio multiplicado por el trozo del circulo unitario que le
                        // corresponde y lo escalado que están en ese eje

                        // El coseno representa lo mucho que ha de moverse en X.
                        // El seno representa lo mucho que ha de moverse en Y.
                        x[i] = (int) (cx + r * Math.cos(a) * escX); 
                        y[i] = (int) (cy + r * Math.sin(a) * escY);
                    }

                    // Se dibuja el polígono relleno con los vectores calculados.
                    g.fillPolygon(x, y, l);
                }
            });

            // tamaño de la ventana en píxeles
            f.setSize(300, 300);

            // vuelve a la ventana visible, debe ponerse hasta aquí para que la ventana solo
            // se
            // vea cuando ya esté llena de componentes.
            f.setVisible(true);


            //===================== MENÚ ===================================
            System.out.println("\n--- CONTROL DE PENTÁGONO ---");

            if (escX == escY) {
                System.out.println("El pentagono actual tiene un radio de: " + r * escX + " píxeles");
            } else
                System.out.println("El pentagono es irregular");
            System.out.println("Escala en X: " + escX + " Escala en Y: " + escY);
            System.out.println("1. Escalar pentágono en XY");
            System.out.println("2. Escalar pentágono en X");
            System.out.println("3. Escalar pentágono en Y");
            System.out.println("4. Reestablecer valores por defecto");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(
                            "Inserte el factor por el cual escalar el pentagono (Valores menores a uno lo encogerán): ");
                    float agrandar = sc.nextFloat();
                    System.out.println("se ha agrandado exitosamente el pentágono");
                    escX = agrandar;
                    escY = agrandar;
                    break;

                case 2:
                    System.out.println(
                            "Inserte el factor por el cual escalar en X (Valores menores a " + escX + " lo encogerán)");
                    escX = sc.nextFloat();
                    System.out.println("se ha escalado exitosamente el pentágono en X");

                    break;

                case 3:
                    System.out.println(
                            "Inserte el factor por el cual escalar en Y (Valores menores a " + escY + " lo encogerán)");
                    escY = sc.nextFloat();
                    System.out.println("se ha escalado exitosamente el pentágono en Y");
                    break;

                case 4:
                    escX = 1;
                    escY = 1;
                    System.out.println("Se han reestablecido los valores por defecto");
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    System.exit(0); // Cierra la ventana y el proceso
                    break;

                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
                    break;
            }

        } while (opcion != 0);
    }
}
