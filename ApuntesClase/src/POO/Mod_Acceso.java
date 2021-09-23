package POO;

public class Mod_Acceso { 		//Modificadores de Acceso; asociado a Vacaciones

	public static void main(String[] args)
	{
		Vacaciones vacacionesAlberto = new Vacaciones("Canarias",14,true);
		
		vacacionesAlberto.destino = "Canarias";
		
		vacacionesAlberto.mostrar();
		
	}

}
