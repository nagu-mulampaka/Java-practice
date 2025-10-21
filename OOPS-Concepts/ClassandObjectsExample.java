// program: demonstrates the concept of Classes and Objects in Java.
// Create a class ‘Student’ that is used to represent the student details.
class Student {

    // Declare instance variables (attributes) of the class
    String name;
    int age;
    String course;

    // Method to display student information
    void displayInfo(){
        System.out.println("--- Display Student Information ---");
        System.out.println("Student name: "+name);
        System.out.println("Student age: "+age);
        System.out.println("Student Selected Course: "+course);
    }
}
class ClassandObjectsExample {
    public static void main(String args[])
    {
        // --- 1st Student Object --- 
        // Student 1 Object Creation 
        Student s1 = new Student();

        // Assign values to s1 object properties
        s1.name = "Mulampaka Nagu";
        s1.age = 26;
        s1.course = "Java Full Stack Developer";

        // call displayInfo() method to display student Information
        s1.displayInfo();
        System.out.println("------------------------------------");

        // --- 2nd Student Object ---
        // Student 2 object Creation
        Student s2 = new Student();

        // Assign values to s2 object properties
        s2.name = "Mulampaka Suresh";
        s2.age = 24;
        s2.course = "forntend Developer";

        // call displayInfo() method to display student Information
        s2.displayInfo();
    }
}

/*
    OUTPUT: 
    --- Display Student Information ---
    Student name: Mulampaka Nagu
    Student age: 26
    Student Selected Course: Java Full Stack Developer
    ------------------------------------
    --- Display Student Information ---
    Student name: Mulampaka Suresh
    Student age: 24
    Student Selected Course: forntend Developer
*/