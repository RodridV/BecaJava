package paquete2;

import java.util.Scanner;

public class Ej30 {

	public static void main(String[] args) {
		/*
		Realiza un programa que lea desde teclado 200 puntuaciones numéricas enteras que han
		de estar comprendidas entre el 0 y el 5, ambos inclusive. Al finalizar se mostrará por cada
		una de las puntuaciones, su frecuencia.
		*/
		
		int total_punt=200;
		int puntuacion,num_punt=0;		//Contador de las puntuaciones
		Scanner sc = new Scanner(System.in);
		int nota0=0,nota1=0,nota2=0,nota3=0,nota4=0,nota5=0;		//Acumuladores para cada nota
		while (num_punt<total_punt) {
			System.out.println("Introduzca puntuación");
			puntuacion=sc.nextInt();
			if(puntuacion<0 || puntuacion>5) {
				System.out.println("La puntuación debe estar comprendida entre 0 y 5");
			}
			else {
				if (puntuacion==0) {
					nota0++;
				}
				else if(puntuacion==1) {
					nota1++;
				}
				else if(puntuacion==2) {
					nota2++;
				}
				else if(puntuacion==3) {
					nota3++;
				}
				else if(puntuacion==4) {
					nota4++;
				}
				else {
					nota5++;
				}
			}
			num_punt++;
		}
		
		System.out.println("La frecuencia para la puntuación 0 es "+(((float)nota0/total_punt)*100)+"%");
		System.out.println("La frecuencia para la puntuación 1 es "+(((float)nota1/total_punt)*100)+"%");
		System.out.println("La frecuencia para la puntuación 2 es "+(((float)nota2/total_punt)*100)+"%");
		System.out.println("La frecuencia para la puntuación 3 es "+(((float)nota3/total_punt)*100)+"%");
		System.out.println("La frecuencia para la puntuación 4 es "+(((float)nota4/total_punt)*100)+"%");
		System.out.println("La frecuencia para la puntuación 5 es "+(((float)nota5/total_punt)*100)+"%");
		
		
		sc.close();
	}

}
