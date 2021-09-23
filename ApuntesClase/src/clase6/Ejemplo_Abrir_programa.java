package clase6;

import java.io.IOException;

public class Ejemplo_Abrir_programa {		//Abrimos la calculadora desde Java

	public static void main(String[] args) {
		
		try {
			Runtime.getRuntime().exec("C:\\Windows\\System32\\calc.exe");
		} catch (IOException e) {
			System.out.println("Fichero no encontrado");
		}
	}

}
