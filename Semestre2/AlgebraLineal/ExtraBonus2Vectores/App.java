import java.util.Scanner;

//Código para comprobar si Vectores en R, R^2 y R^3 son base y el ángulo entre ellos.

public class App {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("--- CONFIGURACIÓN DEL ESPACIO ---");
        System.out.print("¿De qué dimensión es el espacio (R^n, elige 1-3)?: ");
        int dim = sc.nextInt();
        int n = dim;

        // Validación de rango para evitar errores en el determinante
        if (dim <1 || dim > 3) {
            System.out.println("Error: Este sistema solo soporta dimensiones de 1 a 3.");
            return;
        }

        double[][] vectores = new double[dim][dim];

        for (int i = 0; i < n; i++) {
            System.out.printf("\nVector %d:\n", i + 1);
            for (int j = 0; j < dim; j++) {
                System.out.printf(" Componente [%d]: ", j);
                vectores[i][j] = sc.nextDouble();
            }
        }

        boolean ejecutando = true;
        while (ejecutando) {
            System.out.println("\n--- MÓDULO DE ANÁLISIS VECTORIAL (Max R^3) ---");
            System.out.println("1. Validar Base y Dimensión");
            System.out.println("2. Calcular Ángulo entre Vectores");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> verificarBase(vectores, n, dim);
                case 2 -> mostrarMenuAngulo(vectores, n);
                case 3 -> {
                    System.out.println("Cerrando sistema...");
                    ejecutando = false;
                }
                default -> System.out.println("Error: Opción no reconocida.");
            }
        }
    }

    private static void verificarBase(double[][] v, int n, int dim) {
        System.out.println("\nEspacio de trabajo: R^" + dim);
        if (n != dim) {
            System.out.printf("Resultado: NO es base (Se requieren exactamente %d vectores para R^%d).\n", dim, dim);
            return;
        }
        double det = calcularDeterminante(v);
        System.out.printf("Determinante: %.4f\n", det);
        System.out.println("Resultado: " + (Math.abs(det) > 1e-9 ? "SÍ es base (LI)" : "NO es base (LD)"));
    }

    private static void mostrarMenuAngulo(double[][] v, int n) {
        System.out.print("Primer vector (1-" + n + "): ");
        int idx1 = sc.nextInt() - 1;
        System.out.print("Segundo vector (1-" + n + "): ");
        int idx2 = sc.nextInt() - 1;

        if (idx1 >= 0 && idx1 < n && idx2 >= 0 && idx2 < n) {
            double angulo = calcularAngulo(v[idx1], v[idx2]);
            System.out.printf("Ángulo: %.2f°\n", angulo);
        } else {
            System.out.println("Error: Índices fuera de rango.");
        }
    }

    public static double calcularDeterminante(double[][] m) {
        int d = m.length; // Aquí d será igual a dim
        if (d == 1) return m[0][0];
        if (d == 2) return m[0][0] * m[1][1] - m[0][1] * m[1][0];
        // Sarrus para 3x3
        return m[0][0]*(m[1][1]*m[2][2] - m[1][2]*m[2][1])
             - m[0][1]*(m[1][0]*m[2][2] - m[1][2]*m[2][0])
             + m[0][2]*(m[1][0]*m[2][1] - m[1][1]*m[2][0]);
    }

    public static double calcularAngulo(double[] u, double[] v) {
        double dot = 0, nU = 0, nV = 0;
        for (int i = 0; i < u.length; i++) {
            //producto punto U . V
            dot += u[i] * v[i];

            //norma de U
            nU += u[i] * u[i];

            //norma de V
            nV += v[i] * v[i];
        }

        //||U|| * ||V||
        double magnitud = Math.sqrt(nU) * Math.sqrt(nV);
        if (magnitud == 0) return 0; // Evitar división por cero

        //Math.toDegrees convierte en grados
            //Math.Acos calcula el arcCoseno
                //Math.max y luego math min para que el redondeo no haga que los valores
                //salgan de entre 1 y -1.
        return Math.toDegrees(Math.acos(Math.max(-1, Math.min(1, dot / magnitud))));
    }
}