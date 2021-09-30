package ejecuta;

import java.util.Scanner;

import modelos.Alumno;
import repositorios.RepoAlumno;

public class Inicio {

	public static void main(String[] args) {

		RepoAlumno repoAlumno= new RepoAlumno("185.224.138.154","u581554845_alumno","Root1234","u581554845_indra");
		Alumno alumno = new Alumno();
		
		String menu = "Menú: \n"
				+ "1. Nuevo alumno.\n"					//No podemos meter dos alumnos con la misma matrícula
				+ "2. Eliminar alumno.\n"
				+ "3. Editar datos de alumno.\n"
				+ "4. Leer datos de alumno.\n"
				+ "5. Listar alumnos.\n"
				+ "6. Salir del programa.\n";
		int opcion;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println(menu);
			System.out.println("Introduzca opción.");
			opcion=sc.nextInt();
			
			switch(opcion) {
			case 1:		//Nuevo alumno
				try {
					System.out.println("Introduzca matrícula del nuevo alumno.");
					alumno.matricula=sc.nextInt();
					System.out.println("Introduzca nombre del alumno.");
					alumno.nombre=sc.next();
					System.out.println("Introduzca apellido del alumno.");
					alumno.apellido=sc.next();
		
					repoAlumno.nuevo(alumno);
					
				} catch (Exception e) {
					System.out.println("No se ha podido añadir. Se ha prodrucido un error.\n");
				}
				break;
				
			case 2:		//Eliminar alumno
				try {
					System.out.println("Introduzca matrícula del alumno que desea eliminar.");
					alumno.matricula=sc.nextInt();
					repoAlumno.eliminar(alumno.matricula);
				} catch (Exception e) {
					System.out.println("No se ha encontrado el alumno que desea eliminar.\n");
				}
				break;
			
			case 3:		//Editar alumno
				try {
					System.out.println("Introduzca matrícula del alumno que desea editar.");
					alumno.matricula=sc.nextInt();
					repoAlumno.editar(alumno.matricula);
				} catch (Exception e) {
					System.out.println("No se ha encontrado el alumno que desea editar.\n");
				}
				break;
				
			case 4:		//Leer alumno
				try {
					System.out.println("Introduzca matrícula del alumno que desea leer los datos.");
					alumno.matricula=sc.nextInt();
					alumno=repoAlumno.leer(alumno.matricula);
					if (alumno==null) {
						System.out.println("No se ha encontrado el alumno.\n");
					}
					else {
						System.out.println("Datos del alumno solicitado:\n"+alumno);
					}
				} catch (Exception e) {
					System.out.println("No se ha encontrado el alumno que desea leer.\n");
				}
				break;
			
			case 5:		//Listar alumnos
				try {
					repoAlumno.listar();
				} catch (Exception e) {
					System.out.println("No se ha podido listar. Se ha prodrucido un error.\n");
				}
				break;
			
			case 6:		//Salir del programa
				System.out.println("Fin del programa.\n");
				break;
			
			default:
				System.out.println("Opción incorrecta.\n");
				break;
			}
			
		}while(opcion!=6);
		
		sc.close();
	}
}
