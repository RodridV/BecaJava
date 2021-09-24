package paquete2;

import java.util.ArrayList;

import java.util.Random;

public class Ej29 {

	public static void main(String[] args) {
		/*
		Realiza un programa que muestre 10 números aleatorios enteros sin repetir de entre el 1 y
		el 100, ambos inclusive.
		*/
		
		Random r = new Random();
		int aleatorio;
		ArrayList<Integer> lista =new ArrayList<Integer> ();
		boolean repetido=false;
		
		
		while (lista.size()<10) {
			aleatorio=r.nextInt(100)+1;
			repetido=false;
			for(int i=0;i<lista.size();i++) {
				if (aleatorio==lista.get(i)) {
					repetido=true;
				}
			}
			if (repetido!=true) {
				lista.add(aleatorio);
			}
		}
		System.out.println(lista);
		
		
	}

}
