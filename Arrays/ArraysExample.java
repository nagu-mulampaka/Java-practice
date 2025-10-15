// Program: Demonstrating Arrays in Java
// in this program, three arrays are declared and their elements are displayed using both the for loop and the for-each loop.
import java.util.Scanner;
class ArraysExample {
    public static void main(String args[])
    {
       Scanner scanner = new Scanner(System.in);

       // Programming Languages array initializing and Creating
       System.out.println(" === Programming Languages Array === ");
       String[] Programming = new String[5];
       Programming[0] = "Java";
       Programming[1] = "Advanced Java";
       Programming[2] = "Spring Boot";
       Programming[3] = "Python";
       Programming[4] = ".net";

       // Print Programming Array Uing for-loop 
       for(int i=0; i<Programming.length; i++)
       {
          System.out.println("Language at: "+i+" index is: "+Programming[i]);
       }
       
       // Read the array size as input from the user.
       System.out.println(" === Dynamic Subjects Array Started ===");
       System.out.print("Enter the number of Subejcts: ");
       int size = scanner.nextInt();
       scanner.nextLine(); 
       
       // Creating and initializing an array.
       String[] subjects = new String[size];

       // Read the subject names as input from the user.
       System.out.println(" --- Enter Subject Names Here ---");
       for(int i=0; i<size; i++)
       {
          subjects[i] = scanner.nextLine();
       }
       
       // Display the list of subjects.
       System.out.println("Subject Names are: ");
       for(int i=0; i<size; i++)
       {
         System.out.println("Subject at "+i+" Position is: "+subjects[i]);
       }

       // movie names array
       System.out.println(" === Movie Names Array Started === ");
       // Creating and initializing an array.
       String[] movies = {"RRR","Pushpa","Kalki","Bahubali","Raja saab"};
       // Printing movies array using for-each loop
       for(String each:movies){
         System.out.println(each);
       }
    }
}