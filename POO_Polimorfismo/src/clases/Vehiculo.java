package clases;

public class Vehiculo {

	//Constructores
	public Vehiculo() {
	}
	
	public Vehiculo(String tipo, int peso, String color) {
		this.tipo = tipo;
		this.peso = peso;
		this.color = color;
	}
	
	
	//Campos
	public String tipo;
	public int peso;
	public String color;
	
	
	//Métodos
	//...toString
	@Override
	public String toString() {
		return "Vehículo:\n"
				+ "Tipo: " + tipo +"\n"
				+ "Peso: " + peso +" kg"+"\n"
				+ "Color:" + color +"\n";
	}
	
	//...otros
	public void mostrar(Vehiculo v) {
		Tren t;
		Coche c;
		if (v instanceof Coche) {
			c= (Coche) v;
			System.out.println(c.toString());
		}
		else if (v instanceof Tren) {
			t=(Tren)v;
			System.out.println(t.toString());
		}
	}

	
}
