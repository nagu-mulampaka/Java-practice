// Program: Demonstrating Constructor Overloading in Java
class Mobile{
   String brand;
   String model;
   double price;
   
   // Default Constructor
   Mobile(){
    System.out.println("--- Default Constructor ---");
    brand = "I Phone";
    model = "17 Pro Max";
    price = 169900.00;
   }

   // Parameterized Constructor with 2 parameters
   Mobile(String brand, String model){
    System.out.println("--- Parameterized Constructor with 2 parameters ---");
    this.brand = brand;
    this.model = model;
    price = 134900.00;
   }

   // Parameterized Constructor with all parameters
   Mobile(String brand, String model, double price){
    System.out.println("--- Parameterized Constructor with all parameters ---");
    this.brand = brand;
    this.model = model;
    this.price = price;
   }

   // Method to display mobile details
   public void printMobileInfo(){
    System.out.println("Brand: "+ brand);
    System.out.println("Model: "+ model);
    System.out.println("price: "+ price);
    System.out.println("--------------------------------");
   }

}
class ConstructorOverloadingExample {
    public static void main(String args[]){

       // Using default constructor
       Mobile mobile1 = new Mobile();
       mobile1.printMobileInfo();

       // Using parameterized constructor with 2 parameters
       Mobile mobile2 = new Mobile("I Phone","17 Pro");
       mobile2.printMobileInfo();

       // Using parameterized constructor with all parameters
       Mobile mobile3 = new Mobile("I Phone","17",68900);
       mobile3.printMobileInfo();
    }
}