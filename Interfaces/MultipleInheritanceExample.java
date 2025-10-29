// Program: Demonstrating Multiple Inheritance in Java
// Basic arithmetic operations
interface ArithmeticOperations {
    void add(int num1, int num2);
    void sub(int num1, int num2);
    void mul(int num1, int num2);
    void div(int num1, int num2);
}

// Advanced operations interface
interface AdvancedOperations {
    void square(int num);
    void cube(int num);
}

// Calculator implementing multiple interfaces
class Calculator implements ArithmeticOperations, AdvancedOperations {

    // Arithmetic methods
    public void add(int num1, int num2) {
        System.out.println("Addition Result: " + (num1 + num2));
    }

    public void sub(int num1, int num2) {
        System.out.println("Subtraction Result: " + (num1 - num2));
    }

    public void mul(int num1, int num2) {
        System.out.println("Multiplication Result: " + (num1 * num2));
    }

    public void div(int num1, int num2) {
        if (num2 != 0)
            System.out.println("Division Result: " + (num1 / num2));
        else
            System.out.println("Cannot divide by zero!");
    }

    // Advanced methods
    public void square(int num) {
        System.out.println("Square of " + num + " is: " + (num * num));
    }

    public void cube(int num) {
        System.out.println("Cube of " + num + " is: " + (num * num * num));
    }
}

// Main class to test
public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        // Basic arithmetic operations
        cal.add(10, 5);
        cal.sub(20, 8);
        cal.mul(4, 6);
        cal.div(40, 5);

        // Advanced operations
        cal.square(7);
        cal.cube(3);
    }
}
