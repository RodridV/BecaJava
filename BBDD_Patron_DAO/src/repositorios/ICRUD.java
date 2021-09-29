package repositorios;

import java.util.ArrayList;

public interface ICRUD<Modelo,PK> {

	ArrayList<Modelo> listar();
	Modelo leer(PK pk);
	
	void nuevo(Modelo modelo) throws Exception;
	void editar(PK pk, Modelo modelo);
	
	void eliminar(PK pk);
}
