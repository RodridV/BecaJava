package paquete;

import java.util.Scanner;

public class Ej25 {

	public static void main(String[] args) {
		/*
		Realiza un programa que cargue desde teclado una tabla bidimensional de 2x3 de números
		enteros. Posteriormente el programa pedirá un número a buscar, y en caso de encontrarlo
		indicará el número de fila y columna donde se ha encontrado por primera vez. El programa
		ofrecerá al usuario la opción de seguir buscando más números: “¿Desea seguir
		buscando?(s/n)”.
		*/
		
		int tabla[][]=new int[2][3];
		Scanner sc=new Scanner (System.in);
		boolean encontrado;
		String seguir="s";
		int num;

		for (int i=0;i<tabla.length;i++) {		//Recorremos las filas
			for(int j=0;j<tabla[i].length;j++) {		//Ahora las columnas de dicha fila
				System.out.println("Introduce número para la fila "+(i+1));
				tabla[i][j]=sc.nextInt();
			}
			
		}
		
		do {
			System.out.println("¿Qué número desea buscar?");
			num=sc.nextInt();
			encontrado=false;
			int i=0,j=0;										//Volvemos a iniciar las variables para recorrer la tabla
			while (i<tabla.length && encontrado==false) {		//Recorremos las filas
				j=0;
				while(j<tabla[i].length&&encontrado==false) {			//Ahora las columnas de dicha fila
					if (num==tabla[i][j]) {
						encontrado=true;
					}
					else {
						j++;
					}
				}
				if(encontrado==false) {
					i++;
				}
			}
			if (encontrado==true) {
				System.out.println("El número se ha encontrado en la fila "+i+ " y en la columna "+j);
			}
			else {
				System.out.println("No se ha encontrado el número");
			}
			
			System.out.println("¿Desea seguir buscando?(s/n)");
			seguir=sc.next();
		}while(seguir.equals("s"));
		
		
		
		sc.close();
	}

}
