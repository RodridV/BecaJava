package paquete;

import java.util.Scanner;

public class Ej1
{
	public static void main(String[] args) {
		
		//1. Programa que lee dos números A y B, y nos informa si B es divisor de A o no.
		int A,B;
		Scanner sc;
		
		sc = new Scanner (System.in);
		
		System.out.println("Introduzca el número A");
		A = sc.nextInt();
		
		System.out.println("Introduzca el número B");
		B = sc.nextInt();
			
		if ((A%B)==0) {
			System.out.println(B + " es divisor de " + A);
		}
		else {
			System.out.println(B + " no es divisor de " + A);
		}
		sc.close();
	}
}

