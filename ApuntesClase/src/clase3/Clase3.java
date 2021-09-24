package clase3;

import java.util.Scanner;

public class Clase3 {

	public static void main(String[] args) {

		for (int contador=1; contador <=10; contador ++) { 		//inicio;final;incremento
			System.out.println(contador);
		}
		
		/*======================================================*/
		
		//Parte del ejercicio 3 de la hoja 1
		int numero,num_val=0;
		Scanner sc=new Scanner(System.in);
		
		do {											//Entra en el bucle y luego comprueba
			System.out.println("Introduzca número:");
			numero =sc.nextInt();
			
			if (numero<20 || numero>40) {
				System.out.println("El número introducido no es válido. El número debe estar entre 20 y 40");
			}
			else {
				System.out.println("Número válido");
				num_val ++;
			}
		}while (num_val<3);
		sc.close();
		
		/*======================================================*/
		String mensaje;
		mensaje = "Hola" + "\n"
				+ "Mi nombre es Rodrigo";
		System.out.println(mensaje);
		
		
		//Recorrer todos los valores de un array
		int notas[]= {10,9,10,8};
		
		for (int nota:notas) {
			System.out.println(nota);
		}
	}

}
