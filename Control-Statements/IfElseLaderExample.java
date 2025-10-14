// Program: Demonstrating if-else-lader Statements in Java
// Student Grade Checker App
import java.util.Scanner;
class IfElseLaderExample {
    public static void main(String args[])
    {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Please Enter Your Name Here: ");
       String name = scanner.nextLine();
       System.out.print("Now Enter Your Marks Here: ");
       int marks = scanner.nextInt();

       if(marks>100){
        System.out.println("Please Enter Valid Marks.");
       }
       else if(marks>=100){
        System.out.println("Well done! "+name+ " You've got an A+ grade.");
       }
       else if(marks>=90){
        System.out.println("Well done! "+name+ " You've got an A grade.");
       }
       else if(marks>=80){
        System.out.println("Well done! "+name+ " You've got an B+ grade.");
       }
       else if(marks>=70){
        System.out.println("Well done! "+name+ " You've got an B grade.");
       }
       else if(marks>=60){
        System.out.println("Well done! "+name+ " You've got an C grade.");
       }
       else if(marks>=50 || marks>=40){
        System.out.println("Well done! "+name+ " You've got an D grade.");
       }
       else if(marks>=35){
        System.out.println("Well done! "+name+ " You've got an E grade.");
       }
       else{
        System.out.println("We're sorry to inform you that you did not pass the examination.");
       }
       
       System.out.println("Thank you for Using our Student Grade Checker App...");
    }
}