package clases;

public class Cafetera {

	//Constructores
	public Cafetera() {
	}
	
	//Campos
	public float volumen;
	public float volumenVaso;
	public float volumenTaza;
	
	//Métodos
	
	//...setters

	public void setVolumen(float volumen) {
		this.volumen = volumen;
	}

	public void setVolumenVaso(float volumenVaso) {
		this.volumenVaso = volumenVaso;
	}


	public void setVolumenTaza(float volumenTaza) {
		this.volumenTaza = volumenTaza;
	}

	
	//..particulares
	public void servirTaza() {
		
		if (volumen<volumenTaza) {
			System.out.println("No hay suficiente agua para una taza de café.\n");
		}
		else {
			volumen-=volumenTaza;
			System.out.println("Taza de café servida.\n");
		}
	}
	
	public void servirVaso() {
		if (volumen<volumenVaso) {
			System.out.println("No hay suficiente agua para un vaso de café. Debe rellenar la cafetera.\n");
		}
		else {
			volumen-=volumenVaso;
			System.out.println("Vaso de café servido.\n");
		}
	}
	public void mostrar() {
		String texto;
		texto = "La cafetera tiene "+ volumen +" litros.\n"
				+"Cada taza de café consume "+ volumenTaza +" litros"
				+ " y cada vaso "+volumenVaso+" litros.\n";
		System.out.println(texto);
	}
	
	
}
