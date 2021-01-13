package itescia.paris;

public class MainThread {

    public static void main(String[] args) {

        System.out.println("dans la méthode main");

        //1ère facon de lancer un Thread
        Thread monThread = new MonThread();
        monThread.setName("Thread n°1");
        monThread.start();

        //2ème facon
        Thread  runnableThread = new Thread(new RunnableThread());
        runnableThread.setName("Thread runnable");
        runnableThread.start();

        //3ème façon
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Lancement du thead Thread anonymous dans MonThread");
                try {
                    monThread.join(2000);
                } catch (InterruptedException e) {

                }
                System.out.println("poursuite du thead Thread anonymous apres monThread.join()");
            }
        }).start();

        //interruption du sleep du Thread monThread
        //monThread.interrupt();

        System.out.println("apres lancement des Thread");

    }
}
