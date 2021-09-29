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
	public int matricula;	//PK
	public String apellido;
	public String nombre;
	
	//Métodos
	//...toString
	@Override
	public String toString() {
		return "Alumno:\n"
				+"Nº de matricula: " + matricula+"\n"
				+ "Apellido: " + apellido+"\n"
				+ "Nombre: " + nombre+"\n";
	}
	
	
}
