package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ParametrizedQueryMain {

    public static void main(String[] args) {

        String sqlQuery = "SELECT dname, loc, deptno FROM dept WHERE deptno IN (?, ?)";

        try (
            Connection dbConnection = JDBCUtils.obtainConnection();
            PreparedStatement pstmt = dbConnection.prepareStatement(sqlQuery)
        ) {

            pstmt.setInt(1, 10);
            pstmt.setInt(2, 200);

            ResultSet rs = pstmt.executeQuery();

            boolean found = false;

            while (rs.next()) {
                found = true;

                String name = rs.getString(1);
                String location = rs.getString(2);
                int deptNo = rs.getInt(3);

                System.out.println(deptNo + " - " + name + " - " + location);
            }

            if (!found) {
                System.out.println("No records found.");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}