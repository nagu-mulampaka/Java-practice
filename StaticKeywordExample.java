// Java program demonstrating static members in java
class Example {
    // Instance variable
    String name;  

    // Instance method
    void about() {
        System.out.println("Hello, Everyone my name is "+ name);
    }

    // Static variable
    static String course;  

    // Static method
    static void courseDetails() {
        System.out.println("I'm learning "+ course +" to enhance my technical skills.");
    }
}

// Main class to test static and instance members
class StaticKeywordExample {
    public static void main(String args[]) {
        // Create an object of Example class
        Example ex = new Example();

        // Set instance variable using object
        ex.name = "Mulampaka Nagu";

        // Call instance method using object
        ex.about();

        // Set static variable using class name
        Example.course = "Java Full Stack Development";

        // Call static method using class name
        Example.courseDetails();
    }

    // Static block: executed once when the class is loaded, before main()
    static {
        System.out.println(" -- Welcome to Static variables, methods, block Example ---");
    }
}

/*
   OUTPUT:
   -- Welcome to Static variables, methods, block Example ---
   Hello, Everyone my name is Mulampaka Nagu
   I'm learning Java Full Stack Development to enhance my technical skills.
*/
