package repositorios;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import modelos.Articulo;

public class RepoArticulo extends BaseDatosAccess implements ICRUD<Articulo, String>{

	//Constructores
	public RepoArticulo(String fichero) {
		super(fichero);
	}
	
	//Campos
	private String sql;
	private PreparedStatement ps;
	private Statement stmt;
	private ResultSet rs;
	
	//Métodos
	@Override
	public ArrayList<Articulo> listar() throws Exception {
		
		Articulo articulo;
		ArrayList<Articulo> datos = new ArrayList<Articulo>();
		
		super.conectar();
		
		this.stmt= super.conexion.createStatement();
		this.sql= "SELECT Referencia, Nombre, Precio FROM Productos";
		rs = this.stmt.executeQuery(sql);
		
		while( rs.next() == true ) 
		{
			articulo = new Articulo( rs.getString("Referencia"), rs.getString("Nombre"), rs.getFloat("Precio") );
			
			datos.add(articulo);
		}
		
		super.desconectar();
		return datos;
	}
	@Override
	public Articulo leer(String pk) throws Exception {
		Articulo articulo;
		
		super.conectar();
		
		sql= "SELECT Referencia, Nombre, Precio FROM Productos WHERE Referencia = ?";
		this.ps = super.conexion.prepareStatement(sql);
		this.ps.setString(1, pk);
		
		this.rs = this.ps.executeQuery();
		
		if (rs.next()==true) {
			articulo = new Articulo( rs.getString("Referencia"), rs.getString("Nombre"), rs.getFloat("Precio") );
		}
		else {
			articulo=null;
		}
		return articulo;
	}
	@Override
	public void nuevo(Articulo modelo) throws Exception {
		int cantidad;
		
		super.conectar();
		
		this.sql = "INSERT INTO Productos(Referencia, Nombre, Precio) VALUES(?,?,?)";
		this.ps = super.conexion.prepareStatement(sql);
		
		this.ps.setString(1, modelo.referencia);
		this.ps.setString(2, modelo.nombre);
		this.ps.setFloat(3, modelo.precio);	
		
		cantidad = this.ps.executeUpdate();
		
		if(cantidad==1)
		{
			System.out.println("Artículo guardado.");
		}
		else {
			System.out.println("No se ha guardado");
		}
		
		super.desconectar();
	}
	@Override
	public void editar(String pk, Articulo modelo) throws Exception {
		int cantidad;
		
		super.conectar();
		
		this.sql = "UPDATE Productos SET Referencia=?, Nombre=?, Precio=? WHERE Referencia =?";
		this.ps = super.conexion.prepareStatement(sql);
		
		this.ps.setString(1, modelo.referencia);
		this.ps.setString(2, modelo.nombre);
		this.ps.setFloat(3, modelo.precio);
		this.ps.setString(4, pk);
		
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
	public void eliminar(String pk) throws Exception {
int cantidad;
		
		super.conectar();
		
		this.sql = "DELETE FROM Productos WHERE Referencia = ?";
		this.ps = super.conexion.prepareStatement(sql);
		
		this.ps.setString(1, pk);
		
		cantidad = this.ps.executeUpdate();
		
		if(cantidad==1)
		{
			System.out.println("Artículo eliminado.");
		}
		else 
		{
			System.out.println("No se ha eliminado, la referencia no existe.");
		}
		
		super.desconectar();		
	}

}
