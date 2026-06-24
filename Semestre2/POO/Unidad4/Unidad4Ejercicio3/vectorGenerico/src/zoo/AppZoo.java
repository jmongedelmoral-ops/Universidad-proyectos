package zoo;
import vectorGenerico.Vector;
public class AppZoo {
	public static void main(String[] args) {
 // ----------------------- comprobamos con otra clase
      
       Vector<Animales> mascotas = new Vector<>(20);
       
        mascotas.add(new Mamiferos("Canina", "Chihuahua", "2021-01-10", "Croquetas"));
        mascotas.add(new Mamiferos("Aves", "Perico", "2020-07-22", "Alpizte"));
        mascotas.add(new Mamiferos("Canina", "Hasky", "2019-03-11", "Carne"));
        mascotas.add(new Mamiferos("Canino", "Pastor", "2018-09-02", "Carnivoro"));
        mascotas.add(new Mamiferos("Felino", "Gato", "2022-05-30", "Carnivoro"));
        mascotas.add(new Mamiferos("Canino", "Labrador", "2017-12-17", "Omnivoro"));
        
        Mamiferos busqueda = new Mamiferos("Aves", "Guacamaya", "2020-07-22", "Alpizte");
        mascotas.add(busqueda);
        
        System.out.println("=== BUSQUEDA POR Raza ===");
        System.out.println(mascotas.presentar(busqueda, Comparadores.porRaza));

        System.out.println("=== BUSQUEDA POR Especie ===");
        System.out.println(mascotas.presentar(busqueda, Comparadores.porEspecie));
        
        System.out.println("=== BUSQUEDA POR Dieta ===");
        System.out.println(mascotas.presentar(busqueda, Comparadores.porDietaGeneral));
              
            
	}

}
