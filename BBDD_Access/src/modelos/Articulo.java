package modelos;

public class Articulo {

	//Constructores
	public Articulo() {

	}
	public Articulo(String referencia, String nombre, float precio) {
		this.referencia = referencia;
		this.nombre = nombre;
		this.precio = precio;
	}
	
	
	//Campos
	public String referencia; //pk
	public String nombre;
	public float precio;
	
	// Métodos
	@Override
	public String toString() {
		return "Referencia del producto: " + referencia + "\n"
				+ "Nombre: " + nombre + "\n"
				+ "Precio: " + precio + "€\n";
	}
}
