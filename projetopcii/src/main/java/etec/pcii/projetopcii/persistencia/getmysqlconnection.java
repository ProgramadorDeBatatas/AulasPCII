package etec.pcii.projetopcii.persistencia;

public class getmysqlconnection {
	 
	public Connection getMysqlConnection() throws Exception{
		String stringConnection = "jdbc:mysql://localhost:3306/escola";
		Class.forName("com.mysql.jdbc.Driver");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
