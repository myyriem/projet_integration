/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entite;

/**
 *
 * @author Le chiffre
 */
public class Administrateur {
    private int Id_Admin;
    private String Nom_Admin; 
    private String Prenom_Admin;
    private String Mail_Admin;
    private int Tel_Admin;
    private String Login_Admin;
    private String Pwd_Admin;
    
    
    
     public Administrateur() {
    }
     
     
      public Administrateur(String Nom_Admin, String Prenom_Admin, String Mail_Admin, int Tel_Admin,int Id_Admin, String Login_Admin, String Pwd_Admin) {
        this.Nom_Admin = Nom_Admin;
        this.Prenom_Admin = Prenom_Admin;
        this.Mail_Admin = Mail_Admin;
        this.Tel_Admin = Tel_Admin;
        this.Login_Admin = Login_Admin;
        this.Pwd_Admin = Pwd_Admin;
        this.Id_Admin= Id_Admin;
    }

    public int getId_Admin() {
        return Id_Admin;
    }

    public void setId_Admin(int Id_Admin) {
        this.Id_Admin = Id_Admin;
    }

    public String getNom_Admin() {
        return Nom_Admin;
    }

    public void setNom_Admin(String Nom_Admin) {
        this.Nom_Admin = Nom_Admin;
    }

    public String getPrenom_Admin() {
        return Prenom_Admin;
    }

    public void setPrenom_Admin(String Prenom_Admin) {
        this.Prenom_Admin = Prenom_Admin;
    }

    public String getMail_Admin() {
        return Mail_Admin;
    }

    public void setMail_Admin(String Mail_Admin) {
        this.Mail_Admin = Mail_Admin;
    }

    public int getTel_Admin() {
        return Tel_Admin;
    }

    public void setTel_Admin(int Tel_Admin) {
        this.Tel_Admin = Tel_Admin;
    }

    public String getLogin_Admin() {
        return Login_Admin;
    }

    public void setLogin_Admin(String Login_Admin) {
        this.Login_Admin = Login_Admin;
    }

    public String getPwd_Admin() {
        return Pwd_Admin;
    }

    public void setPwd_Admin(String Pwd_Admin) {
        this.Pwd_Admin = Pwd_Admin;
    }

   

   
    
   
    
      
      
   
   
}

