package POO;

public class Vacaciones {		//Asociado a Mod_Acceso

	//Constructores
	public Vacaciones(String destino, int dias, boolean playa)
	{
		this.destino = destino;
		this.dias = dias;
		this.playa = playa;
	}

	public Vacaciones() {
	}
	
	
	//Campos
	protected String destino;
	public int dias;
	public boolean playa;
	
	//protected -> híbrido privado y público. Público porque se puede heredar (si la clase está en el mismo paquete) y privado porque desde el objeto solicitar.
	
	
	public void mostrar() {
		String texto;
		
		/*
		texto= "Días: "+this.dias+"\n"
				+"Destino: "+this.destino+"\n"
				+"Playa: "+ ((this.playa==true)?"si":"no");
		*/
		
		texto= "Días: "+this.dias+"\n"
				+"Destino: "+this.destino+"\n";
		if (this.playa==true){
			texto= texto+ "Playa: si";
		}
		else if(this.playa==false){
			texto=texto+ "Playa: no";
		}
		
		System.out.println(texto);
		
	}
	
	
}
