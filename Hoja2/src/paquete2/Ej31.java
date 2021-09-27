package paquete2;

import java.util.Arrays;
import java.util.Scanner;

public class Ej31 {

	public static void main(String[] args) {
		/*
		Realiza un programa que gestione una lista ordenada ascendentemente y con un m�ximo
		de 18 elementos. No se permitir�n repetidos:
		Men�:
		1.- Introducir n�mero entero.
		2.- Listar n�meros.
		3.- Eliminar n�mero.
		4.- Eliminar todos los n�meros.
		5.- Salir.
		*/
		
		
		String menu;
		Scanner sc = new Scanner(System.in);
		int [] numeros = new int [18];		//Tama�o del array
		int num;		//Valor que introduce el usuario
		int opcion;		//Opci�n elegida por el usuario
		int posi=0;		//Posici�n donde se graba el n�mero
		boolean repe=false;		//Para comprobar si el n�mero es repetido
		boolean encontrado=false; 	//Para eliminar n�meros
		
		menu ="Men�:\n"
				+ "1. Introducir n�mero entero.\n"
				+ "2. Listar n�meros.\n"
				+ "3. Eliminar n�mero.\n"
				+ "4. Eliminar todos los n�meros.\n"
				+ "5. Salir.\n";
		
		do {
			System.out.println(menu);
			System.out.print("Introduzca opci�n: \n");
			opcion= sc.nextInt();
			
			switch (opcion) {
			
				case 1:		//Introducir y ordenar
					
					if (posi==numeros.length) { //Comprobamos que no est� lleno
						System.out.println("La lista est� completa.\n");
					}
					else {
						System.out.println("\nIntroduzca n�mero entero:");
						num=sc.nextInt();
						
						//Comprobamos que no est� repetido
						for (int i=0;i<numeros.length;i++) {
							if (num==numeros[i]) {
								repe=true;
							}
						}
						if (repe) {
							System.out.println("El n�mero es repetido.\n");
						}
						else {
							//Falta ordenar
							numeros[posi]=num;
							posi++;
							System.out.println("N�mero guardado.\n");
						}
					}
				break;	
				
				case 2:		//Listar (mostrar n�meros)
					System.out.println("La lista de n�meros es:\n"
					+(Arrays.toString(numeros)));
				break;
				
				case 3:		//Eliminar n�mero
					System.out.println("�Qu� n�mero desea eliminar?");
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
						System.out.println("El n�mero seleccionado no se ha encontrado");
					}
					else {
						posi--;
						System.out.println("El n�mero "+ num+" ha sido eliminado.\n");
					}
					
				break;
				
				case 4:		//Eliminar todos los n�meros
					
					numeros=new int[numeros.length];
					
					System.out.println("Todos los n�meros han sido eliminados.\n");
				break;
				
				case 5:		//Salir del programa
				break;
				
				default:
					System.out.println("\n Opci�n incorrecta.");
				break;
			}
			
		}while(opcion!=5);
		
		System.out.println("\nFin del programa.");
		sc.close();
	}

}
