package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtils {
	
	public static Connection obtainConnection() throws Exception {
		
	
	String URL = "jdbc:mysql://localhost:3306/cdac?useSSL=false";
	String userName = "root";
	String password = "root";
	
	return DriverManager.getConnection(URL, userName, password);
	
	}
}
