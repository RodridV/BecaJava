package ejecuta;

import repositorios.BaseDatos;

public class Inicio {

	public static void main(String[] args) {

		BaseDatos bd = new BaseDatos("185.224.138.154","u581554845_alumno","Root1234","u581554845_indra");
		
		try {
			bd.conectar();
		} catch (Exception e) {
			System.out.println("Error de conexión con la base de datos.\n");
		}
	}

}
