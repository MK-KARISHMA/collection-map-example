package collection.example.list;

import java.util.Stack;

public class StackExample {

    static void main(String[] args) {

        Stack<String> s1 = new Stack<>();

        s1.push("Guava");
        s1.push("Mango");
        s1.push("Orange");
        s1.push("WaterMelon");
        s1.push("Apple");
        s1.push(null);
        s1.push("Guava");
        s1.push("Banana");
        System.out.println("Stack example : " + s1);

        s1.pop();
        System.out.println("Stack after pop : " + s1);

        System.out.println("Traverse using for each loop");

        for(String s : s1) {
            System.out.println(s);
        }
    }
}
