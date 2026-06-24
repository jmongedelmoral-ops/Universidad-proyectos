package clasesRelacion;

public class Materia {
	private String clave;
	private String nombreM;
	private byte credito;
	private String carrera;
	private String reticula;
	
	public Materia(String clave, String nombreM, byte credito, String carrera, String reticula) {
		super();
		this.clave = clave;
		this.nombreM = nombreM;
		this.credito = credito;
		this.carrera = carrera;
		this.reticula = reticula;
	}
	public Materia() {
		this.clave = null;
		this.nombreM = null;
		this.credito = 4;
		this.carrera = null;
		this.reticula = null;
		
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getNombre() {
		return nombreM;
	}
	public void setNombre(String nombre) {
		this.nombreM = nombre;
	}
	public byte getCredito() {
		return credito;
	}
	public void setCredito(byte credito) {
		this.credito = credito;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public String getReticula() {
		return reticula;
	}
	public void setReticula(String reticula) {
		this.reticula = reticula;
	}
	@Override
	public String toString() {
		return "Materia [clave=" + clave + ", nombre=" + nombreM + ", credito=" + credito + ", carrera=" + carrera
				+ ", reticula=" + reticula + "]";
	}
	
	
	
	

}
