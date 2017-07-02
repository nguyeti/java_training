import java.util.*;

/**
 * Created by nguyeti on 17/06/2017.
 */

class NBA implements Comparable<NBA> {
    private String name;

    public NBA( String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "NBA{" +
                "name='" + name + '\'' +
                '}';
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NBA nba = (NBA) o;

        return name != null ? name.equals(nba.name) : nba.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }*/

    @Override
    public int compareTo(NBA o) {
        return -this.name.compareTo(o.name);
    }
}
public class NaturalOrderingExample {
    public static void main(String[] args){
        List<NBA> list = new ArrayList<NBA>();
        SortedSet<NBA> set = new TreeSet<NBA>();

        addElements(list);
        addElements(set);

        Collections.sort(list);

        showElements(list);
        System.out.println();
        showElements(set);
    }

    private static void addElements(Collection<NBA> collection){
        collection.add(new NBA("Curry"));
        collection.add(new NBA("Lebron"));
        collection.add(new NBA("Barbosa"));
        collection.add(new NBA("Aldridge"));
        collection.add(new NBA("Harden"));
    }

    private static void showElements(Collection<NBA> collection){
        for(NBA element: collection){
            System.out.println(element);
        }
    }
}
