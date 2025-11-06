import java.util.Arrays;
import java.util.Comparator;

public class ArraysExample {
    public static void main(String[] args) {
        
        // Creating integer and string arrays
        int numbers[] = {45, 12, 89, 34, 22, 77, 56};
        String names[] = {"Nagu", "Ashok", "Sai Babu", "Hemanth", "Narendra", "Praveen"};
        
        // Printing array before sorting
        System.out.println("Before Sorting (numbers): " + Arrays.toString(numbers));
        
        // Sorting the array in ascending order
        Arrays.sort(numbers);
        System.out.println("After Sorting (ascending): " + Arrays.toString(numbers));
        
        // Sorting a string array alphabetically
        Arrays.sort(names);
        System.out.println("Names Sorted Alphabetically: " + Arrays.toString(names));
        
        // Sorting in reverse order using Comparator
        Arrays.sort(names, Comparator.reverseOrder());
        System.out.println("Names in Reverse Order: " + Arrays.toString(names));
        
        // Searching for an element (binarySearch works on sorted array)
        int index = Arrays.binarySearch(numbers, 34);
        System.out.println("Position of 34 (after sorting): " + index);
        
        // Copying arrays
        int copyArray[] = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied Array: " + Arrays.toString(copyArray));
        
        // Copying a range of elements
        int partialCopy[] = Arrays.copyOfRange(numbers, 2, 5);
        System.out.println("Copied Range (index 2 to 4): " + Arrays.toString(partialCopy));
        
        // Filling an array with a specific value
        int marks[] = new int[5];
        Arrays.fill(marks, 100);
        System.out.println("Filled Array: " + Arrays.toString(marks));
        
        // Comparing two arrays
        System.out.println("Arrays Equal: " + Arrays.equals(numbers, copyArray));
        
        // Checking deep equality
        int matrix1[][] = {{1, 2}, {3, 4}};
        int matrix2[][] = {{1, 2}, {3, 4}};
        System.out.println("2D Arrays Equal (Deep): " + Arrays.deepEquals(matrix1, matrix2));  
    }
}

/*
 ---- OUTPUT ----
 Before Sorting (numbers): [45, 12, 89, 34, 22, 77, 56]
 After Sorting (ascending): [12, 22, 34, 45, 56, 77, 89]
 Names Sorted Alphabetically: [Ashok, Hemanth, Nagu, Narendra, Praveen, Sai Babu]
 Names in Reverse Order: [Sai Babu, Praveen, Narendra, Nagu, Hemanth, Ashok]
 Position of 34 (after sorting): 2
 Copied Array: [12, 22, 34, 45, 56, 77, 89]
 Copied Range (index 2 to 4): [34, 45, 56]
 Filled Array: [100, 100, 100, 100, 100]
 Arrays Equal: true
 2D Arrays Equal (Deep): true
*/