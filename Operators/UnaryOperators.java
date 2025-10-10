// Program: Demonstrating Unary Operators in Java
class UnaryOperators {
    public static void main(String args[])
    {
        int a = 10;
        int b = -20;
        int c = 30;

        System.out.println(" --- Unary Operators ---");

        // Unary Plus(+)
        System.out.println("Unary Plus: "+(+a)); // remains 10
        // Unary Minus(-)
        System.out.println("Unary Minus: "+(-b)); // changes sign to +20

        // Increment Operations(++)
        // pre-increment
        System.out.println(" --- Increment Operations --- ");
        System.out.println("pre-increment (a++): "+(++a)); // a becomes 11

        // post-increment
        System.out.println("post-increment (++a): "+(a++)); // a is 11
        System.out.println("a value after post-increment (a++): "+a); // a becomes 12

        // Decrement Operations
        // pre-decrement
        System.out.println(" --- Decrement Operations --- ");
        System.out.println("pre-decrement (--c): "+(--c)); // c becomes 29

        // post-decrement 
        System.out.println("post-decrement (c--): "+(c--)); // c is 29
        System.out.println("c value after post-decrement (c--): "+c); // c becomes 28

    }
}