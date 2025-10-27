//  Program: Demonstrating Single Inheritance & super Keyword Example in Java
// Parent class (Super Class)
class Student {
    String name;
    int age;
    String address;

    // Constructor to initialize student details
    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Method to display student details
    public void displayStudentInfo() {
        System.out.println(" --- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("age: " + age);
        System.out.println("Student address: " + address);
    }

    public void seekingOpportunity() {
        System.out.println("Hello everyone, my name is " + name +". I am seeking an opportunity in Java Development.");
    }
}

// Child class (Sub Class)
class CourseDetails extends Student {
    String courseName;
    String duration;
    String description;

    // Constructor to initialize both Student and course details
    // Uses 'super()' to call the constructor of the parent class (Student)
    public CourseDetails(String name, int age, String address,
                         String courseName, String duration, String description) 
    {
        super(name, age, address); // Calls Student class constructor
        this.courseName = courseName;
        this.duration = duration;
        this.description = description;
    }
    
    // Method to display course information
    public void CourseInformation() {
        System.out.println("--- Course Information---");
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration);
        System.out.println("Description: " + description);
    }
}

// Main class (Program Execution Starts Here)
class SingleInheritanceExample {
    public static void main(String args[]) {
        
        // Creating an object of child class (CourseDetails)
        CourseDetails couseObject = new CourseDetails(
          "Mulampaka Nagu", 26,
          "MVP Colony, Visakhapatnam, Andhra Pradesh.",
          "Java Full Stack Development",
          "6 to 7 Months",
          "Java Full Stack Development involves creating frontend and backend web applications using Java, Spring Boot, ReactJS, and MySQL."
        );
        
        // Displaying all details
        couseObject.displayStudentInfo();   // Method from parent class
        couseObject.CourseInformation();    // Method from child class
        couseObject.seekingOpportunity();   // Method from parent class
    }
}
