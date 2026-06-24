package com.proyectofinal.gestionarConslt;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.proyectofinal.gestionarMasc.*;
import com.proyectofinal.Personas.Veterinario;

import java.time.LocalDate;

public class MenuConsultas {
    private VConsultas almacenC;
    private VMascotas gestorMascotas;
    private Scanner entrada;

    public MenuConsultas(VConsultas consultas, VMascotas gestorMascotas) {
        this.gestorMascotas = gestorMascotas;
        this.almacenC = consultas;
        this.entrada = new Scanner(System.in);
    }

    public void menuAdminConsultas() {
        int opcion;

        do {
            try {
                System.out.println("\n--- Menú Administración de Consultas ---");
                System.out.println("1. Agregar Consulta");
                System.out.println("2. Ver Todas las Consultas");
                System.out.println("3. Buscar por ID");
                System.out.println("4. Ordenar Consultas");
                System.out.println("5. Eliminar Consulta");
                System.out.println("0. Salir");
                System.out.print("Seleccione una opción: ");

                opcion = entrada.nextInt();
                entrada.nextLine(); // Limpiar

                if (opcion >= 2 && opcion <= 5 && almacenC.isEmpty()) {
                    System.out.println("Esta opción requiere de que existan elementos registrados");
                } else {

                    switch (opcion) {
                        case 1:
                            Consulta nueva;
                            if (almacenC.isFull()) {
                                System.out.println(
                                        "Se ha alcanzado la capacidad máxima, elimine una consulta del registro para liberar espacio");
                                break;
                            }
                            try {
                                nueva = leerDatos();
                            } catch (Exception e) {
                                System.out.println("Ha ocurrido un error inesperado. Detalles técnicos: "+e.getMessage());
                                nueva = null;
                            }

                            if (nueva == null) {
                                System.out.println("La consulta no se ha agregado");

                            } else {
                                almacenC.add(nueva);
                                System.out.println("Se ha agregado exitosamente la consulta!");

                            }
                            break;
                        case 2:
                            System.out.println(almacenC.presentarTodasConsulta());
                            break;
                        case 3:
                            System.out.print("Ingrese ID a buscar: ");
                            int idBusqueda = entrada.nextInt();
                            System.out.println(almacenC.presentarUnaConsulta(idBusqueda));
                            break;
                        case 4:
                            almacenC.ordenar();
                            System.out.println("Consultas ordenadas por fecha.");
                            break;
                        case 5:
                            System.out.print("Ingrese ID a eliminar: ");
                            int idEliminar = entrada.nextInt();
                            almacenC.delete(idEliminar);
                            break;
                        default:
                            System.out.println("Inserte un valor válido");
                            break;
                    }
                }
            } catch (InputMismatchException errorDeTipo) {
                System.out.println("Por favor inserte valores válidos!");
                entrada.nextLine();
                opcion = -1;

            }
        } while (opcion != 0);
    }

    public Consulta leerDatos() {
        try{

            System.out.print("ID Consulta: ");
            int id = entrada.nextInt();
            entrada.nextLine();
            
            if (almacenC.search(id) != -1 || id < 0) {
                System.out.println("Id inválido");
                return null;
            }
            
        System.out.print("Nombre de la Mascota: ");
        String nomMascota = entrada.nextLine();
        
        // Chequeamos si la mascota existe o no existe ya
        
        Mascota mascota;
        if (gestorMascotas.buscarNombre(nomMascota) != null) {
            mascota = gestorMascotas.buscarNombre(nomMascota);
        }
        // En caso de que no exista llamamos a que se introduzcan los datos
        else {
            mascota = MenuMascotas.leerDatos(nomMascota, 0, 0, gestorMascotas);
            if (mascota == null) {
                System.out.println("La mascota no se ha agregado");
                return null;
            }
            gestorMascotas.add(mascota);
        }
        
        System.out.print("Peso: ");
        float peso = entrada.nextFloat();
        System.out.print("Altura: ");
        float altura = entrada.nextFloat();
        entrada.nextLine();
        
        System.out.println("Fecha de la consulta:");
        System.out.print("  Año (AAAA): ");
        int anio = entrada.nextInt();
        System.out.print("  Mes (1-12): ");
        int mes = entrada.nextInt();
        System.out.print("  Día (1-31): ");
        int dia = entrada.nextInt();
        entrada.nextLine();
        
        LocalDate fecha = LocalDate.of(anio, mes, dia);
        
        System.out.print("Diagnóstico: ");
        String diag = entrada.nextLine();
        System.out.print("Tratamiento: ");
        String trat = entrada.nextLine();
        
        System.out.print("Nombre del Veterinario: ");
        String nomVet = entrada.nextLine();
        Veterinario vet = new Veterinario(nomVet, "", "", "", "");
        mascota.setNumConsulta(mascota.getNumConsulta() + 1);
        return new Consulta(id, mascota, peso, altura, fecha, diag, trat, false, vet);
    } catch(InputMismatchException e){
        System.out.println("Inserte datos válidos!");
        entrada.next();
        return null;
    }
    }
    
    public VConsultas getAlmacenC() {
        return almacenC;
    }
    
    public void setAlmacenC(VConsultas almacenC) {
        this.almacenC = almacenC;
    }
    
    public VMascotas getGestorMascotas() {
        return gestorMascotas;
    }
    
    public void setGestorMascotas(VMascotas gestorMascotas) {
        this.gestorMascotas = gestorMascotas;
    }
    
}
