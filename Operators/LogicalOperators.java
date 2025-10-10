// Program: Demonstrating Logical Operators Operators in Java
class LogicalOperators {
    public static void main(String args[])
    {
        int x=10;
        int y=20;
        int z=30;

        System.out.println(" --- Logical Operators Example --- ");
        // Logical AND(&&) Operator
        if(x<y && x<z){
           System.out.println("x is samller then y and z");
        }
        // Logical OR(||) Operator
        if(x<y || x>z){
            System.out.println("x is smaller then y and x is not smaller then z");
        }
        // Logical NOT(!) Operator
        if(!(x==y)){
            System.out.println("x and y values are not the same");
        }

    }
}