package POO.Unidad3.ExamenPractico;

public class AppPublicacion {
    public static void main(String[] args) {
        // Crear la lista con tamaño máximo de 10
        ListaPublicacion misPublicaciones = new ListaPublicacion(10);

        // Crear tres periódicos y añadirlos a la lista
        Periodico p1 = new Periodico(40, 2.50, "El Mundo", "15/04/2026");
        Periodico p2 = new Periodico(32, 1.80, "La Nación", "14/04/2026");
        Periodico p3 = new Periodico(60, 3.00, "Clarín", "13/04/2026");

        misPublicaciones.add(p1);
        misPublicaciones.add(p2);
        misPublicaciones.add(p3);

        // Mostrar la lista por pantalla
        System.out.println("Contenido de la lista:");
        System.out.println(misPublicaciones.toString());

        // Crear un periódico para buscar (mismo nombre y fecha que p2)
        Periodico busqueda = new Periodico(60, 3.00, "La Nación", "14/04/2026");

        // Buscar la posición de este objeto
        int posicion = misPublicaciones.indexOf(busqueda);

        // Obtener el objeto en esa posición y mostrarlo
        if (posicion != -1) {
            Publicacion encontrado = misPublicaciones.get(posicion);
            System.out.println("Objeto encontrado en la posición: " + posicion);
            System.out.println("Datos: " + encontrado.toString());
        } else {
            System.out.println("El periódico no se encuentra en la lista.");
        }
    }
}
