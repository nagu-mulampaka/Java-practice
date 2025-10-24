// Program: Demonstrating Constructor and this keyword in Java
import java.util.Scanner;
class Book {
    // Instance Variables
    String bookName;    
    String authorName; 
    double price;       

    // Constructor to initialize the Book object with name, author, and price
    public Book(String bookName, String authorName, double price){
        this.bookName = bookName;     // 'this.bookName' refers to the instance variable
        this.authorName = authorName; // 'this.authorName' refers to the instance variable
        this.price = price;           // 'this.price' refers to the instance variable
    }

    // Method to display book information
    public void printBookInfo(){
        System.out.println("--- Welcome to LibraryApp! ---");
        System.out.println("Book Name: " + bookName);
        System.out.println("Author name: " + authorName);
        System.out.println("Total Price: " + price);
    } 
}
// Main class to run the program
class ConstructorExample {
    public static void main(String args[])
    {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Enter the book name here: ");
       String enteredBookname = scanner.nextLine();

       System.out.print("Enter the author name here: ");
       String enteredAuthorname = scanner.nextLine();

       System.out.print("Enter the book price here: ");
       double enteredPrice = scanner.nextDouble();

       // Create a Book object using the entered details
       Book book = new Book(enteredBookname, enteredAuthorname, enteredPrice);
       // Print the book information
       book.printBookInfo();

       scanner.close();
    }
}