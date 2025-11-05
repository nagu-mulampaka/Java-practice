// Program: Demonstrates ArrayList Example in Java
import java.util.*;
class ArrayListExample {
    public static void main(String args[]){

        // ArrayList Creation
        ArrayList<String> languages = new ArrayList<>();

        // ArrayList.add(element) -> add elements into the ArrayList
        languages.add("Java");
        languages.add("Python");
        languages.add("php");
        languages.add(".net");
        languages.add("Java"); // duplicates Accepted
        languages.add("Java Script");
        languages.add("Ai");

        // Printing ArrayList
        // output: [Java, Python, php, .net, Java, Java Script, Ai]
        System.out.println("Initial Array List: "+languages);
        
        // add(int index, E element) - Insert element at specific position
        // output: [Java, Python, HTML, php, .net, Java, Java Script, Ai]
        languages.add(2, "HTML");
        System.out.println("After Adding Element at Specified Index: "+languages);

        // ArrayList.get(index) - Retrieve element at specified index
        System.out.println("Element at Index 4 is: "+languages.get(4));

        // Before Replacing : [Java, Python, HTML, php, .net, Java, Java Script, Ai]
        // Afrer Replacing :  [Java, Python, HTML, CSS, .net, Java, Java Script, Ai]
        languages.set(3,"CSS");
        System.out.println("After Replacing New Element with Exsting Element: "+languages);

        // size() - Returns number of elements
        System.out.println("Size of the ArrayList is: "+languages.size());

        // contains(element) - Checks if list contains a specific element
        // Returns true if the ArrayList contains specified element; otherwise, returns false.
        System.out.println("Languages List Contains 'Java'? :"+languages.contains("Java"));

        // indexOf(element) - Returns First occurrence index
        System.out.println("Index of 'java' : "+languages.indexOf("Java"));

        // lastIndexOf(element) - Last occurrence index
        languages.add("Java");
        System.out.println("Last index of 'Java' : "+languages.lastIndexOf("Java"));

        // before output : [Java, Python, HTML, CSS, .net, Java, Java Script, Ai, Java]
        // after output :   [Java, Python, HTML, CSS, Java, Java Script, Ai, Java]
        languages.remove(".net");
        System.out.println("After Remove '.net' : "+languages);

        // remove(index) - Remove element by index
        // output: [Java, Python, HTML, CSS, Java, Ai, Java]
        languages.remove(5);
        System.out.println("After Removing element at 5th Index: "+languages);

        // Returns true if the ArrayList is empty; otherwise, returns false.
        System.out.println("Array List is Empty? : "+languages.isEmpty());

        // subList(int fromIndex, int toIndex) - Extract portion of list
        // output : Sublist from index 2 to 5: [HTML, CSS, Java]
        System.out.println("Sublist from index 2 to 5: " + languages.subList(2, 5));
    }
}