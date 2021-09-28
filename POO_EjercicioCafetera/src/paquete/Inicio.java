package paquete;

import java.util.Scanner;

import clases.Cafetera;

public class Inicio {

	public static void main(String[] args) {
		/*
		Diseñar una clase que simule el funcionamiento de una máquina de café.
		La cafetera registrará el volumen de agua que puede almacenar, así como
		el tamaño de los vasos de café o tazas que el usuario puede solicitar.
		Se pide, crear la clase Cafetera y sus miembros.
		
		A. Campos
			- volumen (cantidad de agua que puede almacenar la cafetera)
			- volumenVaso	-> restar al volumen
			- volumenTaza	-> restar al volumen
		B. Métodos
			- servirTaza()
			- servirVaso()
			- mostrar() -> indicar las características (redefinir toString)
		*/
		
		//float volumen = 2;	//volumen de la cafetera
		//float volumenTaza=0.4F;	//Volumen de la taza
		//float volumenVaso=0.2F;	//Volumen del vaso
		
		//Rellenamos los datos
		Scanner sc = new Scanner (System.in);
		
		//Iniciamos la cafetera
		Cafetera miCafetera = new Cafetera();
		
		//Rellenamos los datos de la cafetera
		System.out.println("Introduzca el volumen de la cafetera (en litros).");
		miCafetera.setVolumen(sc.nextFloat());
		
		System.out.println("Introduzca volumen de la taza (en litros).");
		miCafetera.setVolumenTaza(sc.nextFloat());
		
		System.out.println("Introduzca el volumen del vaso (en litros).");
		miCafetera.setVolumenVaso(sc.nextFloat());
		
		String menu;
		int opcion;	//Opción elegida en el menú
		
		menu="Menú:\n"
				+ "1. Mostrar capacidad de la cafetera.\n"
				+ "2. Servir una taza de café.\n"
				+ "3. Servir vaso de café.\n"
				+ "4. Salir del programa.\n";
		
		do {
			System.out.println(menu);
			System.out.println("Seleccione opción.\n");
			opcion=sc.nextInt();
			
			switch (opcion) {
				case 1:
					miCafetera.mostrar();
					break;
				case 2:
					miCafetera.servirTaza();
					break;
				case 3:
					miCafetera.servirVaso();
					break;
				case 4:
					System.out.println("Fin del programa. \n");
					break;
				default:
					System.out.println("Opción incorrecta.\n");
					break;
			}
			
		}while (opcion!=4);
			
		sc.close();
	}

}
