/**
 * Program Name : Stack Example - Using All Built-in Methods
 * LIFO : Last In, First Out 
          The last element you add (push) will be the first one you remove (pop).
*/
import java.util.Stack;
class StackExample {
    public static void main(String args[])
    {
       // Creating names Stack
       Stack<String> names = new Stack<String>();

       // push(element) → Push elements onto the stack
       names.push("Nagu");
       names.push("Hemanth");
       names.push("Shiva");
       names.push("Yesu");
       names.push("Hari");
       names.push("Rahul");

       // output : [Nagu, Hemanth, Shiva, Yesu, Hari, Rahul]
       System.out.println("Initial Names Stack is: "+names);

       // peek() → View the top element without removing it
       System.out.println("Top of the Element in the names Stack is: "+names.peek());

       // pop() → Remove and return the top element
       String removedName = names.pop();
       System.out.println("Removed Top of the Element in the names stack is: "+removedName);

       // output: [Nagu, Hemanth, Shiva, Yesu, Hari]
       System.out.println("After pop element from the names stacks is: "+names);

       // search(Element) → Find position of an element
       // output : nagu position from the stack: 2
       int position = names.search("Nagu");
       System.out.println("nagu position from the stack: "+position);
       
       // Returns true if the stack contains no elements; otherwise, returns false.
       System.out.println("Names Stack is Empty? : "+names.empty());
    
       // size() → Return Number of elements in the stack
       System.out.println("Size of the Names Stack is: "+names.size());

       // Returns true if the stack contains Specified name; otherwise, returns false.
       System.out.println("Contain 'hemanth'? :"+names.contains("Hemanth"));
       System.out.println("Contain 'Rohit'? :"+names.contains("Rohit"));

       // clear() → Remove all elements from the stack
       names.clear();
       System.out.println("names Stack After Clear : "+names);

       // output: [prathibha, roshini, lavanya]
       names.add("prathibha");
       names.add("roshini");
       names.add("lavanya");
       System.out.println("New names Stsck is: "+names);
       
       //forEach() → Iterate elements using for-each loop
       System.out.println("Iterating Eleements Using for-each loop");
       for(String items : names){
        System.out.println("Hello, Welcome "+items);
       }
    }
}