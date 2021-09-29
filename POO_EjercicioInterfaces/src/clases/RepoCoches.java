package clases;

import java.util.HashMap;
import interfaz.ICRUD;

public class RepoCoches implements ICRUD<Coches,String>
{
	//Constructor
	public RepoCoches() {
		this.lista_coches = new HashMap<String, Coches>();
	}

	//Campos
	public HashMap<String, Coches> lista_coches;

	
	//Métodos
	@Override
	public void nuevo(Coches clase) {
		this.lista_coches.put(clase.matricula,clase);
		System.out.println("Coche añadido a la lista.\n");
	}

	@Override
	public Coches leer(String id) {
		if (lista_coches.size()==0) {
			System.out.println("El listado de coches está vacío.\n");
		}
		else {
			Coches miCoche = this.lista_coches.get(id);
			System.out.println(miCoche.toString());
		}
	return null;
	}

	@Override
	public HashMap<String, Coches> listar() {
		if (lista_coches.size()==0) {
			System.out.println("El listado de coches está vacío.\n");
		}
		else {
			System.out.println("La lista de coches introducidos es la siguiente:\n"
					+ lista_coches.toString());
		}
		return null;
	}

	@Override
	public void editar(String id, Coches clase) {
		if (lista_coches.size()==0) {
			System.out.println("El listado de coches está vacío.\n");
		}
		else {
			this.lista_coches.put(id, clase);
			System.out.println("Editado con éxito.\n");
		}
		
	}

	@Override
	public void eliminar(String id) {
		if (this.lista_coches.remove(id)==null) {
			System.out.println("No se ha eliminado porque no se encuentra.\n");
		}	
		else {
			System.out.println("Eliminado con éxito.\n");
		}
	}
	
	
	

}
