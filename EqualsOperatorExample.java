public class EqualsOperatorExample {

    public static void main(String[] args) {

        // Using Strings
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        System.out.println("=== String Comparisons ===");
        System.out.println("s1 == s2 : " + (s1 == s2));          // true → same string pool reference
        System.out.println("s1.equals(s2) : " + s1.equals(s2));  // true → same content

        System.out.println("s1 == s3 : " + (s1 == s3));          // false → different objects
        System.out.println("s1.equals(s3) : " + s1.equals(s3));  // true → same content


        // Using Integer Objects
        Integer n1 = 100;
        Integer n2 = 100;
        Integer n3 = new Integer(100);

        System.out.println("=== Integer Comparisons ===");
        System.out.println("n1 == n2 : " + (n1 == n2));          // true → integer cache (-128 to 127)
        System.out.println("n1.equals(n2) : " + n1.equals(n2));  // true → same value

        System.out.println("n1 == n3 : " + (n1 == n3));          // false → different objects
        System.out.println("n1.equals(n3) : " + n1.equals(n3));  // true → same value
    }
}
/*
OUTPUT: 
=== String Comparisons ===
s1 == s2 : true
s1.equals(s2) : true
s1 == s3 : false
s1.equals(s3) : true

=== Integer Comparisons ===
n1 == n2 : true
n1.equals(n2) : true
n1 == n3 : false
n1.equals(n3) : true
*/
