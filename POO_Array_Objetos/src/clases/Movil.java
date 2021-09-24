package clases;

public class Movil {
	
	
	//Constructores
	public Movil() {
	}
	
	
	public Movil(int memoria, String marca, int tamanoPantalla) {
		this.memoria = memoria;
		this.marca = marca;
		this.tamanoPantalla = tamanoPantalla;
	}

	
	//Campos
	private int memoria;
	private String marca;
	private int tamanoPantalla;
	
	
	//Métodos
	//...getters and setters
	public int getMemoria() {
		return memoria;
	}
	public String getMarca() {
		return marca;
	}
	public int getTamanoPantalla() {
		return tamanoPantalla;
	}
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setTamanoPantalla(int tamanoPantalla) {
		this.tamanoPantalla = tamanoPantalla;
	}
	
	//...redefinidos
	@Override
	public String toString() {
		String texto;
		
		texto="Memoria: "+this.memoria+" GB"+"\n"
				+"Marca: "+ this.marca+"\n"
				+"Tamaño de pantalla: "+ this.tamanoPantalla+" pulgadas"+"\n";
		
		return texto;
	}
	
	
	//...normales
	//Método que aumenta en un GB la memoria
	public void aumentarMemoria() {
		this.memoria++;
	}
	
	
	
}
