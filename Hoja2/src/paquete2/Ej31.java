package paquete2;


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
						repe=false;
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
							//Añadimos el número y ordenamos
							if (posi==0) {			//Para añadir el primer número sin problema
								numeros[posi]=num;
							}
							else {
								if (num>numeros[posi-1]) {		//Si el nuevo número es mayor que el último, se coloca inmediatamente después
									numeros[posi]=num;
								}
								else {
									for (int j=posi;j>0;j--) {		//Desde el final hasta el principio vamos comprobando en qué posición se debe introducir el nuevo número
										if(num<numeros[j-1]) {
											numeros[j]=numeros[j-1];
											numeros[j-1]=num;
										}
										else {
											numeros[j]=num;
											break;				//Una vez introducido el nuevo número, salimos del bucle
										}
									}
								}
							}
							posi++;
							System.out.println("Número guardado.\n");
						}
					}
					
				break;	
				
				case 2:		//Listar (mostrar números)
					if(posi==0) {
						System.out.println("No hay datos.\n");
					}
					else {
						System.out.println("La lista de números es:");
						System.out.print("[");
						for(int j=0;j<posi-1;j++) {
							System.out.print(numeros[j]+ ", ");
						}
						System.out.println(numeros[posi-1]+"]\n");
					}
				break;
				
				case 3:		//Eliminar número
					System.out.println("¿Qué número desea eliminar?");
					num=sc.nextInt();
					encontrado=false;
					for (int i=0;i<numeros.length;i++) {
						if (num==numeros[i]) {				//Comprobamos que el número que quiere eliminar existe en nuestro array
							encontrado=true;
							for (int j=i;j<numeros.length-1;j++) {
								numeros[j]=numeros[j+1];
							}
						}
					}
					if (encontrado==false) {
						System.out.println("El número seleccionado no se ha encontrado.\n");
					}
					else {
						posi--;							//Restamos una posición de conteo
						System.out.println("El número "+ num+" ha sido eliminado.\n");
						for (int i =posi;i<numeros.length;i++) {
							numeros[i]=0;
						}
					}
					
				break;
				
				case 4:		//Eliminar todos los números
					numeros=new int[numeros.length];		//También se puede excluir esto ya que reiniciamos la posición
					posi=0;
					System.out.println("Todos los números han sido eliminados.\n");
				break;
				
				case 5:		//Salir del programa
					System.out.println("Saliendo del programa...");
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
