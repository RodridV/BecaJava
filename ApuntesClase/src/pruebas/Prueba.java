package pruebas;

import java.util.ArrayList;

public class Prueba {

	public static void main(String[] args) {

		ArrayList<Integer> lista=new ArrayList<Integer>();
		lista.add(4);
		lista.add(5);
		lista.add(9);
		System.out.println(lista);
		
		int numero=5;
		lista.removeIf(n->n==numero);
		
		System.out.println(lista);
	}

}
