package clases;

public class Hamster extends Mascota	//Hacemos que herede de Mascota
{
	
	//Construcotres
	public Hamster() {
		super();		//Llama al constructor de la clase padre (el vac�o)
						//Igual que no ponerlo
	}
	
	public Hamster(String colorPelo, String marcaPienso,
				   String nombre, int edad)		//Recibe los par�metros de la clase padre (Mascota)
	{
		super(nombre,edad);	//LLamamos al constructor no vac�o
		//Siempre en la primera fila
		
		this.colorPelo = colorPelo;
		this.marcaPienso = marcaPienso;
	}
	
	//Campos
	public String colorPelo;
	public String marcaPienso;
}
