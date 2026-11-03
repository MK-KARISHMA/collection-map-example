package collection.example.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListExample {
    static void main(String[] args) {

        // wrapper class
//        int a = 10; int b = -10;
//        int c = null;  // it cannot be done.
//        Integer d = null;
//        Integer e = new Integer(null);

        // declaring list
        List<Integer> list1 = new ArrayList<>(); // {10, -12, 0, null} can store same data type and can duplicate numbers

        // to store multiple kind of data in single list
//        List<?> list2 = new ArrayList<>(); // {1, -24, 0, null , "hii", false, 1.99f, 245.97};
//        List<Object> list3 = new ArrayList<>();

        // adding the data into the list
        list1.add(10);
        list1.add(null);
        list1.add(0);
        list1.add(-34);
        list1.add(99);
        list1.add(12);

        System.out.println("list1 after adding the elements : " + list1);


        // removing the data into the list
        list1.remove(2);
        System.out.println("list1 after removing the 1st element : " + list1);

        // size
        System.out.println("length of the list : " + list1.size());

        // search
        System.out.println("list1 3rd index elemwnt : " + list1.get(2));

        // sort
      // Collections.sort(list1);  // if a list not containing the null values
        Collections.sort(list1, Comparator.nullsFirst(Comparator.naturalOrder()));
        System.out.println(" elements of list1 in Ascending Order : " + list1);

        // Collections.sort(list1, Collections.reverseOrder());  //  // if a list not containing the null values
        Collections.sort(list1, Comparator.nullsFirst(Comparator.reverseOrder()));
        System.out.println(" elements of list1 in Descending Order : " + list1);


        // traverse
        System.out.println("traverse list1 using for each loop");

        for(Integer li : list1) {
            System.out.println(li);
        }

    }
}
