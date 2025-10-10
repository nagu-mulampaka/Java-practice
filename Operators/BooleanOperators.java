// Program: Demonstrating Boolean Operators Operators in Java

/*
   And (&)  - Returns true only if both conditions are true 
   OR (|) - Returns false only if both conditions are false
   Not (!) - true becomes false and false becomes true
*/

class BooleanOperators {
    public static void main(String args[])
    {
        boolean a = true;
        boolean b = false;
        
        System.out.println(" --- Boolean Operators Example --- ");
        System.out.println("a&b : "+(a&b)); // returns false
        System.out.println("a|b : "+(a|b)); // returns true
        System.out.println("a!b : "+(!a));  // returns false
    
    }
}