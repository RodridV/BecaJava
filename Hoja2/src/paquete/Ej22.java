package paquete;

import java.util.Scanner;

public class Ej22 {

	public static void main(String[] args) {
		/*
		Realiza un programa que lea desde teclado 10 n�meros sin repetir. Si el usuario introduce
		alg�n n�mero repetido se le debe notificar, y no ha de ser contabilizado.
		*/
		
		int cont=0,compr;	//Contador para llegar hasta los 10 n�meros;Para comprobar repetici�n de n�mero
		Scanner sc = new Scanner(System.in);
		int [] num= new int [10];
		
		System.out.println("Introduzca n�mero");
		num[cont]=sc.nextInt();
		
		while (cont<=10) {
			cont++;
			System.out.println("Introduzca n�mero");
			compr=sc.nextInt();
			for (int i=0;i<=cont;i++) {
				if (num[i]==compr) {
					
				}
			}
		}
		
		sc.close();
	}

}
