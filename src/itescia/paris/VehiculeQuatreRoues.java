package itescia.paris;

public class VehiculeQuatreRoues  implements IVehicule{
    private String marque;
    private String modele;
    private int nbChevaux;
    private String anneeFabrication;


    public VehiculeQuatreRoues(String marque, String modele, int nbChevaux, String anneeFabrication) {
        this.marque = marque;
        this.modele = modele;
        this.nbChevaux = nbChevaux;
        this.anneeFabrication = anneeFabrication;
    }

    public void ouvrirPortiere(String nomportiere){
        System.out.println("on ouvre la portiere "+nomportiere);
    }

    @Override
    public void freiner() {
        System.out.println("je freine");
    }

    @Override
    public void accelerer() {
        System.out.println("jaccelere");
    }

    @Override
    public void reglerRetroviseur() {
        System.out.println("je regle le retro");
    }

    @Override
    public void allumerPhare() {
        System.out.println("j'allume les phares");
    }

    @Override
    public void demarrer() {
        System.out.println("je demarre");
    }

    @Override
    public void passerUneVitesse() {
        System.out.println("je passe la vitesse");
    }
}
