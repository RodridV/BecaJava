package repositorios;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

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
	
	public Scanner sc = new Scanner(System.in);		//Para pedir datos
	
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
	public Alumno leer(Integer pk) throws Exception {
		this.conectar();
		Alumno alumno;
		
		this.sql="SELECT matricula, nombre, apellido FROM Alumno WHERE matricula = ?";
		this.ps = super.conexion.prepareStatement(sql);
		this.ps.setInt(1, pk);

		this.rs = this.ps.executeQuery();
		
		if( this.rs.next() == true ) 
		{
			alumno = new Alumno( rs.getInt("matricula"), rs.getString("apellido"), rs.getString("nombre") );
		}
		else
		{
			alumno = null;
		}
		
		super.desconectar();
			
		return alumno;
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
			System.out.println("Los datos del alumno han sido guardados.\n");
		}
		else {
			System.out.println("No se ha podido guardar.\n");
		}
		this.desconectar();
	}

	@Override
	public void editar(Integer pk) throws Exception {
		
		int cantidad;
		Alumno alumno;
		int opcion;
		super.conectar();
		
		//Creo variables nuevas para solicitar datos al usuario por consola.
		String sql2;
		PreparedStatement ps2;
		//Leemos los datos del alumno que se desea modificar
		sql2="SELECT matricula, nombre, apellido FROM Alumno WHERE matricula = ?";
		ps2 = super.conexion.prepareStatement(sql2);
		ps2.setInt(1, pk);

		this.rs = ps2.executeQuery();
		
		if( this.rs.next() == true ) 
		{
			alumno = new Alumno( rs.getInt("matricula"), rs.getString("apellido"), rs.getString("nombre") );
		}
		else
		{
			alumno = null;
		}
		
		//Una vez leidos los datos, modificamos los que seleccione el usuario.		
		this.sql = "UPDATE Alumno SET matricula=?, nombre=?, apellido=? WHERE matricula =?";
		this.ps = super.conexion.prepareStatement(sql);
		
		System.out.println("¿Qué desea editar?:\n"
							+ "1. Nº de matrícula.\n"
							+ "2. Nombre y apellido.\n"
							+ "3. Nº de matrícula, nombre y apellido.\n");
		opcion=sc.nextInt();
		
		if (opcion==1) {
			System.out.println("Introduzca nueva matrícula:");
			alumno.matricula=sc.nextInt();
		}
		else if(opcion==2) {
			System.out.println("Introduzca nombre:");
			alumno.nombre=sc.next();
			System.out.println("Introduzca apellido:");
			alumno.apellido=sc.next();
		}
		else if (opcion==3) {
			System.out.println("Introduzca nueva matrícula:");
			alumno.matricula=sc.nextInt();
			System.out.println("Introduzca nombre:");
			alumno.nombre=sc.next();
			System.out.println("Introduzca apellido:");
			alumno.apellido=sc.next();
		}
		else {
			System.out.println("Opción incorrecta.\n");
		}
		
		//Modificamos con los nuevos datos
		this.ps.setInt(1, alumno.matricula);
		this.ps.setString(2, alumno.nombre);
		this.ps.setString(3, alumno.apellido);
		this.ps.setInt(4, pk);
		
		cantidad = this.ps.executeUpdate();
		
		if(cantidad==1)
		{
			System.out.println("Los datos del alumno han sido modificados.\n");
		}
		else 
		{
			System.out.println("No se ha modificado, la fila no existe.\n");
		}
		
		super.desconectar();
	}

	@Override
	public void eliminar(Integer pk) throws Exception {
		
		int cantidad;
		
		super.conectar();
		
		this.sql = "DELETE FROM Alumno WHERE matricula = ?";
		this.ps = super.conexion.prepareStatement(sql);
		
		this.ps.setInt(1, pk);
		
		cantidad = this.ps.executeUpdate();
		
		if(cantidad==1)
		{
			System.out.println("Los datos del alumno han sido eliminados.\n");
		}
		else 
		{
			System.out.println("No se ha eliminado, la fila no existe.\n");
		}
		
		super.desconectar();
		
	}

	
	

}
