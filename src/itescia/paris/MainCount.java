package itescia.paris;

public class MainCount {

    public static void main(String[] args) {
        CountDown countDown = new CountDown();
        CountThread  th1 = new CountThread(countDown);
        th1.setName("Thread N°A");
        CountThread th2 = new CountThread(countDown);
        th2.setName("Thread N°2");
        th1.start();
        th2.start();
    }

}
