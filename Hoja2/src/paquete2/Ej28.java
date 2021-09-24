package paquete2;

import java.util.Arrays;

public class Ej28 {

	public static void main(String[] args) {
		/*
		Realiza un programa que cargue una tabla de 5 filas y 7 columnas con los siguientes
		números, para finalmente mostrarla:
		|35 26 25 16 15 6  5|
		|34 27 24 17 14 7  4|
		|33 28 23 18 13 8  3| 
		|32 29 22 19 12 9  2|
		|31 30 21 20 11 10 1|
		 */
		
		int tabla[][]=new int[5][7];
		int num=1;				//Número desde 1 a 35
		int j=6; 				//Iteraciones en las columnas
		while(j>=0) {
			if(j%2==0) {			//Columna impar -> desde abajo a arriba
				for (int i=tabla.length-1;i>=0;i--) {
					tabla[i][j]=num;
					num++;
				}
			}
			else {					//Columna par -> desde arriba a abajo
				for (int i=0;i<tabla.length;i++) {
					tabla[i][j]=num;
					num++;
				}
			}
			j--;
		}
		
		for (int i=0;i<tabla.length;i++) {
			System.out.println(Arrays.toString(tabla[i]));
		}
	}

}
