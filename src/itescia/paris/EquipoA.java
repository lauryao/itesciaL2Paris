package itescia.paris;

import java.util.ArrayList;
import java.util.List;

public class EquipoA <T extends Joueur> {
    private String nom;
    private String ville;
    private final List<T> listeJoueur = new ArrayList<>();

    public EquipoA(String nom, String ville) {
        this.nom = nom;
        this.ville = ville;
    }

    public String getNom() {
        return nom;
    }

    public String getVille() {
        return ville;
    }

    public List<T> getListeJoueur() {
        return listeJoueur;
    }

    public void ajouteJoueur(T joueur){
        this.listeJoueur.add(joueur);
    }

    public void afficheJoueur(){
        for (T joueur:listeJoueur){
            System.out.println("Nom du joueur " + joueur.getName() + " de l'equipe : "+this.nom);
        }
    }

}
