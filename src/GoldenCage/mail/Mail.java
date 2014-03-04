/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package goldencage.mail;

/**
 *
 * @author FGH
 */
public class Mail {
    
    private String emailEmetteur ;
    private String pwd ;
    private String emailRecepteur ; 
    private String emailObjet ;
    private String emailSujet ;

    public Mail() {
    }

    public Mail(String emailEmetteur, String pwd, String emailRecepteur, String emailObjet, String emailSujet) {
        this.emailEmetteur = emailEmetteur;
        this.pwd = pwd;
        this.emailRecepteur = emailRecepteur;
        this.emailObjet = emailObjet;
        this.emailSujet = emailSujet;
    }

    
    
    public String getEmailEmetteur() {
        return emailEmetteur;
    }

    public void setEmailEmetteur(String emailEmetteur) {
        this.emailEmetteur = emailEmetteur;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEmailRecepteur() {
        return emailRecepteur;
    }

    public void setEmailRecepteur(String emailRecepteur) {
        this.emailRecepteur = emailRecepteur;
    }

    public String getEmailObjet() {
        return emailObjet;
    }

    public void setEmailObjet(String emailObjet) {
        this.emailObjet = emailObjet;
    }

    public String getEmailSujet() {
        return emailSujet;
    }

    public void setEmailSujet(String emailSujet) {
        this.emailSujet = emailSujet;
    }
}
