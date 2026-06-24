package Tarea6;
import java.sql.Date;
import java.util.Calendar;

public class Cliente {
    private String nombre;
    private Date fNacio;
    private int edad;
    private char sexo = 'H';
    private double peso;
    private double altura;
    private Membresia membr;



    //Métodos

    public int calcularIMC(double peso,double altura){
        
        float IMC = (float)(peso/Math.pow(altura, 2));

        if (IMC < 20)
            return -1;
        else{
            if(IMC > 25){
                return 1;
            }
            else
                return 0;
            }

    }

    public int calcularEdad(Date fNacio) {
    // 1. Crear calendarios para nacimiento y hoy
    Calendar nacimiento = Calendar.getInstance();
    nacimiento.setTime(fNacio);
    
    Calendar hoy = Calendar.getInstance();

    // 2. Resta inicial de años
    int edad = hoy.get(Calendar.YEAR) - nacimiento.get(Calendar.YEAR);

    // 3. Ajuste: ¿Ya pasó su cumpleaños este año?
    // Si el mes actual es menor al de nacimiento, o es el mismo mes pero 
    // el día actual es menor al de nacimiento, aún no cumple años.
    if (hoy.get(Calendar.MONTH) < nacimiento.get(Calendar.MONTH) || 
       (hoy.get(Calendar.MONTH) == nacimiento.get(Calendar.MONTH) && 
        hoy.get(Calendar.DAY_OF_MONTH) < nacimiento.get(Calendar.DAY_OF_MONTH))) {
        edad--;
    }

    return edad;
}

    public Boolean edadLegal (int edad){
        if (edad<18)
            return false;
        else
            return true;
    }

    public Boolean verifGenero(Cliente cliente, char sexo){
        if (cliente.getSexo() == sexo){
            return true;
        }
        else
            return false;
    }










    
    public Cliente(String nombre, Date fNacio, int edad, char sexo, Membresia membr) {
        this.nombre = nombre;
        this.fNacio = fNacio;
        this.edad = edad;
        this.sexo = sexo;
        this.membr = membr;
    }

    public Cliente(String nombre, Date fNacio, int edad, char sexo, double peso, double altura, Membresia membr) {
        this.nombre = nombre;
        this.fNacio = fNacio;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.membr = membr;
    }

    public Cliente(){
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getfNacio() {
        return fNacio;
    }

    public void setfNacio(Date fNacio) {
        this.fNacio = fNacio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Membresia getMembr() {
        return membr;
    }

    public void setMembr(Membresia membr) {
        this.membr = membr;
    }

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", fNacio=" + fNacio + ", edad=" + edad + ", sexo=" + sexo + ", peso="
                + peso + ", altura=" + altura + ", membr=" + membr + "]";
    }

    

    

   
}
