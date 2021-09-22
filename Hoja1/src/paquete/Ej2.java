package paquete;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		
		/* 2.Programa que lee 11 números comprendidos entre el 20 y 40, ambos inclusive.
		En el caso en el que algún número introducido no se encontrara dentro del rango
		permitido, se mostrará un mensaje de error y seguirá pidiendo números. El 
		programa finalizará cuando se hayan introducido 11 números válidos y mostrará
		el número máximo introducido de los 11 válidos. Además indicará cuántos números
		de los introducidos no han sido válidos.
		*/
		
		int a, max, num_val,num_inval;
		Scanner sc;
		
		sc = new Scanner (System.in);
		
		System.out.println("Introduce el primer número");
		a = sc.nextInt();
		max=0;
		
		if (20 <= a && a <= 40) {
			max=a;
			num_val=1;
			num_inval=0;
		}
		else {
			num_inval=1;
			num_val=0;
			System.out.println("El número debe estar comprendido entre 20 y 40");
		}
		while (num_val <11) {
			System.out.println("Introduce otro número");
			a = sc.nextInt();
				
			if (20 <= a && a <= 40) {
				num_val++;
				if (a>max) {
					max=a;
				}
			}
			else {
				num_inval ++;
				System.out.println("El número debe estar comprendido entre 20 y 40");
			}
		}
		System.out.println("El número máximo introducido es "+ max);
		System.out.println("Se han introducido " + num_inval + " números inválidos");
		sc.close();
	}
}
