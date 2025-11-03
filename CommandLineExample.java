// Program: Command Line Arguments Example in Java
class CommandLineExample {
    public static void main(String args[])
    {
        // Check if at least two arguments are passed
        if(args.length < 2){
            System.out.println("Please provide at least two numbers as arguments.");
            System.out.println("Example: java CommandLineExample 10 20");
            return; // Exit the program if not enough arguments are given
        }

        // Display all the command-line arguments
        System.out.println("--- Command line Arguments ---");
        for(int i=0; i < args.length; i++){
            System.out.println(i + " Argument :" + args[i]);
        }

        try{
            // Convert command-line string arguments into integers
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            // Perform arithmetic operations
            int sum = num1 + num2;
            int sub = num1 - num2;
            int mul = num1 * num2;
            
            // Display the results
            System.out.println("----- Results -----");
            System.out.println("Addition: " + sum);
            System.out.println("Subtraction: " + sub);
            System.out.println("Multiplication: " + mul);
        }
        catch (Exception e) {
            // Handles invalid inputs (e.g., non-numeric arguments)
            System.out.println("Please enter valid integer numbers.");
        }
    }
}
/*
   ====== Compilation and Execution ======

   > javac CommandLineExample.java
   > java CommandLineExample

   Output:
   Please provide at least two numbers as arguments.
   Example: java CommandLineExample 10 20

   ====== Example Execution with Arguments ======

   > java CommandLineExample 89 63

   Output:
   --- Command Line Arguments ---
   0 Argument : 89
   1 Argument : 63

   ----- Results -----
   Addition: 152
   Subtraction: 26
   Multiplication: 5607
*/
