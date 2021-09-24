package clases;

public class Hamster extends Mascota	//Hacemos que herede de Mascota
{
	
	//Construcotres
	public Hamster() {
		super();		//Llama al constructor de la clase padre (el vacío)
						//Igual que no ponerlo
	}
	
	public Hamster(String colorPelo, String marcaPienso,
				   String nombre, int edad)		//Recibe los parámetros de la clase padre (Mascota)
	{
		super(nombre,edad);	//LLamamos al constructor no vacío
		//Siempre en la primera fila
		
		this.colorPelo = colorPelo;
		this.marcaPienso = marcaPienso;
	}
	
	//Campos
	public String colorPelo;
	public String marcaPienso;
	
	//Métodos
	
	//...redefinidos
	@Override
	public String toString() {
		String texto;

		texto = super.toString() //Llamamos al toString() de Mascota
				+ "Color de pelo: "+this.colorPelo+"\n"
				+"Marca de pienso: "+this.marcaPienso+"\n";
		return texto;
	}
	
}
