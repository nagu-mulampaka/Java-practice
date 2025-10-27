// Program: Demonstrating Multi Level Inheritance Example in java
// Base class (Parent class)
class Student {
    String name;
    int age;
    String address;

    // Method to set Student details
    public void Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Method to display student details
    public void displayStudentInfo() {
        System.out.println(" --- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

// Intermediate class (Child of Student)
class Postgraduation extends Student {
    String collageName;
    String course;
    String location;

    // Method to set Postgraduation details
    public void Postgraduation(String collageName, String course, String location) {
        this.collageName = collageName;
        this.course = course;
        this.location = location;
    }

    // Method to display Postgraduation details
    public void displayPostGraduationInfo() {
        System.out.println("--- Post Graduation Details ---");
        System.out.println("Collage Name: " + collageName);
        System.out.println("Course: " + course);
        System.out.println("Collage Location: " + location);
    }
}

// Derived class (Child of Postgraduation → Grandchild of Student)
class Graduation extends Postgraduation {
    String collageName;
    String course;
    String location;

    // Method to set Graduation details
    public void Graduation(String collageName, String course, String location) {
        this.collageName = collageName;
        this.course = course;
        this.location = location;
    }

    // Method to display Graduation details
    public void displayGraduationInfo() {
        System.out.println(" --- Graduation Details ---");
        System.out.println("Collage Name: " + collageName);
        System.out.println("Course: " + course);
        System.out.println("Collage Location: " + location);
    }
}

// Main class (Program execution starts here)
class MultiLevelInheritanceExample {
    public static void main(String args[]) {

        // Creating object of child class 'Graduation'
        // Since 'Graduation' inherits from 'Postgraduation' and 'Student',
        // it can access methods from all parent classes
        Graduation graduation = new Graduation();

        // Setting Student details using base class method
        graduation.Student("Mulampaka Nagu", 26, "MVP Colony, Visakhapatnam, Andhra Pradesh.");

        // Setting Postgraduation details using intermediate class method
        graduation.Postgraduation("Dr Lankapalli Bullayya PG College",
                                  "Master of Computer Applications (MCA)",
                                  "Visakhapatnam.");

        // Setting Graduation details using derived class method
        graduation.Graduation("Mahathi Degree College",
                              "Bachelor of Computer Science (BSC)",
                              "Visakhapatnam.");

        // Displaying all details (from each class level)
        graduation.displayStudentInfo();          // From Student class
        graduation.displayPostGraduationInfo();   // From Postgraduation class
        graduation.displayGraduationInfo();       // From Graduation class
    }
}
