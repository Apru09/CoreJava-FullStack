import java.sql.*;

public class PreparedStatementExample {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url = "jdbc:postgresql://localhost:5432/demojdbc";
        String uName = "postgres";
        String pass = "root";

        Class.forName("org.postgresql.Driver");

        Connection conn = DriverManager.getConnection(url, uName, pass);

        int sid = 9;
        String sname = "Pratyusha";
        int smarks = 91;

        String sql = "insert into student values (?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setInt(1, sid);
        pstmt.setString(2, sname);
        pstmt.setInt(3, smarks);

        pstmt.execute();

        conn.close();


    }
}
