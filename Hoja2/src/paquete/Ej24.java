package paquete;

import java.util.Arrays;
import java.util.Scanner;

public class Ej24 {

	public static void main(String[] args) {
		/*
		Realiza un programa que lea 25 números para posteriormente mostrarlos en orden
		ascendente.
		*/
		
		int num[]= new int [25];
		Scanner sc = new Scanner(System.in);
		int nuevo_num;
		
		System.out.println("Introduzca número:");
		num[0]=sc.nextInt();
		
		for (int i =1;i<num.length;i++) {
			System.out.println("Introduzca número:");
			nuevo_num=sc.nextInt();
			if(nuevo_num>=num[i-1]) {
				num[i]=nuevo_num;
			}
			else {
				for (int j=i;j>0;j--) {
					if(nuevo_num<num[j-1]) {
							num[j]=num[j-1];
							num[j-1]=nuevo_num;
						}
					else {
						num[j]=nuevo_num;
						break;
						}
					}
				}
			}
		System.out.println("Los números introducidos en orden ascendente son: "+ Arrays.toString(num));
		sc.close();
	}

}
