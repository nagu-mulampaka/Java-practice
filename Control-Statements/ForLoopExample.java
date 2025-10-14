// Program: Demonstrating for loop Statements in Java
// Syntax: for(Initialization; Condition; Increment)
class ForLoopExample {
    public static void main(String args[])
    {
        int sum = 0;
        // loop for printing 1 to 10 Numbers

        for(int i=1; i<=10; i++)
        {
           System.out.println(i);
        }
        // loop for print sum of 1 to 10 Numbers
        for(int i=1; i<=10; i++)
        {
            sum = sum+i;
        }
        System.out.println("sum of 1 to 10 is: "+sum);
    }
}