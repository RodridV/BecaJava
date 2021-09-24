package clases;

public class Movil {
	
	
	//Constructores
	public Movil() {
	}
	
	
	public Movil(int imei,int memoria, String marca, int tamanoPantalla) {
		this.imei=imei;
		this.memoria = memoria;
		this.marca = marca;
		this.tamanoPantalla = tamanoPantalla;
	}

	
	//Campos
	private int imei;		//Identificador de móvil
	private int memoria;
	private String marca;
	private int tamanoPantalla;
	
	
	//Métodos
	//...getters and setters
	
	
	public int getImei() {
		return imei;
	}
	public void setImei(int imei) {
		this.imei = imei;
	}
	
	public int getMemoria() {
		return memoria;
	}
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getTamanoPantalla() {
		return tamanoPantalla;
	}
	public void setTamanoPantalla(int tamanoPantalla) {
		this.tamanoPantalla = tamanoPantalla;
	}


	//...redefinidos

	//		... toString()
	@Override
	public String toString() {
		String texto;
		
		texto="IMEI: "+this.imei+"\n"
				+"Memoria: "+this.memoria+" GB"+"\n"
				+"Marca: "+ this.marca+"\n"
				+"Tamaño de pantalla: "+ this.tamanoPantalla+" pulgadas"+"\n";
		
		return texto;
	}
	
	//		... .equals
	@Override
	public boolean equals(Object objetoComparacion) {
		Movil movilCompara = (Movil) objetoComparacion;		//Pasamos el objeto objetoComparacion a tipo Movil y lo renombramos como movilCompara
		boolean iguales=this.imei==movilCompara.imei;		//Serán iguales si tienen el mismo IMEI
		
		return iguales;
	}
	
	
	
	//...normales
	//Método que aumenta en un GB la memoria
	public void aumentarMemoria() {
		this.memoria++;
	}
	
	
	
}
