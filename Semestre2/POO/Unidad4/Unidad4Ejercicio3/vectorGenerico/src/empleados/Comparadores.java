package empleados;
import java.util.Comparator;

import zoo.Animales;
import zoo.Mamiferos;

public class Comparadores {

    public static Comparator<Persona> porNombre = (a, b) ->
            a.getNombre().compareToIgnoreCase(b.getNombre());

    public static Comparator<Persona> porRFC = (a, b) ->
            a.getRFC().compareToIgnoreCase(b.getRFC());

    public static Comparator<RepresentanteVentas> porComision = (a, b) ->
            Integer.compare(a.getComision(), b.getComision());

    public static Comparator<Mantenimiento> porBono = (a, b) ->
            Float.compare(a.getBono(), b.getBono());
    
    public static Comparator<Empleado> porTurno = (a, b) ->
            a.getTurno().compareToIgnoreCase(b.getTurno());
    
    public static Comparator<Empleado> porSueldo = (a, b) ->
            Integer.compare(a.getSueldo(), b.getSueldo());
   
}
