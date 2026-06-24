package clasesRelacion;

public class Grupo {
	private String idGrupo;
	private int hora;
	private String aula;
	private Materia materia;
	private Maestro maestro;
	    
	
	public Grupo(String idGrupo, int hora, String aula, Materia materia,Maestro maestro) {
		this.idGrupo = idGrupo;
		this.hora = hora;
		this.aula = aula;
		this.materia = materia;
		this.maestro = maestro;
	}
	public Grupo() {
		this.idGrupo = null;
		this.hora = 0;
		this.aula = null;
		this.materia = null;
		
	}
	
	
	
	
	public String getIdGrupo() {
		return idGrupo;
	}
	public void setIdGrupo(String idGrupo) {
		this.idGrupo = idGrupo;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public String getAula() {
		return aula;
	}
	public void setAula(String aula) {
		this.aula = aula;
	}
	public Materia getMateria() {
		return materia;
	}
	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	public Maestro getMaestro() {
		return maestro;
	}
	public void setMaestro(Maestro maestro) {
		this.maestro = maestro;
	}
	@Override
	public String toString() {
		return "Grupo [idGrupo=" + idGrupo + ", hora=" + hora + ", aula=" + aula + ", materia=" + materia + "]";
	}
	
	
	
	}
	
	
	


