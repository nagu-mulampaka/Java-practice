// Program: Demonstrating One-Dimensional Array in Java
class OneDArrayExample {
    public static void main(String args[])
    {
        System.out.println(" --- 1D Array Example ---");

        // Declaring and initializing an array
        int[] marks = {98,96,94,93,89};

        System.out.println("Printing array elements using for loop");
        for(int i=0;i<marks.length;i++)
        {
            System.out.print(marks[i]+" ");
        }
        System.out.println();

        System.out.println("Printing array elements using for for ecah loop");
        for(int items : marks)
        {
            System.out.print(items+" ");
        }
        System.out.println();
        
        // output: Marks Array length is: 5 
        System.out.println("Marks Array length is: "+marks.length);
    }
}