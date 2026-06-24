package com.proyectofinal.gestionarMasc;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.proyectofinal.gestionarMasc.Mascota.Genero;
import com.proyectofinal.gestionarConslt.VConsultas;

public class MenuMascotas {
    private static Scanner sc = new Scanner(System.in);
    private VMascotas almacen;
    private VConsultas gestorConsultas;

    public MenuMascotas(VMascotas almacen, VConsultas gestorconsultas) {
        this.almacen = almacen;
        this.gestorConsultas = gestorconsultas;
    }

    public void menuAdminMascota() {
        int opcion;
        do {
            try {

                System.out.println("\n========== SISTEMA VETERINARIO ==========");
                System.out.println("1  - Agregar mascota");
                System.out.println("2  - Verificar estado (Lleno/Vacío)");
                System.out.println("3  - Buscar mascota (Submenú)");
                System.out.println("4  - Modificar datos");
                System.out.println("5  - Eliminar mascota (Física)");
                System.out.println("6  - Ordenar por ID (Ascendente)");
                System.out.println("7  - Mostrar todas con Dueño");
                System.out.println("8  - Evaluar número de consultas");
                System.out.println("9  - Evaluar registro de consultas por mascota");
                System.out.println("0      - Salir");
                System.out.print("Seleccione: ");
                opcion = sc.nextInt();
                sc.nextLine();

                if (opcion >= 3 && opcion <= 9 && almacen.isEmpty()) {
                    System.out.println("Esta opción requiere de que existan elementos registrados");
                } else {

                    switch (opcion) {
                        case 1:
                            Mascota añadir;
                            if (almacen.isFull()) {
                                System.out.println(
                                        "Se ha alcanzado la capacidad máxima, elimine una mascota del registro para liberar espacio");
                                break;
                            }
                            try {

                                añadir = leerDatos("", 0, 0, almacen

                                );
                            } catch (Exception e) {
                                System.out.println(
                                        "Ha ocurrido un error inesperado. Detalles técnicos: " + e.getMessage());
                                añadir = null;
                            }
                            if (añadir == null) {
                                System.out.println("No se ha agregado la mascota");

                            } else {
                                almacen.add(añadir);
                                System.out.println("Se ha añadido exitosamente la mascota");

                            }
                            break;
                        case 2:
                            System.out.println("¿Está lleno?: " + (almacen.isFull() ? "SÍ" : "NO"));
                            System.out.println("¿Está vacío?: " + (almacen.isEmpty() ? "SÍ" : "NO"));
                            break;
                        case 3:
                            subMenuBusqueda();
                            break;
                        case 4:
                            System.out.print("Ingrese el ID de la mascota a modificar: ");
                            int idMod = sc.nextInt();
                            sc.nextLine();
                            if (almacen.search(idMod) != -1) {
                                // Buscamos la posición actual para reemplazarla
                                almacen.replace(idMod, leerDatos("", idMod, 0, null));
                                System.out.println("Se ha modificado la mascota");
                            } else
                                System.out.println("No se ha encontrado la mascota");

                            ;
                            break;
                        case 5:
                            System.out.print("ID para eliminación física: ");
                            int idElim = sc.nextInt();
                            almacen.delete(idElim);
                            break;
                        case 6:
                            almacen.ordenar(); // Implementado en MascotasA
                            break;
                        case 7:
                            System.out.println(almacen.toString());
                            break;
                        case 8:
                            System.out.print("ID para ver consultas: ");
                            int idCon = sc.nextInt();
                            if (almacen.search(idCon) != -1) {

                                System.out.println("Consultas acumuladas: "
                                        + almacen.getMascotas()[almacen.search(idCon)].getNumConsulta()); // Preguntar
                                                                                                          // si se
                                // debe presentar
                                // la mascota con
                                // el nro de
                                // consultas
                            } else {
                                System.out.println("La mascota con id: " + idCon + " No se encuentra registrada");
                            }
                            break;
                        case 9:
                            System.out.print("ID para ver historial clínico: ");
                            int idHist = sc.nextInt();
                            if (almacen.search(idHist) != -1) {

                                if (almacen.getMascotas()[almacen.search(idHist)].getNumConsulta() == 0) {
                                    System.out.println("Esta mascotas no tiene consultas registradas");
                                } else {
                                    System.out.println("Mascota encontrada en el sistema, estas son sus consultas:");
                                    System.out.println(gestorConsultas.presentaConsultasMascota(idHist));
                                }

                            } else {

                                System.out.println("Mascota no encontrada.");
                            }
                            break;
                        default:
                            System.out.println("Inserte valores válidos");
                            break;
                    }
                }
            } catch (InputMismatchException errorDeTipo) {
                System.out.println("Por favor inserte valores válidos!");
                sc.nextLine();
                opcion = -1;

            }
        } while (opcion != 0);
    }

    private void subMenuBusqueda() {
        int op;
        do {
            try {

                System.out.println("\n--- BUSCAR POR ---");
                // Separamos ID de Chip (ahora son 6 opciones)
                System.out.println(
                        "1. ID\n2. Nombre\n3. Especie\n4. Número de Chip\n5. Fecha de nacimiento\n6. Nombre del dueño\n0. Salir" );

                op = sc.nextInt();
                sc.nextLine(); // Limpiar el buffer

                switch (op) {
                    case 1:
                        System.out.print("Ingrese ID: ");
                        if (almacen.search(sc.nextInt()) == -1) {
                            System.out.println("No se ha encontrado mascota con dicho id");
                        } else
                            System.out.println(almacen.getMascotas()[almacen.search(sc.nextInt())].toString());
                        break;
                    case 2:
                        System.out.print("Ingrese Nombre: ");
                        // Usamos nextLine() para nombres compuestos y quitamos el sc.next() sobrante
                        if (almacen.buscarNombre(sc.nextLine()) == null) {
                            System.out.println("No se ha encontrado la mascota con dicho nombre");
                        } else
                            System.out.println(almacen.buscarNombre(sc.nextLine()));
                        break;
                    case 3:
                        System.out.print("Ingrese Especie: ");
                        System.out.println(almacen.buscarEspecie(sc.nextLine()));
                        break;
                    case 4: // Nueva opción para el Chip
                        System.out.print("Ingrese Número de Chip: ");
                        System.out.println(almacen.getMascotas()[almacen.buscarChip(sc.nextInt())].toString());
                        break;
                    case 5:
                        System.out.println("Ingrese Fecha de nacimiento:");
                        System.out.println(almacen.buscarFechaNac(leerFecha()));
                        break;
                    case 6:
                        System.out.print("Ingrese ID del Dueño: ");
                        System.out.println(almacen.buscarOwner(sc.nextInt()));
                        break;
                    case 0:
                        System.out.println("Saliendo del submenú...");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
            } catch (InputMismatchException | IndexOutOfBoundsException e) {
                System.out.println("Inserte valores válidos!");
                op = -1;
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error desconocido. Detalles técnicos: " + e.getMessage());
                op = -1;
            }
        } while (op != 0);
    }

    public static Mascota leerDatos(String nombre, int id, int cons, VMascotas vectorMasc) {
        try {

            if (id == 0) {
                System.out.print("ID Mascota: ");
                id = sc.nextInt();
                if (vectorMasc.search(id) != -1 || id < 0) {
                    return null;
                }

            }
            System.out.print("Número de chip: ");
            int numChip = sc.nextInt();
            sc.nextLine();
            String nom;
            if (nombre.equals("")) {
                System.out.print("Nombre: ");
                nom = sc.nextLine();

            } else {
                nom = nombre;
            }
            System.out.print("Raza: ");
            String raz = sc.nextLine();
            System.out.print("Especie: ");
            String esp = sc.nextLine();
            System.out.print("Color: ");
            String col = sc.nextLine();
            System.out.println("Seleccione género: ");
            System.out.println("1. Macho ");
            System.out.println("2. Hembra ");

            Genero gen = Genero.MACHO;
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    gen = Genero.MACHO;
                    break;
                case 2:
                    gen = Genero.HEMBRA;
                    break;
                default:
                    System.out.println("Inserte valores válidos");
            }
            System.out.println("Fecha de nacimiento: ");
            LocalDate nac = leerFecha();
            sc.nextLine();

            // Datos del Dueño para cumplir RF1.7
            System.out.println("-- Datos del Dueño --");
            System.out.print("Nombre Dueño: ");
            String nOwner = sc.nextLine();
            System.out.print("ID Membresía: ");
            int idMem = sc.nextInt();
            sc.nextLine();
            Owner ow = new Owner();
            ow.setNombre(nOwner);
            ow.setMembresia(idMem);

            return new Mascota(id, numChip, nom, raz, esp, col, gen, nac, cons, ow);
        } catch (InputMismatchException e) {
            System.out.println("Inserte valores válidos!");
            sc.nextLine();
            return null;
        }
    }

    public static LocalDate leerFecha() {
        System.out.print("Año (YYYY): ");
        int a = sc.nextInt();
        System.out.print("Mes (1-12): ");
        int m = sc.nextInt();
        System.out.print("Día (1-31): ");
        int d = sc.nextInt();
        return LocalDate.of(a, m, d);
    }

    public static Scanner getSc() {
        return sc;
    }

    public static void setSc(Scanner sc) {
        MenuMascotas.sc = sc;
    }

    public VMascotas getAlmacen() {
        return almacen;
    }

    public void setAlmacen(VMascotas almacen) {
        this.almacen = almacen;
    }

    public VConsultas getGestorConsultas() {
        return gestorConsultas;
    }

    public void setGestorConsultas(VConsultas gestorConsultas) {
        this.gestorConsultas = gestorConsultas;
    }
}