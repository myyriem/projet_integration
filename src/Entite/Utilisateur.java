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
 public class Utilisateur {
     private int Id_Ulilisateur;
     
 public Utilisateur () {
    }
    
          
          
 public Utilisateur (int Id_Ulilisateur) {
                    
      this.Id_Ulilisateur=Id_Ulilisateur;
    }

    public int getId_Ulilisateur() {
        return Id_Ulilisateur;
    }

    public void setId_Ulilisateur(int Id_Ulilisateur) {
        this.Id_Ulilisateur = Id_Ulilisateur;
    }
}
