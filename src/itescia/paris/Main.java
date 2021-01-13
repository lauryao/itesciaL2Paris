package itescia.paris;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        Equipe<JoueurFootball> psg = new Equipe("PSG", "Paris");
//        Equipe<JoueurBasket>  laker = new Equipe("LA Lakers","LA");
//        Equipe<JoueurHandball> mhsc = new Equipe("montpelier hand","Montpellier");
//
//        JoueurFootball  neymar = new JoueurFootball("Neymar");
//        JoueurFootball mbappe = new JoueurFootball("Kilian Mbappe");
//        JoueurBasket  lebron = new JoueurBasket("Lebron James");
//        JoueurHandball omeyer = new JoueurHandball("Thierry Omeyer");
//
//        psg.ajouteJoueur(neymar);
//        psg.ajouteJoueur(mbappe);
//        mhsc.ajouteJoueur(omeyer);
//        laker.ajouteJoueur(lebron);

//        System.out.println(psg.nombreJoueur());

        Autobus autobus = new Autobus("Ligne Paris - Granville");
        autobus.reserveSeat("13");
        autobus.reserveSeat("13");
        autobus.reserveSeat("15");

        List<Autobus.Siege> listeSiege = new ArrayList<>(autobus.getListeSiege());
        afficheSiege(listeSiege);

        Collections.shuffle(listeSiege);
        afficheSiege(listeSiege);

        Collections.sort(listeSiege);
        afficheSiege(listeSiege);

        Autobus.Siege monSiege = Collections.max(listeSiege);
        System.out.println("numero de siege max "+ monSiege.getNumSiege());

    }

    public static void afficheSiege(List<Autobus.Siege> listeSiege){
        for (Autobus.Siege siege:listeSiege){
            System.out.println(" numero siege : "+ siege.getNumSiege());
            System.out.println(" reservation : " + siege.isReserve());
        }
        System.out.println("============================");

    }
}
