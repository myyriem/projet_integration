/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GoldenCage.Dao;

import GoldenCage.entites.Prestataire;
import GoldenCage.entites.Comptes;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FGH
 */
public class PrestataireDAO extends ComptesDAO{
    
    public boolean insertPrestataire(Comptes c,Prestataire p){
        
        super.insertCompte(c);        
        String requete = "insert into prestataire values ("+p.getIdPestataire()+","+p.getIdCompte()+","+p.getNomEspacePrive()+")";
        return cr.insert(requete);
                  
    }

     
    public boolean updatePrestataire(Prestataire p){
        String requete = "update comptes set nom='"+p.getNom()+"',prenom='"+p.getPrenom()+"',adresse='"
                +p.getAdresse()+"',email='"+p.getEmail()+"',numTel="+p.getNumTel()+",pseudo='"
                +p.getPseudo()+"',motDePass='"+p.getMotDePasse()+"' where idCompte="+p.getIdCompte();
        
        return cr.update(requete);
    }
    
     public boolean deletePrestataire(Prestataire p){
        String requete = "delete from prestataire where idPrestataire="+p.getIdPestataire();
        return cr.delete(requete);
    }
     
     public List<Comptes> afficherPrestataire (){

        List<Comptes> comptePrestataire = new ArrayList<Comptes>();

        String requete = "select * from Comptes where typeCompte='PRESTATAIRE'";
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

                comptePrestataire.add(comp);
            }
            return comptePrestataire;
        } catch (SQLException ex) {
            System.out.println("Erreur lors du chargement des comptes des clients "+ex.getMessage());
            return null;
        }
    }
}
