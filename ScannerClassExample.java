// This program demonstrates how to use the Scanner class to take input from the user.
// Demonstration of Reading Various Data Types in Java
import java.util.Scanner;
class ScannerClassExample {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        // Reading String Input from the User
        System.out.println("Enter Your Name Here");
        String name = scanner.nextLine();

        // Reading int Input from the User
        System.out.println("Enter Your Age Here");
        int age = scanner.nextInt();

        // Reading float Input from the User
        System.out.println("Enter Your Salary Here");
        float salary = scanner.nextFloat();
        
        System.out.println("Hello "+name+", You are "+age+" Years Old, and Your Salary is "+salary);
    }
}