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
public class Comptes {
    private int idCompte;
    private String nom;
    private String prenom;
    private String email;
    private String adresse;
    private int numTel;
    private String typeCompte;
    private String pseudo;
    private String motDePasse;
    private String urlphoto;
    private String datenaissance;

    public Comptes(int idCompte, String nom, String prenom, String email, String adresse, int numTel, String typeCompte, String pseudo, String motDePasse,String datenaissance,String urlphoto) {
        this.idCompte = idCompte;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.adresse = adresse;
        this.numTel = numTel;
        this.typeCompte = typeCompte;
        this.pseudo = pseudo;
        this.motDePasse = motDePasse;
        this.urlphoto=urlphoto;
        this.datenaissance=datenaissance;
    }

    public Comptes() {
        
    }

    public int getIdCompte() {
        return idCompte;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getNumTel() {
        return numTel;
    }

    public String getTypeCompte() {
        return typeCompte;
    }

    public String getPseudo() {
        return pseudo;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setIdCompte(int idCompte) {
        this.idCompte = idCompte;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setNumTel(int numTel) {
        this.numTel = numTel;
    }

    public void setTypeCompte(String typeCompte) {
        this.typeCompte = typeCompte;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getUrlphoto() {
        return urlphoto;
    }

    public void setUrlphoto(String urlphoto) {
        this.urlphoto = urlphoto;
    }

    public String getDatenaissance() {
        return datenaissance;
    }

    public void setDatenaissance(String datenaissance) {
        this.datenaissance = datenaissance;
    }


    
    
    
    
    
}
