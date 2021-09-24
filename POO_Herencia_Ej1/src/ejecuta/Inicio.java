package ejecuta;

import clases.Hamster;

public class Inicio {

	public static void main(String[] args) {
		
		/*
		Mascota miMascota = new Mascota("Puka",5);
		
		//Método creado
		System.out.println(miMascota.mostrar());

		//Método redefinido o sobreesctrito
		System.out.println(miMascota.toString());
		//Al sobreescribirlo en clases.Mascota, nos aparece que pertence a Mascota
		 */
		 
		Hamster miHamster = new Hamster("Marrón","ExtraVital","Fulgencio",3);
		//Hamster miHamster2 = new Hamster();
		
		System.out.println(miHamster.toString());
	}

}
