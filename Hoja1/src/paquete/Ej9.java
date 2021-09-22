package paquete;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		/*
		Programa consistente en un juego en el que el Jugador1 introduce un número entre el 1 y
		el 100 y el Jugador2 tendrá que adivinarlo en un máximo de 10 intentos. Por cada intento
		del Jugador2, y en el caso de no acertar, se mostrará el mensaje “Te pasaste”, o “No
		llegaste”, según corresponda. De la misma manera, y al terminar el programa, se
		mostrarán los mensajes “Acertaste” o bien “Intentos agotados”.
		 */
		
		int numJ1,numJ2,intentos=1;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Jugador 1, introduzca número");
		numJ1=sc.nextInt();
		if (numJ1<1 || numJ1>100) {
			System.out.println("El número debe estar comprendido entre 1 y 100");
		}
		else {
			System.out.println("Jugador 2, introduzca número");
			numJ2= sc.nextInt();
			while (numJ1!=numJ2 && intentos<10) {
				if(numJ2>numJ1) {
					System.out.println("Te pasaste");
				}
				else {
					System.out.println("No llegaste");
				}
				System.out.println("Prueba otra vez");
				numJ2=sc.nextInt();
				intentos++;
			}
			if (numJ1==numJ2) {
				System.out.println("Acertaste");
			}
			else {
				System.out.println("Intentos agotados");
			}
		}
		sc.close();
	}

}
