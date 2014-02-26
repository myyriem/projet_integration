/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GoldenCage.entites;

import java.util.Date;

/**
 *
 * @author Mounir
 */
public class Reclamation {
    
     private int idreclamation;
    private String texte;
    private String etat;
    private Date datereclamation;
    private int idcompte;
    
    
     public Reclamation(int idreclamation,int idcompte, String texte, String etat, Date date) {
        this.idreclamation = idreclamation;
        this.texte = texte;
        this.etat = etat;
        this.datereclamation = date;
        this.idcompte=idcompte;
    }

    public Reclamation() {
    }

    public int getIdreclamation() {
        return idreclamation;
    }

    public void setIdreclamation(int idreclamation) {
        this.idreclamation = idreclamation;
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public Date getDatereclamation() {
        return datereclamation;
    }

    public void setDatereclamation(Date datereclamation) {
        this.datereclamation = datereclamation;
    }

    public int getIdcompte() {
        return idcompte;
    }

    public void setIdcompte(int idcompte) {
        this.idcompte = idcompte;
    }
    

}