package clases;

public class Alumno {

	//Constructores
	public Alumno(int matricula) {
		this.matricula=matricula;
	}
	
	public Alumno(int matricula, String nombre) {
		this.matricula = matricula;
		this.nombre = nombre;
	}
	
	//Campos
	public int matricula;		//Número de matrícula //id,PK
	public String nombre;
	
	//Métodos
	@Override
	public String toString() {
		return "Número de matrícula: "+matricula+"\n"
				+"Nombre del alumno: "+nombre+"\n";
		}

	@Override
	public boolean equals(Object obj) {
		
		return ((Alumno)obj).matricula==this.matricula;
	}
	
	
}
