package ejecuta;

import java.util.Scanner;

import clases.Alumno;
//import clases.Articulo;
import clases.RepoAlumno;
//import clases.RepoArticulo;

public class Inicio {

	public static void main(String[] args) {
		
		//GestionCRUD<Alumno, Integer> gestion;
		
		/*	//Articulo
		RepoArticulo repo= new RepoArticulo();
		Articulo articulo1=new Articulo("a123", "Monitor", 300F);
		Articulo articulo2=new Articulo("a456", "Teclado", 20F);
		Articulo art;
		
		repo.nuevo(articulo1);
		repo.nuevo(articulo2);
		
		art=repo.leer("a456");
		System.out.println(art.toString());
		
		//Probamos el listar y el eliminar
		System.out.println(repo.listar());
		
		//repo.eliminar(articulo2);	//Eliminamos el segundo artículo
		
		//System.out.println(repo.listar());
		
		//Editamos un artículo
		art= new Articulo("a456","Teclado Gaming",22.5F);
		repo.editar("a457", art);
		System.out.println(repo.listar());
		*/
		
		//Alumno
		RepoAlumno repoAlumno= new RepoAlumno();
		Alumno alumno;
		int matricula;
		String nombre;
		int opcion;
		Scanner sc= new Scanner(System.in);
		String menu = "Menú alumnos: \n"
					+ "1. Listar.\n"
					+ "2. Leer alumno.\n"
					+ "3. Eliminar. \n"
					+ "4. Editar.\n"
					+ "5. Nuevo. \n"
					+ "6. Salir. \n";
		
		do {
			System.out.println(menu);
			System.out.println("Introduzca opción.");
			opcion=Integer.valueOf(sc.nextLine());	//Como vamos a usar el escaner para texto también, así no nos da problema
			
			switch(opcion){
				case 1:
					if(repoAlumno.listar2().size()==0) {
						System.out.println("No hay alumnos introducidos en el sistema.\n");
					}
					else {
						System.out.println(repoAlumno.listar2());
					}
					
					break;
					
				case 2:
					if(repoAlumno.listar2().size()==0) {
						System.out.println("No hay alumnos introducidos en el sistema.\n");
					}
					else {
						System.out.println("Introduzca número de matrícula:");
						matricula=Integer.valueOf(sc.nextLine());
						if (repoAlumno.leer(matricula)==null) {
							System.out.println("Alumno no encontrado.\n");
						}
						else {
							System.out.println(repoAlumno.leer(matricula));
						}
					}
					break;
					
				case 3:
					System.out.println("Introduzca matrícula del alumno que desea eliminar:");
					matricula=Integer.valueOf(sc.nextLine());
					repoAlumno.eliminar2(matricula);
					break;
					
				case 4:
					System.out.println("Introduzca matrícula del alumno:");
					matricula=Integer.valueOf(sc.nextLine());
					System.out.println("Introduzca el nuevo nombre:");
					nombre =sc.nextLine();
					alumno=new Alumno (matricula,nombre);
					repoAlumno.editar(matricula, alumno);
					break;
					
				case 5:
					System.out.println("Introduzca matrícula del nuevo alumno:");
					matricula=Integer.valueOf(sc.nextLine());
					System.out.println("Introduzca el nombre del nuevo alumno:");
					nombre =sc.nextLine();
					alumno=new Alumno (matricula,nombre);
					repoAlumno.nuevo(alumno);
					break;
					
				case 6:
					System.out.println("Fin del programa.\n");
					break;
					
				default:
					System.out.println("Opción incorrecta.\n");
					break;
			}
			
			
		}while(opcion !=6);
		sc.close();
	}
	

}
