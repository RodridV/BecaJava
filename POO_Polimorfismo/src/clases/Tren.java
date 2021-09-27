package clases;

public class Tren extends Vehiculo{		//Hacemos que Tren herede de Vehículo

	//Constructores
	public Tren() {
		super();
	}
	
	public Tren(String tipo, int peso, String color,
				int vagones, boolean largoRecorrido) {
		
		super(tipo, peso, color);
		
		this.vagones = vagones;
		this.largoRecorrido = largoRecorrido;
	}
	
	
	//Campos
	public int vagones;
	public boolean largoRecorrido;
	
	//Métodos
	//...toString
	@Override
	public String toString() {
		return super.toString()		//Invocamos el toString de la clase padre (Vehiculo)
				+"Número de vagones: " + vagones + "\n"
				+ "¿Es de largo recorrido? " + ((largoRecorrido)?"Si":"No") + "\n";
	}
	
	
}
