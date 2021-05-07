import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.*;

class Whale implements Comparable<Whale> {
    public int id;

    public Whale(int id) {
        this.id = id;
    }

    public int compareTo(Whale whale) {
        if (id < whale.id)
            return -1;
        if (id > whale.id)
            return 1;
        return 0;
    }

    public String toString() {
        return String.valueOf(id);
    }
}

class Person {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    int getId() {
        return this.id;
    }

    String getname() {
        return this.name;
    }

    public String toString() {
        return name;
    }
}

class stringLengthComparator implements Comparator<String> {
    public int compare(String s1, String s2) {
        if (s1.length() == s2.length())
            return 0;
        if (s1.length() < s2.length())
            return -1;
        if (s1.length() > s2.length())
            return 1;
        return 0;
    }
}

class ReverseLengthComparator implements Comparator<String> {
    public int compare(String s1, String s2) {
        return -s1.compareTo(s2);
    }
}

public class AppCompare {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();

        animals.add("tiger");
        animals.add("lion");
        animals.add("cat");
        animals.add("snake");
        animals.add("mongoose");
        animals.add("elephant");

        numbers.add(3);
        numbers.add(36);
        numbers.add(73);
        numbers.add(40);
        numbers.add(1);

        Collections.sort(animals);
        // Collections.sort(numbers);

        stringLengthComparator s = new stringLengthComparator();
        Collections.sort(animals, s);

        Collections.sort(numbers, new Comparator<Integer>() {
            public int compare(Integer num1, Integer num2) {
                return num1.compareTo(num2);
            }
        });
        // for (Integer i : numbers)
        // System.out.println(i);

        List<Person> person = new ArrayList<>();
        person.add(new Person(1, "joe"));
        person.add(new Person(2, "abs"));
        person.add(new Person(3, "zeb"));
        person.add(new Person(4, "sue"));

        Collections.sort(person, new Comparator<Person>() {
            public int compare(Person s1, Person s2) {
                return s1.getname().compareTo(s2.getname());
            }
        });

        // for (Person per : person)
        // System.out.println(per);

        HashSet<Whale> whale = new HashSet<>();
        // whale.add(new Whale(3));
        whale.add(new Whale(2));
        whale.add(new Whale(1));
        whale.add(new Whale(43));
        Collections.sort(whale);
        // System.out.println(whale);
        for (Whale i : whale) {
            System.out.println(i);
        }
    }
}
