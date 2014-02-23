/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GoldenCage.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author FGH
 */
public class Crude {
    
    public Boolean insert(String sql){
        try {
            Statement statement = Connexion.getConnection().createStatement();
            statement.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erreur lors de l'insertion "+ex.getMessage());
            return false;
        }
    }
    
    public Boolean update(String sql){
        try {
            Statement statement = Connexion.getConnection().createStatement();
            statement.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erreur lors de l'insertion "+ex.getMessage());
            return false;
        }
    }
    
    public Boolean delete(String sql){
       try {
            Statement statement = Connexion.getConnection().createStatement();
            statement.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erreur lors de l'insertion "+ex.getMessage());
            return false;
        }
    }
    
    public ResultSet list(String sql){
       try {
            Statement statement = Connexion.getConnection().createStatement();
            ResultSet rs;
            rs = statement.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            System.out.println("Erreur lors de l'insertion "+ex.getMessage());
            return null;
        }
    }
    
}
