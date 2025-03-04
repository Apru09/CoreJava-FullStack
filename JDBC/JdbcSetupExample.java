// 1. Import the required package.
import java.sql.*;

public class JdbcSetupExample {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        /* STEPS TO USE JDBC WITH JAVA APPLICATION
        *
        * Import packages.
        * Load and register driver.
        * Create connection.
        * Create statement.
        * Execute statement.
        * Process the result.
        * Close the connection.
        * */

        String url = "jdbc:postgresql://localhost:5432/demojdbc";
        String uName = "postgres";
        String pass = "root";
        String sql = "select sname from student where sid = 4";

        // 2. Loading and registering driver.
        Class.forName("org.postgresql.Driver");   // Optional from Java 6 (JDBC 4.0)

        // 3. Create a connection.
        Connection conn = DriverManager.getConnection(url, uName, pass);
        System.out.println("Connection Established.");

        // 4. Create a statement.
        Statement stmt = conn.createStatement();

        // 5. Execute statement.
        ResultSet query = stmt.executeQuery(sql);

        // 6. Process the result.
        query.next();
        String name = query.getString("sname");
        System.out.println(name);

        // 7. Close the connection.
        conn.close();
        System.out.println("Conection closed.");
    }
}
