import java.sql.*;

public class CrudOperations {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url = "jdbc:postgresql://localhost:5432/demojdbc";
        String uName = "postgres";
        String pass = "root";

        Class.forName("org.postgresql.Driver");

        Connection conn = DriverManager.getConnection(url, uName, pass);
        Statement stmt = conn.createStatement();

        /*
            Run each of these operations in different class file or else error will be
            thrown. (Because insert statement will try to execute again but the row in the
            table already consists data).

            Also, I am inserting at id 8, because I manually inserted few rows through postgres
            query tool.

            Retrieve is performed in FetchAllRecords.java file.
        */


        // Create
        String insert = "insert into student values (8, 'Kiran', 100)";
        stmt.execute(insert);

        // Update
        String update = "update student set sname = 'Keetruck' where sid = 7";
        stmt.execute(update);

        // Delete
        String delete = "delete from student where sid = 7";
        stmt.execute(delete);

        conn.close();


    }
}
