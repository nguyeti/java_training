import java.util.*;

/**
 * Created by nguyeti on 30/06/2017.
 */
public class QueueExample {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("Jean", "Timothee","arnold");
        Queue<String> q = new LinkedList<>(l);
        q.forEach(s -> System.out.println(s));
        System.out.println(q.peek());

        List<Integer> l2 = Arrays.asList(1,54,654,9784,231,45,45,0);
        Set<Integer> s = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        s.addAll(l2);

        s.forEach(a -> System.out.println(a));


    }
}
