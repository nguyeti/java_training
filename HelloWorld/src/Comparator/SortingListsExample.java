package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by nguyeti on 17/06/2017.
 */


// sort by string length
class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int l1 = o1.length();
        int l2 = o2.length();
        if(l1 > l2) {
            return 1;
        }
        else if(l2 > l1){
            return -1;
        }
        return 0;
    }
}

class AlphabeticalComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}

class ReverseAlphabeticalComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}


class Country implements Comparable<Country>{
    private int id;
    private String name;

    public Country(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Id:" + id + " name: " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        return name.equals(country.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }


    @Override
    public int compareTo(Country o) {
        return -this.name.compareTo(o.getName());
    }
}

class CountryComparator implements Comparator<Country>{

    @Override
    public int compare(Country o1, Country o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

public class SortingListsExample {
    public static void main(String[] args){
        List<String> players = new ArrayList<>();

        players.add("Stephen Curry");
        players.add("Kevin Durant");
        players.add("Tony Parker");

        Collections.sort(players); // ASC

        for(String player: players){
            System.out.println(player);
        }

        System.out.println();
        Collections.sort(players, new StringLengthComparator()); // ASC by length

        for(String player: players){
            System.out.println(player);
        }

        System.out.println();
        Collections.sort(players, new AlphabeticalComparator()); // ASC by alpha

        for(String player: players){
            System.out.println(player);
        }

        System.out.println();
        Collections.sort(players, new ReverseAlphabeticalComparator()); // ASC by alpha

        for(String player: players){
            System.out.println(player);
        }

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1000);
        numbers.add(15);
        numbers.add(10);
        numbers.add(-2);

        // sorting number DESC
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        System.out.println("sorting number DESC");
        for(Integer number: numbers){
            System.out.println(number);
        }

        // sorting Comparator.Country object
        List<Country> countries = new ArrayList<>();
        Country fra = new Country(1, "France");
        Country bel = new Country(2, "Belgium");
        Country nl = new Country(3, "Netherlands");
        Country aus = new Country(4, "Australia");
        countries.add(fra);
        countries.add(bel);
        countries.add(nl);
        countries.add(aus);

        System.out.println("sorting name ASC");
        Collections.sort(countries, new CountryComparator());
        for(Country country: countries){
            System.out.println(country);
        }
        // soit créer un comparator soit tu implements comparable
        System.out.println("sorting name DESC");
        /*Collections.sort(countries, new Comparator<Comparator.Country>() {
            @Override
            public int compare(Comparator.Country o1, Comparator.Country o2) {
                return -o1.getName().compareTo(o2.getName());
            }
        });
        */
        Collections.sort(countries);
        for(Country country: countries){
            System.out.println(country);
        }

    }
}
