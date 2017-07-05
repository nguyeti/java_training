package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by nguyeti on 17/06/2017.
 */
public class SetExample {
    public static void main(String[] args){
        // ordered/sorted >> NO
        Set<String> hashSet = new HashSet<>();
        // remember order of insertion
        LinkedHashSet<String> linkedHashSet= new LinkedHashSet<>();
        // sort in natural order, for string it's A-Z
        TreeSet<String> treeSet = new TreeSet<>();

        System.out.println("HASHSET");
        doTest(hashSet);

        System.out.println("LinkHASHSET");
        doTest(linkedHashSet);

        System.out.println("TREESET");
        doTest(treeSet);

        // Set are good for searching an element

        System.out.println("Does hashSet contain the element \"rabbit\"? " + hashSet.contains("rabbit"));
        System.out.println("remove \"rabbit\"? " + hashSet.remove("rabbit"));
        hashSet.add("wolf");

        // good to do intersection etc
        // creation of a copy
        Set<String> hashSetCopy = new HashSet<>(hashSet);
        hashSetCopy.retainAll(linkedHashSet);
        System.out.println(hashSetCopy);

        // difference
        Set<String> difference = new HashSet<>(hashSet);
        difference.removeAll(linkedHashSet);
        System.out.println(difference);

    }

    public static void doTest(Set<String> set){
        set.add("dog");
        set.add("snake");
        set.add("mouse");
        set.add("rabbit");
        set.add("cat");
        set.add("snake"); // no effect, only unique values

        for(String value: set){
            System.out.println("Item :" + value);
        }
    }
}
