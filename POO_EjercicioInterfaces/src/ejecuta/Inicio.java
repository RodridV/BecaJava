package ejecuta;

import java.util.Scanner;

import clases.Coches;
import clases.RepoCoches;

public class Inicio {

	public static void main(String[] args) {

		RepoCoches repoCoche = new RepoCoches();
		Coches coche;
		String matricula;
		String marca;
		String color;
		int opcion;
		Scanner sc = new Scanner(System.in);
		String menu = "Menú coches: \n"
				+ "1. Listar.\n"
				+ "2. Leer coche.\n"
				+ "3. Eliminar coche. \n"
				+ "4. Editar coche.\n"
				+ "5. Nuevo coche. \n"
				+ "6. Salir. \n";
		
		do {
			System.out.println(menu);
			System.out.println("Introduzca opción.");
			opcion=Integer.valueOf(sc.nextLine());	//Como vamos a usar el escaner para texto también, así no nos da problema
			
			switch(opcion){
				case 1:
					repoCoche.listar();
					break;
					
				case 2:
					System.out.println("Introduzca matrícula del coche a mostrar:");
					matricula=sc.nextLine();
					repoCoche.leer(matricula);
					break;
					
				case 3:
					System.out.println("Introduzca matrícula del coche que desea eliminar:");
					matricula=sc.nextLine();
					repoCoche.eliminar(matricula);
					break;
					
				case 4:	
					System.out.println("Introduzca matrícula del coche que desea editar:");
					matricula=sc.nextLine();
					repoCoche.editar(matricula);
					break;
					
				case 5:
					System.out.println("Introduzca matrícula del nuevo coche:");
					matricula=sc.nextLine();
					System.out.println("Introduzca marca del coche:");
					marca =sc.nextLine();
					System.out.println("Introduzca color del coche:");
					color=sc.nextLine();
					coche=new Coches(matricula, marca, color);
					repoCoche.nuevo(coche);
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
