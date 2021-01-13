package itescia.paris;

public class MonThread extends Thread{

    @Override
    public void run() {
        System.out.println("Lancement du thead "+Thread.currentThread().getName() + " dans MonThread");

        try {
            this.sleep(4000);
        } catch (InterruptedException e){
            System.out.println("je me reveille "+Thread.currentThread().getName() +" suite a un interrupt ");
        }

        System.out.println("reveil du thead "+Thread.currentThread().getName() + " dans MonThread");

    }
}
