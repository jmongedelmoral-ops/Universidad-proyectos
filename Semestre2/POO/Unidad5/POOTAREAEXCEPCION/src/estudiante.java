public class estudiante {
    private String matricula;
    private String nombre;
    private float promedio;

    
    public estudiante(String matricula, String nombre, float promedio) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.promedio = promedio;
    }
    
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public float getPromedio() {
        return promedio;
    }
    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
    @Override
    public String toString() {
        return "estudiante [matricula=" + matricula + ", nombre=" + nombre + ", promedio=" + promedio + "]";
    }
}
