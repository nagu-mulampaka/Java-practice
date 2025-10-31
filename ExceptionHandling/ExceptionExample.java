// Program: Demonstrating Exception Handling in Java
public class ExceptionExample {
    public static void main(String[] args) {
        try {
            // Code that may cause an exception
            int num1 = 10;
            int num2 = 0;

            // This will cause ArithmeticException
            int result = num1 / num2; 

            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            // Handling the exception
            System.out.println("Error: Cannot divide by zero!");
        } 
        finally {
            // This block always executes
            System.out.println("Program execution completed.");
        }
    }
}
