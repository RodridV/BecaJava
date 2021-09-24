package ejecuta;

import java.util.HashMap;

public class Inicio {

	public static void main(String[] args) 
	{
		//	---------------------------------
		//	| 20 | 	 10   |    15 	| 	40	|		Temperaturas (Valores V)
		//	---------------------------------
		//	Otono|Invierno|Primavera|Verano			Claves K
		
		
		
		//HashMap<String, Integer> tempMaxEstacion;		//<> -> Indica valores genéricos
														//Claves de tipo String y valores de tipo Integer
		
		//tempMaxEstacion=new HashMap<String, Integer>();
		var tempMaxEstacion = new HashMap<String, Integer>();		//Igual que las linea de arriba
		
		
		tempMaxEstacion.put("Otoño", 20);
		tempMaxEstacion.put("Invierno",10);
		tempMaxEstacion.put("Primavera",15);
		tempMaxEstacion.put("Verano",40);
		
		System.out.println("La temperatura máxima en primavera es "
							+tempMaxEstacion.get("Primavera")+" grados");
		
		//Elemininamos el elemento de clave primavera
		tempMaxEstacion.remove("Primavera");
		
		System.out.println(tempMaxEstacion);
		System.out.println(tempMaxEstacion.keySet());		//Solo las keys
		System.out.println(tempMaxEstacion.values());		//Solo los values
	}

}