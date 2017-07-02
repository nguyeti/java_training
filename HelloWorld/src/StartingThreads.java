/**
 * Created by nguyeti on 22/06/2017.
 */
class Runner extends Thread {
    // code that I want to run in a seperate thread
    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println("Hello " + i);

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class StartingThreads {
    public static void main(String[] args){
        Runner runner1 = new Runner();
        runner1.start(); // tell the thread to look for the specified run method

        Runner runner2 = new Runner();
        runner2.start();
    }
}
