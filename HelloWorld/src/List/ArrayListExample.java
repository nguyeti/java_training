package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by nguyeti on 16/06/2017.
 */
public class ArrayListExample {
    public static void main(String [] args){
        // default size 10
        List<Integer> numbers = new LinkedList<Integer>();

        numbers.add(1);
        numbers.add(10);
        numbers.add(121);
        numbers.add(100);

        for(Integer i: numbers){
            System.out.println("Number: " + i);
        }

        //System.out.println(numbers.get(2));

        //numbers.remove(2);

        for(Integer i: numbers){
            System.out.println("Numbers remaining: " + i);
        }

        //System.out.println(numbers.stream().count());
        System.out.println(numbers.stream().sorted().collect(Collectors.toList()));

        numbers.stream().sorted().forEach(System.out::println);

        numbers.stream().map(a -> a *2).sorted().forEach(System.out::println);

    }
}
