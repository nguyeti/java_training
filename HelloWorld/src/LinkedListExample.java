import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by nguyeti on 16/06/2017.
 */
public class LinkedListExample {
    public static void main(String [] args){

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.println("AL");
        test(arrayList);
        System.out.println("LL");
        test(linkedList);

        doTimings("ArrayList", arrayList);
        doTimings("LinkList", linkedList);

    }

    public static void test(List<Integer> list){
        list.add(1);
        list.add(3);
        list.add(3);
        list.add(45);
        list.add(5);

        for (Integer value : list) {
            System.out.println("values " + value);
        }

    }
    
    private static void doTimings(String type, List<Integer> list){
        for(int i=0; i < 1E6; i++){
            list.add(i);
        }
        long start = System.currentTimeMillis();
        //adding at the end of the list
        //Time taken 6 ms for ArrayList
        //Time taken 8 ms for LinkList
        for(int i=0; i < 1E5; i++){
           list.add(i);
        }

        //adding at the beginning of the list
        // Time taken 3508 ms for ArrayList
        // Time taken 6 ms for LinkList
        //for(int i=0; i < 1E5; i++){
        //    list.add(0,i);
        //}

        long end = System.currentTimeMillis();

        System.out.println("Time taken " + (end - start) + " ms for " + type);
    }
}

/**
 * ADD THINGS AT THE END ARRAYLIST BUT IF AT THE BEGINIING OR NEAR THE BEGINNING LINKEDLIST (just have to change the the link) (arraylist has to shift values)
 */