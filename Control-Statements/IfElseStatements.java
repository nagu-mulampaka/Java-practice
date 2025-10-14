// Program: Demonstrating if-else Statements in Java
// This program uses the Scanner class for reading user-provided data.
import java.util.Scanner;
class IfElseStatements {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Name Here");
        int age = scanner.nextInt();
        // if statements
        if(age>=18){
            System.out.println("Congratulations! You are eligible for this program.");
        }
        // else statements
        else {
            System.out.println("We regret to inform you that you are not eligible for this program.");
        }
    }
}