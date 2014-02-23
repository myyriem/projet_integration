/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GoldenCage.Dao;

import GoldenCage.entites.Comptes;
import GoldenCage.entites.Admin;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List; 

/**
 *
 * @author FGH
 */
public class AdminDAO extends ComptesDAO{
    
    public void insertAdmin(Comptes c,Admin a){
        
        super.insertCompte(c);        
        String requete = "insert into admin values ("+a.getIdAdmin()+","+a.getIdCompte()+")";
        cr.insert(requete);
    }
    
    public void updateadmin(Admin a){
        String requete = "update comptes set nom='"+a.getNom()+"',prenom='"+a.getPrenom()+"',adresse='"
                +a.getAdresse()+"',email='"+a.getEmail()+"',numTel="+a.getNumTel()+",pseudo='"
                +a.getPseudo()+"',motDePass='"+a.getMotDePasse()+"' where idCompte="+a.getIdCompte();
        cr.update(requete);
    }
    
     public void deleteAdmin(Admin a){
        String requete = "delete from admin where idAdmin="+a.getIdAdmin();
        cr.delete(requete);
    }
     
     public List<Comptes> afficherAdmin (){

        List<Comptes> compteadmin = new ArrayList<Comptes>();

        String requete = "select * from Comptes where typeCompte='ADMIN'";
        try {
           
            ResultSet resultat = cr.list(requete);

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
            System.out.println("Erreur lors du chargement des comptes des admin "+ex.getMessage());
            return null;
        }
    }
    
}
