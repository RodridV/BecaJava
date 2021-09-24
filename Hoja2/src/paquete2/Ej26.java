package paquete2;

import java.util.Arrays;
import java.util.Scanner;

public class Ej26 {

	public static void main(String[] args) {
		/*
		Realiza un programa que dibuje un cuadrado mágico de orden impar introducido por el
		usuario. Un cuadrado mágico es aquel en el que sin repetir ningún número, todas las filas,
		columnas, y las dos diagonales suman lo mismo.
		*/
		
		int orden;								//Orden del cuadrado mágico
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca el orden del cuadrado mágico");
		orden = sc.nextInt();
		
		while (orden%2==0) {
			System.out.println("El orden debe ser impar, introduzca otro número");
			orden=sc.nextInt();
		}
		
		//Una vez tenemos el orden del cuadrado, creamos el cuadrado
		
		int cuadrado [][]=new int [orden][orden];
		
		int c=orden/2,f=0,ci=0,fi=0; //Filas y columnas con sus contadores
		
		cuadrado[f][c]=1;
		
		for (int i=2;i<=orden*orden;i++) {
			if(f-1<0) {
				f=orden-1;
			}
			else {
				f--;
			}
			if(c+1>orden-1) {
				c=0;
			}
			else {
				c++;
			}
			if (cuadrado[f][c]==0) {
				cuadrado[f][c]=i;
				fi=f;
				ci=c;
			}
			else {
				f=fi+1;c=ci;
				cuadrado[f][c]=i;
			}
		}
		
		System.out.println("\nEl cuadrado mágico de orden "+orden+" es:");
		for (int i=0;i<orden;i++) {
			System.out.println(Arrays.toString(cuadrado[i]));
		}
		
		for (int i=0;i<orden;i++) {
			int suma=0;
			for(int j=0;j<orden;j++) {
				suma=suma+cuadrado[i][j];
			}
			System.out.println(suma);
		}
		sc.close();
	}

}
