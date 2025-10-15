// Program: Demonstrating Three-Dimensional Array in Java
class ThreeDArrayExample {
    public static void main(String args[])
    {   
        // // Declare and initialize a 3D array
        System.out.println(" --- 3D Array Started --- ");
        int[][][] numbers = { 
                              {{10,20,30,40,50},{45,96,32,45,63},{61,76,23,12,67}},
                              {{31,78,34,96,40},{12,63,97,42,30},{78,52,63,55,98}},
                              {{17,28,33,47,59},{89,56,78,32,78},{78,63,45,74,23}}
                            };
        
        // Print the 3D array using nested loops
        for(int i=0; i<3; i++) // Loop for Arrys Size
        {
            for(int j=0; j<3; j++) // Loop for rows
            {
                for(int k=0; k<5; k++) // Loop for columns
                {
                    System.out.print(numbers[i][j][k]+" ");
                }
            }
            System.out.println();
        }
        // output: Length of the 3D Array is: 3
        System.out.println("Length of the 3D Array is: "+numbers.length);
    }
}