package itescia.paris;

public class VehiculeDeuxRoues implements IVehicule {
    private String nom;
    private String modele;
    private String fabriquant;
    private int nbCylindres;

    public VehiculeDeuxRoues(String nom, String modele, String fabriquant, int nbCylindres) {
        this.nom = nom;
        this.modele = modele;
        this.fabriquant = fabriquant;
        this.nbCylindres = nbCylindres;
    }

    @Override
    public void freiner() {

    }

    @Override
    public void accelerer() {

    }

    @Override
    public void reglerRetroviseur() {

    }

    @Override
    public void allumerPhare() {

    }

    @Override
    public void demarrer() {

    }

    @Override
    public void passerUneVitesse() {

    }
}
