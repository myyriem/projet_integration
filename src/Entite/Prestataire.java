/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and op  en the template in the editor.
 */

package Entite;

/**
 *
 * @author Le chiffre
 */
public class Prestataire {
    
         
    private int Id_Prestataire;
    private String Nom_Prestataire;
    private String Prenom_Prestataire;
    private String Mail_Prestataire;
    private int Tel_Prestataire;
    private String Login_Prestataire;
    private String Pwd_Prestataire;
    private String Adresse;
    
    
     public Prestataire() {
    }
     
     
      public Prestataire(String Nom_Prestataire,String Adresse, String Prenom_Prestataire, String Mail_Prestataire, int Tel_Prestataire,int Id_Prestataire, String Login_Prestataire, String Pwd_Prestataire) {
        this.Nom_Prestataire = Nom_Prestataire;
        this.Prenom_Prestataire = Prenom_Prestataire;
        this.Mail_Prestataire = Mail_Prestataire;
        this.Tel_Prestataire = Tel_Prestataire;
        this.Login_Prestataire= Login_Prestataire;
        this.Pwd_Prestataire = Pwd_Prestataire;
        this.Id_Prestataire= Id_Prestataire;
        this.Adresse=Adresse;
      

        
    }

    public int getId_Prestataire() {
        return Id_Prestataire;
    }

    public void setId_Prestataire(int Id_Prestataire) {
        this.Id_Prestataire = Id_Prestataire;
    }

    public String getNom_Prestataire() {
        return Nom_Prestataire;
    }

    public void setNom_Prestataire(String Nom_Prestataire) {
        this.Nom_Prestataire = Nom_Prestataire;
    }

    public String getPrenom_Prestataire() {
        return Prenom_Prestataire;
    }

    public void setPrenom_Prestataire(String Prenom_Prestataire) {
        this.Prenom_Prestataire = Prenom_Prestataire;
    }

    public String getMail_Prestataire() {
        return Mail_Prestataire;
    }

    public void setMail_Prestataire(String Mail_Prestataire) {
        this.Mail_Prestataire = Mail_Prestataire;
    }

    public int getTel_Prestataire() {
        return Tel_Prestataire;
    }

    public void setTel_Prestataire(int Tel_Prestataire) {
        this.Tel_Prestataire = Tel_Prestataire;
    }

    public String getLogin_Prestataire() {
        return Login_Prestataire;
    }

    public void setLogin_Prestataire(String Login_Prestataire) {
        this.Login_Prestataire = Login_Prestataire;
    }

    public String getPwd_Prestataire() {
        return Pwd_Prestataire;
    }

    public void setPwd_Prestataire(String Pwd_Prestataire) {
        this.Pwd_Prestataire = Pwd_Prestataire;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }
    
    
}
