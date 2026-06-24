package zoo;
import java.util.Comparator;
import empleados.Mantenimiento;
import empleados.Persona;
import empleados.RepresentanteVentas;
import zoo.Animales;
import zoo.Mamiferos;

public class Comparadores {
   
            // ---------------------------------------- --------------------------------  
    public static Comparator<Animales> porEspecie = (a, b) ->
            a.getEspecie().compareToIgnoreCase(b.getEspecie());

   public static Comparator<Animales> porRaza = (a, b) ->
            a.getRaza().compareToIgnoreCase(b.getRaza());

   public static Comparator<Animales> porFechaNacimiento = (a, b) ->
            a.getFechaNacimiento().compareToIgnoreCase(b.getFechaNacimiento());
    
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
