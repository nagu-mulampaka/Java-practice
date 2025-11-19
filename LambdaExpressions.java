// Java Program: Demonstrating Lambda Expressions in Java

// Functional Interface
@FunctionalInterface
interface Addition {
    void add(int x, int y);
}

// Main Class
public class LambdaExpressions {

    public static void main(String[] args) {

        // 1 Lambda Expression - Simple Addition
        Addition addition = (x, y) -> {
            int result = x + y;
            System.out.println("Addition Result: " + result);
        };
        addition.add(45, 96);

        // 2 Lambda Expression - Custom Message
        Addition customMessageAddition = (x, y) -> {
            int result = x + y;
            System.out.println("Custom Addition Result: " + result);
        };
        customMessageAddition.add(89, 23);

        // 3 Lambda Expression - Subtraction
        Addition subtraction = (x, y) -> {
            int result = x - y;
            System.out.println("Subtraction Result: " + result);
        };
        subtraction.add(100, 40);

        // 4 Lambda Expression - Multiplication
        Addition multiplication = (x, y) -> {
            int result = x * y;
            System.out.println("Multiplication Result: " + result);
        };
        multiplication.add(12, 6);

        // 5 Lambda Expression - Division (with validation)
        Addition division = (x, y) -> {
            if (y == 0) {
                System.out.println("Division Error: Cannot divide by zero!");
            } else {
                int result = x / y;
                System.out.println("Division Result: " + result);
            }
        };
        division.add(50, 5);
        division.add(10, 0);
    }
}
/*
----- OUTPUT ------
Addition Result: 141
Custom Addition Result: 112
Subtraction Result: 60
Multiplication Result: 72
Division Result: 10
Division Error: Cannot divide by zero!
*/