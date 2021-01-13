package itescia.paris;

public class RunnableThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Lancement du thead "+Thread.currentThread().getName() + " dans MonThread");
    }
}
