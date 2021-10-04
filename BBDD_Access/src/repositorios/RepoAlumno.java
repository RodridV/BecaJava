package repositorios;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelos.Alumno;

public class RepoAlumno extends BaseDatosAccess implements ICRUD<Alumno, Integer> 
{
	// Contructores
	// ============
	public RepoAlumno(String fichero)	//Nombre del fichero, sin .accdb
	{
		super(fichero);
	}
	
	// Campos
	// ======
	private String sql;
	private PreparedStatement ps;
	private Statement stmt;
	private ResultSet rs;

	// Métodos
	// =======
	@Override
	public ArrayList<Alumno> listar() throws Exception 
	{
		Alumno al;
		ArrayList<Alumno> datos = new ArrayList<Alumno>();
		
		super.conectar();
		
		this.stmt = super.conexion.createStatement();
		this.sql = "SELECT Matricula, Nombre, Apellido FROM Alumno";
		rs = this.stmt.executeQuery(sql);
		
		while( rs.next() == true ) 
		{
			al = new Alumno( rs.getInt("Matricula"), rs.getString("Apellido"), rs.getString("Nombre") );
			// System.out.println( al.toString() );
			datos.add(al);
		}
		
		super.desconectar();
		
		return datos;
	}

	@Override
	public Alumno leer(Integer pk) throws Exception 
	{
		Alumno al;
		
		super.conectar();
		
		this.sql = "SELECT Matricula, Nombre, Apellido FROM Alumno WHERE Matricula = ?";
		this.ps = super.conexion.prepareStatement(sql);
		this.ps.setInt(1, pk);
		
		this.rs = this.ps.executeQuery();
		
		if( this.rs.next() == true ) 
		{
			al = new Alumno(rs.getInt("Matricula"), rs.getString("Apellido"), rs.getString("Nombre")  );
		}
		else
		{
			al = null;
		}
		
		super.desconectar();
			
		return al;
	}

	@Override
	public void nuevo(Alumno modelo) throws Exception 
	{
		int cantidad;
		
		super.conectar();
		
		this.sql = "INSERT INTO Alumno(Matricula, Nombre, Apellido) VALUES(?,?,?)";
		this.ps = super.conexion.prepareStatement(sql);
		
		this.ps.setInt(1, modelo.matricula);
		this.ps.setString(2, modelo.nombre);
		this.ps.setString(3, modelo.apellido);
		
		cantidad = this.ps.executeUpdate();
		
		if(cantidad==1)
		{
			System.out.println("Guardado.");
		}
		else {
			System.out.println("No se ha guardado");
		}
		
		super.desconectar();
	}

	@Override
	public void editar(Integer pk, Alumno modelo) throws Exception 
	{
		int cantidad;
		
		super.conectar();
		
		this.sql = "UPDATE Alumno SET Matricula=?, Nombre=?, Apellido=? WHERE Matricula =?";
		this.ps = super.conexion.prepareStatement(sql);
		
		this.ps.setInt(1, modelo.matricula);
		this.ps.setString(2, modelo.nombre);
		this.ps.setString(3, modelo.apellido);
		this.ps.setInt(4, pk);
		
		cantidad = this.ps.executeUpdate();
		
		if(cantidad==1)
		{
			System.out.println("Modificado.");
		}
		else 
		{
			System.out.println("No se ha modificado, la fila no existe.");
		}
		
		super.desconectar();		
	}

	@Override
	public void eliminar(Integer pk) throws Exception 
	{
		int cantidad;
		
		super.conectar();
		
		this.sql = "DELETE FROM Alumno WHERE Matricula = ?";
		this.ps = super.conexion.prepareStatement(sql);
		
		this.ps.setInt(1, pk);
		
		cantidad = this.ps.executeUpdate();
		
		if(cantidad==1)
		{
			System.out.println("Eliminado.");
		}
		else 
		{
			System.out.println("No se ha eliminado, la fila no existe.");
		}
		
		super.desconectar();
	}
	
}