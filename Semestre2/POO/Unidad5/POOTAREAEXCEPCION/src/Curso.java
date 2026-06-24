import excepciones.inscripcionExcepcion.CursoLlenoException;
import excepciones.inscripcionExcepcion.MatriculaInvalidaException;
import excepciones.inscripcionExcepcion.PromedioInsuficienteException;

public class Curso {
    private int clave;
    private String nombre;
    private estudiante[] curso;
    private int tope = -1;

    public Curso(int tam, int clave, String nombre) {
        this.curso = new estudiante[tam];
        this.clave = clave;
        this.nombre = nombre;
    }

    public void add(estudiante estudiante) throws CursoLlenoException, PromedioInsuficienteException, MatriculaInvalidaException{
        checkFull();
        checkProm(estudiante);
        checkMat(estudiante);

        tope++;
        curso[tope] = estudiante;
    }

    public void checkFull() throws CursoLlenoException {
        if (islleno()) {
            throw new CursoLlenoException("El curso al que intenta acceder está lleno");
        }
    }

    public void checkProm(estudiante estudiante) throws PromedioInsuficienteException {
        if (estudiante.getPromedio() < 70) {
            throw new PromedioInsuficienteException("El promedio del estudiante es insuficiente para incribirlo");
        }
    }

    public void checkMat(estudiante estudiante) throws MatriculaInvalidaException {
        if (estudiante.getMatricula().isBlank() || estudiante.getNombre().isBlank()) {
            throw new MatriculaInvalidaException("La matrícula del estudiante es inválida");
        }
    }

    public boolean islleno() {
        return (this.curso.length == tope + 1);
    }

    public estudiante[] getCursos() {
        return curso;
    }

    public void setCursos(estudiante[] cursos) {
        this.curso = cursos;
    }

    public int getTope() {
        return tope;
    }

    public void setTope(int tope) {
        this.tope = tope;
    }

}
