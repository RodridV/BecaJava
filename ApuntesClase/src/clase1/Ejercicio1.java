package clase1;

public class Ejercicio1 {

	public static void main(String[] args) {
		//En cierta zona de Madrid solo pueden aparcar residentes o eléctricos y matriculados posteriores al 2018.
		
		boolean residente;
		boolean electrico;
		float matricula;
		
		residente = false;
		electrico = true;
		matricula = 2018;
		
		if (residente==true || electrico==true && matricula >=2018) {
			System.out.println("Puede aparcar");
		}
		else {
			System.out.println("No puede aparcar");
		}
		

	}

}
