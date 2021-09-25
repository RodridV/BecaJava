package paquete2;

import java.util.Scanner;

public class Ej30 {

	public static void main(String[] args) {
		/*
		Realiza un programa que lea desde teclado 200 puntuaciones numéricas enteras que han
		de estar comprendidas entre el 0 y el 5, ambos inclusive. Al finalizar se mostrará por cada
		una de las puntuaciones, su frecuencia.
		*/
		
		int nota_min=0,nota_max=5;
		int total_punt=200;	
		int lista_puntuaciones[]=new int[total_punt];
		int puntuacion;
		
		Scanner sc = new Scanner(System.in);
		
		
		//Leemos y guardamos las puntuaciones
		for (int i=0;i<lista_puntuaciones.length;i++) {
			System.out.println("Introduzca puntuación");
			puntuacion=sc.nextInt();
			if (puntuacion<nota_min || puntuacion >nota_max) {
				System.out.println("La nota debe estar comprendida entre "+nota_min+" y "+nota_max);
			}
			else {
				lista_puntuaciones[i]=puntuacion;
			}
		}
		
		//Ahora calculamos la frecuancia para cada nota
		for (int i=nota_min;i<=nota_max;i++) {
			float suma=0;						//Para el cálculo de las frecuencias
			for(int j=0;j<lista_puntuaciones.length;j++) {
				if(lista_puntuaciones[j]==i) {
					suma++;
				}
			}
			float frec = 100*(suma/lista_puntuaciones.length);
			System.out.println("La frecuencia de la puntuación "+i+" es "+frec+"%");
		}
		
		
		sc.close();
	}

}
