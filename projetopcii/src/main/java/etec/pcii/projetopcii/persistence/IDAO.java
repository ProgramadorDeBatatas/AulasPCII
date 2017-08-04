package etec.pcii.projetopcii.persistence;

public interface IDAO<T> {
	
	void inserir(T t) throws Exception;
	void excluir(T t) throws Exception;
	void alterar(T t) throws Exception;
	
}
