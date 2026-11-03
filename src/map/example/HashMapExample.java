package map.example;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    static void main(String[] args) {

        Map<Integer,String> m1 = new HashMap<>();
        m1.put(101, "Karishma");
        m1.put(102, "Mahi");
        m1.put(103, "Minsa");
        m1.put(104, "Zain");
        m1.put(null, "Karishma");
        m1.put(101, "Papa");  //  old value for 101 will get remove and new value will get added

        System.out.println(m1);

        m1.remove(null);
        System.out.println(m1);

        System.out.println("traverse m1 using for each loop"); // Entryset

        for(Map.Entry m : m1.entrySet()) {
            System.out.println(m.getKey() + "---" + m.getValue());

        }



    }
}
