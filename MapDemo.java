import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        // Creating a HashMap instance
        Map<String, Integer> hashMap = new HashMap<>();

        // Adding key-value pairs to the map
        hashMap.put("Apple", 10);
        hashMap.put("Guava", 20);
        hashMap.put("strawberry", 15);

        // Accessing values by keys
        System.out.println("Value of 'Apple': " + hashMap.get("Apple"));
        System.out.println("Value of 'Guava': " + hashMap.get("Guava"));
        System.out.println("Value of 'strawberry': " + hashMap.get("strawberry"));

        // Checking if a key exists
        System.out.println("Contains key 'Apple': " + hashMap.containsKey("Apple"));
        System.out.println("Contains key 'Grapes': " + hashMap.containsKey("Grapes"));

        // Checking if a value exists
        System.out.println("Contains value 10: " + hashMap.containsValue(10));
        System.out.println("Contains value 25: " + hashMap.containsValue(25));

        // Iterating through the map
        System.out.println("Entries in the map:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Removing a key-value pair
        hashMap.remove("Guava");
        System.out.println("After removing 'Guava': " + hashMap);
    }
}

