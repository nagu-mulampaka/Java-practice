// Program: Multiple Exception Handling in Java

public class MultipleExceptionExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {10, 20, 30};
            String name = "Java";

            // Uncomment one line at a time to test different exceptions

            // ArrayIndexOutOfBoundsException
            // int result = numbers[3] / 0;

            // ArithmeticException
            int result = numbers[1] / 0;

            // StringIndexOutOfBoundsException
            // char ch = name.charAt(10);

            System.out.println("Results is: " + result);
            //System.out.println("Character: " + ch);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of range!");
        } 
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: String index is out of range!");
        } 
        catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());
        } 
        finally {
            System.out.println("Program execution completed.");
        }
    }
}

