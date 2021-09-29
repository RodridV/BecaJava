package ejecuta;

import modelos.Alumno;
import repositorios.RepoAlumno;

public class Inicio {

	public static void main(String[] args) {

		/*
		BaseDatos bd = new BaseDatos("185.224.138.154","u581554845_alumno","Root1234","u581554845_indra");
		
		try {
			bd.conectar();
		} catch (Exception e) {
			System.out.println("Error de conexión con la base de datos.\n");
		}
		*/
		
		//Alumno alumno = new Alumno(999, "Perez", "Pepito");		//No podemos meter dos alumnos con la misma matrícula
		RepoAlumno repoAlumno= new RepoAlumno("185.224.138.154","u581554845_alumno","Root1234","u581554845_indra");
		
		try {
			//repoAlumno.nuevo(alumno);
		} catch (Exception e) {
			System.out.println("No se ha podido añadir. Se ha prodrucido un error.\n");
		}
		try {
			repoAlumno.listar();
		} catch (Exception e) {
			System.out.println("No se ha podido listar. Se ha prodrucido un error.\n");
		}
		
	}

}
