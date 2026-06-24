package clasesRelacion;

import java.time.LocalDate;
import java.time.Period;

public class Maestro {
	private String nombre;
	private String dir;
	private LocalDate nacio;
	
	public Maestro(String nombre, String dir, LocalDate nacio) {
		super();
		this.nombre = nombre;
		this.dir = dir;
		this.nacio = nacio;
	}
	public Maestro() {
		this.nombre = null;
		this.dir = null;
		this.nacio = null;
		
	}
	public Maestro(String nombre) {
		this.nombre = nombre;
		this.dir = null;
		this.nacio = null;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDir() {
		return dir;
	}
	public void setDir(String dir) {
		this.dir = dir;
	}
	public LocalDate getNacio() {
		return nacio;
	}
	public void setNacio(LocalDate nacio) {
		this.nacio = nacio;
	}
	public int calcularEdad() {
		int edad =0;
		LocalDate fechaactual = LocalDate.now();
		edad = Period.between(this.nacio, fechaactual).getYears();
		return edad;
	
	}
	@Override
	public String toString() {
		return "Maestro [nombre=" + nombre + ", dir=" + dir + ", nacio=" + nacio + "]";
	}
	
	

}
