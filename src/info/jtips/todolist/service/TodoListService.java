package info.jtips.todolist.service;

import info.jtips.todolist.model.Tache;
import info.jtips.todolist.model.Utilisateur;
import java.util.List;

public interface TodoListService {
    Utilisateur verifierLogin(String id, String pwd);
    void enregistrerUtilisateur(Utilisateur u);
    Tache lireTache(int id);
    List<Tache> lireListeTaches();
    void sauvegarderTache(Tache t);
    void supprimerTache(Tache t);
}
