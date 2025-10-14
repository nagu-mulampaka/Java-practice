// Program: Student Marksheet Generator
// Concept Covered: for loop, if-else ladder, Scanner class (user input), basic arithmetic operations.
import java.util.Scanner;
class StudentMarksheetGeneratorUsingforLoop {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int totalMarks = 0;

        System.out.print("Please Enter Your Name: ");
        String name = scanner.nextLine();

        System.out.print("Please Enter How Many Subjects Marks You Added: ");
        int noofSubjects = scanner.nextInt();

        for(int i=1; i<=noofSubjects; i++)
        {
            System.out.print("Enter "+i+" Subject Marks: ");
            int enteredMarks = scanner.nextInt();
            totalMarks = totalMarks+enteredMarks;
        }

        double avarage = (double)totalMarks/noofSubjects;

        System.out.println("---- Welcome to Student Marks Sheet App ----");
        System.out.println("Name: "+name);
        System.out.println("Number of Subjects: "+noofSubjects);
        System.out.println("Total Marks: "+totalMarks);
        System.out.println("Avarage: "+avarage);

        if(avarage>=90){
            System.out.println("Grade: A+");
        } else if(avarage>=80) {
           System.out.println("Grade: A");
        }else if(avarage>=70) {
           System.out.println("Grade: B");
        }else if(avarage>=60) {
           System.out.println("Grade: C");
        }else if(avarage>=50) {
           System.out.println("Grade: D");
        }else if(avarage>=40 || avarage>=35) {
           System.out.println("Grade: E");
        }else {
            System.out.println("Failed In the Examination");
        }

        System.out.println("Thanks for Uisng our Service Have a nice day!");

    }
}