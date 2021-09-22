package clase2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Escaner {

	public static void main(String[] args) {
		int numero1, numero2, suma;
		Scanner sc;				//Está en un paquete distinto al nuestro
		
		
		try 
		{
			sc = new Scanner (System.in);
			
			System.out.println("Introduce número");
			numero1 = sc.nextInt();
			
			System.out.println("Introduce otro número");
			numero2 = sc.nextInt();
			
			suma = numero1 + numero2;
			System.out.println("La suma es " + suma);	//Lo convierte a texto
			System.out.println("La suma es " + String.valueOf(suma));	//Conversión manual
			
			System.out.println("La suma es " + numero1+numero2);
			System.out.println("La suma es " + (numero1+numero2));	//Si no pones los parentesis convierte ambos números a texto
			
			System.out.println(suma + " es el resultado de la suma");
		}
		catch(InputMismatchException e) 	//e es una variable (e -> excepción)
		{		
			System.out.println("Formato incorrecto. Se debe introducir un número entero");
		}
	
		//Si no sabemos que error se puede producir, podemos usar un catch genérico.
		catch (Exception e) {
			String mensaje;
			
			mensaje = "Se ha producido un error desconocido." + e.getMessage();
			
			System.out.println(mensaje);
		}
		//Se deja para el final porque atrapa todo.

	}

}
