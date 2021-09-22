package clase5;

import java.util.Random;

public class ComandoRandom {

	public static void main(String[] args) {
		
		int segundos;
		int aleatorio;
		Random r = new Random();
		
		for (int corredor=1;corredor<=3;corredor++) {
			
			segundos = 0;
			aleatorio =r.nextInt(20)+1;  //Por que el random te incluye el 0
			
			for(;segundos<=aleatorio;segundos++) {
				
			}
			if (segundos<10) {
				System.out.println("Rápido, ha tardado " + segundos + " segundos");
			}
			else {
				System.out.println("Lento, ha tardado " + segundos + " segundos");
			}
		}

	}

}
