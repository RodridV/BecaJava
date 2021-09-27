package ejecuta;

import clases.Coche;
import clases.ECombustible;
import clases.Tren;
import clases.Vehiculo;

public class Inicio {

	public static void main(String[] args) {
		
		Vehiculo[] vehiculos = new Vehiculo[2];
		
		
		Coche miCoche = new Coche(true,ECombustible.gasolina,"Coche",1300,"Verde");
		//System.out.println(miCoche.toString());
		
		Tren miTren = new Tren("Tren",1500000,"Negro",7,true);
		//System.out.println(miTren.toString());
		
		// I. Hacemos uso del polimorfismo para almacenar en el Array objetos de distinto tipo
		//===================================================================================
		
		//vechiculos[0]=(Vehiculo)miCoche; //No es necesario porque Coche hereda de Vehículo
		vehiculos[0]=miCoche;
		vehiculos[1]=miTren;
		
		for (int i=0;i<vehiculos.length;i++) {
			System.out.println(vehiculos[i]);
		}
		
		for (int i=0;i<vehiculos.length;i++) {
			if (vehiculos[i] instanceof Tren) {
				miTren = (Tren)vehiculos[i];	//Vuelve a ser de la clase Tren
				System.out.println(miTren.color+"\n");
			}
			else if (vehiculos[i] instanceof Coche) {
				miCoche = (Coche)vehiculos[i];
			}
		}
		
		// II. Instanciar un objeto de un tipo como otro
		//==============================================
		
		Vehiculo nuevoVehiculo= new Tren();
		
		// III. Paso de parámetros
		//==================================================
		nuevoVehiculo.mostrar(miTren);
	
	
	
	}

}
