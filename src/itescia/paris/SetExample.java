package itescia.paris;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {


        Set<String> seta = new HashSet<>();
        Set<String> setb = new HashSet<>();

        seta.add("toto");
        seta.add("tata");
        seta.add("tutu");

        setb.add("titi");
        setb.add("tvtv");
        setb.add("tutu");

        seta.removeAll(setb);

        for (String element:seta){
            System.out.println(" element "+ element);
        }

    }

}
