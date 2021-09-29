package repositorios;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


import modelos.Alumno;


public class RepoAlumno extends BaseDatos implements ICRUD <Alumno,Integer>
{

	//Constructor
	public RepoAlumno(String servidor, String usuario, String password, String baseDatos) {
		super(servidor, usuario, password, baseDatos);
	}

	//Campos
	private String sql;		//Para esta base de datos, debemos usar lenguaje Java.
	private PreparedStatement ps;
	private Statement stat;
	private ResultSet rs;
	
	//Métodos
	//... procedentes de ICRUD
	@Override
	public void listar() throws Exception {
		
		this.conectar();
		
		Alumno al = new Alumno();
		
		this.stat=super.conexion.createStatement();
		this.sql="SELECT matricula,nombre,apellido FROM Alumno";
		rs=this.stat.executeQuery(sql);
		if (rs.next()==false) {
			System.out.println("No hay datos.\n");
		}
		else {
			System.out.println("Estos son los alumnos introducidos en la base de datos.\n");
			while(rs.next()==true) {
				al= new Alumno(rs.getInt("matricula"), rs.getString("apellido"), rs.getString("nombre"));
				System.out.println(al.toString());
			}
		}

		this.desconectar();
	}

	@Override
	public Alumno leer(Integer pk) {
		

		return null;
	}

	@Override
	public void nuevo(Alumno modelo) throws Exception {
		
		int cantidad;
		
		super.conectar();		//Se ha heredado de la superclase
			
		sql= "INSERT INTO Alumno (matricula, nombre, apellido) VALUES (?,?,?)";
		ps = conexion.prepareStatement(sql);		//Sirve para sustituir los valores por las interrogaciones (?)
			
		this.ps.setInt(1,modelo.matricula);
		this.ps.setString(2, modelo.nombre);
		this.ps.setString(3, modelo.apellido);
			
		cantidad=this.ps.executeUpdate();			//Nos devuelve el número de filas insertadas (si está bien hecho será 1)
		
		if (cantidad==1) {
			System.out.println("Guardado.\n");
		}
		else {
			System.out.println("No se ha podido guardar.\n");
		}
		this.desconectar();
	}

	@Override
	public void editar(Integer pk, Alumno modelo) {
		
	}

	@Override
	public void eliminar(Integer pk) {
		
		
	}

	
	

}
