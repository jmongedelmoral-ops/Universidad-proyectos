/*Algoritmo para el manejo de un vector
 * 
 * Autor:José Manuel Monge Delmoral
 * Fecha: 31/01/2026
 * 
 * Observaciones: El programa no maneja optimamente valores negativos ni decimales, solo enteros positivos.
 * 
 */

package POO;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Tarea1 {
    public static Scanner tc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
    ArrayList<Integer> elementos = new ArrayList<>();
    int opcion= 0;

            do {
                System.out.println("=== MENÚ DE OPCIONES ===");
                System.out.println("1.- Agregar");
                System.out.println("2.- Presentar Elementos");
                System.out.println("3.- Buscar un valor dentro del vector");
                System.out.println("4.- Actualizar un elemento");
                System.out.println("5.- Eliminar un valor");
                System.out.println("6.- Ordenar el vector");
                System.out.println("7.- Salir");
                System.out.print("Selecciona una opción (del 1 al 7): ");
			opcion = lectura();
			switch (opcion) {
            case 1: {
            	System.out.println("\n=== AGREGAR ELEMENTO ===");
            	agregarelemento(elementos);
                continuar();
            	break;
                
                }
            case 2: {            	
	            System.out.println("\n=== MOSTRAR VECTOR ===");
	            mostrarElementos(elementos);
                continuar();
	            break;
            }
            case 3: {
                System.out.println("\n=== BUSCAR elemento ===");
                buscarelemento(elementos);
                continuar();
                break;
            }
            case 4: {
                System.out.println("\n=== ACTUALIZAR ELEMENTO ===");
                actualizarVector(elementos);
                continuar();
                break;
                }
            case 5:
                eliminarelemento(elementos);
                continuar();
				break;
            case 6:
                ordenarVector(elementos);
                continuar();
                break;
            case 7:
                System.out.println("Saliendo...");
                break;
			default:
				System.out.println("Opción inválida...");
				break;
			}

            }while(opcion !=7);
		    tc.close();
        }






        //Métodos:

        //lectura de opción
        //Este método es necesario para evitar entrar en un bucle infinito en el menú. 
        public static int lectura() {
            int numero = tc.nextInt();
            return numero;
        };
        
        //Agregar elemento
        public static void agregarelemento(ArrayList<Integer> elementos) {
            System.out.println("Inserta el Valor que deseas agregar:");
            elementos.add(tc.nextInt());
            System.out.println("Se ha agregado el valor exitosamente.");
        }
        
        //Mostrar Vector
		
public static void mostrarElementos(ArrayList<Integer> elementos) {
	if (elementos.size() == 0)
		System.out.println("No hay elementos en el Vector");
    else {
		for (int i = 0; i < elementos.size(); i++) {
            System.out.println("Elemento    "+(i+1)+": "+ elementos.get(i));
		}
	}
}
//Buscar un elemento
        
public static void buscarelemento (ArrayList<Integer> elementos) {
    int cantidadesEncontradas = 0;
            if (elementos.size() == 0) {
                System.out.println("No hay valores que buscar.");
                return;}
                System.out.println("Ingrese el valor que desea buscar: ");
                int search = tc.nextInt();
            for (int i = 0; i < elementos.size(); i++){
                if (elementos.get(i) ==(search)){
                    cantidadesEncontradas++;
                }
            }
            System.out.println("Se ha encontrado el valor: "+search+" Un total de: "+cantidadesEncontradas+" veces.");
            if (cantidadesEncontradas == 0) {
                System.out.println("El valor no existe, intentelo de nuevo.");
            }
        }
		
//Actualizar elementos        
public static void actualizarVector(ArrayList<Integer> elementos){
    if (elementos.size() == 0) {
				System.out.println("No hay elementos que actualizar.");
				return;}
                System.out.println("Qué elemento quieres actualizar?");
                Integer ElemAct = tc.nextInt();
                
                for (int i = 0; i < elementos.size(); i++){
				if (elementos.get(i) == (ElemAct)){
                    System.out.println("Inserte el reemplazo de "+ElemAct+": ");
					int cant = tc.nextInt();
					elementos.set(i, cant);
                    System.out.println("Se ha actualizado exitosamente el elemento!");
					return;
				}
			}
			System.out.println("Ese elemento no existe, intentelo de nuevo.");
			return;
			
			
		}
		
		
//Eliminar elemento
public static void eliminarelemento(ArrayList<Integer> elementos) {
            int cantidadesAEliminar = 0;
            if (elementos.size() == 0) {
                System.out.println("No hay elementos que eliminar.");
                return;
            }
            System.out.println("Inserte el valor que desea eliminar:");
            int eliminar = tc.nextInt();
            if(Collections.frequency(elementos, eliminar) == 0){
                System.out.println("El valor no existe, intentelo de nuevo.");
                return;
            }
            else if(Collections.frequency(elementos, eliminar) > 1){
                System.out.println("Se han encontrado "+Collections.frequency(elementos, eliminar)+" elementos con ese valor. Cuántos desea eliminar?");
                cantidadesAEliminar = tc.nextInt();
                if (cantidadesAEliminar > Collections.frequency(elementos, eliminar)){
                    System.out.println("La cantidad a eliminar es mayor a la cantidad existente, se eliminarán todos los elementos con ese valor.");
                    cantidadesAEliminar = Collections.frequency(elementos, eliminar);
                }
                else
                    System.out.println("Se eliminarán "+cantidadesAEliminar+" elementos con el valor de: "+eliminar);    
                
                for (int i = 0; i < elementos.size(); i++){
                    if (elementos.get(i) ==(eliminar)){
                    elementos.remove(i);
                    cantidadesAEliminar--;
                    if (cantidadesAEliminar == 0) {
                        break;
                    }
                }
            }
            System.out.println("Se han eliminado los valores exitosamente.");
        }
    }
//Ordenar el vector
 public static void ordenarVector(ArrayList<Integer> elementos) {
            if (elementos.size() == 0) {
                System.out.println("No hay elementos que ordenar.");
                return;
            }
            System.out.println("Cómo desea ordenar el vector?");
            System.out.println("1.- Ascendentemente");
            System.out.println("2.- Descendentemente");
            int orden = tc.nextInt();
            switch (orden) {
                case 1:
                    Collections.sort(elementos);
                    break;
                    case 2:
                        Collections.sort(elementos, Collections.reverseOrder());
                    break;
                    default:
                        System.out.println("Opción inválida, intentelo de nuevo.");
                        return;
                    }
                    System.out.println("El vector ha sido ordenado exitosamente.");
                }
                
//Continuar
//Método de calidad de vida para el usuario, pensado para que en el terminal sea más cómodo el uso del programa.
public static void continuar() {
                    System.out.println("Pulse cualquier número para continuar... Si desea salir, pulse 2");
            int opcion = tc.nextInt();
            if (opcion == 2) {
                System.out.println("Saliendo del programa.");
                System.exit(0);
            }
            else {
                return;
            }
        }
        

    
    
    
    
    }
