import java.util.*;

/**
 * Created by nguyeti on 16/06/2017.
 */
public class SortedMapExample {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        Map<Integer, String> treeMap = new TreeMap<>(new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);
            }
        });
        // duplicate values YES
        // duplicate Key no
        // not sorted
        // ordered
        test(hashMap);
        System.out.println("lm");
         test(linkedHashMap);
         System.out.println("tm");
        test(treeMap);
    }

    public static void test(Map<Integer, String> map){
        map.put(14, "Toyota");
        map.put(3, "GMC");
        map.put(3, "Ford");
        map.put(45, "Ford");
        map.put(5, "Renault");
        map.put(69, null);
        // overwrite the value above
        map.put(5, "Renault2");

        for (Map.Entry<Integer, String> values : map.entrySet()) {
            int key = values.getKey();
            String value = values.getValue();
            //System.out.println(values);

            System.out.println("KEY = " + key + " /// VALUE = " + value);
        }

    }
}
