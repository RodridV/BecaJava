package paquete2;

import java.util.Arrays;
import java.util.Scanner;

public class Ej31 {

	public static void main(String[] args) {
		/*
		Realiza un programa que gestione una lista ordenada ascendentemente y con un máximo
		de 18 elementos. No se permitirán repetidos:
		Menú:
		1.- Introducir número entero.
		2.- Listar números.
		3.- Eliminar número.
		4.- Eliminar todos los números.
		5.- Salir.
		*/
		
		
		String menu;
		Scanner sc = new Scanner(System.in);
		int [] numeros = new int [18];		//Tamaño del array
		int num;		//Valor que introduce el usuario
		int opcion;		//Opción elegida por el usuario
		int posi=0;		//Posición donde se graba el número
		boolean repe=false;		//Para comprobar si el número es repetido
		boolean encontrado=false; 	//Para eliminar números
		
		menu ="Menú:\n"
				+ "1. Introducir número entero.\n"
				+ "2. Listar números.\n"
				+ "3. Eliminar número.\n"
				+ "4. Eliminar todos los números.\n"
				+ "5. Salir.\n";
		
		do {
			System.out.println(menu);
			System.out.print("Introduzca opción: \n");
			opcion= sc.nextInt();
			
			switch (opcion) {
			
				case 1:		//Introducir y ordenar
					
					if (posi==numeros.length) { //Comprobamos que no esté lleno
						System.out.println("La lista está completa.\n");
					}
					else {
						System.out.println("\nIntroduzca número entero:");
						num=sc.nextInt();
						
						//Comprobamos que no esté repetido
						for (int i=0;i<numeros.length;i++) {
							if (num==numeros[i]) {
								repe=true;
							}
						}
						if (repe) {
							System.out.println("El número es repetido.\n");
						}
						else {
							//Falta ordenar
							numeros[posi]=num;
							posi++;
							System.out.println("Número guardado.\n");
						}
					}
				break;	
				
				case 2:		//Listar (mostrar números)
					System.out.println("La lista de números es:\n"
					+(Arrays.toString(numeros)));
				break;
				
				case 3:		//Eliminar número
					System.out.println("¿Qué número desea eliminar?");
					num=sc.nextInt();
					for (int i=0;i<numeros.length;i++) {
						if (num==numeros[i]) {
							encontrado=true;
							for (int j=i;j<numeros.length-1;j++) {
								numeros[j]=numeros[j+1];
							}
						}
					}
					if (encontrado==false) {
						System.out.println("El número seleccionado no se ha encontrado");
					}
					else {
						posi--;
						System.out.println("El número "+ num+" ha sido eliminado.\n");
					}
					
				break;
				
				case 4:		//Eliminar todos los números
					
					numeros=new int[numeros.length];
					
					System.out.println("Todos los números han sido eliminados.\n");
				break;
				
				case 5:		//Salir del programa
				break;
				
				default:
					System.out.println("\n Opción incorrecta.");
				break;
			}
			
		}while(opcion!=5);
		
		System.out.println("\nFin del programa.");
		sc.close();
	}

}
