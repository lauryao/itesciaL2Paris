package itescia.paris;

public class CountThread extends Thread{
    private CountDown myCounter;

    public CountThread(CountDown countDown){
        this.myCounter = countDown;
    }

    @Override
    public void run() {
        myCounter.doCount();
    }
}
