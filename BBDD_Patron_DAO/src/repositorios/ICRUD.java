package repositorios;

public interface ICRUD<Modelo,PK> {

	void listar() throws Exception;
	
	Modelo leer(PK pk) throws Exception;
	
	void nuevo(Modelo modelo) throws Exception;
	
	void editar(PK pk) throws Exception;
	
	void eliminar(PK pk) throws Exception;;
}
