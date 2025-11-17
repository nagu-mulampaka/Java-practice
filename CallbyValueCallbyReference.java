//program to demonstrate call by value and call by reference 
class Sample  {            

    void add(int a,int b) {
        int c = a+b;
        System.out.println("a,b values are :"+a+","+b);  
        System.out.println("Addition result is :"+c);  

        a = 67; 
        b = 89; 
        c = a+b; 
        System.out.println("a,b values are :"+a+","+b);  
        System.out.println("Addition result second time is :"+c);    
    }

    void check(ObjectExample ob1) {
        ob1.v1 = 34;
        ob1.v2 = 98;
    }
}  

class ObjectExample {
   int v1; 
   int v2;    
}

class CallbyValueCallbyReference {
   public static void main(String arr[]) {

      int p = 16; 
      int q = 23;  

      Sample s = new Sample(); 

      System.out.println("p,q values are :"+p+","+q);  
      s.add(p,q);         // call by value 
      System.out.println("p,q values are :"+p+","+q);  

      ObjectExample obj1 = new ObjectExample(); 
      obj1.v1 = 1; 
      obj1.v2 = 2; 

      System.out.println("v1,v2 values before are :"+obj1.v1+","+obj1.v2);  
      s.check(obj1);     // call by reference 
      System.out.println("v1,v2 values after are :"+obj1.v1+","+obj1.v2);  
   }  
}    
/*
---- OUTPUT ----
p,q values are :16,23
a,b values are :16,23
Addition result is :39
a,b values are :67,89
Addition result second time is :156
p,q values are :16,23
v1,v2 values before are :1,2
v1,v2 values after are :34,98
*/