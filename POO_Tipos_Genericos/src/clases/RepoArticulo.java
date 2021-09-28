package clases;

import java.util.ArrayList;
import java.util.HashMap;

import interfaces.I_CRUD;

public class RepoArticulo implements I_CRUD<Articulo, String>{

	//Constructor
	public RepoArticulo(){
		listado=new ArrayList<Articulo>();
	}
	
	//Campos
	public ArrayList<Articulo> listado;

	
	//Métodos
	@Override
	public void nuevo(Articulo clase) {
		listado.add(clase);
	}

	@Override
	public Articulo leer(String id) {
		
		Articulo miArticulo=null;
		
		for (int i=0;i<listado.size();i++) {
			miArticulo=listado.get(i);
			if (miArticulo.referencia.equals(id)==true) {
				break;
			}
		}
				
		return miArticulo;
	}

	@Override
	public ArrayList<Articulo> listar() {
		return listado;
	}

	@Override
	public void editar(String id, Articulo clase) {
		
		Articulo miArticulo=null;
		boolean ok=false;
		for (int i=0;i<listado.size();i++) {
			miArticulo=listado.get(i);
			
			if (miArticulo.referencia.equals(id)==true) {
				ok=true;
				listado.set(i, clase);
				break;
			}
		}
		if (ok) {
			System.out.println("Modificado.\n");
		}
		else {
			System.out.println("No se ha encontrado el artículo para modificar.\n");
		}
	}

	@Override
	public void eliminar(Articulo clase) {
		if(listado.remove(clase)) {		//Hemos rehecho el equals en Articulo
			System.out.println("Eliminado.\n");
		}
		else {
			System.out.println("No encontrado.\n");
		}
	}

	
	//Los dos siguientes vienen de cambiar cosas en RepoAlumno, por eso están vacíos.
	@Override
	public HashMap<String, Articulo> listar2() {
		return null;
	}

	@Override
	public void eliminar2(String id) {		
	}

}
