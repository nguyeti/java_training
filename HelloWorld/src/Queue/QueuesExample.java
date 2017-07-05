package Queue;

import sun.misc.Queue;

import java.util.AbstractQueue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by nguyeti on 17/06/2017.
 */
public class QueuesExample {
    public static void main(String[] args){
        // head <- oooooooooooooooooooooooo <- tail - FIFO
        AbstractQueue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);
        q1.add(3);
        q1.add(1);
        q1.add(20);

        showElement(q1);
        System.out.println("Head is " + q1.element());

        System.out.println("removing the head " + q1.remove());
        showElement(q1);

    }

    public static void showElement(AbstractQueue<Integer> q){
        for(Integer element: q){
            System.out.println(element);
        }
    }
}
