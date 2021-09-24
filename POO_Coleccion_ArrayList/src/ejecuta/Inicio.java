package ejecuta;

import java.util.ArrayList;
import java.util.Scanner;

import clases.Movil;

public class Inicio {

	public static void main(String[] args) {
		
		ArrayList<Movil> moviles = new ArrayList<Movil>();
		
		Movil movilJuan = new Movil(111,4,"Samsung",4);
		Movil movilMaria = new Movil (222,6,"Iphone",4);
		Movil movilPedro = new Movil (955,4,"Xiaomi",5);
		
		
		//Vamos a buscar un movil por su IMEI
		Movil movilBusqueda;
		Scanner sc = new Scanner (System.in);
		int imei;
		
		//Poblamos el ArrayList
		moviles.add(movilJuan);
		moviles.add(movilPedro);
		moviles.add(movilMaria);
		
		//Mostramos el contenido del ArrayList
		System.out.println("Contenido del ArrayList:\n");
		for (Movil movil : moviles) {
			System.out.println(movil);
		}
		
		//Realizamos una búsqueda
		
		//Introducido desde el ejecutable	
		movilBusqueda= new Movil();
		movilBusqueda.setImei(111);						
		if (moviles.contains(movilBusqueda)==true) {
			System.out.println("Encontrado");
		}
		else {
			System.out.println("No encontrado");
		}
		
		
		//Pedido por consola											
		System.out.println("\nIntroduzca IMEI para buscar");
		imei=sc.nextInt();
		
		movilBusqueda= new Movil();
		movilBusqueda.setImei(imei);
		if (moviles.contains(movilBusqueda)==true) {
			System.out.println("Encontrado");
		}
		else {
			System.out.println("No encontrado");
		}
		
		sc.close();
	}

}
