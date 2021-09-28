package modelos;

public class Alumno {

	//Constructores
	public Alumno() {
	}
	public Alumno(int matricula, String apellido, String nombre) {
		this.matricula = matricula;
		this.apellido = apellido;
		this.nombre = nombre;
	}
	
	//Campos
	public int matricula;
	public String apellido;
	public String nombre;
	
}
