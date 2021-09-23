package paquete;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej23 {

	public static void main(String[] args) {
		/*
		Realiza un programa que lea desde teclado 12 números y posteriormente los muestre.
		Los números que estuvieran repetidos solo se deben mostrar una vez.
		*/
		int num[]= new int [4];
		Scanner sc = new Scanner(System.in);
		List<Integer> no_rep =new ArrayList<Integer> (); //Lista con los no repetidos
		boolean repe;
		
		//Creamos el array de los 12 números
		for (int i =0;i<num.length;i++) {
			repe=false;
			System.out.println("Introduzca número:");
			num[i]=sc.nextInt();
			
			for(int j=0;j<i;j++) {
				if(num[i]==num[j]) {
					repe=true;
				}
			}
			if(repe==false) {
				no_rep.add(num[i]);
			}
		}
		
		System.out.println("Los números no repetidos son "+no_rep);
		sc.close();
	}

}
