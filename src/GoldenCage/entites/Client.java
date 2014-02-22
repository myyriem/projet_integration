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
public class Client extends Comptes{
    
    private int idClient;

    public Client(int idCompte, String nom, String prenom, String email, String adresse, int numTel, String typeCompte, String pseudo, String motDePasse, int idClient) {
        super(idCompte, nom, prenom, email, adresse, numTel, typeCompte, pseudo, motDePasse);
        this.idClient=idClient;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }
    
}
