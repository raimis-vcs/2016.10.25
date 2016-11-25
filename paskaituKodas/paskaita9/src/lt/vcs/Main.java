package lt.vcs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static lt.vcs.VcsUtils.*;

/**
 *
 * @author Cukrus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "vcstestas";
        String userName = "root";
        String password = "";
        Connection conn = DriverManager.getConnection(
                url + dbName, userName, password);
        println("valio, prisijungem prie " + dbName + " DB!");
        Statement st = conn.createStatement();
//        int pakito = st.executeUpdate("insert into hobby VALUES(7,'bevardis','bevardzio hobis')");
//        println("suinsertinom " + pakito + " eiluciu");
        ResultSet rs = st.executeQuery("select * from person");
        println("person lenteles duomenys");
        println("| ak | name | lastname | age | pet_id |");
        while (rs.next()) {
            println("| " + rs.getInt(1)
                    + " | " + rs.getString("name")
                    + " | " + rs.getString("lastname")
                    + " | " + rs.getInt("age")
                    + " | " + rs.getInt("pet_id"));
        }
        conn.close();
    }
    
}
