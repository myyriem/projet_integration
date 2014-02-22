/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GoldenCage.Dao;

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
public class ComptesDAO {
    
    
    public void insertCompte(Comptes c){

        String requete = "insert into comptes (nom,prenom,adresse,email,numTel,Pseudo,motDePasse,typeCompte) values (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
            ps.setString(1, c.getNom());
            ps.setString(2, c.getPrenom());
            ps.setString(3, c.getAdresse());
            ps.setString(4, c.getEmail());
            ps.setInt(5, c.getNumTel());
            ps.setString(6, c.getPseudo());
            ps.setString(7, c.getMotDePasse());
            ps.setString(8, c.getTypeCompte());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erreur lors de l'insertion "+ex.getMessage());
        }
    }


    public void updateCompte(Comptes c){
        String requete = "update comptes set nom=?,prenom=?,adresse=?,email=?,numTel=? where idCompte=?";
        try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
            ps.setString(1, c.getNom());
            ps.setString(2, c.getPrenom());
            ps.setString(3, c.getAdresse());
            ps.setString(4, c.getEmail());
            ps.setInt(5, c.getNumTel());
            ps.setInt(6, c.getIdCompte());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erreur lors de la mise à jour "+ex.getMessage());
        }
    }

    public void deleteCompte(int id){
        String requete = "delete from Comptes where idCompte=?";
        try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Compte supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erreur lors de la suppression "+ex.getMessage());
        }
    }

    public List<Comptes> afficherComptes (){

        List<Comptes> listecomptes = new ArrayList<Comptes>();

        String requete = "select * from Comptes";
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

                listecomptes.add(comp);
            }
            return listecomptes;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erreur lors du chargement des comptes "+ex.getMessage());
            return null;
        }
    }
}
