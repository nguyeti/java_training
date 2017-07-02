import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by nguyeti on 17/06/2017.
 */
public class IteratorExample {
    public static void main(String[] args){
        LinkedList<String> animals = new LinkedList<String>();
        animals.add("Dog");
        animals.add("Cat");

        Iterator it = animals.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println();
        // java 5 and later
        for(String element: animals){
            System.out.println(element);
        }
    }
}
