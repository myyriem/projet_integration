/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entite;

/**
 *
 * @author    Le chiffre
 */  
public class Offre {
    
    private int Id_Offre;
    private String Nom_Offre;
    private String Description_Offre;
    private int Prix_Offre;
    
    
    public Offre(){
    
}
    public Offre(int id_offre,String Nom_Offre,String Description, int Prix_Offre){
        this.Id_Offre=id_offre;
        this.Nom_Offre=Nom_Offre;
        this.Description_Offre=Description;
        this.Prix_Offre=Prix_Offre;     
    }

    public int getId_Offre() {
        return Id_Offre;
    }

    public void setId_Offre(int Id_Offre) {
        this.Id_Offre = Id_Offre;
    }

    public String getNom_Offre() {
        return Nom_Offre;
    }

    public void setNom_Offre(String Nom_Offre) {
        this.Nom_Offre = Nom_Offre;
    }

    public String getDescription_Offre() {
        return Description_Offre;
    }

    public void setDescription_Offre(String Description_Offre) {
        this.Description_Offre = Description_Offre;
    }

    public int getPrix_Offre() {
        return Prix_Offre;
    }

    public void setPrix_Offre(int Prix_Offre) {
        this.Prix_Offre = Prix_Offre;
    }
    
}
