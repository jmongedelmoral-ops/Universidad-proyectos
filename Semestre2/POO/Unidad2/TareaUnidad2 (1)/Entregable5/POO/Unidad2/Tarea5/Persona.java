package POO.Unidad2.Tarea5;

public class Persona {
    private String nombre;
    private int edad;
    private char sexo = 'H';
    private double peso;
    private double altura;

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.sexo = 'H';
        this.peso = 0.0;
        this.altura = 0.0;
    }
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }



    public int calcularIMC() {
        double imc = peso / (altura * altura);
        if (imc < 20) {
            return -1; // Bajo peso
        } else if (imc >= 20 && imc <= 25) {
            return 0; // Peso ideal
        } else {
            return 1; // Sobrepeso
        }
    }
    public Boolean esMayorDeEdad() {
        return edad >= 18;
    }
    public void comprobarSexo() {
        if (sexo != 'H' && sexo != 'M') {
            this.sexo = 'H';
        }
    }
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
    
    public String setNombre(String nombre) {
        this.nombre = nombre;
        return nombre;
    }
    public int setEdad(int edad) {
        this.edad = edad;
        return edad;
    }
    public char setSexo(char sexo) {
        this.sexo = sexo;
        return sexo;
    }
    public double setPeso(double peso) {
        this.peso = peso;
        return peso;
    }
    public double setAltura(double altura) {
        this.altura = altura;
        return altura;
    }


}
