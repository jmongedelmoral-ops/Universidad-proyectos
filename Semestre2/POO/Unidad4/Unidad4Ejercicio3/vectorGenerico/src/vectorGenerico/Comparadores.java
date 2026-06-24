package vectorGenerico;
import java.util.Comparator;
import empleados.Mantenimiento;
import empleados.Persona;
import empleados.RepresentanteVentas;
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
    
    public static Comparator<Animales> porEspecie = (a, b) ->
            a.getEspecie().compareToIgnoreCase(b.getEspecie());

   public static Comparator<Animales> porRaza = (a, b) ->
            a.getRaza().compareToIgnoreCase(b.getRaza());
    
 /*   public static Comparator<Mamiferos> porDieta = (a, b) ->
            a.getDieta().compareToIgnoreCase(b.getDieta());*/


   public static Comparator<Animales> porDietaGeneral = (a, b) -> {
        if (a instanceof Mamiferos && b instanceof Mamiferos) {
                    Mamiferos m1 = (Mamiferos) a;
                    Mamiferos m2 = (Mamiferos) b;
                    return m1.getDieta().compareToIgnoreCase(m2.getDieta());
           }
           return 0;
        };       
}
