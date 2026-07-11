package DSA.MapSetHasing;

import java.util.HashSet;
import java.util.Iterator;

public class Sets {
    public static void main(String[] args) {
        // Creating a HashSet
      //  1.    O(1) for add, remove, contains  , O(n) for iteration, contains Unique elements always, unordered
        // when to use set
        // 1. when problem contains words like duplicates,common in two list, Unique element,repeating,
        // 2. when you need to remove duplicates
        // 3. when you need to perform set operations like union, intersection, difference

        HashSet<String> fruits = new HashSet<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        // Trying to add duplicate element
        fruits.add("Apple"); // ignored (no duplicates allowed)
        // Remove item
        fruits.remove("Orange");
        // Check if an element exists
        if (fruits.contains("Apple")){
            System.out.println("Apple is present");
        }

        // iterate over items
        for (String item : fruits) {
            System.out.println(item);
        }

        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        fruits.forEach(fruit -> System.out.println(fruit));



    }

}



