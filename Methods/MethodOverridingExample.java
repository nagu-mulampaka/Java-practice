// Program: Demonstrating Method Overriding in Java
// Parent class
class Employee {
    int empId;
    String name;

    Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    double calculateSalary(){
        double baseSalary = 10000;
        return baseSalary;
    }

    void displayDetails(){
        System.out.println("Employee Id: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + calculateSalary());
    }
}
// Child class 1: Developer
class Developer extends Employee {
    Developer(int empId, String name){
        super(empId, name);
    }

    // Overriding calculateSalary method
    @Override
    double calculateSalary(){
        double baseSalary = 10000;
        double allowance  = 5000;
        return baseSalary + allowance;
    }

    // Overriding displayDetails method
    @Override
    void displayDetails(){
        System.out.println("=== Developer Details ===");
        super.displayDetails();
    }
}
// Child class 2: Tester
class Tester extends Employee {
    Tester(int empId, String name){
        super(empId, name);
    }

    // Overriding calculateSalary for Tester
    @Override
    double calculateSalary(){
        double baseSalary = 10000;
        double allowance = 3000;
        return baseSalary + allowance;
    }

    // Overriding displayDetails method
    @Override
    void displayDetails(){
        System.out.println("=== Tester Details ===");
        super.displayDetails();
    }
}
// Main class to execute overriding example
class MethodOverridingExample {
   public static void main(String args[])
   {
     Developer dev = new Developer(101, "Nagu");
     Tester tes = new Tester(102, "Hemanth");

     dev.displayDetails();
     System.out.println("-----------------------");
     tes.displayDetails();
   }
}
/*
Output:

=== Developer Details ===
Employee Id: 101
Employee Name: Nagu
Employee Salary: 15000.0
-----------------------
=== Tester Details ===
Employee Id: 102
Employee Name: Hemanth
Employee Salary: 13000.0
*/