//program to Demonstrating Bitwise operations in java 
class BitwiseOperators 
{ 
    public static void main(String ar[]) 
    { 
       byte x=10; 
       byte y=20; 
       byte z=-30; 

       System.out.println(" --- Bitwise Operators Example --- ");
       System.out.println("~x is : "+(~x)); 
       System.out.println("x&y is : "+(x&y)); 
       System.out.println("x|y is : "+(x|y)); 
       System.out.println("x^y is : "+(x^y)); 
       System.out.println("x<<2 is : "+(x<<2)); 
       System.out.println("z>>2 is : "+(z>>2)); 
       System.out.println("z>>>2 is : "+(z>>>2)); 
    }  
} 