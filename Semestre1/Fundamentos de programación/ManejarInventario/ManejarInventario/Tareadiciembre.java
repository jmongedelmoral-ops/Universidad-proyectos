/*Algoritmo para manejar el inventario de una tienda.
 * 
 * Autores:
 * José Manuel Monge Delmoral
 * Said Uriel Enriquez Hernández
 * Leonel Enrique Lerma Velázquez
 * André Enrique Peregrino Ramírez
 * 
 * 
 */

package StockManager;
import java.util.Scanner;
import java.util.ArrayList;

public class Tareadiciembre{
	
	
	public static Scanner tc = new Scanner(System.in);
	public static void main(String[] args) {
    ArrayList<String> productos = new ArrayList<>();
    ArrayList<Integer> cantidades = new ArrayList<>();
    int opcion= 0;

            do {
                System.out.println("\n StockManager");
                System.out.println("1.- Agregar un producto");
                System.out.println("2.- Mostrar inventario");
                System.out.println("3.- Actualizar Stock");
                System.out.println("4.- Buscar producto");
                System.out.println("5.- Salir");
                System.out.print("Selecciona una opción (del 1 al 5): ");
			switch (opcion = lectura()) {
            case 1: {
            	System.out.println("\n=== AGREGAR PRODUCTO ===");
            	agregarProducto(productos, cantidades);
            	break;
                
                }
            case 2: {            	
	            System.out.println("\n=== MOSTRAR INVENTARIO ===");
	            mostrarInventario(productos, cantidades);
	            break;
            }
            case 3: {
                System.out.println("\n=== ACTUALIZAR STOCK ===");
                actualizarStock(productos, cantidades);
                break;
                }
            case 4: {
            	System.out.println("\n=== BUSCAR PRODUCTO ===");
            	buscarProducto(productos, cantidades);
            	break;
            }
            case 5:
				System.out.println("Adiós, se terminó el programa...");
				break;
			default:
				System.out.println("Opción inválida...");
				break;
			}

            }while(opcion !=5);
		    tc.close();
        }







//Métodos:

//Agregar producto
public static void agregarProducto(ArrayList<String> productos, ArrayList<Integer> cantidades) {
    System.out.println("Inserta el producto que deseas agregar:");
    productos.add(tc.next());
    System.out.println("Cuanta cantidad de ese producto se encuentra disponible?:");
    int cant = tc.nextInt();
    if(cant < 0) {
    	System.out.println("Inserte valores válidos.");
    	return;
    	}
    cantidades.add(cant);
    System.out.println("Se ha agregado el producto exitosamente.");
	}

	public static int lectura() {
		int numero = tc.nextInt();
		return numero;
		};
		 
//Mostrar inventario
		
public static void mostrarInventario(ArrayList<String> productos, ArrayList<Integer> cantidades) {
	if (productos.size() == 0)
		System.out.println("No hay productos en el inventario");
	else {
		for (int i = 0; i < productos.size(); i++) {
				System.out.println("Producto "+(i+1)+": "+ productos.get(i)+" Cantidad: "+cantidades.get(i));
		}
	}
}
		
		
		
		
//Actualizar stock
		
public static void actualizarStock(ArrayList<String> productos, ArrayList<Integer> cantidades){
	if (productos.size() == 0) {
				System.out.println("No hay productos que actualizar.");
				return;}
			System.out.println("Qué producto quieres actualizar?");
			String catchString = tc.next();
			String prodAct = catchString.toLowerCase();
			
			for (int i = 0; i < productos.size(); i++){
				if (productos.get(i).equalsIgnoreCase(prodAct)){
					System.out.println("Inserta la nueva cantidad de "+prodAct+" (Valores negativos eliminarán el producto del inventario)");
					int cant = tc.nextInt();
					if(cant > 0) {
						cantidades.set(i, cant);
						System.out.println("Se ha actualizado exitosamente el producto!");}
					else {
						cantidades.remove(i);
						productos.remove(i);
						System.out.println("Se ha eliminado exitosamente el producto!");}
					return;
				}
			}
			System.out.println("Ese producto no existe, intentelo de nuevo.");
			return;
			
			
		}
		
		
		
		
//Buscar un producto
		
		public static void buscarProducto (ArrayList<String> productos, ArrayList<Integer> cantidades) {
			if (productos.size() == 0) {
				System.out.println("No hay productos que buscar.");
				return;}
			System.out.println("Ingrese el producto que desea buscar: ");
			String search = tc.next();
			for (int i = 0; i < productos.size(); i++){
				if (productos.get(i).equalsIgnoreCase(search)){
					System.out.println("Se ha encontrado el producto: "+productos.get(i)+" Cantidad: "+ cantidades.get(i));
					return;
				}
			}
			System.out.println("El producto no existe, compruebe su escritura e intentelo de nuevo.");
	}
}

