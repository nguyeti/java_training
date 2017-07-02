import java.util.Scanner;

/**
 * Created by nguyeti on 22/06/2017.*
 * THREAD SYNCHRONIZATION
 */

class Processor extends Thread {
    private volatile boolean running = true; // prevent threads caching variables

    public void run(){
        while(running){
            System.out.println("Hellooooo");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown(){
        running = false;
    }
}

public class VolatileExample {
    public static void main(String[] args){
        Processor p1 = new Processor();
        p1.start();

        System.out.println("Press RETURN to stop.");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        p1.shutdown();
    }
}
