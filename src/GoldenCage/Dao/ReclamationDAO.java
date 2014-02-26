/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GoldenCage.Dao;

import GoldenCage.Technique.Crude;
import GoldenCage.entites.Comptes;
import GoldenCage.entites.Reclamation;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Mounir
 */
public class ReclamationDAO {
     public ReclamationDAO() {
    }
    
    Crude cr = new Crude();
     public boolean insertReclamation(Reclamation r ,Comptes c){

        String requete = "insert into Reclamation (idreclamation,idcompte,texte,etat,datereclamation) values ("
                +r.getIdreclamation()+","+c.getIdCompte()+",'"+r.getTexte()+"','"
                +r.getEtat()+"','"+r.getDatereclamation()+"')";
        return cr.insert(requete);
    }
     public void updatereclamation(Reclamation r){
        String requete = "update reclamation set etat='"+r.getEtat()+"'" ;
        cr.update(requete);
     }
      public boolean deleteReclamation(int idreclamation){
        String requete = "delete from Reclamation where idreclamation="+idreclamation;
        return cr.delete(requete);
    }

      public List<Reclamation> afficherReclamation (){

        List<Reclamation> listereclamation = new ArrayList<Reclamation>();

        String requete = "select * from reclamation";
        try {
            
           ResultSet resultat = cr.list(requete);

            while(resultat.next()){
                Reclamation rec =new Reclamation();
                rec.setIdreclamation(resultat.getInt(1));
                rec.setTexte(resultat.getString(3));
                rec.setEtat(resultat.getString(4));
                rec.setDatereclamation(resultat.getDate(5));
                

                listereclamation.add(rec);
            }
            return listereclamation;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erreur lors du chargement des reclamations "+ex.getMessage());
            return null;
        }
    }
}
