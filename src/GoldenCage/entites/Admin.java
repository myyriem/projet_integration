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
public class Admin extends Comptes{

    private int idAdmin;
    
    public Admin(int idCompte, String nom, String prenom, String email, String adresse, int numTel, String typeCompte, String pseudo, String motDePasse, int idAdmin) {
        super(idCompte, nom, prenom, email, adresse, numTel, typeCompte, pseudo, motDePasse);
        this.idAdmin=idAdmin;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }
    
    
    
}
