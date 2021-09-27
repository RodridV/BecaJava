package interfaces;

public interface IGestionListado {
	
	//public abstract void nuevo(); //abstracto -> No tiene llaves ni código dentro
	
	void nuevo(int numero);
	void listar();
	void eliminar(Integer numero);
	void eliminar();
	
}