package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DataUpdationMain {

    public static void main(String[] args) {

    	String sqlQuery = "update dept_copy set dname = ?, loc = ? where deptno = ?";

        try (
            Connection dbConnection = JDBCUtils.obtainConnection();
            PreparedStatement pstmt = dbConnection.prepareStatement(sqlQuery)
        ) {

            pstmt.setInt(3, 50);
            pstmt.setString(1, "Finance");
            pstmt.setString(2, "Mumbai City");
            int updateCount = pstmt.executeUpdate();
            System.out.println(updateCount + "Record Updated.");
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}