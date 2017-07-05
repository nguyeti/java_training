package Map;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by nguyeti on 17/06/2017.
 */

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Id:" + id + " name: " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        return result;
    }
}

class Car {
    private int id;
    private String name;

    public Car(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Id:" + id + " name: " + name;
    }
}

public class CustomObjMapSet {
    public static void main(String[] args) {
        Person p1 = new Person(1, "Curry");
        Person p2 = new Person(2, "KD");
        Person p3 = new Person(3, "Lebron");
        Person p4 = new Person(1, "Curry");

        Map<Person, Integer> map = new LinkedHashMap<>();
        map.put(p1, 1);
        map.put(p2, 2);
        map.put(p3, 3);
        map.put(p4, 1);

        for (Person key : map.keySet()) {
            System.out.println(key.toString() + " ; " + map.get(key));
        }

        System.out.println("p1.equals(p2)? " + p1.equals(p2));
        System.out.println("p1.equals(p4)? " + p1.equals(p4));


        System.out.println(p1 == p4); // tells if 2 refs point to the same object or not
        // false
        System.out.println(p1 == p1); // tells if 2 refs point to the same object or not
        // true

        Car c = new Car(1,"Toyota");
        Car c2 = new Car(1,"Toyota");
        System.out.println(c == c2); // false

        System.out.println(c.equals(c2)); // false
        System.out.println(c.equals(c)); // true
    }
}
