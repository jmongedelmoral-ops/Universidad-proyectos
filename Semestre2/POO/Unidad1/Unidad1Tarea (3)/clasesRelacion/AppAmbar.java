/*
App para el horario de un alumno

Alumno: José Manuel Monge Delmoral
Número de control:  
Fecha: 11/02/2026

*/

package clasesRelacion;

public class AppAmbar {
	public static void main(String[] args) {
		
		Materia materiaPOO = new Materia("POO","Programacion orientada a objetos",(byte)5,"Ing.Sistemas","re01");
		
		Materia materiaAl = new Materia("AL","algebra lineal",(byte)5,"Ing.Sistemas","re01");
		
		Materia materiaCd = new Materia("CD","Calculo diferencial",(byte)5,"Ing.Sistemas","re01");
		
		Materia materiaQ = new Materia("Q","Quimica",(byte)4,"Ing.Sistemas","re01");
		
		Maestro marisela = new Maestro("Marisela Ponce Millanes");
		
		Maestro elena = new Maestro("ELENA HAYDEE ORTIZ GARCIA");
		
		Maestro pedro = new Maestro("PEDRO MOISES ZAVALA SANCHEZ");
		
		Maestro jazmin = new Maestro("JAZMIN LIZETH JIMENEZ NAVA");
		
		Alumno monge = new Alumno(" ","Monge Delmoral José Manuel");
		
		Grupo grupoPOO = new Grupo("BZA2",8,"G03",materiaPOO, marisela);
		
		Grupo grupoAL = new Grupo("FZA2",10,"N4",materiaAl, elena); 
		
		Grupo grupoCD = new Grupo("AZA2",13,"F05",materiaCd, pedro); 
		
		Grupo grupoQ = new Grupo("CZA2",12,"F05",materiaQ, jazmin); 
		
		Horario horariomonge = new Horario(); 
		
		horariomonge.setAlumno(monge); 
		horariomonge.asignaGrupo(grupoPOO, 0);
		horariomonge.asignaGrupo(grupoAL, 1); 
		horariomonge.asignaGrupo(grupoCD, 2); 
		horariomonge.asignaGrupo(grupoQ, 3); 
		
		System.out.println("Control: " + 
				horariomonge.getAlumno().getControl() + 
				"\nNombre:  " + horariomonge.getAlumno().getNombre()); 
		
		System.out.println("\tGrupo : "+ 
				horariomonge.PresentaGrupo(0).getIdGrupo() +   "  " + 
				horariomonge.PresentaGrupo(0).getMateria().getNombre() + "  " + 
				horariomonge.PresentaGrupo(0).getHora() + ":00hrs  "+ 
				horariomonge.PresentaGrupo(0).getAula() + "  " + horariomonge.PresentaGrupo(0).getMaestro().getNombre()); 

		System.out.println("\tGrupo : "+ 
		horariomonge.PresentaGrupo(1).getIdGrupo() + "  " + 
		horariomonge.PresentaGrupo(1).getMateria().getNombre() + "  " + 
		horariomonge.PresentaGrupo(1).getHora() + ":00hrs  "+ 
		horariomonge.PresentaGrupo(1).getAula() + "  " + 
		horariomonge.PresentaGrupo(1).getMaestro().getNombre()); 

		System.out.println("\tGrupo : "+ 
		horariomonge.PresentaGrupo(2).getIdGrupo() + "  " + 
		horariomonge.PresentaGrupo(2).getMateria().getNombre() + "  " + 
		horariomonge.PresentaGrupo(2).getHora() + ":00hrs  "+ 
		horariomonge.PresentaGrupo(2).getAula() + "  " + 
		horariomonge.PresentaGrupo(2).getMaestro().getNombre()); 
		
		System.out.println("\tGrupo : "+ 
		horariomonge.PresentaGrupo(3).getIdGrupo() + "  " + 
		horariomonge.PresentaGrupo(3).getMateria().getNombre() + "  " + 
		horariomonge.PresentaGrupo(3).getHora() + ":00hrs  "+ 
		horariomonge.PresentaGrupo(3).getAula() + "  " + 
		horariomonge.PresentaGrupo(3).getMaestro().getNombre());  }
				

	}


