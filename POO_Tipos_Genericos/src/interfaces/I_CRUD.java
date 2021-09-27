package interfaces;

import java.util.ArrayList;

//CRUD -> Create,Read,Update,Delete
public interface I_CRUD <T1, T2>
{ 
	//T1 es el tipo de datos del objeto, por ejemplo Alumno.
	//T2 es el tipo de datos del campo del objeto que lo identifica como único. Por ejemplo, el nº de matrícula del alumno
	
	void nuevo(T1 elemento);
	T1 leer(T2 id);		//id -> Identificación general y única
	ArrayList <T1> listar();
	void editar(T2 id,T1 item);		//Datos a modificar
	void eliminar (T1 item);
	
	
}
