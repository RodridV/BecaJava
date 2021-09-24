package ejecuta;

import clases.Movil;

public class Inicio {

	public static void main(String[] args) {
		
		Movil moviles[]= new Movil [3];
		Movil m1  = new Movil (8,"Apple",4);
		Movil m2 = new Movil(10,"Samsung",7);
		Movil m3 = new Movil(12,"Xiaomi",5);
		
		moviles[0]=m1;
		moviles[1]=m2;
		moviles[2]=m3;

		
		for (int i=0;i<3;i++) {
			System.out.println("Móvil número "+(i+1)+":");
			System.out.println(moviles[i].toString());		//Este toString() pertenece a clases.Movil
		}
	}

}
