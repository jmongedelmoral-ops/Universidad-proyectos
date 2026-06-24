package zoo;


public class Mamiferos extends Animales {
	private String dieta; 
	
	public Mamiferos(String especie, String raza, String fechaNacimiento, String dieta) {
		super(especie, raza, fechaNacimiento);
		this.dieta= dieta; 
	}

	public String getDieta() {
		return dieta;
	}

	public void setDieta(String dieta) {
		this.dieta = dieta;
	}

	@Override
	public String toString() {
		return super.toString()+ "   Mamiferos [dieta=" + dieta + "]";
	}
	
	public void respirar() {
		System.out.println("Respiro como mamifero");
	}

}
