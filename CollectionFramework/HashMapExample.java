// Program: Demonstrates HashMap Example in Java
import java.util.*;
class HashMapExample {
    public static void main(String args[]){
    
       // fruites HashMap Creation
       HashMap<Integer,String> fruites = new HashMap<>();
       // names HashMap creation
       HashMap<String,String> names = new HashMap<>();

       // put() - Add elements
       fruites.put(1,"apple");
       fruites.put(2,"mango");
       fruites.put(3,"banana");
       fruites.put(4,"orange");

       //  put() - Add elements
       names.put("1st","nagu");
       names.put("2nd","hemanth");
       names.put("3rd","shiva");
       names.put("4th","yesu");

       // initial fruites hashmap: {1=apple, 2=mango, 3=banana, 4=orange}
       System.out.println("initial fruites hashmap: "+fruites);
       // initial names hashmap: {1st=nagu, 3rd=shiva, 2nd=hemanth, 4th=yesu}
       System.out.println("initial names hashmap: "+names);

       // get(keyName) -> Retrive element at specified index 
       // output: The element retrieved at index 2 from the Fruits HashMap is: mango
       System.out.println("The element retrieved at index 2 from the Fruits HashMap is: "+fruites.get(2));
       // output: The element retrieved at index 3 from the Names HashMap is: shiva
       System.out.println("The element retrieved at index 3 from the Names HashMap is: "+names.get("3rd"));

       // containsKey() and containsValue()
       // Note: Returns true if the stack contains no elements; otherwise, returns false.
       // output: Contains Key 3: true
       System.out.println("Contains Key 3: "+fruites.containsKey(3));
       // Contains key 2: true
       System.out.println("Contains key 2 ?: "+names.containsKey("2nd"));

       // output : Afrer Removing: {1=apple, 2=mango, 4=orange}
       fruites.remove(3);
       System.out.println("Afrer Removing: "+fruites);

       // output: Afrer Removing: {1st=nagu, 3rd=shiva, 2nd=hemanth}
       names.remove("4th");
       System.out.println("Afrer Removing: "+names);

       // remove(key, value) 
       // output: After removeing element by using (key, value) pairs: {2=mango, 4=orange}
       fruites.remove(1, "applee"); // wrong value won't remove
       fruites.remove(1,"apple"); // remove
       System.out.println("After removeing element by using (key, value) pairs: "+fruites);

       // // putAll()
       // output: After merging all entries from the newNames HashMap into the names HashMap:
       //  {1st=nagu, 3rd=shiva, 2nd=hemanth, 5th=hari, 6th=harish, 7th=siril}
       HashMap<String, String> newNames = new HashMap<>();
       newNames.put("5th","hari");
       newNames.put("6th","harish");
       newNames.put("7th","siril");
       names.putAll(newNames);
       System.out.println("After merging all entries from the newNames HashMap into the names HashMap: "+names);

       // forEach() 
       // names HashMap
       names.forEach(
        (id, name) -> System.out.println("Hello, Welcome your id is "+id+" and your name is "+name)
        );
        // fruites HashMap
        fruites.forEach(
            (id, name) -> System.out.println("fruite id is "+id+" and fruite name is "+name)
        );
 
        // compute()
        // before compute: {2=mango, 4=orange}
        // after compute:  {2=mango Juice, 4=orange}
        fruites.compute(2,(k,v)-> v+" Juice");
        System.out.println("After Perform Compute Operation on key 2: "+fruites);

        // computeIfAbsent()
        // output: After computeIfAbsent: {2=mango Juice, 4=orange, 5=Grapes}
        fruites.computeIfAbsent(5, k -> "Grapes");
        System.out.println("After computeIfAbsent: " + fruites);

        // After clear(): {}
        fruites.clear();
        System.out.println("After clear(): " + fruites);

    }
}