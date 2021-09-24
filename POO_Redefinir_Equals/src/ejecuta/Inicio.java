package ejecuta;

import java.util.HashMap;

import clases.Movil;

public class Inicio {

	public static void main(String[] args) {
		
		//	---------------------------------
		//	|movilJuan|movilMaria|movilPedro|			//Valores (objetos de tipo movil)
		//	---------------------------------
		//		111		   232	   	 955				//Imei (tipos Integer)
		
		
		HashMap<Integer, Movil> moviles = new HashMap<Integer, Movil>();
		//var moviles = new HashMap<Integer, Movil>();
		
		Movil movilJuan = new Movil(111,4,"Samsung",4);
		Movil movilMaria = new Movil (232,6,"Iphone",4);
		Movil movilPedro = new Movil (955,4,"Xiaomi",5);
		
		//Añadimos los elementos a la colección
		moviles.put(111,movilJuan);
		moviles.put(232, movilMaria);
		moviles.put(movilPedro.getImei(), movilPedro);
				
		
		Movil movilBusqueda=new Movil(232,6,"Iphone",4);
		
		if (moviles.containsValue(movilBusqueda)) {
			System.out.println("Encontrado");
		}
		else {
			System.out.println("No encontrado");
		}
		
		System.out.println(movilJuan.equals(movilPedro));
	}

}
