/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GoldenCage.Dao;

import GoldenCage.entites.Client;
import GoldenCage.entites.Comptes;
import GoldenCage.util.Connexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FGH
 */
public class ClientDAO extends ComptesDAO{
    
    
    public void insertClient(Comptes c,Client clt){
        
        super.insertCompte(c);        
        String requete = "insert into client values (?,?)";
        try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
            ps.setInt(1, clt.getIdClient());
            ps.setInt(2, clt.getIdCompte());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erreur lors de l'insertion "+ex.getMessage());
        }
    }
    
    public void updateClient(Client clt){
        String requete = "update comptes set nom=?,prenom=?,adresse=?,email=?,numTel=? where idCompte=?";
        try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
            ps.setString(1, clt.getNom());
            ps.setString(2, clt.getPrenom());
            ps.setString(3, clt.getAdresse());
            ps.setString(4, clt.getEmail());
            ps.setInt(5, clt.getNumTel());
            ps.setInt(6, clt.getIdCompte());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erreur lors de la mise à jour "+ex.getMessage());
        }
    }
    
     public void deleteClient(Client c){
        String requete = "delete from client where idClient=?";
        try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
            ps.setInt(1, c.getIdClient());
            ps.executeUpdate();
            super.deleteCompte(c.getIdCompte());
            System.out.println("Client supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erreur lors de la suppression "+ex.getMessage());
        }
    }
     
     public List<Comptes> afficherClient (){

        List<Comptes> compteClient = new ArrayList<Comptes>();

        String requete = "SELECT * FROM  comptes WHERE typeCompte =  'CLIENT'";
        try {
           Statement statement = Connexion.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Comptes comp =new Comptes();
                comp.setIdCompte(resultat.getInt(1));
                comp.setNom(resultat.getString(2));
                comp.setPrenom(resultat.getString(3));
                comp.setAdresse(resultat.getString(4));
                comp.setEmail(resultat.getString(5));
                comp.setNumTel(resultat.getInt(6));

                compteClient.add(comp);
            }
            return compteClient;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erreur lors du chargement des comptes des clients "+ex.getMessage());
            return null;
        }
    }
}
