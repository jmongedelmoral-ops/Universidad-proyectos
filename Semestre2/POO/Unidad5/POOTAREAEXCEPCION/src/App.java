/*
Estudiante: José Manuel Monge Delmoral
Nro. Control:  


*/

import excepciones.inscripcionExcepcion.CursoLlenoException;
import excepciones.inscripcionExcepcion.MatriculaInvalidaException;
import excepciones.inscripcionExcepcion.PromedioInsuficienteException;

public class App {
    public static void main(String[] args) {
        // Creamos un curso
        Curso curso1 = new Curso(2, 10, "Matemáticas Discretas");
        Curso curso2 = new Curso(2, 10, "Matemáticas Discretas");
        Curso curso3 = new Curso(2, 10, "Matemáticas Discretas");
        Curso cursoExito = new Curso(2, 10, "Matemáticas Discretas");

        // hacemos las pruebas

        // Prueba de campos vacíos
        try {
            estudiante est1 = new estudiante("", "", 90);
            curso1.add(est1);
        } catch (MatriculaInvalidaException e) {
            System.out.println("Error esperado (Matrícula): " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Se disparó una excepción inesperada: " + e.getClass().getName());
        }

        // Prueba de promedio bajo (suponiendo que el mínimo es 70)
        try {
            estudiante est2 = new estudiante("202401", "Jose Manuel", 65);
            curso2.add(est2);
        } catch (PromedioInsuficienteException e) {
            System.out.println("Error esperado (Promedio): " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Se disparó una excepción inesperada: " + e.getClass().getName());
        }

        // Prueba de llenar vector curso
        // Prueba de saturación (Capacidad)
        try {
            curso3.add(new estudiante("001", "Alumno A", 85));
            curso3.add(new estudiante("002", "Alumno B", 90));

            // Este debería tronar
            curso3.add(new estudiante("003", "Alumno C", 95));
        } catch (CursoLlenoException e) {
            System.out.println("Error esperado (Lleno): " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Se disparó una excepción inesperada: " + e.getClass().getName());
        }

        // Caso sin excepciones

        try {
            estudiante estExito = new estudiante("202442", "Harry Du Bois", 80);
            cursoExito.add(estExito);
            System.out.println("Estudiante inscrito con éxito.");
        } catch (Exception e) {
            System.out.println("No debería haber errores aquí: " + e.getMessage());
        }

    }

}
