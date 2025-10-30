// Program: Demonstrating access modifiers in Java

// Parent class
class Student {

    // Accessible only within this class
    private String name = "Nagu Mulampaka";

    // Default access - same package only
    int rollNumber = 83;

    // Accessible in subclasses across packages
    protected String course = "Java Full Stack Development";

    // Accessible from anywhere
    public int marks = 90;

    private void displayPrivate() {
        System.out.println("Private Method: Name = " + name);
    }

    void displayDefault() {
        System.out.println("Default Method: Roll Number = " + rollNumber);
    }

    protected void displayProtected() {
        System.out.println("Protected Method: Course = " + course);
    }

    public void displayPublic() {
        System.out.println("Public Method: Marks = " + marks);
        displayPrivate(); // Private accessible inside same class
    }
}

// Subclass in the same package
class CollegeStudent extends Student {
    void accessData() {
        // System.out.println(name);     // private - not accessible
        System.out.println(rollNumber);  // default - same package
        System.out.println(course);      // protected - accessible
        System.out.println(marks);       // public - accessible
    }
}

public class AccessModifiersExample {
    public static void main(String[] args) {
        Student s = new Student();
        s.displayPublic();        // Accessible everywhere
        s.displayDefault();       // Accessible (same package)
        s.displayProtected();     // Accessible (same package)
        // s.displayPrivate();    // Not accessible

        CollegeStudent cs = new CollegeStudent();
        cs.accessData();          // Access protected + default + public
    }
}

