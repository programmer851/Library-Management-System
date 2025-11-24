import java.sql.*;

public class DB {
    static Connection con;

    public static Connection get() {
        try {
            if (con == null) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/librarydb",
                    "root",
                    "password"
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
