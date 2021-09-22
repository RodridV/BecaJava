package paquete;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		
		/*
		Programa que lee de manera consecutiva números hasta que se introducen dos números
		iguales seguidos.
		*/
		
		int A,B;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduzca un número");
		A=sc.nextInt();
		
		System.out.println("Introduzca otro número");
		B=sc.nextInt();
		
		if (A==B) {
			System.out.println("FIN");
		}
		else {
			A=B;
			System.out.println("Introduzca otro número");
			B=sc.nextInt();
			while (A!=B) {
				A=B;
				System.out.println("Introduzca otro número");
				B=sc.nextInt();
			}
			System.out.println("FIN");
		}
		sc.close();
	}

}