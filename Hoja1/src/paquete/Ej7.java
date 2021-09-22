package paquete;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) 
	{
		
		/*
		 Programa que pide el número de calificaciones a introducir, y una nota de corte. A
		continuación se introducirán las calificaciones, para finalmente indicar cuántas
		calificaciones han igualado o superado la nota de corte.
		 */
		int num_calif,aprob=0;
		float calif,nota_corte;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el número de calificaciones");
		num_calif=sc.nextInt();
		System.out.println("Introduzca la nota de corte");
		nota_corte=sc.nextFloat();
		
		for (int i=1; i<=num_calif; i++) {
			System.out.println("Introduzca calificación");
			calif=sc.nextFloat();
			if (calif>=nota_corte) {
				aprob++;
			}
		}
		
		sc.close();		
		System.out.println(aprob + " alumn@s han superado la nota de corte");
	}

}
