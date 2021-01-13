package itescia.paris;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Autobus {
    private List<Siege>  listeSiege = new LinkedList<>();
    private String description;

    public Autobus(String description) {
        this.description = description;

        listeSiege.add(new Siege("11"));
        listeSiege.add(new Siege("12"));
        listeSiege.add(new Siege("13"));
        listeSiege.add(new Siege("14"));

        listeSiege.add(new Siege("21"));
        listeSiege.add(new Siege("22"));
        listeSiege.add(new Siege("23"));
        listeSiege.add(new Siege("24"));
    }

    public String getDescription() {
        return description;
    }

    public List<Siege> getListeSiege() {
        return listeSiege;
    }

    public void reserveSeat(String numSiege){

        Siege siegeDemande = new Siege(numSiege);
        int indexSiege =  Collections.binarySearch(listeSiege, siegeDemande);

        if (indexSiege < 0 ) {
            System.out.println("Siege "+ numSiege + " non trouve");
            return;
        }
        if (listeSiege.get(indexSiege).isReserve()) {
            System.out.println("Siege "+ numSiege + " deja reserve");
        } else {
            listeSiege.get(indexSiege).setReserve(true);
            System.out.println("Siege "+ numSiege + " reserve sur ligne "+description);
        }



//      previous implementation
//        for (Siege siege:listeSiege) {//
//
//            if (siege.getNumSiege().equals(numSiege) && (!siegeDemande.isReserve())) {
//                siegeDemande = siege;
//                break;
//            }
//        }
//
//        if (siegeDemande == null) {
//            System.out.println("Pas de siege "+numSiege);
//            return;
//        }
//


        //return requestedSeat.reserve();
    }

    class Siege implements  Comparable<Siege> {
        private String numSiege;
        private boolean reserve=false;

        public Siege(String numSiege) {
            this.numSiege = numSiege;
        }

        @Override
        public int compareTo(Siege siege) {
            return this.numSiege.compareToIgnoreCase(siege.getNumSiege());
        }

        public String getNumSiege() {
            return numSiege;
        }

        public void setReserve(boolean reserve) {
            this.reserve = reserve;
        }

        public boolean isReserve() {
            return reserve;
        }
    }
}
