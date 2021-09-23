package paquete;

import java.util.Arrays;
import java.util.Scanner;

public class Ej21 {

	public static void main(String[] args) {
		/*
		Realiza un programa que lea desde teclado 11 números enteros, para posteriormente
		mostrarlos en el orden inverso al que fueron introducidos.
		*/
		
		int [] num = new int [11];			//Números introducidos
		int [] invert = new int [11];		//Números invertidos
		Scanner sc = new Scanner (System.in);
		
		for (int i=0;i<num.length;i++) {
			System.out.println("Introduzca número");
			num[i]=sc.nextInt();
		}
		int i=num.length-1;
		for (int j=0;j<num.length;j++) {
			invert[j]=num[i];
			i--;
		}
		System.out.println("El orden inverso de los números introducidos es:");
		System.out.println(Arrays.toString(invert));
		sc.close();
	}

}
