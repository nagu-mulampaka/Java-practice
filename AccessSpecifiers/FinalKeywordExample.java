// Program: Demonstrating final keyword in Java
// Final class — cannot be extended
final class Constants {
    final double PI = 3.14159;  // final variable

    final void showConstant() { // final method
        System.out.println("Value of PI: " + PI);
    }
}

class Circle {
    final double radius;

    // Constructor can assign value to a final variable (only once)
    Circle(double r) {
        radius = r;
    }

    void area() {
        // radius = 10; // Not allowed - cannot reassign final variable
        double result = 3.14159 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}
// Main Class
public class FinalKeywordExample {
    public static void main(String[] args) {
        Constants c = new Constants();
        c.showConstant();
        Circle circle = new Circle(5);
        circle.area();  
    }
}
