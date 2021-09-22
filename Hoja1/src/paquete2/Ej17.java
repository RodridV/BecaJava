package paquete2;

import java.util.Scanner;

public class Ej17 {

	public static void main(String[] args) {
		/*
		Programa que lee cantidades y precios de productos, para al final indicar el total de la
		factura. Si el importe supera los 1000€ se aplicará un descuento del 5%. El programa
		finaliza al introducir una cantidad 0.
		*/
		
		int cant;
		float total=0,precio;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduzca cantidad de productos");
		cant=sc.nextInt();
		
		while (cant!=0) {	
			System.out.println("Introduzca precio del producto"); //Pedimos precio del producto anterior
			precio=sc.nextFloat();
			
			total=total+cant*precio;
			
			System.out.println("Introduzca cantidad de productos");
			cant=sc.nextInt();
		}
		sc.close();
		if (total>1000) {
			total=total*0.95F;
		}
		System.out.println("El importe total es " + total + "€");
	}

}
