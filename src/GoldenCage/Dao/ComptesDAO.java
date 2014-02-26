/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GoldenCage.Dao;


import GoldenCage.Technique.Crude;
import GoldenCage.entites.Comptes;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author FGH
 */
public class ComptesDAO {
    

    public ComptesDAO() {
    }
    
    Crude cr = new Crude();

    public boolean insertCompte(Comptes c){
        String requete = "insert into comptes (nom,prenom,adresse,email,numtel,pseudo,motdepasse,typeCompte,urlphoto) values "
                + "('"+c.getNom()+"','"+c.getPrenom()+"','"+c.getAdresse()+"','"+c.getEmail()+"',"+c.getNumTel()+",'"
                +c.getPseudo()+"','"+c.getMotDePasse()+"','"+c.getTypeCompte()+"','"+c.getUrlphoto()+"')";
        return cr.insert(requete);
                  
    }


    public boolean updateCompte(Comptes c){
        String requete = "update comptes set nom='"+c.getNom()+"',prenom='"+c.getPrenom()+"',adresse='"
                +c.getAdresse()+"',email='"+c.getEmail()+"',numtel="+c.getNumTel()+",pseudo='"
                +c.getPseudo()+"',motdepass='"+c.getMotDePasse()+"',urlphoto='"+c.getUrlphoto()+"' where idCompte="+c.getIdCompte();
        return cr.update(requete);
    }

    public boolean deleteCompte(int id){
        String requete = "delete from comptes where idcompte="+id;
        return cr.delete(requete);
    }

    public List<Comptes> afficherComptes (){

        List<Comptes> listecomptes = new ArrayList<Comptes>();

        String requete = "select * from comptes";
        try {
            
            ResultSet rs = cr.list(requete);

            while(rs.next()){
                Comptes e=new Comptes();
               e.setIdCompte(rs.getInt("idcompte"));
                e.setNom(rs.getString("nom"));
                e.setPrenom(rs.getString("prenom"));
                e.setEmail(rs.getString("email"));
                e.setNumTel(rs.getInt("numtel"));
                e.setPseudo(rs.getString("pseudo"));
                e.setMotDePasse(rs.getString("motdepasse"));
                e.setUrlphoto(rs.getString("urlphoto"));
                e.setTypeCompte(rs.getString("typeCompte"));
               

                listecomptes.add(e);
            }
            return listecomptes;
        } catch (SQLException ex) {
            System.out.println("Erreur lors du chargement des comptes "+ex.getMessage());
            return null;
        }
    }
    
    
    
    
    public Comptes Authentification(String pseudo,String motDePasse) {//pseudo motDePasse

        try {
            String sql = "SELECT * FROM comptes WHERE pseudo='"+pseudo+"' AND motdepasse='"+motDePasse+"'";
            
            ResultSet rs = cr.list(sql);
            Comptes e = null; 
            while (rs.next()) {
                e = new Comptes();
                e.setIdCompte(rs.getInt("idcompte"));
                e.setNom(rs.getString("nom"));
                e.setPrenom(rs.getString("prenom"));
                e.setAdresse(rs.getString("adresse"));
                e.setEmail(rs.getString("email"));
                e.setNumTel(rs.getInt("numtel"));
                e.setPseudo(rs.getString("pseudo"));
                e.setMotDePasse(rs.getString("motdepasse"));
                e.setTypeCompte(rs.getString("typeCompte"));
                e.setUrlphoto(rs.getString("urlphoto"));
                
               
                
               
            }
            return e;

        } catch (SQLException ex) {
            Logger.getLogger(ComptesDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public List<Comptes> findByType (String type ){

        List<Comptes> compteadmin = new ArrayList<Comptes>();

        String requete = "select * from comptes where typeCompte='"+type+"'";
        
        try {
           
            ResultSet rs = cr.list(requete);

            while(rs.next()){
                Comptes e =new Comptes();
                e.setIdCompte(rs.getInt("idcompte"));
                e.setNom(rs.getString("nom"));
                e.setPrenom(rs.getString("prenom"));
                e.setEmail(rs.getString("email"));
                e.setNumTel(rs.getInt("numtel"));
                e.setPseudo(rs.getString("pseudo"));
                e.setMotDePasse(rs.getString("motdepasse"));
                e.setUrlphoto(rs.getString("urlphoto"));
                e.setTypeCompte(rs.getString("typeCompte"));
               

                compteadmin.add(e);
            }
            return compteadmin;
        } catch (SQLException ex) {
            System.out.println("Erreur lors du chargement des comptes des admin "+ex.getMessage());
            return null;
        }
        
    }




}
