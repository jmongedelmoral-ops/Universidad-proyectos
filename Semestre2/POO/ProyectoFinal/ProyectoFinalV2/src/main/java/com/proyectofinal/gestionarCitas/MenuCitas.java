package com.proyectofinal.gestionarCitas;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;

import com.proyectofinal.gestionarMasc.*;
import com.proyectofinal.gestionarCitas.Cita.EstadoCita;
import com.proyectofinal.gestionarCitas.Cita.TipoServicio;
import com.proyectofinal.Personas.Veterinario;

public class MenuCitas {
    private VCitas gestor;
    private VMascotas almacen;
    private Scanner entrada;

    public MenuCitas(VCitas citas, VMascotas almacen) {
        this.gestor = citas;
        this.almacen = almacen;
        this.entrada = new Scanner(System.in);
    }

    public void menuAdminCitas() {
        int opcion = -1;
        do {
            System.out.println("\n--- Panel de Control de Citas ---");
            System.out.println("1. Registrar nueva Cita");
            System.out.println("2. Mostrar todas las Citas");
            System.out.println("3. Ver Citas por Fecha");
            System.out.println("4. Ver Citas de Primera Vez");
            System.out.println("5. Eliminar Cita");
            System.out.println("6. Modificar Cita");
            System.out.println("7. Modificar Estado de una cita");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            try {
                opcion = entrada.nextInt();
                entrada.nextLine();

                // boolean opcionDisponible (opcion ,rangoInicial, rangoFinal)
                if (opcion >= 2 && opcion <= 7 && gestor.isEmpty()) {
                    System.out.println("Esta opción requiere de que existan citas registradas");
                } else {

                    switch (opcion) {
                        case 1:
                            Cita nueva;
                            if (gestor.isFull()) {
                                System.out.println("Se ha alcanzado el límite de citas, por favor elimine una");
                                break;
                            }
                            try{

                                nueva = leerCita(0);
                            } catch(Exception e){
                                System.out.println("Ha ocurrido un error inesperado. Detalles técnicos: "+ e.getMessage());
                                nueva = null;
                            }
                            if (nueva != null) {
                                gestor.add(nueva);
                                System.out.println("Cita registrada con éxito.");
                            } else
                                System.out.println("No se ha registrado la cita.");
                            break;

                        case 2:
                            System.out.println(gestor.toString());
                            break;
                        case 3:
                            System.out.print("Año: ");
                            int a = entrada.nextInt();
                            System.out.print("Mes: ");
                            int m = entrada.nextInt();
                            System.out.print("Día: ");
                            int d = entrada.nextInt();
                            System.out.println(gestor.presentarCitaFecha(LocalDate.of(a, m, d)));
                            break;
                        case 4:
                            System.out.println(gestor.PresentarPrimeraVez());
                            break;
                        case 5:
                            System.out.print("Número de cita a borrar: ");
                            int num = entrada.nextInt();
                            if (gestor.search(num) != -1) {
                                gestor.delete(num);
                                System.out.println("Se ha eliminado la cita exitosamente");
                            } else {
                                System.out.println("No se ha encontrado la cita en el sistema");
                            }
                            break;
                        case 6:
                            System.out.println(gestor.toString());
                            System.out.println("Inserte el número de cita a modificar");
                            int mod = entrada.nextInt();
                            if (gestor.search(mod) != -1) {
                                Cita citaAct = leerCita(mod);
                                if (citaAct != null) {
                                    gestor.replace(mod - 1, citaAct);
                                    System.out.println("Se ha actualizado correctamente la cita");
                                } else
                                    System.out.println("No se actualizó la cita");
                                break;
                            } else {
                                System.out.println("No se ha encontrado la cita en el sistema");
                                break;
                            }
                        case 7:
                            System.out.println(gestor.toString());
                            System.out.println("Inserte el ID de la cita cuyo estado quiere modificar");
                            int modEst = entrada.nextInt();
                            actualizarEst(gestor.search(modEst), gestor);
                            System.out.println("Se ha actualizado la cita correctamente");
                            break;
                        default:
                            System.out.println("Inserte valores válidos");
                    }
                }
            } catch (InputMismatchException errorDeTipo) {
                System.out.println("Por favor inserte valores válidos!");
                entrada.nextLine();
                opcion = -1;

            }
        } while (opcion != 0);
    }

    public void actualizarEst(int pos, VCitas citas) {
        EstadoCita estCit = EstadoCita.PROGRAMADA;
        System.out.println("Inserte el nuevo estado de la cita");
        int opcion;
        do {
            System.out.println("1. " + EstadoCita.EN_PROCESO);
            System.out.println("2. " + EstadoCita.CANCELADA);
            System.out.println("3. " + EstadoCita.FINALIZADA);
            System.out.println("4. " + EstadoCita.PROGRAMADA);
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    estCit = EstadoCita.EN_PROCESO;
                    break;
                case 2:
                    estCit = EstadoCita.CANCELADA;
                    break;
                case 3:
                    estCit = EstadoCita.FINALIZADA;
                    break;
                case 4:
                    estCit = EstadoCita.PROGRAMADA;
                    break;
                default:
                    System.out.println("Inserte un valor válido");
            }

        } while (opcion < 1 || 4 < opcion);

        citas.getCitas()[pos].setEstadoCita(estCit);
    }

    public Cita leerCita(int id) {
        try {

            System.out.print("Nombre Veterinario: ");
            String nomVet = entrada.nextLine();

            System.out.println("Fecha de la Cita:");
            System.out.print("  Año (AAAA): ");
            int anio = entrada.nextInt();
            System.out.print("  Mes (1-12): ");
            int mes = entrada.nextInt();
            System.out.print("  Día (1-31): ");
            int dia = entrada.nextInt();
            entrada.nextLine();

            LocalDate fecha = LocalDate.of(anio, mes, dia);

            System.out.println("Hora de la cita:");
            System.out.print("  Hora (0-23): ");
            int valorHora = entrada.nextInt();
            System.out.print("  Minuto (0-59): ");
            int minuto = entrada.nextInt();

            LocalTime hora = LocalTime.of(valorHora, minuto);
            entrada.nextLine();

            if (!gestor.estaDisponible(fecha, hora, nomVet)) {
                System.out.println("¡Error! El veterinario ya tiene una cita a esa hora.");
                System.out.println("Sugerencia: Intente 30 minutos después: " + hora.plusMinutes(30));
                return null;
            }

            System.out.print("Nombre de la Mascota: ");
            String nomMascota = entrada.nextLine();

            // Chequeamos si la mascota existe o no existe ya

            Mascota mascotaFinal;
            Boolean esPrimeraVez = true;
            Boolean fidelizacion = false;
            if (almacen.buscarNombre(nomMascota) != null) {
                mascotaFinal = almacen.buscarNombre(nomMascota);
            }
            // En caso de que no exista llamamos a que se introduzcan los datos
            else {
                // True si no hay citas con esa id o
                // si no hay mascotas con esa id
                if (gestor.search(id) == -1 || gestor.getCitas()[gestor.search(id)].getMascota().getIdMascota() == -1) {

                    mascotaFinal = MenuMascotas.leerDatos(nomMascota, 0, 0, almacen);
                    if (mascotaFinal == null) {
                        System.out.println("ID inválido");
                        return null;
                    }
                    almacen.add(mascotaFinal);
                } else {
                    mascotaFinal = MenuMascotas.leerDatos(nomMascota,
                            gestor.getCitas()[gestor.search(id)].getMascota().getIdMascota(), 0, almacen);
                    almacen.add(mascotaFinal);
                }

            }
            if (mascotaFinal.getNumConsulta() != 0) {
                if (mascotaFinal.getNumConsulta() % 10 == 0) {
                    fidelizacion = true;
                }
                esPrimeraVez = false;
            }

            Cita.TipoServicio tipSer = Cita.TipoServicio.CONSULTA;
            System.out.println("Inserte el tipo de servicio que requiere");
            System.out.println("Seleccione el tipo de servicio:");
            int opcion;

            do {
                System.out.println("1. " + TipoServicio.CONSULTA);
                System.out.println("2. " + TipoServicio.VACUNA);
                System.out.println("3. " + TipoServicio.CIRUGIA);
                System.out.println("4. " + TipoServicio.ESTETICA);
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        tipSer = Cita.TipoServicio.CONSULTA;
                        break;
                    case 2:
                        tipSer = Cita.TipoServicio.VACUNA;
                        break;
                    case 3:
                        tipSer = Cita.TipoServicio.CIRUGIA;
                        break;
                    case 4:
                        tipSer = Cita.TipoServicio.ESTETICA;
                        break;
                    default:
                        System.out.println("Inserte un valor válido");
                }

            } while (opcion < 1 || 4 < opcion);

            // Creamos el veterinario
            Veterinario vet = new Veterinario(nomVet, "", "", "", "");

            if (id == 0) {
                do {
                    System.out.print("ID Cita (Solo valores a partir del 1): ");
                    id = entrada.nextInt();

                } while (id <= 0);

                if (gestor.search(id) != -1 || id < 0) {
                    System.out.println("ID inválido");
                    return null;
                }

            }

            return new Cita(id, fecha, hora, mascotaFinal, esPrimeraVez, Cita.EstadoCita.PROGRAMADA, fidelizacion,
                    tipSer,
                    vet);
        } catch (InputMismatchException e) {
            System.out.println("Inserte valores válidos!");
            entrada.nextLine();
            return null;
        }
    }

    // getters y setters
    public VCitas getGestor() {
        return gestor;
    }

    public void setGestor(VCitas gestor) {
        this.gestor = gestor;
    }

    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }
}