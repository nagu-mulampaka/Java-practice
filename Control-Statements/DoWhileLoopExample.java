// Program: Demonstrating for do-while Statements in Java
// program to print 1 to 10 Numbers using do-while loop
class DoWhileLoopExample {
    public static void main(String args[])
    {
        int i = 1; // Initialization
        // do-while loop executes the block at least once
        do{
            System.out.println(i);
            i++; // increment
        }
        while(i<=10); // Condition check happens after execution
        System.out.println("Loop finished!");

    }
}