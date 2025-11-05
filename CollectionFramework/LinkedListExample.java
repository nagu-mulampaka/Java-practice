// Program: Demonstrating all major built-in methods of LinkedList in Java
import java.util.LinkedList;
class LinkedListExample {
    public static void main(String args[]){

       // LinkedList Creation
       LinkedList<String> movies = new LinkedList();

       // add elements into the LinkedList
       movies.add("RRR");
       movies.add("Pushpa");
       movies.add("Bahubali");
       movies.add("KGF");
       movies.add("avatar 2");
       movies.add("RRR"); // duplicates accepted

       // Initial Movies LinkedList
       // output : [RRR, Pushpa, Bahubali, KGF, avatar 2, RRR]
       System.out.println("After Inserting Elements into the LinkedList: "+movies);

       // Iterator elements using for-each loop
       System.out.println("Iterating Elements Using for-each loop");
       for(String each : movies){
        System.out.println("Movie name is: "+each);
       }

       // addFirst(element) – Add element at the beginning
       // output : [Rangasthalam, RRR, Pushpa, Bahubali, KGF, avatar 2, RRR]
       movies.addFirst("Rangasthalam");
       System.out.println("After inserting a new element at the first position: "+movies);
       
       // addLast(element) – Add element at the ending
       // output: [Rangasthalam, RRR, Pushpa, Bahubali, KGF, avatar 2, RRR, Guntur Kaaram]
       movies.addLast("Guntur Kaaram");
       System.out.println("After inserting a new element at the last position: "+movies);
       
       // add(int index, element) – Insert at specific index
       // output: [Rangasthalam, RRR, Pushpa, Saaho, Bahubali, KGF, avatar 2, RRR, Guntur Kaaram]
       movies.add(3,"Saaho");
       System.out.println("After inserting a new element at the Specified index position: "+movies);
       
       // get(int index) – Get element at specific index
       // output : Element at index 4: Bahubali
       System.out.println("Element at index 4: "+movies.get(4));
       
       // getFirst() and getLast() – Get first & last elements
       System.out.println("Element at First index : "+movies.getFirst());
       System.out.println("Element at Last index : "+movies.getLast());

       // contains(movie) – Check if element exists
       // Returns true if the LinkedList contains Specified movie; otherwise, returns false.
       System.out.println("Contains 'RRR'? : "+movies.contains("RRR"));
       
       // indexOf(movie) – Return First occurrence index
       System.out.println("Find index of 'RRR' : "+movies.indexOf("RRR"));

       // lastIndexOf(movie) – Last occurrence index
       movies.add("Rangasthalam"); // duplicates accepted
       System.out.println("finding the index of 'Rangasthalam' : "+movies.indexOf("Rangasthalam"));
       System.out.println("finding last index of 'Rangasthalam' : "+movies.lastIndexOf("Rangasthalam"));

       // set(int index, element) – Replace element at index
       // output: [Rangasthalam, RRR, Pushpa, Saaho, Bahubali, KGF, Radhe Shyam, RRR, Guntur Kaaram, Rangasthalam]
       movies.set(6, "Radhe Shyam");
       System.out.println("After Inserting Updated element at specified index : "+movies);

       // remove(movie) – Remove specific element
       // output: [Rangasthalam, Pushpa, Saaho, Bahubali, KGF, Radhe Shyam, RRR, Guntur Kaaram, Rangasthalam]
       movies.remove("RRR");
       System.out.println("After removing 'RRR' : "+movies);

       // remove(index) - Remove specified index element
       // output: [Rangasthalam, Pushpa, Saaho, Bahubali, Radhe Shyam, RRR, Guntur Kaaram, Rangasthalam]
       movies.remove(4);
       System.out.println("After removing element at specified index : "+movies);
    
       // removeFirst() & removeLast() – Remove first & last elements
       // output: [Pushpa, Saaho, Bahubali, Radhe Shyam, RRR, Guntur Kaaram]
       movies.removeFirst();
       movies.removeLast();
       System.out.println("After removeFirst() & removeLast() : "+movies);

       // peek(), peekFirst(), peekLast() – Retrieve without removing
       // LinkedList : [Pushpa, Saaho, Bahubali, Radhe Shyam, RRR, Guntur Kaaram]
       System.out.println("Peek() :"+movies.peek()); // return first element
       System.out.println("peekFirst() : "+movies.peekFirst()); // return first element
       System.out.println("peekLast() :"+movies.peekLast()); // return last element
 
       // poll(), pollFirst(), pollLast() – Retrieve & remove
       // LinkedList before poll: [Pushpa, Saaho, Bahubali, Radhe Shyam, RRR, Guntur Kaaram]
       System.out.println("Poll() : "+movies.poll()); // Remove first element
       System.out.println("pollFirst() : "+movies.pollFirst()); // Remove first element
       System.out.println("pollLast() : "+movies.pollLast()); // remove last element
       System.out.println("After Poll Operations : "+movies); // output: [Bahubali, Radhe Shyam, RRR]

       // size() – Number of elements
       System.out.println("Size of LinkedList is : "+movies.size());

       // Returns true if the stack contains no elements; otherwise, returns false.
       System.out.println("is Empty? "+movies.isEmpty());

       //  clone() – Create a shallow copy
       LinkedList<String> cloinedList = (LinkedList<String>) movies.clone();
       System.out.println("Cloned list: "+cloinedList);

       // clear() – Remove all elements
       movies.clear();
       // After Clear LinkedList: []
       System.out.println("After Clear LinkedList: "+movies);
       System.out.println("After Clear LinkedList is Empty? : "+movies.isEmpty());

    }
}