package connection;

import java.sql.*;
import java.util.logging.*;

/**
 *
 * @author Marko Milosevic
 */
public class MyConnection {

    private final static MyConnection instance = new MyConnection();
    private Connection connection;

    private MyConnection() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nutrition", "root", "marko");
        } catch (SQLException ex) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static MyConnection getInstance() {
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
