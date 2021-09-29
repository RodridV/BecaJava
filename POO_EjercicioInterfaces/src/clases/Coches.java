package clases;

public class Coches {
	
	//Constructores
	public Coches() {
	}
	public Coches(String matricula, String marca, String color) {
		this.matricula = matricula;
		this.marca = marca;
		this.color = color;
	}
	//Campos
	public String matricula;
	public String marca;
	public String color;
	
	//Métodos
	@Override
	public String toString() {
		return "Coche: \n"
				+ " - Matricula: " + matricula + "\n"
				+ " - Marca: " + marca + "\n"
				+ " - Color: " + color + "\n";
	}
	@Override
	public boolean equals(Object obj) {

		return ((Coches)obj).matricula.equals(matricula);
	}
	
	
	

}
