package clasesRelacion;

import java.util.Arrays;

public class Horario {
	private Alumno alumno;
	private Grupo grupo[];
	
	public Horario(Alumno alumno, Grupo[] grupo) {
		this.alumno = alumno;
		this.grupo = grupo;
	}
	public Horario() {
		this.alumno = new Alumno();
		this.grupo = new Grupo[7];
	}
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	public Grupo[] getGrupo() {
		return grupo;
	}
	public Grupo PresentaGrupo(int pos) {
		return grupo[pos];
	}
	public void asignaGrupo(Grupo grupo, int pos) {
		this.grupo[pos]= grupo;
	}
	@Override
	public String toString() {
		return "Horario [alumno=" + alumno + ", grupo=" + Arrays.toString(grupo) + "]";
	}
	

}
