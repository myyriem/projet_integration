/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GoldenCage.Dao;

import GoldenCage.entites.Comptes;
import GoldenCage.entites.Admin;
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
public class AdminDAO extends ComptesDAO{
    
    public void insertAdmin(Comptes c,Admin a){
        
        super.insertCompte(c);        
        String requete = "insert into admin values (?,?)";
        try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
            ps.setInt(1, a.getIdAdmin());
            ps.setInt(2, a.getIdCompte());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erreur lors de l'insertion "+ex.getMessage());
        }
    }
    
    public void updateadmin(Admin a){
        String requete = "update comptes set nom=?,prenom=?,adresse=?,email=?,numTel=? where idCompte=?";
        try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
            ps.setString(1, a.getNom());
            ps.setString(2, a.getPrenom());
            ps.setString(3, a.getAdresse());
            ps.setString(4, a.getEmail());
            ps.setInt(5, a.getNumTel());
            ps.setInt(6, a.getIdCompte());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erreur lors de la mise à jour "+ex.getMessage());
        }
    }
    
     public void deleteAdmin(Admin a){
        String requete = "delete from admin where idAdmin=?";
        try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
            ps.setInt(1, a.getIdAdmin());
            ps.executeUpdate();
            super.deleteCompte(a.getIdCompte());
            System.out.println("Admin supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erreur lors de la suppression "+ex.getMessage());
        }
    }
     
     public List<Comptes> afficherAdmin (){

        List<Comptes> compteadmin = new ArrayList<Comptes>();

        String requete = "select * from Comptes where typeCompte='ADMIN'";
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

                compteadmin.add(comp);
            }
            return compteadmin;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erreur lors du chargement des comptes des admin "+ex.getMessage());
            return null;
        }
    }
    
}
