package paquete;

import java.util.Scanner;


public class Ej19 {

	public static void main(String[] args) {
		// Realiza un programa que lea desde teclado 10 números y posteriormente muestre
		//solamente los que sean pares.
		
		int [] lista = new int [10];
		Scanner sc =new Scanner (System.in);
		
		for (int i=0;i<lista.length;i++) {
			System.out.println("Introduzca número");
			lista[i]=sc.nextInt();
		}
		System.out.println("Los números pares de los introducidos son:");
		for (int j=0;j<lista.length;j++) {		//Buscamos los pares para imprimirlos

			if (lista[j]%2==0) {
				System.out.println(lista[j]);
			}
		}
		sc.close();
	}
}