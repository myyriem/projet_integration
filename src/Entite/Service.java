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
public class Service {
    
    private int Id_Service;
    private String Nom_Service;
    private String Type_Service;
    
    
     public Service() {
    }
     
     
      public Service(String Nom_Service, String Type_Service, int id_Service){
          
          this.Id_Service=Id_Service;
          this.Nom_Service=Nom_Service;
          this.Type_Service=Type_Service;        
      }

    public int getId_Service() {
        return Id_Service;
    }

    public void setId_Service(int Id_Service) {
        this.Id_Service = Id_Service;
    }

    public String getNom_Service() {
        return Nom_Service;
    }

    public void setNom_Service(String Nom_Service) {
        this.Nom_Service = Nom_Service;
    }

    public String getType_Service() {
        return Type_Service;
    }

    public void setType_Service(String Type_Service) {
        this.Type_Service = Type_Service;
    }
    
}
