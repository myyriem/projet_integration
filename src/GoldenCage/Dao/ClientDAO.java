/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GoldenCage.Dao;

import GoldenCage.entites.Client;
import GoldenCage.entites.Comptes;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FGH
 */
public class ClientDAO extends ComptesDAO{
    
    
    public Boolean insertClient(Comptes c,Client clt){
        
        super.insertCompte(c);        
        String requete = "insert into client values ("+clt.getIdClient()+","+c.getIdCompte()+")";
        return cr.insert(requete);
    }
    
    public Boolean updateClient(Client clt){
        String requete = "update comptes set nom='"+clt.getNom()+"',prenom='"+clt.getPrenom()+"',adresse='"
                +clt.getAdresse()+"',email='"+clt.getEmail()+"',numTel="+clt.getNumTel()+",pseudo='"
                +clt.getPseudo()+"',motDePass='"+clt.getMotDePasse()+"' where idCompte="+clt.getIdCompte();
        return cr.update(requete);
    }
    
     public Boolean deleteClient(Client clt){
        String requete = "delete from client where idClient="+clt.getIdClient();
        return cr.delete(requete);
    }
     
     public List<Comptes> afficherClient (){

        List<Comptes> compteClient = new ArrayList<Comptes>();

        String requete = "SELECT * FROM  comptes WHERE typeCompte ='CLIENT'";
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

                compteClient.add(comp);
            }
            return compteClient;
        } catch (SQLException ex) {
            System.out.println("Erreur lors du chargement des comptes des clients "+ex.getMessage());
            return null;
        }
    }
}
