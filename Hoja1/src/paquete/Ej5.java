package paquete;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		
		// 5. Programa que nos informa si un número introducido es primo o no.
		
		int A,a,resto;
		Scanner sc = new Scanner(System.in);
		List<Integer> div =new ArrayList<Integer> ();

		System.out.println("Introduzca un número");
		A= sc.nextInt();
		a=2;
		if (a<A) {
			while (a<A) {
				resto=A%a;
				if (resto==0) {
					div.add(a);
				}
				a=a+1;
			}
		}
		if (div.size()==0) {
			System.out.println("El número elegido es un número primo");
		}
		else {
			System.out.println("El número elegido no es un número primo");
		}
		sc.close();
	}
}