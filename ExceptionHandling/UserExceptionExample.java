// Program to demonstrate User Defined Exceptions in Java

// Step 1: Define a custom exception class
class MyException extends Exception {
    
    // Default constructor
    MyException() {
        System.out.println("This competition is for children below 10 years only.");
    }

    // Parameterized constructor
    MyException(String message) {
        super(message);  // Pass message to Exception superclass
    }
}

// Step 2: Main class
public class UserExceptionExample {
    public static void main(String[] args) {
        int age = 11;  // Try changing this to 8 to see different results

        try {
            if (age > 10) {
                // Throw custom exception if age > 10
                throw new MyException("Please enter the competition only if you are below 10.");
            }
            System.out.println("You are eligible for the competition!");
        } 
        catch (MyException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } 
        finally {
            System.out.println("Program execution completed.");
        }
    }
}
