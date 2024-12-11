package Week5.Databases2;
import java.sql.*;
public class StudentGradesSQLServer {
    String username = "username";
    String passwd = "password";

    // SQL Server connection details
    private static final String DB_URL =
            "jdbc:sqlserver://localhost:1433;databaseName=SchoolDB"; // Update your DB details
    private static final String DB_USER = "username"; // Replace with your username
    private static final String DB_PASSWORD = "password"; // Replace with your password

    // JDBC Connection
    private Connection conn = null;

    // Constructor to initialize the DB connection
    public StudentGradesSQLServer() {
        try {
            // Load the SQL Server JDBC driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Establish connection
            conn = DriverManager.getConnection(DB_URL, DB_USER,
                    DB_PASSWORD);
            System.out.println("Connected to SQL Server database successfully.");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertStudent(int studentId, String studentName, double grade) {
        String insertSQL = "INSERT INTO students (student_id, student_name, grade) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
            pstmt.setInt(1, studentId);
            pstmt.setString(2, studentName);
            pstmt.setDouble(3, grade);
            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new student record inserted successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

        public void getAllStudentGrades() {
            String selectSQL = "SELECT student_id, student_name, grade FROM students";
            try (PreparedStatement pstmt = conn.prepareStatement(selectSQL);
                 ResultSet rs = pstmt.executeQuery()) {
                System.out.println("Student Grades:");
                while (rs.next()) {
                    int studentId = rs.getInt("student_id");
                    String studentName = rs.getString("student_name");
                    double grade = rs.getDouble("grade");
                    System.out.println("ID: " + studentId + ", Name: " + studentName + ", Grade: " +
                            grade);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        // Close the DB connection
        public void closeConnection() {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                    System.out.println("Database connection closed.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public static void main(String[] args) {
            // Initialize the student grades management
            StudentGradesSQLServer studentGrades = new StudentGradesSQLServer();
            // Insert sample student data
            studentGrades.insertStudent(1, "John Doe", 88.5);
            studentGrades.insertStudent(2, "Jane Smith", 92.3);
            // Retrieve and display all student grades
            studentGrades.getAllStudentGrades();
            // Close the database connection
            studentGrades.closeConnection();
        }
}
