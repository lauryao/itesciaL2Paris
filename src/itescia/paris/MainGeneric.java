package itescia.paris;

import java.util.List;

public class MainGeneric {
    public static void main(String[] args) {
        JoueurFoot  mbappe = new JoueurFoot("Kilian Mbappe");
        JoueurFoot  neymar = new JoueurFoot("Neymar");
        JoueurBaskeet lebron = new JoueurBaskeet("lebron James");
        JoueurHand omeyer = new JoueurHand("Thierry Omeyer");

        EquipoA<JoueurFoot>   psgFoot = new EquipoA("PSG","PARIS");
        EquipoA<JoueurBaskeet>   lakerBasket = new EquipoA("LA LAKERS","LA");
        EquipoA<JoueurHand>  kelHand = new EquipoA("KEL HANDBAL","KEL");

        //EquipoA<String> autreEquipe = new EquipoA<String>();

        psgFoot.ajouteJoueur(mbappe);
        psgFoot.ajouteJoueur(neymar);
        lakerBasket.ajouteJoueur(lebron);
        kelHand.ajouteJoueur(omeyer);

        psgFoot.afficheJoueur();
        lakerBasket.afficheJoueur();
        kelHand.afficheJoueur();


    }

    private static void afficheJoueur(List<Joueur> liste){
        for (Joueur joueur:liste){
            System.out.println(" joueur "+ ((Joueur)joueur).getName());
        }

    }
}
