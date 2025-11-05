/**
 * Program Name : HashSetAllMethodsExample
 * Description  : Demonstrates the use of most built-in methods of HashSet in Java Collections.
 *                HashSet stores unique elements, does not allow duplicates, and does not maintain order.
 */
import java.util.*;
class HashSetExample {
    public static void main(String[] args){

       HashSet<String> fruits = new HashSet<String>();
       
       fruits.add("Apple");
       fruits.add("Banana");
       fruits.add("Orange");
       fruits.add("Mango");
       fruits.add("Grapes");
       fruits.add("Apple"); // duplicates ignore

       // output: [Apple, Grapes, Mango, Orange, Banana]
       System.out.println("Initial Hashset: "+fruits);
       
       // check size of the Hashset
       System.out.println("Size of the Hashset: "+fruits.size());

       // return true if Hashset Contains The specified fruits otherwise it returns false
       System.out.println("Does Hashset Contains Banana? : "+fruits.contains("Banana"));
       
       // return true if Hashset is empty otherwise it return false
       System.out.println("Hashset is Empty: "+fruits.isEmpty());

       // removing element from fruits
       // Resulting Hashset after remove orange : [Apple, Grapes, Mango, Banana]
       fruits.remove("Orange");
       System.out.println("After Removing Orange Hashset is: "+fruits);

       // Iterate using for-each loop
       System.out.println("Iterating Using for each-loop");
       for (String each : fruits){
        System.out.println("Name of the fruit is: "+each);
       }

       /* // Iterate using Iterator
       System.out.println("Iterating Using Iterator");
       Iterator<String> itr = fruits.iterator();
       while(itr.hasNext())
       {
         String newValue = itr.next();
         String fruites = "fruit name is: "+newValue;
         System.out.println(fruites);
        } */

        // Iterate using Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> itr = fruits.iterator();
        while (itr.hasNext()) {
            System.out.println("fruit name is: "+itr.next());
        } 
        
        // Add all elements from another collection
        // output: [Apple, Grapes, Green Apple, Mango, Pineapple, Banana]
        HashSet<String> moreFruites = new HashSet<String>();
        moreFruites.add("Pineapple");
        moreFruites.add("Green Apple");
        fruits.addAll(moreFruites);
        System.out.println("After Adding More Fruites to Fruites set Results is: "+fruits);
        
        // Remove all elements of another collection
        // output: [Apple, Grapes, Mango, Banana]
        fruits.removeAll(moreFruites);
        System.out.println("After Removing More Fruits Collection to fruites Results is: "+fruits);

        // Retain only common elements output: [Mango]
        HashSet<String> commonFruits = new HashSet<String>();
        commonFruits.add("Mango");
        commonFruits.add("Mango");
        fruits.add("Mango");

        fruits.retainAll(commonFruits);
        System.out.println("After RetaingAll CommonFruites: "+fruits);

        // return "false" because fruits list is empty
        System.out.println("fruits list is empty? : "+fruits.isEmpty());

        // output: After Clear fruits list: []
        fruits.clear();
        System.out.println("After Clear fruits list: "+fruits);
 
        // return "true" because fruits list is empty
        System.out.println("fruits list is empty? : "+fruits.isEmpty());

    }
}