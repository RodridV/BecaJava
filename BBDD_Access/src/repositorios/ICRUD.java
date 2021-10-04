package repositorios;

import java.util.ArrayList;

public interface ICRUD<MODELO, PK> 
{
	ArrayList<MODELO> listar() throws Exception;
	MODELO leer(PK pk) throws Exception;
	
	void nuevo(MODELO modelo) throws Exception;
	void editar(PK pk, MODELO modelo) throws Exception;
	
	void eliminar(PK pk) throws Exception;
}
