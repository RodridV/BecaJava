package paquete;

import java.util.Scanner;

public class Ej22 {

	public static void main(String[] args) {
		/*
		Realiza un programa que lea desde teclado 10 números sin repetir. Si el usuario introduce
		algún número repetido se le debe notificar, y no ha de ser contabilizado.
		*/
		
		int cont=0,compr;	//Contador para llegar hasta los 10 números;Para comprobar repetición de número
		Scanner sc = new Scanner(System.in);
		int [] num= new int [10];
		
		System.out.println("Introduzca número");
		num[cont]=sc.nextInt();
		
		while (cont<=10) {
			cont++;
			System.out.println("Introduzca número");
			compr=sc.nextInt();
			for (int i=0;i<=cont;i++) {
				if (num[i]==compr) {
					
				}
			}
		}
		
		sc.close();
	}

}
