import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {
    public static void main(String[] args) {

        // Creating a Hashtable
        Hashtable<Integer, String> table = new Hashtable<>();

        // Adding key-value pairs
        table.put(101, "Apple");
        table.put(102, "Banana");
        table.put(103, "Cherry");
        table.put(104, "Mango");

        System.out.println("Hashtable Elements: " + table);

        // Accessing values
        System.out.println("Value for key 102: " + table.get(102));

        // Replacing a value
        table.replace(103, "Cherry", "Grapes");
        System.out.println("After replacing value for key 103: " + table);

        // Checking if a key or value exists
        System.out.println("Contains key 101? " + table.containsKey(101));
        System.out.println("Contains value 'Apple'? " + table.containsValue("Apple"));

        // Removing an entry
        table.remove(104);
        System.out.println("After removing key 104: " + table);

        // Iterating using for-each loop
        System.out.println("Iterating using for-each loop:");
        for (Map.Entry<Integer, String> entry : table.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // Getting all keys and values
        System.out.println("Keys: " + table.keySet());
        System.out.println("Values: " + table.values());

        // Size of the Hashtable
        System.out.println("Size: " + table.size());

        // Checking if empty
        System.out.println("Is Hashtable empty? " + table.isEmpty());

        // Cloning the Hashtable
        Hashtable<Integer, String> clonedTable = (Hashtable<Integer, String>) table.clone();
        System.out.println("Cloned Hashtable: " + clonedTable);

        // Clearing all elements
        table.clear();
        System.out.println("After clear(): " + table);
    }
}
