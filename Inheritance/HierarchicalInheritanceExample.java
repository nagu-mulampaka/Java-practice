// Program: Demonstrating Hierarchical Inheritance and Super Keyword Example in java
// Base Class (Parent Class)
class Student{
    String name;
    int age;
    String address;
    
    // Constructor to initialize student details
    public Student(String name, int age, String address)
    {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    //  Method to display student information
    public void displayStudentInfo(){
        System.out.println(" --- Student Information ---");
        System.out.println("Name: " + name); 
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

// Child Class 1 — UnderGraduation (inherits from Student)
class UnderGraduation extends Student {
    String collageName;
    String course;
    String location;

    // Constructor for UnderGraduation
    // Uses 'super()' to call the parent (Student) constructor
    public UnderGraduation(String name, int age, String address,
                      String collageName, String course, String location)
    {
        super(name, age, address); // Initialize inherited variables
        this.collageName = collageName;
        this.location = location;
    }
 
    // Method to display UnderGraduation details
    public void displayUnderGraduationInfo(){
        System.out.println(" --- Disaplay Graduation Information --- ");
        System.out.println("Collage Name: " + collageName);
        System.out.println("Course: " + course);
        System.out.println("Location: " + location);
    }
} 

// Child Class 2 — Postgraduation (inherits from Student)
class Postgraduation extends Student {
    String pgCollege;
    String pgCourse;
    String pgLocation;

    // Constructor for Postgraduation
    // Uses 'super()' to call the parent (Student) constructor
    public Postgraduation(String name, int age, String address,
                          String pgCollege, String pgCourse, String pgLocation)
    {
        super(name, age, address); // Initialize inherited variables
        this.pgCollege = pgCollege;
        this.pgCourse = pgCollege;
        this.pgLocation = pgLocation;
    }

    // Method to display Postgraduation details
    public void displayPostGraduationInfo(){
        System.out.println("--- Display Post Graduation Information ---");
        System.out.println("College Name: " + pgCollege);
        System.out.println("Course: " + pgCourse);
        System.out.println("Location: " + pgLocation);
    }
}

// Main class (Program Execution Starts Here)
class HierarchicalInheritanceExample {
    public static void main(String args[]){
        
        // Creating object of UnderGraduation class
        UnderGraduation ug = new UnderGraduation("Mulampaka Nagu", 26,
                                                  "MVP Colony, Visakhapatnam, Andhra Pradesh.",
                                                  "Mahathi Degree Collage",
                                                  "Bachelor of Computer Science (BSC)",
                                                  "Visakhapatnam.");

        // Creating object of Postgraduation class                                         
        Postgraduation pg = new Postgraduation("Mulampaka Nagu", 26,
                                               "MVP Colony, Visakhapatnam, Andhra Pradesh.",
                                               "Dr Lankapalli Bullayya PG Collage",
                                               "Master of Computer Applications (MCA)",
                                               "Visakhapatnam.");
       
        // Display Student + Graduation details
        ug.displayStudentInfo();         // From Student class
        ug.displayUnderGraduationInfo(); // From UnderGraduation class

        System.out.println();

        // Display Student + Postgraduation details
        pg.displayStudentInfo();        // From Student class
        pg.displayPostGraduationInfo(); // From Postgraduation class
    }
}