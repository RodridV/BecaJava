package inicio;

import java.util.Scanner;

import modelo.Coche;

public class principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Coche miCoche = new Coche();
		Coche segundoCoche = new Coche("Tesla","X",0,true);
		Coche coche3=new Coche ();
		String electrico;
		
		miCoche.setMarca("Seat");
		miCoche.setModelo("Ibiza");
		miCoche.setKilometros(50000);
		miCoche.setElectrico(false);
		
		System.out.println(miCoche.toString());
		
		System.out.println(segundoCoche.getMarca());
		System.out.println(segundoCoche.getModelo());
		System.out.println(segundoCoche.getKilometros());
		System.out.println(segundoCoche.isElectrico());
		
		
		System.out.println("Introduce marca del coche");
		coche3.setMarca(sc.nextLine());
		
		System.out.println("Introduce modelo");
		coche3.setModelo(sc.nextLine());
		
		System.out.println("Introduce kilómetros");
		coche3.setKilometros(Integer.valueOf(sc.nextLine()));
		
		System.out.println("¿Es eléctrico?(Si/No)");
		electrico=sc.nextLine();
		
		if (electrico.equals("Si")) {
			coche3.setElectrico(true);
		}
		else if (electrico.equals("No")) {
			coche3.setElectrico(false);
		}
		System.out.println(coche3.toString());
		sc.close();
	}

}
