package itescia.paris;

public class CountDown {
    private int i;

    public void doCount(){
        String tutu="";

        synchronized (tutu) {
            for (i = 10; i > 0; i--) {
                System.out.println(Thread.currentThread().getName() + " valeur de i = " + i);
            }
        }
    }
}
