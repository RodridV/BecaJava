package repositorios;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDatos {

	//Constructores
	public BaseDatos(String servidor,String usuario,String password,String baseDatos) {
		this.cadenaConexion = "jdbc:mysql://" + servidor + "/" + baseDatos 
				   + "?user=" + usuario + "&password=" + password 
				   + "&autoReconnect=true";

	}
	
	//Campos
	public Connection conexion;
	private String cadenaConexion;
	
	//Métodos
	//...conectar con la base de datos
	public Connection conectar() throws Exception {
		this.conexion=DriverManager.getConnection(cadenaConexion);
		//Connection conexion = DriverManager.getConnection(cadenaConexion);
		
		System.out.println("Conectado a la base de datos.\n");
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
