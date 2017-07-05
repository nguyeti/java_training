package Questions;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by dev on 6/22/15.
 */
public class Hello {


    public static String kthMostCommon(int[] a, int k) {
        int[] array = a;
        int count = 0;
        Map<String, Integer> result = new TreeMap<String, Integer>();

        for (int elementToCount = 0; elementToCount < array.length; elementToCount++) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == array[elementToCount]) {
                    count++;
                }
            }

            result.put(Integer.toString(array[elementToCount]), count);
            count = 0;
        }
        Map<String, Integer> sortedResult = sortByValue(result);
        List<String> finalResults = new ArrayList<>(sortedResult.keySet());

        return finalResults.get(k - 1);
    }


    private static Map<String, Integer> sortByValue(Map<String, Integer> unsortMap) {

        // 1. Convert Map to List of Map
        List<Map.Entry<String, Integer>> list =
                new LinkedList<Map.Entry<String, Integer>>(unsortMap.entrySet());
        /*for(Map.Entry<String, Integer> entry: list){
            System.out.println("t " + entry);
        }*/
        System.out.println(list);
        // 2. Sort list with Collections.sort(), provide a custom Comparator
        //    Try switch the o1 o2 position for a different order
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                if(o1.getValue() == o2.getValue()){
                    return (o2.getKey()).compareTo(o1.getKey());
                }
                else {
                    return (o2.getValue()).compareTo(o1.getValue());
                }
            }
        });
        /*for(Map.Entry<String, Integer> entry: list){
            System.out.println("sorted " + entry);
        }*/
        // 3. Loop the sorted list and put it into a new insertion order Map LinkedHashMap
        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }

    public static void main(String[] args) {
        String x = kthMostCommon(new int[]{5, 4, 3, 2, 1, 5, 4, 3, 2, 5, 4, 3, 5, 4,4,4}, 2);
        System.out.println(x);
    }
}
