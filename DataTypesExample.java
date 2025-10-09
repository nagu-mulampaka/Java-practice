// Program: Demonstrating Data Types and Variables in Java
class DataTypesExample {
    public static void main(String args[])
    {
       // String (not a primitive data type, but commonly used)
       String name = "Mulampaka Nagu";
       // byte - stores very small whole numbers (-128 to 127)
       byte age = 26;
       // int - commonly used for whole numbers India (Population approx) (-2 billion to +2 billion)
       int population = 1380000000;
       // Float data type (stores decimal numbers with 'f' at the end)
       float height = 5.6f;
       // Double data type (stores large decimal numbers)
       double weight = 55.51;
       // Character data type (stores a single character in single quotes)
       char grade = 'A';
       // Boolean data type (stores true or false values)
       boolean isStudent = true;
       // short - stores small whole numbers (-32,768 to 32,767)
       short year = 2025;
       //long - stores very large whole numbers (use 'L' at the end)
       long distanceToSun = 149600000000L; // in meters
       
       // Printing all variable values
       System.out.println("---- Data Types and Variables Example ----");
       System.out.println("Name: "+name);
       System.out.println("age: "+age);
       System.out.println("Height: "+height);
       System.out.println("Weight: "+weight);
       System.out.println("Grade: "+grade);
       System.out.println("Is Student: "+isStudent);
       System.out.println("India Population (Approx): "+population);
       System.out.println("Present Year is: "+year);
       System.out.println("DistanceToSun: "+distanceToSun);
    }
}