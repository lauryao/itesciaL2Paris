package itescia.paris;

public abstract class Personne {
    private String nom;
    private String prenom;

    public void avancer(){
        System.out.println("javance");
    }

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int calculAge(String anneeDeNaissance) {
        System.out.println("");
        return 0;
    }
}
