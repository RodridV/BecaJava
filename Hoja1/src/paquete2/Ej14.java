package paquete2;

import java.util.Scanner;

public class Ej14 {

	public static void main(String[] args) {
		/*
		Programa que lee una secuencia de 10 números y muestra el mayor de los múltiplos de 5,
		y el menor de los múltiplos de 3. Si no hubiera ningún múltiplo, el programa lo indicaría.
		*/
		
		int num,may5=Integer.MIN_VALUE,men3=Integer.MAX_VALUE;
		Scanner sc = new Scanner (System.in);
		
		for (int i =1;i<=10;i++) {
			System.out.println("Introduzca número");
			num=sc.nextInt();
			
			if (num%5==0) {					//Comprobamos si es divisible entre 5
				if (num>may5) {				//Cambiamos el mayor múltiplo de 5
					may5=num;
				}
			}
			if (num%3==0) {
				if(num<men3) {
					men3=num;
				}
			}
		}
		sc.close();
		if (may5==0) {
			System.out.println("No hay múltiplos de 5");
		}
		else if (may5!=0){
			System.out.println("El mayor múltiplo de 5 es " + may5);
		}
		if (men3==0) {
			System.out.println("No hay múltiplos de 3");
		}
		else if(men3!=0) {
			System.out.println("El menor múltiplo de 3 es " + men3);
		}
	}

}
