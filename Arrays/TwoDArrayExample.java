// Program: Demonstrating Two-Dimensional Array in Java
class TwoDArrayExample {
    public static void main(String args[])
    {
        // Declare and initialize a 2D array
        int[][] marks = {{86,96,85,93,92},{89,89,81,83,90},{95,65,75,82,73}};

        // Print the 2D array using nested loops
        System.out.println(" --- 2D Marks Array --- ");
        for(int i=0; i<3; i++) // Loop for rows
        {
            for(int j=0; j<5;j++) // Loop for Columns
            {
                System.out.print(marks[i][j]+" ");
            }
            System.out.println();
        }
        // output: Length of the 3D Array is: 3
        System.out.println("Length of the Marks Array is: "+marks.length);
    }
}