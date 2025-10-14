// Program: Demonstrating Switch Statements in Java
// Fast Food Delivery App
import java.util.Scanner;
class SwitchStatementExample {
    public static void main(String args[])
    {
        System.out.println("---- Welcome to Fast Food Delivery App ----");
        System.out.println("Available Items");
        System.out.println("1. Burger - 120");
        System.out.println("2. Coffee - 80");
        System.out.println("3. Pizza - 150");
        System.out.println("4. Chicken Biryani - 200");
        System.out.println("5. Exit");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Select Items (1 to 4): ");
        int choice = scanner.nextInt();

        switch(choice){
            case 1:
                System.out.println("Your Ordered Burder Please pay 120 Rupees Only");
                break;
            case 2: 
                System.out.println("Your Ordered Coffee Please pay 80 Rupees Only");
                break;
            case 3:
                System.out.println("Your Ordered Pizza Please pay 150 Rupees Only");
                break;
            case 4:
                System.out.println("Your Ordered Chicken Biryani Please pay 200 Rupees Only");
                break;
            case 5:
                System.out.println("Thanks for your time. Have a wonderful day!");
                break;
            default:
                System.out.println("Invalid selection. Kindly enter a valid option.");
        }
        System.out.println("Thank You Visit Again");
    }
}