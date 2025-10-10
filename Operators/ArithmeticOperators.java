// Program: Demonstrating Arithmetic Operators in Java
class ArithmeticOperators {
    public static void main(String args[])
    {
        int a = 10; // first number
        int b = 20; // second number

        // performing arithemetic operations and displaying Results
        System.out.println("----- Arithmetic Operators Example -----");
        System.out.println("The addition of " +a+" and "+b+" is: "+(a+b));
        System.out.println("The subtraction of "+a+" and "+b+" is: "+(a-b));
        System.out.println("The multiplication of "+a+" and "+b+" is: "+(a*b));
        System.out.println("The division of "+b+" by "+a+" is: "+(b/a));
        System.out.println("The modulus of "+a+" and "+b+" is: "+(a%b));

        // increment/decrement operators
        a++; // increment (add 1 to a)
        b--; // decrement (Substracts 1 from b)
        
        // a value after increment: 11
        System.out.println("a value after increment: "+a);
        // b value after decrement: 19
        System.out.println("b value after decrement: "+b);

    }
}