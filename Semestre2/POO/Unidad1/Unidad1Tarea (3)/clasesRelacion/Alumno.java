package clasesRelacion;

public class Alumno {
	private String control;
	private String nombre;
	private String carrera;
	public Alumno(String control, String nombre, String carrera) {
		super();
		this.control = control;
		this.nombre = nombre;
		this.carrera = carrera;
	}
	
	public Alumno() {
		this.control = null;
		this.nombre = null;
		this.carrera = null;
		
	}
	public Alumno(String control, String nombre) {
		this.control = control;
		this.nombre = nombre;
		this.carrera = null;
	}

	public String getControl() {
		return control;
	}

	public void setControl(String control) {
		this.control = control;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		return "Alumno [control=" + control + ", nombre=" + nombre + ", carrera=" + carrera + "]";
	}
	
	

}
