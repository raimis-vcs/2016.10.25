package lt.vcs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Cukrus
 */
public class DbUtils {
    
    public static Connection newCon(String url, String user, String pass) throws SQLException {
        VcsUtils.println("kuriam connectiona");
        return DriverManager.getConnection(url, user, pass);
    }
    
    public static Statement newStatement(Connection conn, boolean updatable) throws SQLException {
        if (updatable) {
            return conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        } else {
            return conn.createStatement();
        }
    }
    
}
