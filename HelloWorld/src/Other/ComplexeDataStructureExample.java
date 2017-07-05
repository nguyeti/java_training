package Other;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by nguyeti on 17/06/2017.
 */


public class ComplexeDataStructureExample {
    public static String[] vehicules = {"car", "helicopter","truck"};
    public static String[][] drivers = {{"Jean", "Paul"},{"Jennifer","Cécile","Etienne"},{"Daniel","Papa","Maman"}};

    public static void main(String[] args){

        Map<String, Set<String>> personnels = new LinkedHashMap<>();

        for(int i = 0; i < vehicules.length; i++){
            String vehicule = vehicules[i];
            String[] driverList = drivers[i];
            Set<String> driverSet = new LinkedHashSet<>();

            for(String driver: driverList){
                driverSet.add(driver);
            }

            personnels.put(vehicule, driverSet);
        }

        /*Key: car - [Jean, Paul]
        Key: helicopter - [Jennifer, Cécile, Etienne]
        Key: truck - [Daniel, Papa, Maman]*/
        for(Map.Entry<String, Set<String>> personnel: personnels.entrySet()){
            System.out.println("Key: " + personnel.getKey() + " - " + personnel.getValue());
        }

        System.out.println();

        for(String key: personnels.keySet()){
            System.out.print(key + ": ");
            Set<String> driverList = personnels.get(key);

            for(String driver: driverList){
                System.out.print(driver + " ");
            }
            System.out.println();
        }
    }
}
