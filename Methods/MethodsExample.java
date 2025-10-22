// Program: Demonstrating Methods Example in Java
// Create a class named Calculator 
class Calculator {

   // Method to add two numbers
   int sum(int a, int b) {
       return a + b; 
   }

   // Method to subtract two numbers
   int subtract(int a, int b) {
       return a - b; 
   }

   // Method to multiply two numbers
   int multiplication(int a, int b) {
       return a * b; 
   }

   // Method to divide two numbers
   double division(int a, int b) {
       if (b != 0) { 
           return (double) a / b; 
       } else {
           System.out.println("Cannot divide by zero.");
           return 0; 
       }
   }
}

// Main class 
class MethodsExample {
    public static void main(String args[]) {
        // Create an object of Calculator class
        Calculator cal = new Calculator();

        // Call Calculator methods and store results 
        int add = cal.sum(10, 20);            // Call sum method
        int sub = cal.subtract(56, 78);       // Call subtract method
        int mul = cal.multiplication(89, 63); // Call multiplication method
        double div = cal.division(56, 5);     // Call division method

        // Printing results
        System.out.println("--- Printing Results ---");
        System.out.println("Addition Result is: " + add);
        System.out.println("Subtraction Result is: " + sub);
        System.out.println("Multiplication Result is: " + mul);
        System.out.println("Division Result is: " + div);
    }
}

/*
   Output: 
   --- Printing Results ---
   Addition Result is: 30
   Subtraction Result is: -22
   Multiplication Result is: 5607
   Division Result is: 11.2
*/
