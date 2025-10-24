// Program: Demonstrating Different types of Constructors in Java
class BookApp {
   // Instance variables
   String bookName;
   String authorName;
   double price;

   // Default Constructor
   BookApp() {
       System.out.println("--- Default Constructor ---");
       bookName = "The Post Office";  // Default book name
       authorName = "Rabindra Nath Tagore";  // Default author name
       price = 1500.0;  // Default price
       
   }

   // Parameterized Constructor
   BookApp(String bookName, String authorName, double price) {
       System.out.println("--- Parameterized constructor ---");
       this.bookName = bookName;  
       this.authorName = authorName;
       this.price = price;
   }

   // Method to display book information
   public void printBookInfo() {
       System.out.println("Book Name: " + bookName);
       System.out.println("Author Name: " + authorName);
       System.out.println("Total Price: " + price);
       System.out.println("------------------------------");
   }
}

// Main class 
class DifferentTypesofConstructors {
    public static void main(String args[]) {

        // Creating object using Default Constructor
        BookApp book1 = new BookApp();
        book1.printBookInfo();  

        // Creating object using Parameterized Constructor
        BookApp book2 = new BookApp("Java", "James Gosling", 1500.0);
        book2.printBookInfo();  
    }
}
