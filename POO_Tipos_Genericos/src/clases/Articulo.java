package clases;

public class Articulo{

	//Constructores
	public Articulo() {
	}
	
	public Articulo(String referencia, String nombre, float precio) {
		this.referencia = referencia;
		this.nombre = nombre;
		this.precio = precio;
	}
	
	//Campos
	public String referencia; //PK Primary Key
	public String nombre;
	public float precio;

	//Métodos
	@Override
	public String toString() {
		return "Referencia: "+referencia+"\n"
				+"Nombre: "+nombre+"\n"
				+"Precio: "+precio+" €\n";
	}

	@Override
	public boolean equals(Object obj) {
		
		return ((Articulo)obj).referencia.equals(referencia);
	}
	
	
}
