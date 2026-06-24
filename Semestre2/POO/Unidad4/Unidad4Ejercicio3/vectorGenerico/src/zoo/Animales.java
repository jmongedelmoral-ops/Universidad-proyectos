package zoo;

public abstract  class Animales {
	private String especie; 
	private String raza;
	private String fechaNacimiento;
	
	
	public Animales(String especie, String raza, String fechaNacimiento) {
		super();
		this.especie = especie;
		this.raza = raza;
		this.fechaNacimiento = fechaNacimiento;
	}
	public Animales() {
		super();
		this.especie = null;
		this.raza = null;
		this.fechaNacimiento = null;
		
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return  "Animales [especie=" + especie + ", raza=" + raza + ", fechaNacimiento=" + fechaNacimiento + "]";
	} 
	
	public void respirar() {
		System.out.println("Respiro como animal");
	}

}
