// Program: Demonstrating the immutability of Strings and three ways to declare a String in Java
class StringImmutable{
    public static void main(String args[])
    {
        // Way 1: String initilazation (By Direct declaration) 
        String aboutMe = "Hello everyone my name is nagu mulampaka";
        System.out.println(aboutMe);

        // Way 2: Declaring String By Using new Keyword
        // Checking the immutability of Strings
        String name = new String("Nagu");
        System.out.println("initial value: "+name);
        // initial hashcode: 2420225
        System.out.println("initial hashcode: "+name.hashCode());
        
        name="Mulampaka Nagu";
        System.out.println("After Update Sting value: "+name);
        // After Update hashCode: -1671328086
        System.out.println("After Update hashCode: "+name.hashCode());
        
        name ="Hello Welcome";
        System.out.println("After 2nd Update Sting value: "+name);
        // After 2nd Update hashCode: -269408812
        System.out.println("After 2nd Update hashCode: "+name.hashCode()); 

        // Way 3: By using a character array
        char c[] = {'m','u','l','a','m','p','a','k','a',' ','n','a','g','u'};
        String fullName = new String(c);
        System.out.println(fullName);
    }
}