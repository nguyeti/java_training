import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by nguyeti on 30/06/2017.
 */
public class ListSorting {
    public static void main(String[] args) {
        List<Integer> l = createList();
       // showList(l);
        sortList(l);
    }

    public static List<Integer> createList() {
        List<Integer> l = new ArrayList<>();
        Random r = new Random(100);
        long start = System.currentTimeMillis();

        for(int i = 0; i < 1E7; i++) {
            l.add(r.nextInt());
        }

        long end = System.currentTimeMillis();

        System.out.println("Total time " + (end - start)/1000 + " s");

        return l;
    }

    public static void showList(List<Integer> l) {
        for(Integer i : l) {
            System.out.println(i);
        }
    }

    public static void sortList(List<Integer> l) {
        long start = System.currentTimeMillis();
        Collections.sort(l);

        long end = System.currentTimeMillis();

        System.out.println("Total time " + (end - start)/1000 + " s");

    }
}
