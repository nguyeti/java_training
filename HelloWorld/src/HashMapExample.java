import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by nguyeti on 16/06/2017.
 */
class Test {
    private String name;
    public Test(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;

    }
}
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Test, String> map = new HashMap<Test, String>();

        map.put(new Test("Teto"),"first");
        map.put(new Test("Tetoooo"),"second");
        for (Map.Entry<Test, String> values : map.entrySet()) {
            Test key = values.getKey();
            String value = values.getValue();
            //System.out.println(values);

            System.out.println("KEY = " + key.getName() + " /// VALUE = " + value);
        }

        // duplicate values YES
        // duplicate Key no
        // not sorted/ordered
        /*map.put(1, "Toyota");
        map.put(2, "GMC");
        map.put(3, "Ford");
        map.put(4, "Ford");
        map.put(5, "Renault");
        map.put(6, null);
        // overwrite the value above
        map.put(5, "Renault2");

        for (Map.Entry<Integer, String> values : map.entrySet()) {
            int key = values.getKey();
            String value = values.getValue();
            //System.out.println(values);

            System.out.println("KEY = " + key + " /// VALUE = " + value);
        }*/

        //doTimings(map);
    }

    public static void doTimings(Map<Integer, String> map){

        for(int i = 0; i < 1E6; i++){
            map.put(i,"E"+i);
        }
        long start = System.currentTimeMillis();
        for(int i = 10000001; i < 1E9; i++){
            map.put(i,"E"+i);
        }
        long end = System.currentTimeMillis();

        System.out.println("Time taken : " + (end - start) +  " in ms.");
    }
}
