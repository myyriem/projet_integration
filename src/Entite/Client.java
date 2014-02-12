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
public class Client {
    
    private int Id_Client;
    private String Nom_Client;
    private String Prenom_Client;
    private String Mail_Client;
    private String Login_Client;
    private String Pwd_Client;
    
    
    
     public Client() {
    }
     
     
      public Client(String Nom_Client, String Prenom_Client, String Mail_Client, int Id_Client, String Login_Client, String Pwd_Client) {
        this.Nom_Client = Nom_Client;
        this.Prenom_Client = Prenom_Client;
        this.Mail_Client = Mail_Client;
        this.Login_Client= Login_Client;
        this.Pwd_Client = Pwd_Client;
        this. Id_Client= Id_Client;
    
}

    public int getId_Client() {
        return Id_Client;
    }

    public void setId_Client(int Id_Client) {
        this.Id_Client = Id_Client;
    }

    public String getNom_Client() {
        return Nom_Client;
    }

    public void setNom_Client(String Nom_Client) {
        this.Nom_Client = Nom_Client;
    }

    public String getPrenom_Client() {
        return Prenom_Client;
    }

    public void setPrenom_Client(String Prenom_Client) {
        this.Prenom_Client = Prenom_Client;
    }

    public String getMail_Client() {
        return Mail_Client;
    }

    public void setMail_Client(String Mail_Client) {
        this.Mail_Client = Mail_Client;
    }

    public String getLogin_Client() {
        return Login_Client;
    }

    public void setLogin_Client(String Login_Client) {
        this.Login_Client = Login_Client;
    }

    public String getPwd_Client() {
        return Pwd_Client;
    }

    public void setPwd_Client(String Pwd_Client) {
        this.Pwd_Client = Pwd_Client;
    }
      
}
