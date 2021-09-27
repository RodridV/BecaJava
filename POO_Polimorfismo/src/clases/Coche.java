package clases;

public class Coche extends Vehiculo{		//Hacemos que Coche herede de Vechículo

	//Constructores
	public Coche() {
	}
	
	public Coche(boolean camara,ECombustible combustible,
				String tipo, int peso, String color) {
		
		super(tipo,peso,color);
		
		this.camara = camara;
		this.combustible = combustible;
	}
	
	//Campos
	public boolean camara;
	public ECombustible combustible;
	
	
	//Métodos
	//...toString
	@Override
	public String toString() {
		return super.toString()
				+"¿Tiene cámara? " + ((camara)?"Si":"No")+"\n"
				+ "Tipo de combustible: " + combustible + "\n";
	}
	
}
