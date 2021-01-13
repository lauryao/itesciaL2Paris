package itescia.paris;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    //déclaration de ArrayList
    private static List<String> maListe = new ArrayList<>();


    public static void main(String[] args) {

        //Ajout dun element dans la liste
        maListe.add("Albert");
        maListe.add("Justin");
        maListe.add("Gerard");

        //Afficher la liste
        afficheListe(maListe);

        //récupérer un element a partir de son indice
        String nom = maListe.get(0);

        //Modifier un element de la liste a partir de son indice
        maListe.set(1, "Alfred");

        afficheListe(maListe);

        //Supprimer un element a partir de son indice
        maListe.remove(2);

        afficheListe(maListe);






    }

    public static void afficheListe(List<String> liste){
        //Affichage par forEach
        //liste.forEach(System.out::println);

        //Affichage par boucle for
        for (String nom:liste){
            System.out.println(nom);
        }
    }
}
