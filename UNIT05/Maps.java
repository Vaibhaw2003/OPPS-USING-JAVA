//Map is an interface in Java that represents a collection of key-value pairs.
// Each key is unique and maps to a specific value.


//-------------01 ---[ HashMap CLASS ]----------
/*  
import java.util.*;

class Maps {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<Integer, String> map = new HashMap<>();

        // Adding key-value pairs to the map
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");

        // Displaying the map
        System.out.println("HashMap: " + map);

        // Accessing a value using its key
        String value = map.get(2);
        System.out.println("Value for key 2: " + value);

        // Removing a key-value pair
        map.remove(3);
        System.out.println("After removing key 3: " + map);

        // Iterating through the map
        System.out.println("Iterating through the map:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
    
}
*/


//------02 -----[ TreeMap CLASS ]----------

import java.util.*;
class Maps {
    public static void main(String[] args) {
        // Creating a TreeMap
        Map<Integer, String> map = new TreeMap<>();

        // Adding key-value pairs to the map
        map.put(3, "Orange");
        map.put(1, "Apple");
        map.put(2, "Banana");

        // Displaying the map (will be sorted by keys)
        System.out.println("TreeMap: " + map);

        // Accessing a value using its key
        String value = map.get(1);
        System.out.println("Value for key 1: " + value);

        // Removing a key-value pair
        map.remove(2);
        System.out.println("After removing key 2: " + map);

        // Iterating through the map
        System.out.println("Iterating through the map:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}