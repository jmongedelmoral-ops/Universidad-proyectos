package herenciabebidas;
import java.util.Scanner;

public class AppAlmacen {
    public static void main(String[] args) {
        int opcion;
        Scanner sc = new Scanner(System.in);
        ArregloProducto productos = new ArregloProducto(10);

        do{
            System.out.println("Bienvenido al menú del almacén");
            System.out.println("1. Añadir un producto");
            System.out.println("2. Calcular precios");
            System.out.println("3. Mostrar información");
            System.out.println("4. Eliminar un producto");
            System.out.println("5. Salir");
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                    if (productos.add(prodCreate(sc))){
                        System.out.println("Se ha añadido el producto exitosamente");

                    }
                    else
                        System.out.println("El producto estaba repetido o el almacén lleno");
                    break;
                case 2:
                    menuPrecios(productos, sc);
                    break;
                case 3:
                    productos.mostrarInfor();
                    break;
                case 4:
                    String ID;
                    System.out.println("Inserte el ID del producto a eliminar: ");
                    ID = sc.next();
                    if(productos.delete(ID)){
                        System.out.println("Se ha eliminado el producto exitosamente");
                    }
                    else
                        System.out.println("No se ha encontrado determinado producto");
                    break;
                case 5:
                    System.out.println("Ha seleccionado salir del programa! Nos vemos!");
            }
        }while (opcion != 5);

        sc.close();



    }
    

    public static void menuPrecios(ArregloProducto p, Scanner sc){
        int opcion;

        do{

            System.out.println("Menu de precios");
            System.out.println("1. Obtener valor total en el almacén");
            System.out.println("2. Obtener valor por marca en el almacén");
            opcion = sc.nextInt();
            
            switch (opcion){
                case 1:
                    System.out.println("El dinero acumulado en el almacén asciende hasta: "+ p.calcPrecioTotal() + "$ MXN");
                    break;
                case 2:
                    String marca;
                    System.out.println("Inserte una marca: ");
                    marca = sc.next();
                    System.out.println("El dinero acumulado en el almacén asciende hasta: "+ p.calcPrecioTotalMarca(marca) + "$ MXN");
                    
            }

        }while (opcion != 1 && opcion != 2);


    }

    public static Producto prodCreate(Scanner sc){
                
        System.out.println("Inserte el debido identificador");
        String identificador = sc.next();
        sc.nextLine();
        System.out.println("Inserte la descripción del artículo: ");
        String descripcion = sc.nextLine();
        System.out.println("Inserte el tamaño del producto el Centímetros: ");
        float tamaño = sc.nextFloat();
        System.out.println("Inserte la cantidad del producto: ");
        int cantidad = sc.nextInt();
        System.out.println("Inserte el costo del producto: ");
        double precio = sc.nextDouble();
        System.out.println("Inserte la marca del producto: ");
        String marca = sc.next();

        int opcion = 0;

        do{
            System.out.println("Qué tipo de producto es?");
            System.out.println("1. Agua Mineral");
            System.out.println("2. Gaseosa");
            opcion = sc.nextInt();

            switch(opcion){
                case 1:
                    String origen;
                    System.out.println("Inserte el origen de el agua");
                    origen = sc.next();
                    sc.nextLine();
                    AguaMineral aguaMineral = new AguaMineral(identificador, descripcion, tamaño, cantidad, precio, marca, origen);
                    return aguaMineral;
                case 2:
                    double porcAzucar;
                    boolean promocion;

                    System.out.println("Inserte el porcentaje de azucar");
                    porcAzucar = sc.nextDouble();
                    System.out.println("Está en promoción? (El precio se reducirá en 30%)");
                    System.out.println("1. Sí \n2. No");
                    opcion = sc.nextInt();
                    sc.nextLine();

                    if(opcion == 1){
                        promocion = true;
                        precio *= 0.3;
                    }
                    else{
                        promocion = false;
                        opcion = 2;

                    }


                    Soda soda = new Soda(identificador, descripcion, tamaño, cantidad, precio, marca, porcAzucar, promocion);
                    return soda;
                default:
                    System.out.println("Inserte un número válido");
                    break;
            }

        } while(!(opcion == 1) && !(opcion ==2));
        return null;
            }


}
