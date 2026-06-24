

package POO.Unidad3.T4Multimedia;

public class AppMultimedia {

    public static void main(String[] entradaArgumentos) {
        ListaMultimedia coleccionMultimedia = new ListaMultimedia(10);
        // se prepara una lista de multimedia con ejemplos
        Disco discoNochesVerano = new Disco(Disco.Genero.rock, "Noches de verano", "Los Navegantes", 5);
        Disco discoOscilaciones = new Disco(Disco.Genero.rock, "Oscilaciones", "Cuarteto Atlántico", 4);
        Disco discoBrillosCiudad = new Disco(Disco.Genero.pop, "Brillos en la ciudad", "María Luna", 3);
        Pelicula peliculaMatrixReloaded = new Pelicula("Keanu Reeves", "Carrie-Anne Moss", "Matrix Reloaded", "Wachowski", 120);
        Pelicula peliculaHabitacionSecreta = new Pelicula(null, "Emma Stone", "La habitación secreta", "Sam Mendes", 0);
        Pelicula peliculaAtrapadosHielo = new Pelicula("Oscar Isaac", null, "Atrapados en el hielo", "Denis Villeneuve", 10);
    
    
        // se añaden en el orden que usa la lista para los recorridos
        coleccionMultimedia.agregar(peliculaHabitacionSecreta);
        coleccionMultimedia.agregar(discoNochesVerano);
        coleccionMultimedia.agregar(peliculaMatrixReloaded);
        coleccionMultimedia.agregar(discoOscilaciones);
        coleccionMultimedia.agregar(peliculaAtrapadosHielo);
        coleccionMultimedia.agregar(discoBrillosCiudad);
        

        // consultas finales sobre los elementos cargados
        System.out.println("Selección de discos rock:");
        coleccionMultimedia.mostrarDiscosRock();
        System.out.println("Películas sin actriz principal:");
        coleccionMultimedia.mostrarPeliculasSinActrizPrincipal();

        System.out.println("Tiempo total acumulado en la lista: "+ coleccionMultimedia.calcularDuracionTotal()+" minutos.");

    }

}
