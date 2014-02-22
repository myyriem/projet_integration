/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GoldenCage.Dao;

import GoldenCage.entites.Prestataire;
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
public class PrestataireDAO extends ComptesDAO{
    
    
    public void insertClient(Comptes c,Prestataire p){
        
        super.insertCompte(c);        
        String requete = "insert into prestataire values (?,?,?)";
        try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
            ps.setInt(1, p.getIdPestataire());
            ps.setInt(2, p.getIdCompte());
            ps.setString(3, p.getNomEspacePrive());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erreur lors de l'insertion "+ex.getMessage());
        }
    }
    
    public void updateClient(Prestataire p){
        String requete = "update prestataire set nom=?,prenom=?,adresse=?,email=?,numTel=? where idCompte=?";
        try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
            ps.setString(1, p.getNom());
            ps.setString(2, p.getPrenom());
            ps.setString(3, p.getAdresse());
            ps.setString(4, p.getEmail());
            ps.setInt(5, p.getNumTel());
            ps.setInt(6, p.getIdCompte());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erreur lors de la mise à jour "+ex.getMessage());
        }
    }
    
     public void deleteClient(Prestataire c){
        String requete = "delete from prestataire where idPrestataire=?";
        try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
            ps.setInt(1, c.getIdPestataire());
            ps.executeUpdate();
            super.deleteCompte(c.getIdCompte());
            System.out.println("Prestataire supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erreur lors de la suppression "+ex.getMessage());
        }
    }
     
     public List<Comptes> afficherClient (){

        List<Comptes> comptePrestataire = new ArrayList<Comptes>();

        String requete = "select * from Comptes where typeCompte='PRESTATAIRE'";
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

                comptePrestataire.add(comp);
            }
            return comptePrestataire;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erreur lors du chargement des comptes des clients "+ex.getMessage());
            return null;
        }
    }
}
