package Week5.Databases;
import java.sql.*;

public class DatabaseClasswork {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String username = "username";
        String passwd = "password";

        Class.forName("oracle.jdbc.driver.OracleDriver");

        Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@oracle-prod:1521:OPROD", username, passwd);

        Statement stmt = con.createStatement();

        String createStudent = "Create table Student " + " (Id Integer not null, " + " Name VARCHAR(32), " + " Marks Integer)";
        stmt.executeUpdate(createStudent);

        String insertStudent = "Insert into Student values " + "(123456789, 'abc' ,100)"; // put string in single quotes for SQL
        stmt.executeUpdate(insertStudent);

        String queryStudent = "select * from Student";
        ResultSet rs = stmt.executeQuery(queryStudent);

        while (rs.next()) {
            int id = rs.getInt(" ID ");
            String name = rs.getString(" NAME ");
            int marks = rs.getInt(" MARKS ");
        }

        rs.close();
        stmt.close();
        con.close();
    }
}
