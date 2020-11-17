

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	public class Test {
//		static Connection connetion = null;
		//static String databaseName = "college";
		static String url = "jdbc:mysql://localhost/college" ;
		static String username ="root";
		static String password="";
		
	 public static void main(String args[]) throws InstantiationException,ClassNotFoundException, SQLException {
		 Class.forName("com.mysql.jdbc.Driver");
		Connection connetion = DriverManager.getConnection(url,username,password);
		/* PreparedStatement ps =connetion.prepareStatement("SELECT * FROM 'students';");
		 int status = ps.executeUpdate();
		 if(status!= 0) {
			 System.out.println("Succesfull");
		 }*/
	 }
	}

