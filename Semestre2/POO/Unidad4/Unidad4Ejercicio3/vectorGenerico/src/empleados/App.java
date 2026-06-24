/*
Autor: José Manuel Monge Delmoral
Nro. Control:  
Fecha: 29/04/2026


*/
package empleados;

import java.util.Scanner;

import vectorGenerico.Vector;
import zoo.Animales;
import zoo.Mamiferos;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Empleado> empleados = new Vector<>(10);
        Vector<Animales> mascotas = new Vector<>(10);
        int opcion;

        do {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1) Crear empleado");
            System.out.println("2) Buscar empleado por sueldo");
            System.out.println("3) Buscar empleado por turno");
            System.out.println("4) Menu mascotas");
            System.out.println("0) Salir");
            opcion = leerEntero(sc, "Elige opcion: ");

            switch (opcion) {
                case 1:
                    crearEmpleado(sc, empleados);
                    break;
                case 2:
                    buscarPorSueldo(sc, empleados);
                    break;
                case 3:
                    buscarPorTurno(sc, empleados);
                    break;
                case 4:
                    menuMascotas(sc, mascotas);
                    break;
                case 0:
                    System.out.println("Fin del programa.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        } while (opcion != 0);

        sc.close();
    }

    private static void crearEmpleado(Scanner sc, Vector<Empleado> empleados) {
        System.out.println("\nTipo de empleado: 1) Representante  2) Mantenimiento");
        int tipo = leerEntero(sc, "Elige tipo: ");

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("RFC: ");
        String rfc = sc.nextLine();
        System.out.print("Turno: ");
        String turno = sc.nextLine();
        int noEmp = leerEntero(sc, "No. empleado: ");
        int sueldo = leerEntero(sc, "Sueldo: ");

        Empleado nuevo;
        if (tipo == 1) {
            int comision = leerEntero(sc, "Comision: ");
            RepresentanteVentas rep = new RepresentanteVentas(nombre, rfc, turno, noEmp, comision);
            rep.setSueldo(sueldo);
            nuevo = rep;
        } else {
            float bono = leerFloat(sc, "Bono: ");
            Mantenimiento man = new Mantenimiento(nombre, rfc, turno, noEmp, bono);
            man.setSueldo(sueldo);
            nuevo = man;
        }

        System.out.println(empleados.add(nuevo));
    }

    private static void buscarPorSueldo(Scanner sc, Vector<Empleado> empleados) {
        int sueldo = leerEntero(sc, "Sueldo a buscar: ");
        RepresentanteVentas filtro = new RepresentanteVentas("", "", "", 0, 0);
        filtro.setSueldo(sueldo);
        System.out.println(empleados.presentar(filtro, Comparadores.porSueldo));
    }

    private static void buscarPorTurno(Scanner sc, Vector<Empleado> empleados) {
        System.out.print("Turno a buscar: ");
        String turno = sc.nextLine();
        RepresentanteVentas filtro = new RepresentanteVentas("", "", turno, 0, 0);
        System.out.println(empleados.presentar(filtro, Comparadores.porTurno));
    }

    private static void menuMascotas(Scanner sc, Vector<Animales> mascotas) {
        int opcion;
        do {
            System.out.println("\n--- MENU MASCOTAS ---");
            System.out.println("1) Crear mascota");
            System.out.println("2) Buscar por fecha de nacimiento");
            System.out.println("0) Volver");
            opcion = leerEntero(sc, "Elige opcion: ");

            switch (opcion) {
                case 1:
                    System.out.print("Especie: ");
                    String especie = sc.nextLine();
                    System.out.print("Raza: ");
                    String raza = sc.nextLine();
                    System.out.print("Fecha nacimiento (YYYY-MM-DD): ");
                    String fecha = sc.nextLine();
                    System.out.print("Dieta: ");
                    String dieta = sc.nextLine();
                    Mamiferos mascota = new Mamiferos(especie, raza, fecha, dieta);
                    System.out.println(mascotas.add(mascota));
                    break;
                case 2:
                    System.out.print("Fecha nacimiento a buscar (YYYY-MM-DD): ");
                    String fechaBuscar = sc.nextLine();
                    Mamiferos filtro = new Mamiferos("", "", fechaBuscar, "");
                    System.out.println(mascotas.presentar(filtro, zoo.Comparadores.porFechaNacimiento));
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        } while (opcion != 0);
    }

    private static int leerEntero(Scanner sc, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String entrada = sc.nextLine();
            try {
                return Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Ingresa un numero valido.");
            }
        }
    }

    private static float leerFloat(Scanner sc, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String entrada = sc.nextLine();
            try {
                return Float.parseFloat(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Ingresa un numero decimal valido.");
            }
        }
    }
}