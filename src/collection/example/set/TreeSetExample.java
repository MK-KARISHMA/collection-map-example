package collection.example.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    static void main(String[] args) {

        // unorder , no null value , no duplicacy.
        Set<Integer> set1 = new TreeSet<>();
        set1.add(1);
        set1.add(23);
        set1.add(43);
        set1.add(43);
        set1.add(15);

        System.out.println("set1 is : " + set1);


        // removing the data , cannot mention index value
        set1.remove(43);
        System.out.println("set1 is : " + set1);

        System.out.println("traverse s1 using foreach loop : ");

        for(Integer i : set1) {
            System.out.println(i);
        }

    }
}
