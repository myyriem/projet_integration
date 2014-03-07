package info.jtips.todolist.model;

import java.util.ArrayList;
import java.util.List;

public class Utilisateur {
    private String identifiant;
    private String nom;
    private String prenom;
    private String motDePasse;

    private List<Tache> taches;

    public Utilisateur() {}
    public Utilisateur(String identifiant, String nom, String prenom, String motDePasse) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
        this.motDePasse = motDePasse;
    }

    public void ajouterTache(Tache t) {
        if (taches == null) taches = new ArrayList<Tache>();
        taches.add(t);
        t.setUtilisateur(this);
    }

    public List<Tache> getTaches() {
        return taches;
    }

    public void setTaches(List<Tache> taches) {
        this.taches = taches;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

}
