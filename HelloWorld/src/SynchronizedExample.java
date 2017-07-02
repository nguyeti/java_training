/**
 * Created by nguyeti on 26/06/2017.
 */
public class SynchronizedExample {
    private  int count = 0;

    // make the variable available to one thread at a time.
    public synchronized void increment(){
        count++;
    }
    public static void main(String[] args){
        SynchronizedExample a = new SynchronizedExample();
        a.doWork();

    }
    public void doWork() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10000; i++){
                    increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10000; i++){
                    increment();
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(count);
    }
}
