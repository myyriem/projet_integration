/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GoldenCage.Dao;

import GoldenCage.entites.Comptes;
import GoldenCage.util.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author FGH
 */
public class ComptesDAO {

    public ComptesDAO() {
    }
    
    Crude cr = new Crude();

    public boolean insertCompte(Comptes c){
        String requete = "insert into comptes (nom,prenom,adresse,email,numTel,Pseudo,motDePasse,typeCompte) values "
                + "('"+c.getNom()+"','"+c.getPrenom()+"','"+c.getAdresse()+"','"+c.getEmail()+"',"+c.getNumTel()+",'"
                +c.getPseudo()+"','"+c.getMotDePasse()+"','"+c.getTypeCompte()+"')";
        return cr.insert(requete);
                  
    }


    public boolean updateCompte(Comptes c){
        String requete = "update comptes set nom='"+c.getNom()+"',prenom='"+c.getPrenom()+"',adresse='"
                +c.getAdresse()+"',email='"+c.getEmail()+"',numTel="+c.getNumTel()+",pseudo='"
                +c.getPseudo()+"',motDePass='"+c.getMotDePasse()+"' where idCompte="+c.getIdCompte();
        return cr.update(requete);
    }

    public boolean deleteCompte(int id){
        String requete = "delete from Comptes where idCompte="+id;
        return cr.delete(requete);
    }

    public List<Comptes> afficherComptes (){

        List<Comptes> listecomptes = new ArrayList<Comptes>();

        String requete = "select * from Comptes";
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

                listecomptes.add(comp);
            }
            return listecomptes;
        } catch (SQLException ex) {
            System.out.println("Erreur lors du chargement des comptes "+ex.getMessage());
            return null;
        }
    }
}
