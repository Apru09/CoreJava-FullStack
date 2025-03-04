import java.sql.*;

public class FetchAllRecords {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url = "jdbc:postgresql://localhost:5432/demojdbc";
        String uName = "postgres";
        String pass = "root";

        Class.forName("org.postgresql.Driver");

        Connection conn = DriverManager.getConnection(url, uName, pass);
        Statement stmt = conn.createStatement();

        // Retrieve
        String sql = "select * from student";
        ResultSet rs = stmt.executeQuery(sql);

        while(rs.next()) {
            System.out.print(rs.getInt("sid") + " - ");
            System.out.print(rs.getString("sname") + " - ");
            System.out.println(rs.getInt("smarks"));
        }

        conn.close();



    }
}
