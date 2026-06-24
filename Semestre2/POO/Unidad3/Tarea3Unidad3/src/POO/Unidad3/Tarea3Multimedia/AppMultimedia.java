/*
Código de multimedias
Autor: José Manuel Monge Delmoral
Numero de control:  


*/

package POO.Unidad3.Tarea3Multimedia;

public class AppMultimedia {

    public static void main(String[] args) {
        ListaMultimedia multimedias = new ListaMultimedia(10);
        Pelicula pelicula1 = new Pelicula("Avatar", "James Cameron", 120, "Sam Worthington", "Zoe Saldaña");
        Pelicula pelicula2 = new Pelicula("El hoyo", "Galder Urrutia", 0, null, "Default");
        Pelicula pelicula3 = new Pelicula("Birdbox", "Michael Keaton", 10, "Default", null);
    
    
    
        multimedias.add(pelicula1);
        multimedias.add(pelicula2);
        multimedias.add(pelicula3);
        
        int presentar = multimedias.indexOf(pelicula1);
        
        System.out.print(multimedias.get(presentar).toString() +"\nPosición: "+presentar);
        
    }

}
