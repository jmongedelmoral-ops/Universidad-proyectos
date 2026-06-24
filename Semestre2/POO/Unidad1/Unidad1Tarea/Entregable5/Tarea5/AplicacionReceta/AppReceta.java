package AplicacionReceta;
import java.util.*;

public class AppReceta {
    public static void main(String[] args) {
        // Create Paso array
        ArrayList<Paso> pasos = new ArrayList<>();
        pasos.add(new Paso(1, "Precalentar el horno a 180°C", 10.0, 180.0));
        pasos.add(new Paso(2, "Mezclar harina, azúcar y huevos", 5.0, 25.0));
        pasos.add(new Paso(3, "Hornear por 30 minutos", 30.0, 180.0));

        // Create Ingrediente array
        ArrayList<Ingrediente> ingredientes = new ArrayList<>();
        ingredientes.add(new Ingrediente("Harina", 2.0f));
        ingredientes.add(new Ingrediente("Azúcar", 1.0f));
        ingredientes.add(new Ingrediente("Huevos", 3.0f));

        // Create Receta and add arrays
        Receta receta = new Receta(28, "Pastel Simple", "Un delicioso pastel casero", 8, pasos, ingredientes);

        // Display receta
        System.out.println(receta);
    }
}
