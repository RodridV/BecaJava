package ejecuta;

import java.util.Scanner;

import clases.Gestion_Listado;

public class Inicio {

	public static void main(String[] args) {
		
		/*	Usamos el ejercicio 31 como ejemplo:
		31. Realiza un programa que gestione una tabla ordenada ascendentemente y con un máximo
		de 18 elementos. No se permitirán repetidos:
		
		Menú:
		1.- Introducir número entero.
		2.- Listar números.
		3.- Eliminar número.
		4.- Eliminar todos los números.
		5.- Salir.	
		*/

		//Declaramos las variables
		Gestion_Listado gestion=new Gestion_Listado();
		Scanner sc = new Scanner(System.in);
		int opcion;
		int numero;
		String menu;
		
		menu ="Menú:\n"
				+ "1. Introducir número entero.\n"
				+ "2. Listar números.\n"
				+ "3. Eliminar número.\n"
				+ "4. Eliminar todos los números.\n"
				+ "5. Salir.\n";
		
		do {
			System.out.println(menu);
			System.out.print("Introduzca opción: \n");
			
			try {
				opcion= Integer.valueOf(sc.nextLine());	//Para que no se convierta en un bucle infinito.
				
				switch(opcion) {
				case 1:
					System.out.println("Introduzca número:");
					numero =Integer.valueOf(sc.nextLine());
					gestion.nuevo(numero);
					break;
				
				case 2:
					gestion.listar();
					break;
				
				case 3:
					System.out.println("Introduzca número que desea eliminar:");
					numero =Integer.valueOf(sc.nextLine());
					gestion.eliminar(numero);
					break;
				
				case 4:
					gestion.eliminar();
					break;
				
				case 5:
					System.out.println("Fin del programa");
					break;
				
				default :
					System.out.println("Opción no válida.\n");
				break;
				}
			}
			catch (Exception e) {
				opcion= 0;		//Para que vuelva a realizar el do while
				System.out.println("Opción incorrecta. Debe introducir un número.\n");
			}
			
		}while(opcion!=5);
		sc.close();
	}

}
