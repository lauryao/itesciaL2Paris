package itescia.paris;

import java.util.ArrayList;

public class Equipe <T extends Joueur> {
    private String name;
    private String ville;

    private ArrayList<T> equipe = new ArrayList<>();

    public Equipe(String name, String ville) {
        this.name = name;
        this.ville = ville;
    }

    public String getName() {
        return name;
    }

    public String getVille() {
        return ville;
    }

    public int nombreJoueur(){
        return this.equipe.size();
    }

    public boolean ajouteJoueur(T joueur){
        if (equipe.contains(joueur)){
            System.out.println("Joueur deja present dans cette equipe");
            return false;
        } else {
            equipe.add(joueur);
            System.out.println("joueur "+ (joueur).getName() + " ajoute dans equipe "+this.name);
            return true;
        }
    }
}
