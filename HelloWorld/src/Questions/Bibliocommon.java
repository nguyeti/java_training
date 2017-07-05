package Questions;

import java.util.*;

/**
 * Created by Timothy on 7/4/2017.
 */
public class Bibliocommon {
    public static void main(String[] args) {
        int[] a = {1};
        Bibliocommon b = new Bibliocommon();
        b.increment(a);
        System.out.println(a[a.length - 1]);

        String text = "Questions.Hello my name is timo";

        String[] words = text.split(" ", -1);
        Map<Integer, String> unsortedMap = new LinkedHashMap<>();

        int wordLength = 0;
        for (int i = 0; i < words.length; i++) {
            wordLength = words[i].length();
            if (wordLength % 2 == 0) {
                unsortedMap.put(i, words[i]);
            }
        }

        List<Map.Entry<Integer, String>> l = new LinkedList<>(unsortedMap.entrySet());

        Collections.sort(l, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                int l1 = o1.getValue().length();
                int l2 = o2.getValue().length();
                if (l1 == l2) {
                    return o1.getKey() - o2.getKey();
                } else {
                    if (l1 > l2) {
                        return -1;
                    } else if (l2 > l1) {
                        return 1;
                    }
                    return 0;
                }
            }
        });

        Map<Integer, String> sortedMap = new LinkedHashMap<>();

        for (Map.Entry<Integer, String> entry : l) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        List<String> results = new LinkedList<>(sortedMap.values());

        System.out.println(results.get(0));
        //

        String[] votes = {"Alex", "Michael", "Harry", "Dave", "Michael", "Victor","Harry","Alex","Mary","Mary"};
        Map<String, Integer> initialCount = new HashMap<>();

        /*Arrays.sort(votes);
        for (String s : votes) {
            System.out.println(s);
        }*/

        for (int i = 0; i < votes.length; i++) {
            int count = 0;
            for (int j = 0; j < votes.length; j++) {
                if (votes[i].equals(votes[j])) {
                    count++;
                }
            }

            initialCount.put(votes[i], count);
        }

        for(Map.Entry<String, Integer> m : initialCount.entrySet()) {
            System.out.println(m);
        }

        List<Map.Entry<String, Integer>> list = new LinkedList<>(initialCount.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    if(o2.getValue() < o1.getValue()){
                        return -1;
                    } else if (o2.getValue() > o1.getValue()) {
                        return 1;
                    } else if (o1.getValue() == o2.getValue()){
                        return o2.getKey().compareTo(o1.getKey());
                    }
                    return 0;


            }
        });

        Map<String, Integer> sortedCount = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> entry : list) {
            sortedCount.put(entry.getKey(), entry.getValue());
        }
        System.out.println("-----------------------");
        for(Map.Entry<String, Integer> m : sortedCount.entrySet()) {
            System.out.println(m);
        }
        List<String> winner = new LinkedList<>(sortedCount.keySet());

        System.out.println(winner.get(0));

    }

    private void increment(int[] a) {
        a[a.length - 1]++;
    }
}
