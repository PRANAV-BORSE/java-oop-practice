package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DataInsertionMain {

    public static void main(String[] args) {

        String sqlQuery = "insert into dept_copy values(?,?,?)";

        try (
            Connection dbConnection = JDBCUtils.obtainConnection();
            PreparedStatement pstmt = dbConnection.prepareStatement(sqlQuery)
        ) {

            pstmt.setInt(1, 50);
            pstmt.setString(2, "Finance");
            pstmt.setString(3, "Mumbai");
            int updateCount = pstmt.executeUpdate();
            System.out.println(updateCount + "Record inserted.");
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}