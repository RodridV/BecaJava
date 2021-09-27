package clases;

import java.util.ArrayList;
import interfaces.I_CRUD;

public class GestionCRUD<T1,T2> implements I_CRUD<T1,T2>
{
	//T1 es el tipo de datos del objeto, por ejemplo Alumno.
	//T2 es el tipo de datos del campo del objeto que lo identifica como único. Por ejemplo, el nº de matrícula del alumno
		
	//Constructores
	public GestionCRUD(){
		this.listado = new ArrayList<T1>();
	}
	
	//Campos
	ArrayList <T1> listado;

	@Override
	public void nuevo(T1 elemento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T1 leer(T2 id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<T1> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editar(T2 id, T1 item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(T1 item) {
		// TODO Auto-generated method stub
		
	}
	
	
}
