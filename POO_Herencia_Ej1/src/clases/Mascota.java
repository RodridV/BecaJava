package clases;

public class Mascota extends Object		//Mi clase mascota herede de la clase Object
{										//Es lo mismo que no ponerlo
	
	//Constructores
	public Mascota() {
	}
	
	public Mascota(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//Campos
	public String nombre;
	public int edad;
	
	//Métodos
	
	public String mostrar() {
		String texto;
		texto= "Nombre: "+nombre+"\n"
				+"Edad: "+ edad;
		
		return texto;
	}
	
	
	@Override			//Sobreescribimos el toString
	public String toString() {
		String texto;
		texto= "Nombre: "+nombre+"\n"
				+"Edad: "+ edad;
		
		return texto;
	}
	
	
	
}
