//Autor: José Manuel Monge Delmoral
//Número de control:  





package POO.Unidad2.Tarea5;
import java.util.Scanner;


public class AppIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese el sexo (H/M): ");
        char sexo = scanner.next().charAt(0);

        System.out.print("Ingrese el peso en kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese la altura en metros: ");
        double altura = scanner.nextDouble();

        Persona persona = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();


        //Setters para persona3
        persona3.setNombre("Juan");
        persona3.setEdad(25);
        persona3.setSexo('H');
        persona3.setPeso(70);
        persona3.setAltura(1.75);

        // Mostrar resultados para persona
        int[] imcResult = {persona.calcularIMC(), persona2.calcularIMC(), persona3.calcularIMC()};

        for (int i = 0; i < imcResult.length; i++) {
            if (imcResult[i] == -1) {
                System.out.println("Persona " + (i+1) + ": Bajo peso");
            } else if (imcResult[i] == 0) {
                System.out.println("Persona " + (i+1) + ": Peso ideal");
        } else {
            System.out.println("Persona " + (i+1) + ": Sobrepeso");
        }

        if (persona.esMayorDeEdad()) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("No es mayor de edad.");
        }

    }
    persona.comprobarSexo();
    System.out.println(persona);
    persona2.comprobarSexo();
    System.out.println(persona2);
    persona3.comprobarSexo();
    System.out.println(persona3);
    scanner.close();
    
    }
}
