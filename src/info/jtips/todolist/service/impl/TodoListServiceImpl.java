package info.jtips.todolist.service.impl;

import info.jtips.todolist.dao.TacheDao;
import info.jtips.todolist.dao.UtilisateurDao;
import info.jtips.todolist.dao.impl.TacheDaoImpl;
import info.jtips.todolist.dao.impl.UtilisateurDaoImpl;
import info.jtips.todolist.model.Tache;
import info.jtips.todolist.model.Utilisateur;
import info.jtips.todolist.service.TodoListException;
import info.jtips.todolist.service.TodoListService;
import java.util.List;

public class TodoListServiceImpl implements TodoListService {

    private UtilisateurDao utilisateurDao = new UtilisateurDaoImpl();
    private TacheDao tacheDao = new TacheDaoImpl();

    /**
     * Cette méthode permet de vérifier un couple "identifiant/mot de passe"
     * issue d'un écran de login. Si l'utilisateur correspondant à l'identifiant
     * ou si le mot de passe est incorrect, alors une exception est levée
     */
    public Utilisateur verifierLogin(String id, String pwd) {
        Utilisateur u = utilisateurDao.findById(id);
        if (u != null && pwd != null && pwd.equals(u.getMotDePasse())) {
            return u;// connexion OK
        }
        throw new TodoListException("Echec de l'authentification");
    }

    /**
     * Un utilisateur peut être enregistré si son identifiant n'est pas déjà utilisé.
     * Si l'identifiant est déjà utilisé, une exception est levée.
     */
    public void enregistrerUtilisateur(Utilisateur u) {
        // vérification login déjà utilisé
       Utilisateur utilisateurExistant = utilisateurDao.findById(u.getIdentifiant());
       if (utilisateurExistant != null) throw new TodoListException("Identifiant déjà utilisé");

       // ok, on peut enregistrer
       utilisateurDao.create(u);
    }

    /**
     * Dans cette implémentation, l'association "Utilisateur <-> Tache" est
     * initialisée uniquement côté "Tache", ie la propriété "utilisateur".
     * Côté "Utilisateur", la collection de tâches n'est pas initialisée.
     */
    public List<Tache> lireListeTaches() {
        List<Tache> taches = tacheDao.findAll();
        for (Tache t : taches) {
            Utilisateur u = utilisateurDao.findById(t.getUtilisateur().getIdentifiant());
            t.setUtilisateur(u);
        }
        return taches;
    }

    /**
     * Dans cette méthode, l'association "Utilisateur <-> Tache" est complètement
     * initialisée : ie la propriété "utilisateur" côté "Tache" et la propriété
     * "taches" coté "Utilisateur".
     */
    public Tache lireTache(int id) {
        Tache tache = tacheDao.findById(id);
        String idUtilisateur = tache.getUtilisateur().getIdentifiant();
        Utilisateur u = utilisateurDao.findById(idUtilisateur);
        List<Tache> taches = tacheDao.findByUtilisateur(u);
        for (Tache t : taches) {
            u.ajouterTache(t);
            if (t.getId() == id) tache = t;// évite d'avoir deux instances différentes
                                           // pour l'entité recherchée dans le graphe d'objet
        }
        tache.setUtilisateur(u);
        return tache;
    }

    /**
     * Cette méthode consiste à effectuer un INSERT s'il s'agit de sauvegarder
     * une nouvelle tâche (reconnue par id == -1). S'il s'agit d'une tâche
     * existante (reconnue par id != -1), alors un UPDATE est généré.
     */
    public void sauvegarderTache(Tache t) {
        if (t.getId() == -1) {
            tacheDao.create(t);
        }
        else {
            tacheDao.update(t);
        }
    }

    /**
     * Suppression de la tâche passée en paramètre
     */
    public void supprimerTache(Tache t) {
        tacheDao.delete(t);
    }

}
