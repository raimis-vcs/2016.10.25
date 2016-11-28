package lt.vcs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "vcstestas";
        String userName = "root";
        String password = "";
        Connection conn = DbUtils.newCon(url + dbName, userName, password);
        println("valio, prisijungem prie " + dbName + " DB!");
        Statement st = DbUtils.newStatement(conn, true);
//        int pakito = st.executeUpdate("insert into hobby VALUES(7,'bevardis','bevardzio hobis')");
//        println("suinsertinom " + pakito + " eiluciu");
        ResultSet rs = st.executeQuery("select * from person");
        println("person lenteles duomenys PRIES UPDATE");
        println("| ak | name | lastname | age | pet_id |");
        while (rs.next()) {
            println("| " + rs.getInt(1)
                    + " | " + rs.getString("name")
                    + " | " + rs.getString("lastname")
                    + " | " + rs.getInt("age")
                    + " | " + rs.getInt("pet_id"));
        }
        
        rs.absolute(3);
        rs.updateString("lastname", "sabonis-vasia");
        rs.updateRow();
        
//        rs.moveToInsertRow();
//        rs.updateInt(1, 7);
//        rs.updateString("name", "lucky");
//        rs.updateString("lastname", "seven");
//        rs.updateInt("age", 77);
//        rs.insertRow();
        
        rs.absolute(2);
        rs.deleteRow();
        
        rs.beforeFirst();
        println("person lenteles duomenys PO UPDATE");
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
    
    
    //sukurti klase DbUtils, kuri turetu 2 metodus:
    //1) public static Connection newCon(String url, String user, String pass) throws SQLException
    //2) public static Statement newStatement(Connection conn, boolean updatable) throws SQLException
    
}
