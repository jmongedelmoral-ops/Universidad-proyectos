/* 
Estudiante: José Manuel Monge Delmoral
Número de control:  

Ultima edición: 24/05/2026
Changelog:
Se introducieron excepciones de InputMismatch en todos los menús

== Palabras personales ==
Muchas gracias por sus clases maestra, realmente aprendí mucho sobre
planificar la arquitectura del código antes de empezar a escribirlo.

Me siento orgulloso del código y sin embargo gracias a sus clases
confío a que puedo estructurar uno más optimizado, escalable y
legible en el futuro. Se agradece su aporte en mi carrera
profesional
*/


package com.proyectofinal;

import com.proyectofinal.gestionarMasc.VMascotas;
import com.proyectofinal.gestionarCitas.VCitas;
import com.proyectofinal.gestionarConslt.MenuConsultas;
import com.proyectofinal.gestionarConslt.VConsultas;
import com.proyectofinal.Personas.Administrador;
import com.proyectofinal.Personas.Cliente;
import com.proyectofinal.Personas.Recepcionista;
import com.proyectofinal.Personas.Veterinario;
import com.proyectofinal.gestionarCitas.MenuCitas;
import com.proyectofinal.gestionarMasc.MenuMascotas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Instanciamos unas cuantas personas

        Administrador admin1 = new Administrador("Carlos Ruiz", "ADM-001", "686-123-4567", "Gerente General", 25500.00);
        Administrador admin2 = new Administrador("Ana Martínez", "ADM-002", "686-987-6543", "Supervisora de Turno",
                18200.50);

        Veterinario vet1 = new Veterinario("Dr. Isaac Asimov", "VET-101", "686-555-0011", "Cirugía", "CED-998877");
        Veterinario vet2 = new Veterinario("Dra. Elena Poniatowska", "VET-102", "686-555-0022", "Dermatología",
                "CED-112233");

        Recepcionista recep1 = new Recepcionista("Luis Wong", "REC-201", "686-444-9988", "Matutino", 101);
        Recepcionista recep2 = new Recepcionista("Sofía Castro", "REC-202", "686-444-7766", "Vespertino", 102);

        Cliente cliente1 = new Cliente("Juan Pérez", "CLI-501", "686-111-2233", "Av. Reforma #123");
        Cliente cliente2 = new Cliente("María López", "CLI-502", "686-222-3344", "Calle Novena #456");

        // Instanciamos las listas relevantes
        VCitas listaCitas = new VCitas(100);
        VMascotas listaMascotas = new VMascotas(100); // Tamaño de 100 mascotas placeholder, no se si requiere que sea
                                                      // por input
        VConsultas listaConsultas = new VConsultas(100);

        // Instanciamos los controladores de cada módulo
        MenuMascotas moduloMascotas = new MenuMascotas(listaMascotas, listaConsultas);
        MenuCitas moduloCitas = new MenuCitas(listaCitas, listaMascotas);
        MenuConsultas moduloConsultas = new MenuConsultas(listaConsultas, listaMascotas);

        int opcion;

        do {
            try {

                System.out.println("\n========================================");
                System.out.println("   SISTEMA DE GESTIÓN VETERINARIA");
                System.out.println("========================================");
                System.out.println("1. Módulo de Consultas");
                System.out.println("2. Módulo de Citas");
                System.out.println("3. Módulo de Mascotas");
                System.out.println("0. Salir del Sistema");
                System.out.println("----------------------------------------");
                System.out.print("Seleccione un módulo para trabajar: ");

                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("\nEntrando al Módulo de Consultas...");
                        moduloConsultas.menuAdminConsultas();
                        break;
                    case 2:
                        System.out.println("\nEntrando al Módulo de Citas...");
                        moduloCitas.menuAdminCitas();
                        break;
                    case 3:
                        System.out.println("\nEntrando al Módulo de Mascotas...");
                        moduloMascotas.menuAdminMascota();
                        break;
                    case 0:
                        System.out.println("Cerrando sistema... ¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }

            } catch (InputMismatchException errorDeTipo) {
                System.out.println("Por favor inserte valores válidos!");
                sc.nextLine();
                opcion = -1;

            }
        } while (opcion != 0);

        sc.close();
    }
}
