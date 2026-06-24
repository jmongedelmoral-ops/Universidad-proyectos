//Nombre: José Manuel Monge Delmoral

package Tarea6;
import java.util.Scanner;
import java.sql.Date;

public class gymApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese edad: ");
        int edad = scanner.nextInt();
        
        System.out.print("Ingrese sexo: ");
        scanner.nextLine(); 
        char sexo = scanner.nextLine().charAt(0);
        
        System.out.print("Ingrese peso (kg): ");
        double peso = scanner.nextDouble();
        
        System.out.print("Ingrese altura (m): ");
        double altura = scanner.nextDouble();
        
        System.out.print("Ingrese tipo de membresia (BASICA o PREMIUM): ");
        scanner.nextLine(); 
        String tipoMembresia = scanner.nextLine().toUpperCase();
        
        System.out.print("Ingrese duracion (meses): ");
        int duracion = scanner.nextInt();
        
        scanner.close();
        
        // Crear objeto membresía
        Membresia.Tipo tipo = Membresia.Tipo.valueOf(tipoMembresia);
        Membresia membresia = new Membresia(duracion, tipo.getCosto() * duracion, tipo);
        
        // Cliente 1: Con todos sus parámetros
        Date fNacio = new Date(System.currentTimeMillis());
        Cliente cliente1 = new Cliente(nombre, fNacio, edad, sexo, peso, altura, membresia);
        System.out.println("\n===== CLIENTE 1 =====");
        System.out.println(cliente1);
        evaluarCliente(cliente1, membresia);
        
        // Cliente 2: Sin peso ni altura
        Cliente cliente2 = new Cliente(nombre, fNacio, edad, sexo, membresia);
        System.out.println("\n===== CLIENTE 2 =====");
        System.out.println(cliente2);
        evaluarCliente(cliente2, membresia);
        
        // Cliente 3: Usando setters
        Cliente cliente3 = new Cliente();
        cliente3.setEdad(edad);
        cliente3.setSexo(sexo);
        cliente3.setMembr(membresia);
        cliente3.setNombre(nombre);
        cliente3.setfNacio(fNacio);
        cliente3.setPeso(peso);
        cliente3.setAltura(altura);
        System.out.println("\n===== CLIENTE 3 =====");
        System.out.println(cliente3);
        evaluarCliente(cliente3, membresia);
    }
    

    //Métodos

    public static void evaluarCliente(Cliente cliente, Membresia membresia) {
        // Calcular IMC's
        int imcResult = cliente.calcularIMC(cliente.getPeso(), cliente.getAltura());
        String imcStatus = "";
        if (imcResult == -1) {
            imcStatus = "Bajo de peso";
        } else if (imcResult == 0) {
            imcStatus = "Peso normal";
        } else {
            imcStatus = "Sobrepeso";
        }
        System.out.println("Estado IMC: " + imcStatus);
        
        // Checar edad
        Boolean esAdulto = cliente.edadLegal(cliente.getEdad());
        System.out.println("¿Es adulto legal (18+)?: " + (esAdulto ? "Sí" : "No"));
        
        // Calcular costo total
        double costoTotal = membresia.calcularCostoTotal(membresia, membresia.getDuracion());
        System.out.println("Costo total de membresía: $" + costoTotal);
    }
}