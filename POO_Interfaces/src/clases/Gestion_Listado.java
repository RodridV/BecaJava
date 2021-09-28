package clases;

import java.util.ArrayList;
//import java.util.Collections;

import interfaces.IGestionListado;

public class Gestion_Listado implements IGestionListado
{
	//Constructores
	public Gestion_Listado() {
		this.lista=new ArrayList<Integer>();
	}
	
	//Campos
	public ArrayList<Integer> lista;
	
	//Métodos
	
	@Override
	public void nuevo(int numero) {
		if(this.lista.size()==4) {
			System.out.println("El listado está lleno. No se puede introducir el número. \n");
		}
		else if (this.lista.contains(numero)) {
			System.out.println("El número es repetido. No se puede introducir el número.\n");
		}
		else {
			lista.add(numero);
		}
	}

	@Override
	public void listar() {
		if (lista.size()==0) {
			System.out.println("Listado vacío.\n");
		}
		else {
			//Collections.sort(lista);	//Lo ordenamos de menor a mayor
			lista.sort(null);
			System.out.println("La lista de números es:");
			System.out.println(lista+"\n");
		}
	}

	@Override
	public void eliminar(Integer numero) {		//Le ponemos Integer para que no use el int en el remove (que elimina la posición)
		if (lista.remove(numero)==true) {		//Eliminamos el número y lo mostramos
			System.out.println("El número "+numero+" ha sido eliminado.\n");
		}
		else {
			System.out.println("El número que desea eliminar no se encuentra en el listado.\n");
		}
	}

	@Override
	public void eliminar() {
		lista.clear();
		System.out.println("Se ha eliminado el contenido del listado.\n");
	}
	
}
