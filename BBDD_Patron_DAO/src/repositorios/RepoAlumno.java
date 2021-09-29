package repositorios;

import java.sql.PreparedStatement;
import java.util.ArrayList;


import modelos.Alumno;


public class RepoAlumno extends BaseDatos implements ICRUD <Alumno,Integer>
{

	//Constructor
	public RepoAlumno(String servidor, String usuario, String password, String baseDatos) {
		super(servidor, usuario, password, baseDatos);
	}

	//Campos
	private Alumno alumno;	//Para evitar ponerlo en todos lados.
	private String sql;		//Para esta base de datos, debemos usar lenguaje Java.
	private PreparedStatement ps;
	
	//Métodos
	//... procedentes de ICRUD
	@Override
	public ArrayList<Alumno> listar() {
		
		
		return null;
	}

	@Override
	public Alumno leer(Integer pk) {
		

		return null;
	}

	@Override
	public void nuevo(Alumno modelo) throws Exception {
			conectar();
			
			sql= "INSERT INTO Alumno (matricula, nombre, apellido) VALUES (?,?,?)";
			ps = conexion.prepareStatement(sql);
			
	}

	@Override
	public void editar(Integer pk, Alumno modelo) {
		
	}

	@Override
	public void eliminar(Integer pk) {
		
	}

	
	

}
