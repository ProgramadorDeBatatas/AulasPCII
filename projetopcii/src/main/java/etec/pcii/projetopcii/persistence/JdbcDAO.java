package etec.pcii.projetopcii.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import etec.pcii.projetopcii.model.UsuarioSistema;

public class JdbcDAO<T> implements IDAO<T>{
	
	private String url = "jdbc:mysql://localhost:3306/escola";
	private String usuario_do_banco="root";
	private String senha="";
	private Class clazz;
	
	private String sqlInsertUsuario = "insert into sistema_usuario (login,senha)";
	private String sqlInsertPessoa = "insert into sistema_pessoa (nome_pessoa)";
	private Connection connection;
	
	public JdbcDAO() throws Exception{		
			System.out.println("public void JdbcDAO() throws Exception {...");
			this.clazz = clazz;
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, usuario_do_banco, senha);			
			System.out.println(connection);
	}
	
	public void inserir(T t) throws Exception {
		UsuarioSistema u = (UsuarioSistema)t;		
		System.out.println(u.getNome());
		String sql = this.sqlInsertPessoa + "values('"+u.getNome()+"');";
		System.out.println(sql);
		PreparedStatement prepareStatement = connection.prepareStatement(sql);
		prepareStatement.execute();
	}

	public void excluir(T t) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void alterar(T t) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
}
