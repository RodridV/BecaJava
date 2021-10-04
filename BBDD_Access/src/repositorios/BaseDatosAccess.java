package repositorios;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDatosAccess {
	
	//Constructores
	public BaseDatosAccess(String fichero) {
		this.rutaFichero="jdbc:ucanaccess://C:\\Users\\rodri\\Documents\\"+ fichero +".accdb";
	}
	
	
	//Campos
	private String rutaFichero;
	public Connection conexion;
		
	//Métodos
	//...conectar con la base de datos
	public Connection conectar() throws Exception {
		
		conexion = DriverManager.getConnection(rutaFichero);
		
		System.out.println("Conectado");
		
		return conexion;

	}
	
	
	//...desconectar
	public void desconectar() throws Exception {
		if (this.conexion!=null && this.conexion.isClosed()==false) 
		{
			this.conexion.close();
			System.out.println("Desconectado de la base de datos.\n");
		}
	}


}
