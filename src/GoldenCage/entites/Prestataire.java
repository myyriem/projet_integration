/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GoldenCage.entites;

/**
 *
 * @author FGH
 */
public class Prestataire extends Comptes{
    
    private int idPestataire ;
    private String nomEspacePrive;

    public Prestataire(int idCompte, String nom, String prenom, String email, String adresse, int numTel, String typeCompte, String pseudo, String motDePasse,int idPestataire,String nomEspacePrive) {
        super(idCompte, nom, prenom, email, adresse, numTel, typeCompte, pseudo, motDePasse);
        this.idPestataire=idPestataire;
        this.nomEspacePrive=nomEspacePrive;
        
        
    }

    public int getIdPestataire() {
        return idPestataire;
    }

    public String getNomEspacePrive() {
        return nomEspacePrive;
    }

    public void setIdPestataire(int idPestataire) {
        this.idPestataire = idPestataire;
    }

    public void setNomEspacePrive(String nomEspacePrive) {
        this.nomEspacePrive = nomEspacePrive;
    }
    
}
