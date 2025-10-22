// program : Example program for Method Overloading
// Method OverLoading : Two or More method in a class having same name with different Signature is called method overloading.
class CalculatorApp {

    // Method with no parameters
    int addition() {
        int a = 45, b = 96;
        return a + b; 
    }

    // Method with one parameter
    int addition(int a) {
        int b = 89;
        return a + b; 
    }

    // Method with two parameters
    int addition(int a, int b) {
        return a + b; 
    }

    // Method with three parameters
    int addition(int a, int b, int c) {
        return a + b + c; 
    }

    // Method with four parameters
    int addition(int a, int b, int c, int d) {
        return a + b + c + d; 
    }
}

// Main class to test the CalculatorApp methods
class MethodOverloadingExample {
    public static void main(String args[]) {
        // Create an object of CalculatorApp
        CalculatorApp cal = new CalculatorApp(); 

        // Call addition methods with different number of arguments
        int sum = cal.addition();             // call No parameters method 
        int sum1 = cal.addition(78);          // call Single parameters method
        int sum2 = cal.addition(45, 18);      // call Two parameters method
        int sum3 = cal.addition(96, 63, 45);  // call Three parameters method 
        int sum4 = cal.addition(7, 31, 8, 45);// call Four parameters method

        // Print results
        System.out.println("Addition with no parameters result: " + sum);
        System.out.println("Addition with single parameter result: " + sum1);
        System.out.println("Addition with two parameters result: " + sum2);
        System.out.println("Addition with three parameters result: " + sum3);
        System.out.println("Addition with four parameters result: " + sum4);
    }
}

/*
  OUTPUT:
  Addition with no parameters result: 141
  Addition with single parameter result: 167
  Addition with two parameters result: 63
  Addition with three parameters result: 204
  Addition with four parameters result: 91
*/
