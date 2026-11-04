package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DataRetreivalMain {

	public static void main(String[] args)  {
		//1. Load the driver.
		String DriverClassName = "com.mysql.cj.jdbc.Driver";//java.lang.String
		Connection dbConnection = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName(DriverClassName);
			System.out.println("Driver Loaded.");
			
		//2. Establish Connection.
			String URL = "jdbc:mysql://localhost:3306/cdac?useSSL=false";
			String userName = "root";
			String password = "root";
			
			dbConnection = DriverManager.getConnection(URL, userName, password);
			System.out.println("Connection Established.");
			
		//3. Obtain Statement.
			stmt = dbConnection.createStatement();
			
		//4.Execute Sql Query.
			String sqlQuery = "Select dname,loc,deptno from dept";
			rs = stmt.executeQuery(sqlQuery);
			
			while(rs.next()) {
				String name = rs.getString(1);
				String location = rs.getString(2);
				int deptNo = rs.getInt(3);
				System.out.println(deptNo + " - " + name + " - " + location);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				rs.close();
				stmt.close();
				dbConnection.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}