import java.sql.*;

public class BookDAO {

    public static void add(int id, String title, String author) {
        try {
            Connection con = DB.get();
            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO books VALUES(?,?,?,false)"
            );
            ps.setInt(1,id);
            ps.setString(2,title);
            ps.setString(3,author);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
