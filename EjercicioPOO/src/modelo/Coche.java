package modelo;

public class Coche {

	private String marca;
	private String modelo;
	private int kilometros;
	private boolean electrico;
	
	
	public Coche(String marca, String modelo, int kilometros, boolean electrico) {
		this.marca = marca;
		this.modelo = modelo;
		this.kilometros = kilometros;
		this.electrico = electrico;
	}
	
	public Coche() {
		
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getKilometros() {
		return kilometros;
	}
	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}
	public boolean isElectrico() {
		return electrico;
	}
	public void setElectrico(boolean electrico) {
		this.electrico = electrico;
	}
	
	@Override
	public String toString() {
		return "Coche: marca=" + marca + "\n"
				+"modelo=" + modelo + "\n"
				+"kilometros=" + kilometros + "\n"
				+"electrico="
				+ electrico + "";
	}
	
}
