package GoldenCage.Technique;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author HunterX
 */
public class MyConnection {

    /**
     * Déclaration des variables pour la connexion
     */
    
    private String url = "jdbc:mysql://localhost/goldencage";
    private String login = "root";
    private String pwd = "";
    private static MyConnection instance;
    public static Connection connection;

    private MyConnection() {
        try {
            connection = DriverManager.getConnection(url,login,pwd);
            
        } catch (SQLException ex) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Connection getConnection() {
        return connection;
    }

    public static MyConnection getInstance() {
        if(instance==null)
            instance = new MyConnection();
        return instance;
    }


}
